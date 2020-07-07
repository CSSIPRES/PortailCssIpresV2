package com.secusociale.portail.service.immatriculation;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.recepisseDepot.GETRECEPISSEDEPOTURL;
import com.secusociale.portail.service.soap.recepisseDepot.GETRECEPISSEDEPOTURLFault;
import com.secusociale.portail.service.soap.recepisseDepot.GETRECEPISSEDEPOTURLPortType;
import com.secusociale.portail.service.soap.recepisseDepot.GETRECEPISSEDEPOTURLService;
import com.secusociale.portail.service.soap.recepisseDepot.ObjectFactory;

@Service
public class RecepisseDepotService {
	
	public Holder<GETRECEPISSEDEPOTURL> getRecepisseDepotUrl(String idDossier){
		
		Holder<GETRECEPISSEDEPOTURL> recepisseInboud = new Holder<GETRECEPISSEDEPOTURL>();
		
		ObjectFactory obj = new ObjectFactory();
		recepisseInboud.value = obj.createGETRECEPISSEDEPOTURL();
		recepisseInboud.value.setProcessFolwId(idDossier);
		
		GETRECEPISSEDEPOTURLService getrecepissedepoturlService = new GETRECEPISSEDEPOTURLService();
		GETRECEPISSEDEPOTURLPortType getrecepissedepoturlPortType = getrecepissedepoturlService.getGETRECEPISSEDEPOTURLPort();
		
		 BindingProvider prov = (BindingProvider) getrecepissedepoturlPortType;
		    
		 prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
	     prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
	     
	     try {
			getrecepissedepoturlPortType.getRECEPISSEDEPOTURL(recepisseInboud);
		} catch (GETRECEPISSEDEPOTURLFault e) {
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
		
		
		return recepisseInboud;
		
		
	}

}
