package com.secusociale.portail.service.declaration;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.declarations_manquantes.CMINFORMATIONMANQUEDNSIPRES;
import com.secusociale.portail.service.soap.declarations_manquantes.CMINFORMATIONMANQUEDNSIPRES.Input;
import com.secusociale.portail.service.soap.declarations_manquantes.CMINFORMATIONMANQUEDNSIPRESFault;
import com.secusociale.portail.service.soap.declarations_manquantes.CMINFORMATIONMANQUEDNSIPRESPortType;
import com.secusociale.portail.service.soap.declarations_manquantes.CMINFORMATIONMANQUEDNSIPRESService;
import com.secusociale.portail.service.soap.declarations_manquantes.ObjectFactory;

@Service
public class DeclarationsManquantesService {
	
	public Holder<CMINFORMATIONMANQUEDNSIPRES> getDeclarationManquantes(CMINFORMATIONMANQUEDNSIPRES declarationManquantes) throws JAXBException{
		
		Input input = new Input();
		
		input.setAncienNumeroIpres(declarationManquantes.getInput().getAncienNumeroIpres());
		input.setIdEmployer(declarationManquantes.getInput().getIdEmployer());
		
		Holder<CMINFORMATIONMANQUEDNSIPRES> decmanquantes = new Holder<CMINFORMATIONMANQUEDNSIPRES>();
		
		ObjectFactory obj = new ObjectFactory();
		
		decmanquantes.value = obj.createCMINFORMATIONMANQUEDNSIPRES();
		decmanquantes.value.setInput(input);
		
		final JAXBContext jc = JAXBContext.newInstance(CMINFORMATIONMANQUEDNSIPRES.class);
	    final Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(decmanquantes.value, System.out);
	    
	    CMINFORMATIONMANQUEDNSIPRESService cminformationmanquednsipresService = new CMINFORMATIONMANQUEDNSIPRESService();
	    CMINFORMATIONMANQUEDNSIPRESPortType cminformationmanquednsipresPortType = cminformationmanquednsipresService.getCMINFORMATIONMANQUEDNSIPRESPort();
	    
        BindingProvider prov = (BindingProvider) cminformationmanquednsipresPortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        try {
			cminformationmanquednsipresPortType.cmINFORMATIONMANQUEDNSIPRES(decmanquantes);
		} catch (CMINFORMATIONMANQUEDNSIPRESFault e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
	    
	    
		return decmanquantes;
		
	}

}
