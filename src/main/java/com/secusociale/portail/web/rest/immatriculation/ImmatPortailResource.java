package com.secusociale.portail.web.rest.immatriculation;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.bind.JAXBException;
import javax.xml.ws.Holder;


import com.secusociale.portail.service.soap.immatRepresentantationDiplomatique.IMMATREPDIPLO;
import com.secusociale.portail.service.soap.immatRepresentantationDiplomatique.IMMATREPDIPLOFault;
import com.secusociale.portail.service.soap.infosEmployeur.CMINFOSEMPLOYEUR;
import com.secusociale.portail.service.soap.infosSalaries.CMGETPERSONSLINKTOEMPLOYER;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUND;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUNDFault;
import com.secusociale.portail.service.soap.recepisseDepot.GETRECEPISSEDEPOTURL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.service.immatriculation.CertificatImmatriculationService;
import com.secusociale.portail.service.immatriculation.ImmatPortailService;
import com.secusociale.portail.service.immatriculation.InfoSalariesService;
import com.secusociale.portail.service.immatriculation.InfosCompteEmployeurService;
import com.secusociale.portail.service.immatriculation.RecepisseDepotService;
import com.secusociale.portail.service.immatriculation.StatutDossierImmatriculationService;
import com.secusociale.portail.service.immatriculation.VerifierExistenceEmployeur;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculation;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculationFault;
import com.secusociale.portail.service.soap.checkExistenceEmployeur.CmCheckExistenceEmployeur;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDFault;
import com.secusociale.portail.service.soap.domestique.InboundDomFrm;
import com.secusociale.portail.service.soap.employeurExistant.CMGETEMPLOYEURDETAILS;
import com.secusociale.portail.service.soap.immatPublicParapublic.IMMAT2INBOUND;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculation;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculationFault;
//import com.secusociale.portail.web.rest.ImmatriculationResource;

@RestController
@RequestMapping("/api")
public class ImmatPortailResource {

	//private final Logger log = LoggerFactory.getLogger(ImmatriculationResource.class);
   // private static final String ENTITY_NAME = "IMMATRICULATIONINBOUND";

    @Autowired
   private ImmatPortailService immatPortailService ;

    @Autowired
    private StatutDossierImmatriculationService statutDossierImmatriculationService ;

    @Autowired
	private CertificatImmatriculationService certificatImmatriculationService;

    @Autowired
    private VerifierExistenceEmployeur verifierExistenceEmployeur;
    
    @Autowired
    private RecepisseDepotService recepisseDepotService ;
    
    @Autowired
    private InfosCompteEmployeurService infosCompteEmployeurService ;
    
    @Autowired
    private InfoSalariesService infosSalarieService ;

	@PostMapping("/immatPortail")
    public Holder<IMMATRICULATIONINBOUND> createImmatriculationPortail(@RequestBody IMMATRICULATIONINBOUND immatriculation) throws URISyntaxException, IMMATRICULATIONINBOUNDFault, JAXBException, IOException {
       // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

        Holder<IMMATRICULATIONINBOUND> immatriculationInbound = new Holder<IMMATRICULATIONINBOUND>();

           immatriculationInbound = immatPortailService.createImmatriculationPortail(immatriculation);

		return immatriculationInbound;

    }


	@PostMapping("/maintient-affiliation")
    public Holder<MAINTAFFINBOUND> createMaintientAffiliation(@RequestBody MAINTAFFINBOUND.Input immatriculation) throws URISyntaxException,   JAXBException {
       // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

        Holder<MAINTAFFINBOUND> immatriculationInbound = new Holder<MAINTAFFINBOUND>();

           immatriculationInbound = immatPortailService.createImmatriculationMaintienAffiliation(immatriculation);

		return immatriculationInbound;

    }


	@PostMapping("/representation-diplomatique")
    public Holder<IMMATREPDIPLO> createRepresentationDiplomatique(@RequestBody IMMATREPDIPLO immatriculation) throws URISyntaxException,  JAXBException {
       // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

        Holder<IMMATREPDIPLO> immatriculationInbound = new Holder<IMMATREPDIPLO>();

           immatriculationInbound = immatPortailService.createImmatriculationRepresentatnt(immatriculation);

		return immatriculationInbound;

    }

	@PostMapping("/publique-parapublique")
    public Holder<IMMAT2INBOUND> createPubliqueParapublique(@RequestBody IMMAT2INBOUND immatriculation) throws URISyntaxException,  JAXBException {
       // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

        Holder<IMMAT2INBOUND> immatriculationInbound = new Holder<IMMAT2INBOUND>();

           immatriculationInbound = immatPortailService.createImmatPublicParapublique(immatriculation);

		return immatriculationInbound;

    }

	

	 @PostMapping("/domestique")
	    public Holder<InboundDomFrm> createImmatriculationPortail(@RequestBody InboundDomFrm immatriculation) throws URISyntaxException, IMMATRICULATIONINBOUNDFault, JAXBException {
	       // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

	        Holder<InboundDomFrm> immatriculationInbound = new Holder<InboundDomFrm>();

	           immatriculationInbound = immatPortailService.createImmatDomestique(immatriculation);

			return immatriculationInbound;

	    }


    @PostMapping("/immatPortail/uploadFile")
    public Holder<IMMATRICULATIONINBOUND> createImmatriculationUploadFilePortail(@RequestBody IMMATRICULATIONINBOUND immatriculation) throws URISyntaxException, IMMATRICULATIONINBOUNDFault, JAXBException, IOException {
        // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

        Holder<IMMATRICULATIONINBOUND> immatriculationInbound = new Holder<IMMATRICULATIONINBOUND>();

        immatriculationInbound = immatPortailService.createImmatriculationUploadFilePortail(immatriculation);

        return immatriculationInbound;

    }




	@GetMapping("/statutDossierImmatriculation/{idDossier}")
	Holder<CmGetStatusDossierImmatriculation> getStatutDossierImmatriculation(@PathVariable String idDossier) throws JAXBException, CmGetStatusDossierImmatriculationFault{

		Holder<CmGetStatusDossierImmatriculation> statuDossier = new Holder<CmGetStatusDossierImmatriculation>();

		statuDossier = statutDossierImmatriculationService.getStatutDossierImmatriculation(idDossier) ;


		return statuDossier;

	}


	@GetMapping("/checkExistenceEmployeur/{typeIdentifiant}/{numeroIdentifiant}")
	Holder<CmCheckExistenceEmployeur> getExistenceEmployeur(@PathVariable String typeIdentifiant,@PathVariable String numeroIdentifiant) throws JAXBException, CmGetStatusDossierImmatriculationFault{

		Holder<CmCheckExistenceEmployeur> cmCheckExistenceEmployeur = new Holder<CmCheckExistenceEmployeur>();

		cmCheckExistenceEmployeur = verifierExistenceEmployeur.verifierExistenceEmployeur(typeIdentifiant, numeroIdentifiant) ;


		return cmCheckExistenceEmployeur;

	}



	@GetMapping("/recepisseDepot/{idDossier}")
	Holder<GETRECEPISSEDEPOTURL> getRecepisseDepot(@PathVariable String idDossier) {

		Holder<GETRECEPISSEDEPOTURL> recepisse = new Holder<GETRECEPISSEDEPOTURL>();

		recepisse = recepisseDepotService.getRecepisseDepotUrl(idDossier);

		return recepisse;

	}
	
	
	@GetMapping("/infosCompteEmployeur/{idDossier}")
	Holder<CMINFOSEMPLOYEUR> getinfosCompteEmployeur(@PathVariable String idDossier) throws JAXBException {

		Holder<CMINFOSEMPLOYEUR> infosCompte = new Holder<CMINFOSEMPLOYEUR>();

		infosCompte =  infosCompteEmployeurService.getInfosCompteEmployeur(idDossier);

		return infosCompte;

	}
	
	
	@GetMapping("/salaries/{numeroEmployeur}")
	Holder<CMGETPERSONSLINKTOEMPLOYER> getinfosSalaries(@PathVariable String numeroEmployeur) throws JAXBException {

		Holder<CMGETPERSONSLINKTOEMPLOYER> infosalaries = new Holder<CMGETPERSONSLINKTOEMPLOYER>();

		infosalaries =  infosSalarieService.getInfosalarie(numeroEmployeur) ;

		return infosalaries;

	}
	
	
	
	
	
	


	@GetMapping("/certificatImmatriculation/{idDossier}")
	Holder<CmGetCertificatImmatriculation> getCertificatImmatriculation(@PathVariable String idDossier) throws JAXBException, CmGetCertificatImmatriculationFault{

		Holder<CmGetCertificatImmatriculation> certificatImmatriculation = new Holder<CmGetCertificatImmatriculation>();

		certificatImmatriculation = certificatImmatriculationService.getCertificatImmatriculation(idDossier);


		return certificatImmatriculation;

	}



	@PostMapping("/employeurExistant")
    public Holder<CMGETEMPLOYEURDETAILS> getEmployeurexistant(@RequestBody CMGETEMPLOYEURDETAILS cmgetEmployeurDetails) throws JAXBException   {
       // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

        Holder<CMGETEMPLOYEURDETAILS> employeurDetails = new Holder<CMGETEMPLOYEURDETAILS>();

        employeurDetails = immatPortailService.getEmployeurExistant(cmgetEmployeurDetails);

		return employeurDetails;

    }



}

