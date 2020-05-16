package com.secusociale.portail.service.immatriculation;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.EmployeurService;
import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUND.Input;
import com.secusociale.portail.service.soap.domestique.InboundDomFrm;
import com.secusociale.portail.service.soap.domestique.InboundDomFrmFault;
import com.secusociale.portail.service.soap.domestique.InboundDomFrmPortType;
import com.secusociale.portail.service.soap.domestique.InboundDomFrmService;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDFault;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDPortType;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDService;
import com.secusociale.portail.service.soap.demandeImmatriculation.ObjectFactory;
import com.secusociale.portail.service.soap.employeurExistant.CMGETEMPLOYEURDETAILS;
import com.secusociale.portail.service.soap.employeurExistant.CMGETEMPLOYEURDETAILSFault;
import com.secusociale.portail.service.soap.employeurExistant.CMGETEMPLOYEURDETAILSPortType;
import com.secusociale.portail.service.soap.employeurExistant.CMGETEMPLOYEURDETAILSService;
import com.secusociale.portail.service.soap.immatPublicParapublic.IMMAT2INBOUND;
import com.secusociale.portail.service.soap.immatPublicParapublic.IMMAT2INBOUNDFault;
import com.secusociale.portail.service.soap.immatPublicParapublic.IMMAT2INBOUNDPortType;
import com.secusociale.portail.service.soap.immatPublicParapublic.IMMAT2INBOUNDService;
import com.secusociale.portail.service.soap.immatRepresentantationDiplomatique.IMMATREPDIPLO;
import com.secusociale.portail.service.soap.immatRepresentantationDiplomatique.IMMATREPDIPLOFault;
import com.secusociale.portail.service.soap.immatRepresentantationDiplomatique.IMMATREPDIPLOPortType;
import com.secusociale.portail.service.soap.immatRepresentantationDiplomatique.IMMATREPDIPLOService;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUND;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUNDFault;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUNDPortType;
import com.secusociale.portail.service.soap.maintientAffiliation.MAINTAFFINBOUNDService;


@Service
public class ImmatPortailService {

    private EmployeurService employeurService;


    public ImmatPortailService(EmployeurService employeurService){
        this.employeurService = employeurService;
    }

	public Holder<IMMATRICULATIONINBOUND> createImmatriculationPortail(IMMATRICULATIONINBOUND immatriculation){

		//String immatriculationType = "BVOLN" ;   //Immatriculation Volontaire




		Holder<IMMATRICULATIONINBOUND> immatriculationInbound = new Holder<IMMATRICULATIONINBOUND>();

		Input input = new Input();



	    input.getEmployeList().addAll(immatriculation.getInput().getEmployeList());

		input.setEmployerQuery(immatriculation.getInput().getEmployerQuery());
		input.setMainRegistrationForm(immatriculation.getInput().getMainRegistrationForm());
		input.setLegalRepresentativeForm(immatriculation.getInput().getLegalRepresentativeForm());
	    input.setDocuments(immatriculation.getInput().getDocuments());



		ObjectFactory obj = new ObjectFactory();
		immatriculationInbound.value = obj.createIMMATRICULATIONINBOUND();
		immatriculationInbound.value.setInput(input);

		IMMATRICULATIONINBOUNDService immatriculationinboundService = new IMMATRICULATIONINBOUNDService();
		IMMATRICULATIONINBOUNDPortType immatriculationinboundPortType = immatriculationinboundService.getIMMATRICULATIONINBOUNDPort();

		BindingProvider prov = (BindingProvider) immatriculationinboundPortType ;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);

        try {
			immatriculationinboundPortType.immatriculationINBOUND(immatriculationInbound);
		} catch (IMMATRICULATIONINBOUNDFault e) {

			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}

		return immatriculationInbound;

	}

	 // Save Immatriculation maintien d'affiliation

    public Holder<MAINTAFFINBOUND> createImmatriculationMaintienAffiliation(MAINTAFFINBOUND.Input immatriculation) throws   JAXBException, JAXBException {
        //String immatriculationType = "BVOLN" ;   //Immatriculation Volontaire
        Holder<MAINTAFFINBOUND> immatriculationAffiliation = new Holder<MAINTAFFINBOUND>();
        MAINTAFFINBOUND.Input input = new MAINTAFFINBOUND.Input();
       // input.getEmployeList().addAll(immatriculation.getInput().getEmployeList());
        input.setInformationsGenerales(immatriculation.getInformationsGenerales());
        input.setRegistrationFormInfos(immatriculation.getRegistrationFormInfos());
        input.setInfosSupplementaires(immatriculation.getInfosSupplementaires());
        input.setDocuments(immatriculation.getDocuments());
        com.secusociale.portail.service.soap.maintientAffiliation.ObjectFactory obj = new com.secusociale.portail.service.soap.maintientAffiliation.ObjectFactory();
        immatriculationAffiliation.value = obj.createMAINTAFFINBOUND();
        immatriculationAffiliation.value.setInput(input);

        final JAXBContext jc = JAXBContext.newInstance(MAINTAFFINBOUND.class);
        final Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(immatriculationAffiliation.value, System.out);


        MAINTAFFINBOUNDService immatriculationMainAffiliationService = new MAINTAFFINBOUNDService();
        MAINTAFFINBOUNDPortType immatriculationMainAffiliationPortType = immatriculationMainAffiliationService.getMAINTAFFINBOUNDPort();
        BindingProvider prov = (BindingProvider) immatriculationMainAffiliationPortType ;
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        try {
			immatriculationMainAffiliationPortType.maintAFFINBOUND(immatriculationAffiliation);
		} catch (MAINTAFFINBOUNDFault e) {
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
        return immatriculationAffiliation;
    }




    // Save Immatriculation representant

    public Holder<IMMATREPDIPLO> createImmatriculationRepresentatnt(IMMATREPDIPLO immatriculation) throws   JAXBException {
        // String immatriculationType = "BVOLN" ;   //Immatriculation Volontaire
        Holder<IMMATREPDIPLO> immatriculationRepresentatnt = new Holder<IMMATREPDIPLO>();
        IMMATREPDIPLO.Input input = new IMMATREPDIPLO.Input() ;
        input.getEmployeList().addAll(immatriculation.getInput().getEmployeList());
        input.setEmployerQuery(immatriculation.getInput().getEmployerQuery());
        input.setMainRegistrationForm(immatriculation.getInput().getMainRegistrationForm());
        input.setPersonneContact(immatriculation.getInput().getPersonneContact());
        input.setDocuments(immatriculation.getInput().getDocuments());
        com.secusociale.portail.service.soap.immatRepresentantationDiplomatique.ObjectFactory obj = new com.secusociale.portail.service.soap.immatRepresentantationDiplomatique.ObjectFactory();
        immatriculationRepresentatnt.value = obj.createIMMATREPDIPLO();
        immatriculationRepresentatnt.value.setInput(input);

        final JAXBContext jc = JAXBContext.newInstance(IMMATREPDIPLO.class);
        final Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(immatriculationRepresentatnt.value, System.out);
        IMMATREPDIPLOService immatriculatioRepresentantService = new IMMATREPDIPLOService();
        IMMATREPDIPLOPortType immatriculationRepresentantPortType = immatriculatioRepresentantService.getIMMATREPDIPLOPort();
        BindingProvider prov = (BindingProvider) immatriculationRepresentantPortType ;
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);

        try {
			immatriculationRepresentantPortType.immatREPDIPLO(immatriculationRepresentatnt);
		} catch (IMMATREPDIPLOFault e) {
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
        return immatriculationRepresentatnt;
    }






   public Holder<IMMAT2INBOUND> createImmatPublicParapublique(IMMAT2INBOUND immatriculation) throws JAXBException{

    	Holder<IMMAT2INBOUND> immatPublicPara = new Holder<IMMAT2INBOUND>();
    	 IMMAT2INBOUND.Input input= new IMMAT2INBOUND.Input();
    	 input.getEmployeList().addAll(immatriculation.getInput().getEmployeList());
    	 input.setEmployerQuery(immatriculation.getInput().getEmployerQuery());
    	 input.setMainRegistrationForm(immatriculation.getInput().getMainRegistrationForm());
    	 input.setPersonneContact(immatriculation.getInput().getPersonneContact());
    	 input.setDocuments(immatriculation.getInput().getDocuments());

    	 com.secusociale.portail.service.soap.immatPublicParapublic.ObjectFactory obj= new com.secusociale.portail.service.soap.immatPublicParapublic.ObjectFactory();
    	 immatPublicPara.value = obj.createIMMAT2INBOUND();
    	 immatPublicPara.value.setInput(input);

    	 final JAXBContext jc = JAXBContext.newInstance(IMMAT2INBOUND.class);
         final Marshaller marshaller = jc.createMarshaller();
         marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
         marshaller.marshal(immatPublicPara.value, System.out);

         IMMAT2INBOUNDService immat2inboundService = new IMMAT2INBOUNDService();
         IMMAT2INBOUNDPortType immat2inboundPortType = immat2inboundService.getIMMAT2INBOUNDPort();

         BindingProvider prov = (BindingProvider) immat2inboundPortType ;
         prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
         prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);

         try {
			immat2inboundPortType.immat2INBOUND(immatPublicPara);
		} catch (IMMAT2INBOUNDFault e) {
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}

		return immatPublicPara;

    }

   
   public Holder<InboundDomFrm> createImmatDomestique(InboundDomFrm immatriculation) throws JAXBException{
		
		Holder<InboundDomFrm> inboundDomForm = new Holder<InboundDomFrm>();
		
		InboundDomFrm.Input input = new InboundDomFrm.Input();
		
		input.getEmployeList().addAll(immatriculation.getInput().getEmployeList());
		input.setRegistrationFormInfos(immatriculation.getInput().getRegistrationFormInfos());
		input.setDomesticRegistrationForm(immatriculation.getInput().getDomesticRegistrationForm());
		input.setDocuments(immatriculation.getInput().getDocuments());
		
		
		com.secusociale.portail.service.soap.domestique.ObjectFactory obj = new com.secusociale.portail.service.soap.domestique.ObjectFactory();
		
		inboundDomForm.value = obj.createInboundDomFrm();
		inboundDomForm.value.setInput(input);
		
		final JAXBContext jc = JAXBContext.newInstance(InboundDomFrm.class);
        final Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(inboundDomForm.value, System.out);
		InboundDomFrmService domFrmService = new InboundDomFrmService();
		InboundDomFrmPortType domFrmPortType = domFrmService.getInboundDomFrmPort();
		
		BindingProvider prov = (BindingProvider) domFrmPortType ;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
       
       try {
			domFrmPortType.inboundDomFrm(inboundDomForm);
		} catch (InboundDomFrmFault e) {
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
		
		return inboundDomForm;
		
		
		
	}

 



    // Immaatriculation avec upload de file excel pour charger les employés
    public Holder<IMMATRICULATIONINBOUND> createImmatriculationUploadFilePortail(IMMATRICULATIONINBOUND immatriculation) throws IOException {

        //String immatriculationType = "BVOLN" ;   //Immatriculation Volontaire




        Holder<IMMATRICULATIONINBOUND> immatriculationInbound = new Holder<IMMATRICULATIONINBOUND>();

        Input input = new Input();



        input.getEmployeList().addAll(immatriculation.getInput().getEmployeList());

        input.setEmployerQuery(immatriculation.getInput().getEmployerQuery());
        input.setMainRegistrationForm(immatriculation.getInput().getMainRegistrationForm());
        input.setLegalRepresentativeForm(immatriculation.getInput().getLegalRepresentativeForm());
        input.setDocuments(immatriculation.getInput().getDocuments());


        // Chargement de la liste des employés via le fichier uploader
       // List<Input.EmployeList> employes = this.employeurService.mapReapExcelDataEmployeDB(input.getFileData());
      //  input.setEmployeList(employes);




        ObjectFactory obj = new ObjectFactory();
        immatriculationInbound.value = obj.createIMMATRICULATIONINBOUND();
        immatriculationInbound.value.setInput(input);

        IMMATRICULATIONINBOUNDService immatriculationinboundService = new IMMATRICULATIONINBOUNDService();
        IMMATRICULATIONINBOUNDPortType immatriculationinboundPortType = immatriculationinboundService.getIMMATRICULATIONINBOUNDPort();

        BindingProvider prov = (BindingProvider) immatriculationinboundPortType ;
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);

        try {
            immatriculationinboundPortType.immatriculationINBOUND(immatriculationInbound);
        } catch (IMMATRICULATIONINBOUNDFault e) {

            throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
        }

        return immatriculationInbound;

    }
    
    public Holder<CMGETEMPLOYEURDETAILS> getEmployeurExistant(CMGETEMPLOYEURDETAILS employeurDetail) throws JAXBException{
    	
    	Holder<CMGETEMPLOYEURDETAILS> cmGetEmployeurDetails = new Holder<CMGETEMPLOYEURDETAILS>();
    	
      CMGETEMPLOYEURDETAILS.Input input = new CMGETEMPLOYEURDETAILS.Input();
      input.setTypeIdentifiant(employeurDetail.getInput().getTypeIdentifiant());
      input.setNumeroIdentifiant(employeurDetail.getInput().getNumeroIdentifiant());
      input.setNumeroUnique(employeurDetail.getInput().getNumeroUnique());
    	
      com.secusociale.portail.service.soap.employeurExistant.ObjectFactory obj = new com.secusociale.portail.service.soap.employeurExistant.ObjectFactory();
		cmGetEmployeurDetails.value = obj.createCMGETEMPLOYEURDETAILS();
		cmGetEmployeurDetails.value.setInput(input);    
		
		 final JAXBContext jc = JAXBContext.newInstance(CMGETEMPLOYEURDETAILS.class);
	     final Marshaller marshaller = jc.createMarshaller();
	     marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	     marshaller.marshal(cmGetEmployeurDetails.value, System.out);
		
		CMGETEMPLOYEURDETAILSService cmgetemployeurdetailsService = new CMGETEMPLOYEURDETAILSService();
		CMGETEMPLOYEURDETAILSPortType cmgetemployeurdetailsPortType = cmgetemployeurdetailsService.getCMGETEMPLOYEURDETAILSPort();
      

        BindingProvider prov = (BindingProvider) cmgetemployeurdetailsPortType ;
        prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        try {
			cmgetemployeurdetailsPortType.cmGETEMPLOYEURDETAILS(cmGetEmployeurDetails);
		} catch (CMGETEMPLOYEURDETAILSFault e) {
			 
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
		
		return cmGetEmployeurDetails;
    	
    }
    
    
    


}
