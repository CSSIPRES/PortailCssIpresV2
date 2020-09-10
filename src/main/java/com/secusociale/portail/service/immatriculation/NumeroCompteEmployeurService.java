package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.numeroCompteEmployeur.CMPerAccountById;
import com.secusociale.portail.service.soap.numeroCompteEmployeur.CMPerAccountById.Input;
import com.secusociale.portail.service.soap.numeroCompteEmployeur.CMPerAccountByIdFault;
import com.secusociale.portail.service.soap.numeroCompteEmployeur.CMPerAccountByIdPortType;
import com.secusociale.portail.service.soap.numeroCompteEmployeur.CMPerAccountByIdService;
import com.secusociale.portail.service.soap.numeroCompteEmployeur.ObjectFactory;

@Service
public class NumeroCompteEmployeurService {

	
	public Holder<CMPerAccountById> getNumeroCompteByPersonId(String personId) throws JAXBException{
		
		Holder<CMPerAccountById> numeroCompte = new Holder<CMPerAccountById>();
		
		Input input = new Input() ;
		input.setPersonId(personId);
		
		ObjectFactory obj = new ObjectFactory();
				
		numeroCompte.value = obj.createCMPerAccountById();
		numeroCompte.value.setInput(input);
		
		 final JAXBContext jc = JAXBContext.newInstance(CMPerAccountById.class); 
		 final Marshaller marshaller = jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 marshaller.marshal(numeroCompte.value, System.out);
		
		 
		 CMPerAccountByIdService accountByIdService = new CMPerAccountByIdService() ;
		 CMPerAccountByIdPortType accountByIdPortType = accountByIdService.getCMPerAccountByIdPort();
		 
		 BindingProvider prov = (BindingProvider) accountByIdPortType ;
			
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
		    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		 
		    try {
				accountByIdPortType.cmPerAccountById(numeroCompte);
			} catch (CMPerAccountByIdFault e) {
				throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
			}
		 
		return numeroCompte;
		
		
	}
	
}
