package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.soldeEmployeur.ObjectFactory;
import com.secusociale.portail.service.soap.soldeEmployeur.XAIGETSOLDE;
import com.secusociale.portail.service.soap.soldeEmployeur.XAIGETSOLDE.Input;
import com.secusociale.portail.service.soap.soldeEmployeur.XAIGETSOLDEFault;
import com.secusociale.portail.service.soap.soldeEmployeur.XAIGETSOLDEPortType;
import com.secusociale.portail.service.soap.soldeEmployeur.XAIGETSOLDEService;

@Service
public class SoldeEmployeurService {
	
	public Holder<XAIGETSOLDE> getSoldeEmployeur(String numeroUnique) throws JAXBException{
		
		Holder<XAIGETSOLDE> solde = new Holder<XAIGETSOLDE>();
		
	Input input = new Input();
	input.setPersonId(numeroUnique);
	
	ObjectFactory obj = new ObjectFactory() ;
	
	solde.value = obj.createXAIGETSOLDE();
	solde.value.setInput(input);
	
	 final JAXBContext jc = JAXBContext.newInstance(XAIGETSOLDE.class); 
	 final Marshaller marshaller = jc.createMarshaller();
	 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	 marshaller.marshal(solde.value, System.out);
		
	 XAIGETSOLDEService service = new XAIGETSOLDEService();
	 XAIGETSOLDEPortType portType = service.getXAIGETSOLDEPort();
	 
	 
	 BindingProvider prov = (BindingProvider) portType ;
		
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
	    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
	    
	   try {
		portType.xaiGETSOLDE(solde);
	} catch (XAIGETSOLDEFault e) {
		throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
	}
		return solde;
		
	}

}
