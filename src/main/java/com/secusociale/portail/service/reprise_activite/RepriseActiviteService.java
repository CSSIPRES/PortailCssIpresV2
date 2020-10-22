package com.secusociale.portail.service.reprise_activite;

import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.model.RepriseActivite;
import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.reprise_activite.CMAddProcessRepriseActivite;
import com.secusociale.portail.service.soap.reprise_activite.CMAddProcessRepriseActivite.Input;
import com.secusociale.portail.service.soap.reprise_activite.CMAddProcessRepriseActivite.Input.Documents;
import com.secusociale.portail.service.soap.reprise_activite.CMAddProcessRepriseActivite.Input.InformationEmployer;
import com.secusociale.portail.service.soap.reprise_activite.CMAddProcessRepriseActivite.Input.InformationReprise;
import com.secusociale.portail.service.soap.reprise_activite.CMAddProcessRepriseActiviteFault;
import com.secusociale.portail.service.soap.reprise_activite.CMAddProcessRepriseActivitePortType;
import com.secusociale.portail.service.soap.reprise_activite.CMAddProcessRepriseActiviteService;
import com.secusociale.portail.service.soap.reprise_activite.ObjectFactory;
import com.secusociale.portail.service.soap.reprise_activite_accuse_url.CMGetUrlAccuseReceptionReprise;
import com.secusociale.portail.service.soap.reprise_activite_accuse_url.CMGetUrlAccuseReceptionRepriseFault;
import com.secusociale.portail.service.soap.reprise_activite_accuse_url.CMGetUrlAccuseReceptionReprisePortType;
import com.secusociale.portail.service.soap.reprise_activite_accuse_url.CMGetUrlAccuseReceptionRepriseService;
import com.secusociale.portail.service.soap.reprise_activite_statut.CMGetStatusRepriseActivite;
import com.secusociale.portail.service.soap.reprise_activite_statut.CMGetStatusRepriseActiviteFault;
import com.secusociale.portail.service.soap.reprise_activite_statut.CMGetStatusRepriseActivitePortType;
import com.secusociale.portail.service.soap.reprise_activite_statut.CMGetStatusRepriseActiviteService;

 
@Service
public class RepriseActiviteService {
	
	 public Holder<CMAddProcessRepriseActivite> createReprise(RepriseActivite demandeReprise) throws JAXBException{
		
		 Input input = new Input();
		 InformationEmployer informationEmployer = new InformationEmployer();
		 InformationReprise informationReprise = new InformationReprise();
		 Documents documents = new Documents();
		 
		 
		 Holder<CMAddProcessRepriseActivite> reprise = new Holder<CMAddProcessRepriseActivite>();
		 
		 ObjectFactory obj = new ObjectFactory();
		 
		 JAXBElement<BigDecimal> nombreDmt = obj.createCMAddProcessRepriseActiviteInputInformationRepriseNombreDmt(demandeReprise.getInput().getInformationReprise().getNombreDmt());
		 JAXBElement<BigDecimal> nmbreContrat = obj.createCMAddProcessRepriseActiviteInputInformationRepriseNombreContrat(demandeReprise.getInput().getInformationReprise().getNombreContrat());
		 
		 
		 informationEmployer.setIdEmployer(demandeReprise.getInput().getInformationEmployer().getIdEmployer());
		 
		 informationReprise.setNombreDmt(nombreDmt);
		 informationReprise.setNombreContrat(nmbreContrat);
		 informationReprise.setTypeDemande(demandeReprise.getInput().getInformationReprise().getTypeDemande());
		 
		 JAXBElement<Boolean> dmt = obj.createCMAddProcessRepriseActiviteInputDocumentsDmt(demandeReprise.getInput().getDocuments().getDmt());
		 JAXBElement<Boolean> formDeclarationReprise = obj.createCMAddProcessRepriseActiviteInputDocumentsFormDeclarationReprise(demandeReprise.getInput().getDocuments().getFormDeclarationReprise());
		 JAXBElement<Boolean> photocopiePiece = obj.createCMAddProcessRepriseActiviteInputDocumentsPhotocopiePiece(demandeReprise.getInput().getDocuments().getPhotocopiePiece());
		 
		 documents.setDmt(dmt);
		 documents.setFormDeclarationReprise(formDeclarationReprise);
		 documents.setPhotocopiePiece(photocopiePiece);
		 
		 input.setInformationEmployer(informationEmployer);
		 input.setInformationReprise(informationReprise);
		 input.setDocuments(documents);
		 
		 reprise.value = obj.createCMAddProcessRepriseActivite();
		 reprise.value.setInput(input);
		 
		    final JAXBContext jc = JAXBContext.newInstance(CMAddProcessRepriseActivite.class);
		    final Marshaller marshaller = jc.createMarshaller();
		    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    marshaller.marshal(reprise.value, System.out);
		 
		    
		    CMAddProcessRepriseActiviteService activiteService = new CMAddProcessRepriseActiviteService();
		    CMAddProcessRepriseActivitePortType activitePortType = activiteService.getCMAddProcessRepriseActivitePort();
		    
		    BindingProvider prov = (BindingProvider) activitePortType ;
		    
		    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
	        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
	        
		 
	        try {
				activitePortType.cmAddProcessRepriseActivite(reprise);
			} catch (CMAddProcessRepriseActiviteFault e) {
				// TODO Auto-generated catch block
				throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
			}
		 
		 
		 return reprise;
		 
	 }
	 
	 
	 
	 public Holder<CMGetUrlAccuseReceptionReprise> getUrlAccuseReprise(String idDossier) throws JAXBException{
		 
		 com.secusociale.portail.service.soap.reprise_activite_accuse_url.CMGetUrlAccuseReceptionReprise.Input input = new com.secusociale.portail.service.soap.reprise_activite_accuse_url.CMGetUrlAccuseReceptionReprise.Input();
		 
		 input.setIdDossier(idDossier);
		 
		 Holder<CMGetUrlAccuseReceptionReprise> accuse = new Holder<CMGetUrlAccuseReceptionReprise>();
		 
		 com.secusociale.portail.service.soap.reprise_activite_accuse_url.ObjectFactory obj = new com.secusociale.portail.service.soap.reprise_activite_accuse_url.ObjectFactory();
		 accuse.value = obj.createCMGetUrlAccuseReceptionReprise();
		 accuse.value.setInput(input);
		 
		 final JAXBContext jc = JAXBContext.newInstance(CMGetUrlAccuseReceptionReprise.class);
		    final Marshaller marshaller = jc.createMarshaller();
		    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    marshaller.marshal(accuse.value, System.out);
		    
		    
		    CMGetUrlAccuseReceptionRepriseService accuseReceptionRepriseService = new CMGetUrlAccuseReceptionRepriseService();
		    CMGetUrlAccuseReceptionReprisePortType accuseReceptionReprisePortType = accuseReceptionRepriseService.getCMGetUrlAccuseReceptionReprisePort();
		    
              BindingProvider prov = (BindingProvider) accuseReceptionReprisePortType ;
		    
		    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
	        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
	        
	        try {
				accuseReceptionReprisePortType.cmGetUrlAccuseReceptionReprise(accuse);
			} catch (CMGetUrlAccuseReceptionRepriseFault e) {
				// TODO Auto-generated catch block
				throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
			}
		 
		return accuse;
		 
		 
	 }
		
	 
	 public Holder<CMGetStatusRepriseActivite> getStatutReprise(String idDossier) throws JAXBException{
		 
		 com.secusociale.portail.service.soap.reprise_activite_statut.CMGetStatusRepriseActivite.Input input = new com.secusociale.portail.service.soap.reprise_activite_statut.CMGetStatusRepriseActivite.Input();
		 input.setIdDossier(idDossier);
		 
		 Holder<CMGetStatusRepriseActivite> statutReprise = new Holder<CMGetStatusRepriseActivite>();
		 com.secusociale.portail.service.soap.reprise_activite_statut.ObjectFactory obj = new com.secusociale.portail.service.soap.reprise_activite_statut.ObjectFactory();
		 
		 statutReprise.value = obj.createCMGetStatusRepriseActivite();
		 statutReprise.value.setInput(input);
		 
		 final JAXBContext jc = JAXBContext.newInstance(CMGetStatusRepriseActivite.class);
		    final Marshaller marshaller = jc.createMarshaller();
		    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    marshaller.marshal(statutReprise.value, System.out);
		 
		    CMGetStatusRepriseActiviteService activiteService = new CMGetStatusRepriseActiviteService();
		    CMGetStatusRepriseActivitePortType activitePortType = activiteService.getCMGetStatusRepriseActivitePort();
		    
              BindingProvider prov = (BindingProvider) activitePortType ;
		    
		    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
	        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
	        
	        try {
				activitePortType.cmGetStatusRepriseActivite(statutReprise);
			} catch (CMGetStatusRepriseActiviteFault e) {
				// TODO Auto-generated catch block
				throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
			}
		 
		return statutReprise;
		 
		 
		 
	 }
		
	 
	
	

}
