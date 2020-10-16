package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.ficheEmployeur.CMFICHEPORTXAI;
import com.secusociale.portail.service.soap.ficheEmployeur.CMFICHEPORTXAI.Input;
import com.secusociale.portail.service.soap.ficheEmployeur.CMFICHEPORTXAIFault;
import com.secusociale.portail.service.soap.ficheEmployeur.CMFICHEPORTXAIPortType;
import com.secusociale.portail.service.soap.ficheEmployeur.CMFICHEPORTXAIService;
import com.secusociale.portail.service.soap.ficheEmployeur.ObjectFactory;

@Service
public class FicheEmployeurService {
	
	public Holder<CMFICHEPORTXAI> updateEmployeur(CMFICHEPORTXAI employeurUpdate) throws JAXBException{
		
		Input input = new Input() ;
		
		input.setChangeStatus(employeurUpdate.getInput().getChangeStatus());
		input.setCommentaire(employeurUpdate.getInput().getCommentaire());
		input.setDemandeEcrite(employeurUpdate.getInput().getDemandeEcrite());
		input.setIdentifiant(employeurUpdate.getInput().getIdentifiant());
		input.setNouveauStatut(employeurUpdate.getInput().getNouveauStatut());
		input.setTypeOfContact(employeurUpdate.getInput().getTypeOfContact());
		
		Holder<CMFICHEPORTXAI> emp = new Holder<CMFICHEPORTXAI>();
		
		ObjectFactory  obj = new ObjectFactory();
		
		emp.value = obj.createCMFICHEPORTXAI() ;
		emp.value.setInput(input);
		
		final JAXBContext jc = JAXBContext.newInstance(CMFICHEPORTXAI.class);
	    final Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(emp.value, System.out);
		
	    CMFICHEPORTXAIService cmficheportxaiService = new CMFICHEPORTXAIService() ;
	    CMFICHEPORTXAIPortType cmficheportxaiPortType = cmficheportxaiService.getCMFICHEPORTXAIPort();
	    

        BindingProvider prov = (BindingProvider) cmficheportxaiPortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        try {
			cmficheportxaiPortType.cmFICHEPORTXAI(emp);
		} catch (CMFICHEPORTXAIFault e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
	    
		return emp;
		
	}

}
