package com.secusociale.portail.service;

import com.secusociale.portail.domain.Employeur;
import com.secusociale.portail.repository.EmployeurRepository;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing {@link Employeur}.
 */
@Service
@Transactional
public class EmployeurService {

    private final Logger log = LoggerFactory.getLogger(EmployeurService.class);

    private final EmployeurRepository employeurRepository;

    public EmployeurService(EmployeurRepository employeurRepository) {
        this.employeurRepository = employeurRepository;
    }

    /**
     * Save a employeur.
     *
     * @param employeur the entity to save.
     * @return the persisted entity.
     */
    public Employeur save(Employeur employeur) {
        log.debug("Request to save Employeur : {}", employeur);
        return employeurRepository.save(employeur);
    }

    /**
     * Get all the employeurs.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<Employeur> findAll(Pageable pageable) {
        log.debug("Request to get all Employeurs");
        return employeurRepository.findAll(pageable);
    }


    /**
     * Get all employeurs by User.
     *
     * @param .
     * @return  the list of employeurs by currentUser.
     */
    @Transactional(readOnly = true)
    public List<Employeur> findEmployeurByUser() {
        log.debug("Request to get Employeur : {}");
       // String username = SecurityUtils.getCurrentUserLogin().get();
        return employeurRepository.findByUserIsCurrentUser();
    }



    /**
     * Get one employeur by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<Employeur> findOne(Long id) {
        log.debug("Request to get Employeur : {}", id);
        return employeurRepository.findById(id);
    }

    /**
     * Delete the employeur by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Employeur : {}", id);
        employeurRepository.deleteById(id);
    }




    public List<IMMATRICULATIONINBOUND.Input.EmployeList> mapReapExcelDataEmployeDB(MultipartFile reapExcelDataFile) throws IOException {

        List<IMMATRICULATIONINBOUND.Input.EmployeList> employeList = new ArrayList<>();
        XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);

        for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
            IMMATRICULATIONINBOUND.Input.EmployeList employe = new IMMATRICULATIONINBOUND.Input.EmployeList();

            XSSFRow row = worksheet.getRow(i);

            employe.setNinCedeao(String.valueOf(row.getCell(0).getNumericCellValue()));
            employe.setNomEmploye(row.getCell(1).getStringCellValue());
            employe.setPrenomEmploye(row.getCell(2).getStringCellValue());
            employe.setSexe(row.getCell(3).getStringCellValue());
            employe.setEtatCivil(row.getCell(4).getStringCellValue());
            // employeur.setDateNaissance(row.getCell(5).getStringCellValue());
            employe.setNationalite(row.getCell(11).getStringCellValue());
            employe.setTypePieceIdentite(row.getCell(12).getStringCellValue());
            employe.setNin(row.getCell(13).getStringCellValue());
            employe.setLieuDelivrance(row.getCell(17).getStringCellValue());
            employe.setPaysNaissance(row.getCell(19).getStringCellValue());
            employe.setPays(row.getCell(21).getStringCellValue());
            employe.setRegion(row.getCell(22).getStringCellValue());
            employe.setDepartement(row.getCell(23).getStringCellValue());
            employe.setArrondissement(row.getCell(24).getStringCellValue());
            employe.setCommune(row.getCell(25).getStringCellValue());
            employe.setQuartier(row.getCell(25).getStringCellValue());
            employe.setAdresse(row.getCell(26).getStringCellValue());
            employe.setTypeMouvement(row.getCell(28).getStringCellValue());
            employe.setNatureContrat(row.getCell(29).getStringCellValue());
            employe.setProfession(row.getCell(32).getStringCellValue());
            employe.setEmploi(row.getCell(33).getStringCellValue());
            employe.setEmployeurPrec(row.getCell(34).getStringCellValue());
            employe.setSalaireContractuel(String.valueOf(row.getCell(35).getStringCellValue()));
            employe.setTempsTravail(row.getCell(36).getStringCellValue());
            employe.setCategorie(row.getCell(37).getStringCellValue());


            employeList.add(employe);
        }

        return employeList;
    }
}
