package com.secusociale.portail.service.declaration;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.getTauxPlafonds.CMGETCONSTANTS;
import com.secusociale.portail.service.soap.getTauxPlafonds.CMGETCONSTANTSFault;
import com.secusociale.portail.service.soap.getTauxPlafonds.CMGETCONSTANTSPortType;
import com.secusociale.portail.service.soap.getTauxPlafonds.CMGETCONSTANTSService;
import com.secusociale.portail.service.soap.getTauxPlafonds.ObjectFactory;

@Service
public class GetTauxEtPlafondsService {
	
	public Holder<CMGETCONSTANTS> getTauxPlafonds(){
		
		Holder<CMGETCONSTANTS> constantes = new Holder<CMGETCONSTANTS>();
		
		ObjectFactory obj = new ObjectFactory();
		constantes.value = obj.createCMGETCONSTANTS();
		
		
		CMGETCONSTANTSService cmgetconstantsService = new CMGETCONSTANTSService();
		CMGETCONSTANTSPortType cmgetconstantsPortType  = cmgetconstantsService.getCMGETCONSTANTSPort();
		
		 BindingProvider prov = (BindingProvider) cmgetconstantsPortType ;
			
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
		    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		    
		    try {
				cmgetconstantsPortType.cmGETCONSTANTS(constantes);
			} catch (CMGETCONSTANTSFault e) {
				throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
			}
		return constantes;
		
	}

}
