package com.secusociale.portail.service.paiement;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.facturesDns.CMPAYDNSXAI;
import com.secusociale.portail.service.soap.facturesDns.CMPAYDNSXAIFault;
import com.secusociale.portail.service.soap.facturesDns.CMPAYDNSXAIPortType;
import com.secusociale.portail.service.soap.facturesDns.CMPAYDNSXAIService;
import com.secusociale.portail.service.soap.facturesDns.ObjectFactory;

@Service
public class ListefacturesService {
	
	public Holder<CMPAYDNSXAI> getListFactures(String numeroCompte) throws JAXBException{
		
		Holder<CMPAYDNSXAI> listeFacture = new Holder<CMPAYDNSXAI>();
		
		ObjectFactory obj = new ObjectFactory();
		listeFacture.value = obj.createCMPAYDNSXAI();
		listeFacture.value.setAcctId(numeroCompte);
		
		final JAXBContext jc = JAXBContext.newInstance(CMPAYDNSXAI.class); 
		 final Marshaller marshaller = jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 marshaller.marshal(listeFacture.value, System.out);
		 
		 CMPAYDNSXAIService cmpaydnsxaiService = new CMPAYDNSXAIService() ;
		 CMPAYDNSXAIPortType cmpaydnsxaiPortType = cmpaydnsxaiService.getCMPAYDNSXAIPort();
		 
		 BindingProvider prov = (BindingProvider) cmpaydnsxaiPortType ;
			
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
		    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		    
		    try {
				cmpaydnsxaiPortType.cmPAYDNSXAI(listeFacture);
			} catch (CMPAYDNSXAIFault e) {
				throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
			}
		    
		    
		return listeFacture;
		
		
	}

}
