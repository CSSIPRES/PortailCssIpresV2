package com.secusociale.portail.web.rest.immatriculation;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.bind.JAXBException;
import javax.xml.ws.Holder;


import com.secusociale.portail.service.soap.immatRepresentantationDiplomatique.IMMATREPDIPLO;
import com.secusociale.portail.service.soap.immatRepresentantationDiplomatique.IMMATREPDIPLOFault;
import com.secusociale.portail.service.soap.infosEmployeur.CMINFOSEMPLOYEUR;
import com.secusociale.portail.service.soap.infosSalaries.CMGETPERSONSLINKTOEMPLOYER;
import com.secusociale.portail.service.soap.listeEmployes.EMPLOYESLISTSERVICE;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUND;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUNDFault;
import com.secusociale.portail.service.soap.numeroCompteEmployeur.CMPerAccountById;
import com.secusociale.portail.service.soap.recepisseDepot.GETRECEPISSEDEPOTURL;
import com.secusociale.portail.service.soap.soldeEmployeur.XAIGETSOLDE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.service.immatriculation.AgencesRattachementService;
import com.secusociale.portail.service.immatriculation.CertificatImmatriculationService;
import com.secusociale.portail.service.immatriculation.IdentifiantsEmployeurService;
import com.secusociale.portail.service.immatriculation.ImmatPortailService;
import com.secusociale.portail.service.immatriculation.InfoSalariesService;
import com.secusociale.portail.service.immatriculation.InfosCompteEmployeurService;
import com.secusociale.portail.service.immatriculation.InfosEmployeurService;
import com.secusociale.portail.service.immatriculation.ListeEmployesService;
import com.secusociale.portail.service.immatriculation.NumeroCompteEmployeurService;
import com.secusociale.portail.service.immatriculation.RecepisseDepotService;
import com.secusociale.portail.service.immatriculation.SoldeEmployeurService;
import com.secusociale.portail.service.immatriculation.StatutDossierImmatriculationService;
import com.secusociale.portail.service.immatriculation.VerifierExistenceEmployeur;
import com.secusociale.portail.service.soap.agencesRattachement.AGENCESEMPLOYEURSERVICE;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculation;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculationFault;
import com.secusociale.portail.service.soap.checkExistenceEmployeur.CmCheckExistenceEmployeur;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDFault;
import com.secusociale.portail.service.soap.derniersDeclarations.DERNDNSEMPLOYEURSERVICE;
import com.secusociale.portail.service.soap.domestique.InboundDomFrm;
import com.secusociale.portail.service.soap.employeurExistant.CMGETEMPLOYEURDETAILS;
import com.secusociale.portail.service.soap.employeurInfos.CMEMPLOYEURINFOS;
import com.secusociale.portail.service.soap.identifiantsEmployeurs.IDsEMPLOYEURSERVICE;
import com.secusociale.portail.service.soap.immatPublicParapublic.IMMAT2INBOUND;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculation;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculationFault;
//import com.secusociale.portail.web.rest.ImmatriculationResource;
import com.secusociale.portail.web.rest.errors.EmailAlreadyUsedException;
import com.secusociale.portail.web.rest.errors.InvalidPasswordException;
import com.secusociale.portail.web.rest.errors.LoginAlreadyUsedException;

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
    
    @Autowired
    private ListeEmployesService listeEmployesService ;

    @Autowired
    private SoldeEmployeurService soldeEmployeurService;
    
    @Autowired
    private IdentifiantsEmployeurService identifiantsEmployeurService;
    
    @Autowired
    private AgencesRattachementService agencesRattachementService ;
    
    @Autowired
    private InfosEmployeurService infosEmployeurService ;
    
    @Autowired
    private NumeroCompteEmployeurService numeroCompteService ;
    
    /**
     * {@code POST  /immatPortail} : Immatriculation Maintient affiliation.
     *
     * @param immatriculationPortail the managed user View Model.
     * @throws IOException 
     */
 
	@PostMapping("/immatPortail")
    public Holder<IMMATRICULATIONINBOUND> createImmatriculationPortail(@RequestBody IMMATRICULATIONINBOUND immatriculationPortail) throws IOException   {
       // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

        Holder<IMMATRICULATIONINBOUND> immatriculationInbound = new Holder<IMMATRICULATIONINBOUND>();

           immatriculationInbound = immatPortailService.createImmatriculationPortail(immatriculationPortail);

		return immatriculationInbound;

    }

	/**
     * {@code POST  /maintient-affiliation} : Immatriculation Maintient affiliation.
     *
     * @param maintient the managed user View Model.
	 * @throws JAXBException 
     */
	@PostMapping("/maintient-affiliation")
    public Holder<MAINTAFFINBOUND> createMaintientAffiliation(@RequestBody MAINTAFFINBOUND maintient) throws JAXBException   {
       // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

        Holder<MAINTAFFINBOUND> immatriculationInbound = new Holder<MAINTAFFINBOUND>();

           immatriculationInbound = immatPortailService.createImmatriculationMaintienAffiliation(maintient);

		return immatriculationInbound;

    }
  
	/**
     * {@code POST  /representation-diplomatique} : Immatriculation Representation diplomatique.
     *
     * @param diplomatique the managed user View Model.
	 * @throws JAXBException 
     */
	@PostMapping("/representation-diplomatique")
    public Holder<IMMATREPDIPLO> createRepresentationDiplomatique(@RequestBody IMMATREPDIPLO diplomatique) throws JAXBException   {
       // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

        Holder<IMMATREPDIPLO> immatriculationInbound = new Holder<IMMATREPDIPLO>();

           immatriculationInbound = immatPortailService.createImmatriculationRepresentatnt(diplomatique);

		return immatriculationInbound;

    }
    
	/**
     * {@code POST  /publique-parapublique} : Immatriculation des publics et parapublics.
     *
     * @param publicPara the managed user View Model.
	 * @throws JAXBException 
     */
	@PostMapping("/publique-parapublique")
    public Holder<IMMAT2INBOUND> createPubliqueParapublique(@RequestBody IMMAT2INBOUND publicPara) throws JAXBException   {
       // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

        Holder<IMMAT2INBOUND> immatriculationInbound = new Holder<IMMAT2INBOUND>();

           immatriculationInbound = immatPortailService.createImmatPublicParapublique(publicPara);

		return immatriculationInbound;

    }

	

	/**
     * {@code POST  /domestique} : Immatriculation des publics et parapublics.
     *
     * @param domestique the managed user View Model.
	 * @throws JAXBException 
     */
	 @PostMapping("/domestique")
	    public Holder<InboundDomFrm> createImmatriculationPortail(@RequestBody InboundDomFrm domestique) throws JAXBException  {
	       // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

	        Holder<InboundDomFrm> immatriculationInbound = new Holder<InboundDomFrm>();

	           immatriculationInbound = immatPortailService.createImmatDomestique(domestique);

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
	Holder<CmGetCertificatImmatriculation> getCertificatImmatriculation(@PathVariable String idDossier) throws JAXBException, CmGetCertificatImmatriculationFault {

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
	
	
	@GetMapping("/listEmployes/{numeroUnique}")
	Holder<EMPLOYESLISTSERVICE> getListeemployes(@PathVariable String numeroUnique) throws JAXBException {

		Holder<EMPLOYESLISTSERVICE> employes = new Holder<EMPLOYESLISTSERVICE>();

		employes =   listeEmployesService.getListeEmployes(numeroUnique);

		return employes;

	}
	
	
	@GetMapping("/solde/{numeroUnique}")
	Holder<XAIGETSOLDE> getSolde(@PathVariable String numeroUnique) throws JAXBException {

		Holder<XAIGETSOLDE> solde = new Holder<XAIGETSOLDE>();

		solde =  soldeEmployeurService.getSoldeEmployeur(numeroUnique);

		return solde;

	}
	
	
	@GetMapping("/idsEmployeur/{numeroUnique}")
	Holder<IDsEMPLOYEURSERVICE> getIdentifiantsEmployeur(@PathVariable String numeroUnique) throws JAXBException {

		Holder<IDsEMPLOYEURSERVICE> ids = new Holder<IDsEMPLOYEURSERVICE>();

		ids =  identifiantsEmployeurService.getIdentifiantsEmployeurs(numeroUnique);

		return ids;

	}
	
	
	@GetMapping("/agences/{numeroUnique}")
	Holder<AGENCESEMPLOYEURSERVICE> getAgencesEmployeur(@PathVariable String numeroUnique) throws JAXBException {

		Holder<AGENCESEMPLOYEURSERVICE> agences = new Holder<AGENCESEMPLOYEURSERVICE>();

		agences =   agencesRattachementService.getAgencesRattachement(numeroUnique);

		return agences;
	}
	
	
	@GetMapping("/employeur/{numeroUnique}")
	Holder<CMEMPLOYEURINFOS> getEmployeurbyPersonByNumeroUnique(@PathVariable String numeroUnique) throws JAXBException {

		Holder<CMEMPLOYEURINFOS> employeur = new Holder<CMEMPLOYEURINFOS>();

		employeur =   infosEmployeurService.getEmployeurInfos(numeroUnique);

		return employeur;

	}
	
	

	@GetMapping("/numeroCompte/{numeroUnique}")
	Holder<CMPerAccountById> getNumeroCompteByPersonId(@PathVariable String numeroUnique) throws JAXBException {

		Holder<CMPerAccountById> compte = new Holder<CMPerAccountById>();

		compte =   numeroCompteService.getNumeroCompteByPersonId(numeroUnique);

		return compte;

	}



}

