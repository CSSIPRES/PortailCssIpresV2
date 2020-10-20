package com.secusociale.portail.service.remise_gracieuse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.CmGetUrlAccuseReceptionRemiseGracieuse;
import com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.CmGetUrlAccuseReceptionRemiseGracieuseFault;
import com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.CmGetUrlAccuseReceptionRemiseGracieusePortType;
import com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.CmGetUrlAccuseReceptionRemiseGracieuseService;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieuse;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieuse.Input;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieuseFault;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieusePortType;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieuseService;
import com.secusociale.portail.service.soap.remise_gracieuse_add.ObjectFactory;

@Service
public class RemiseGracieuseService {

	
	public Holder<CmAddDemandeRemiseGracieuse> createRemiseGracieuse(CmAddDemandeRemiseGracieuse demandeRemiseGracieuse) throws JAXBException{
		
		Input input = new Input();
		input.setInformationEmployeur(demandeRemiseGracieuse.getInput().getInformationEmployeur());
		input.setInformationDemande(demandeRemiseGracieuse.getInput().getInformationDemande());
		input.setDocuments(demandeRemiseGracieuse.getInput().getDocuments());
		
		Holder<CmAddDemandeRemiseGracieuse> remiseGracieuse = new Holder<CmAddDemandeRemiseGracieuse>();
		ObjectFactory obj = new ObjectFactory();
		
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
	
	
}
