package com.secusociale.portail.service.remise_gracieuse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.google.protobuf.TextFormat.ParseException;
import com.secusociale.portail.model.RemiseGracieuse;
import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.CmGetUrlAccuseReceptionRemiseGracieuse;
import com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.CmGetUrlAccuseReceptionRemiseGracieuseFault;
import com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.CmGetUrlAccuseReceptionRemiseGracieusePortType;
import com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.CmGetUrlAccuseReceptionRemiseGracieuseService;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieuse;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieuse.Input;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieuse.Input.Documents;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieuse.Input.InformationDemande;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieuse.Input.InformationEmployeur;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieuseFault;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieusePortType;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieuseService;
import com.secusociale.portail.service.soap.remise_gracieuse_add.ObjectFactory;
import com.secusociale.portail.service.soap.remise_gracieuse_notification_url.CMGETURLNOTIFICATION;
import com.secusociale.portail.service.soap.remise_gracieuse_notification_url.CMGETURLNOTIFICATIONFault;
import com.secusociale.portail.service.soap.remise_gracieuse_notification_url.CMGETURLNOTIFICATIONPortType;
import com.secusociale.portail.service.soap.remise_gracieuse_notification_url.CMGETURLNOTIFICATIONService;
import com.secusociale.portail.service.soap.remise_gracieuse_statut.CMGetStatusRemiseGracieuse;
import com.secusociale.portail.service.soap.remise_gracieuse_statut.CMGetStatusRemiseGracieuseFault;
import com.secusociale.portail.service.soap.remise_gracieuse_statut.CMGetStatusRemiseGracieusePortType;
import com.secusociale.portail.service.soap.remise_gracieuse_statut.CMGetStatusRemiseGracieuseService;

@Service
public class RemiseGracieuseService {

	
	public Holder<CmAddDemandeRemiseGracieuse> createRemiseGracieuse(RemiseGracieuse demandeRemiseGracieuse) throws JAXBException, ParseException, DatatypeConfigurationException, java.text.ParseException{
		
		
		
		Input input = new Input();
		InformationDemande informationDemande = new InformationDemande();
		InformationEmployeur informationEmployeur = new InformationEmployeur();
		Documents documents =  new Documents();
		
		informationEmployeur.setNumeroEmployeur(demandeRemiseGracieuse.getInput().getInformationEmployeur().getNumeroEmployeur());
		
		
		
		
		Holder<CmAddDemandeRemiseGracieuse> remiseGracieuse = new Holder<CmAddDemandeRemiseGracieuse>();
		ObjectFactory obj = new ObjectFactory();
		
		XMLGregorianCalendar dd = demandeRemiseGracieuse.formatToGregorianCalendar(demandeRemiseGracieuse.getInput().getInformationDemande().getDateDebutPeriode());
		XMLGregorianCalendar df = demandeRemiseGracieuse.formatToGregorianCalendar(demandeRemiseGracieuse.getInput().getInformationDemande().getDateFinPeriode());
		
		 informationDemande.setDateDebutPeriode(dd);
		 informationDemande.setDateFinPeriode(df);
		 informationDemande.setInstitution(demandeRemiseGracieuse.getInput().getInformationDemande().getInstitution());
		 informationDemande.setMontant(demandeRemiseGracieuse.getInput().getInformationDemande().getMontant());
		 informationDemande.setMotifDemande(demandeRemiseGracieuse.getInput().getInformationDemande().getMotifDemande());
		 
		 documents.setDemandeEcrite(demandeRemiseGracieuse.getInput().getDocuments().getDemandeEcrite());
		
		input.setInformationEmployeur(informationEmployeur);
		input.setInformationDemande(informationDemande);
		input.setDocuments(documents);
		 
		remiseGracieuse.value = obj.createCmAddDemandeRemiseGracieuse();
		remiseGracieuse.value.setInput(input);
		
		final JAXBContext jc = JAXBContext.newInstance(CmAddDemandeRemiseGracieuse.class);
	    final Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(remiseGracieuse.value, System.out);
		
	    CmAddDemandeRemiseGracieuseService addDemandeRemiseGracieuseService = new CmAddDemandeRemiseGracieuseService();
	    CmAddDemandeRemiseGracieusePortType addDemandeRemiseGracieusePortType = addDemandeRemiseGracieuseService.getCmAddDemandeRemiseGracieusePort();
	    BindingProvider prov = (BindingProvider) addDemandeRemiseGracieusePortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
	    
        try {
			addDemandeRemiseGracieusePortType.cmAddDemandeRemiseGracieuse(remiseGracieuse);
		} catch (CmAddDemandeRemiseGracieuseFault e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
	    
		return remiseGracieuse;
		
	}
	
	
	
	
	public Holder<CmGetUrlAccuseReceptionRemiseGracieuse> getUrlRemise(String idDossier) throws JAXBException{
		
		com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.CmGetUrlAccuseReceptionRemiseGracieuse.Input input = new com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.CmGetUrlAccuseReceptionRemiseGracieuse.Input();
		
		input.setIdDossier(idDossier);
		
		Holder<CmGetUrlAccuseReceptionRemiseGracieuse> urlAccuseRemise = new Holder<CmGetUrlAccuseReceptionRemiseGracieuse>();
		
		com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.ObjectFactory obj = new com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.ObjectFactory();
		
		urlAccuseRemise.value = obj.createCmGetUrlAccuseReceptionRemiseGracieuse();
		urlAccuseRemise.value.setInput(input);
		
		final JAXBContext jc = JAXBContext.newInstance(CmGetUrlAccuseReceptionRemiseGracieuse.class);
	    final Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(urlAccuseRemise.value, System.out);
	    
	    CmGetUrlAccuseReceptionRemiseGracieuseService accuseReceptionRemiseGracieuseService = new CmGetUrlAccuseReceptionRemiseGracieuseService();
	    CmGetUrlAccuseReceptionRemiseGracieusePortType accuseReceptionRemiseGracieusePortType = accuseReceptionRemiseGracieuseService.getCmGetUrlAccuseReceptionRemiseGracieusePort();
	    
        BindingProvider prov = (BindingProvider) accuseReceptionRemiseGracieusePortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        try {
			accuseReceptionRemiseGracieusePortType.cmGetUrlAccuseReceptionRemiseGracieuse(urlAccuseRemise);
		} catch (CmGetUrlAccuseReceptionRemiseGracieuseFault e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
        
        
		return urlAccuseRemise;
		
		
	}
	
	
	public Holder<CMGetStatusRemiseGracieuse> getStatutRemise(String idDossier) throws JAXBException{
		
		com.secusociale.portail.service.soap.remise_gracieuse_statut.CMGetStatusRemiseGracieuse.Input input = new com.secusociale.portail.service.soap.remise_gracieuse_statut.CMGetStatusRemiseGracieuse.Input();
		
		input.setIdDossier(idDossier);
		
		Holder<CMGetStatusRemiseGracieuse> statutRemise = new Holder<CMGetStatusRemiseGracieuse>();
		
		com.secusociale.portail.service.soap.remise_gracieuse_statut.ObjectFactory obj = new com.secusociale.portail.service.soap.remise_gracieuse_statut.ObjectFactory();
		statutRemise.value = obj.createCMGetStatusRemiseGracieuse();
		statutRemise.value.setInput(input);
		
		final JAXBContext jc = JAXBContext.newInstance(CMGetStatusRemiseGracieuse.class);
	    final Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(statutRemise.value, System.out);
		
	    CMGetStatusRemiseGracieuseService cmGetStatusRemiseGracieuseService = new CMGetStatusRemiseGracieuseService();
	    CMGetStatusRemiseGracieusePortType cmGetStatusRemiseGracieusePortType = cmGetStatusRemiseGracieuseService.getCMGetStatusRemiseGracieusePort();
	    
        BindingProvider prov = (BindingProvider) cmGetStatusRemiseGracieusePortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        try {
			cmGetStatusRemiseGracieusePortType.cmGetStatusRemiseGracieuse(statutRemise);
		} catch (CMGetStatusRemiseGracieuseFault e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
        
		return statutRemise;
		
	}
	 
	public Holder<CMGETURLNOTIFICATION> getUrlNotification(String idDossier) throws JAXBException{
		
		com.secusociale.portail.service.soap.remise_gracieuse_notification_url.CMGETURLNOTIFICATION.Input input = new com.secusociale.portail.service.soap.remise_gracieuse_notification_url.CMGETURLNOTIFICATION.Input();
		input.setIdDossier(idDossier);
		
		Holder<CMGETURLNOTIFICATION> urlNotification = new Holder<CMGETURLNOTIFICATION>();
		com.secusociale.portail.service.soap.remise_gracieuse_notification_url.ObjectFactory obj = new com.secusociale.portail.service.soap.remise_gracieuse_notification_url.ObjectFactory();
		
		urlNotification.value = obj.createCMGETURLNOTIFICATION();
		urlNotification.value.setInput(input);
		
		
		final JAXBContext jc = JAXBContext.newInstance(CMGETURLNOTIFICATION.class);
	    final Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(urlNotification.value, System.out);
	    
	    CMGETURLNOTIFICATIONService cmgeturlnotificationService = new CMGETURLNOTIFICATIONService();
	    CMGETURLNOTIFICATIONPortType cmgeturlnotificationPortType = cmgeturlnotificationService.getCMGETURLNOTIFICATIONPort();
	    
        BindingProvider prov = (BindingProvider) cmgeturlnotificationPortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
	    
        
        try {
			cmgeturlnotificationPortType.cmGETURLNOTIFICATION(urlNotification);
		} catch (CMGETURLNOTIFICATIONFault e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
		
		return urlNotification;
		
	}
	
	
}
