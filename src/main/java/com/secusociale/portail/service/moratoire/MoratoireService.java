package com.secusociale.portail.service.moratoire;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.moratoire.CMGETINFORMATIONMORATOIRE;
import com.secusociale.portail.service.soap.moratoire.CMGETINFORMATIONMORATOIRE.Input;
import com.secusociale.portail.service.soap.moratoire.CMGETINFORMATIONMORATOIREFault;
import com.secusociale.portail.service.soap.moratoire.CMGETINFORMATIONMORATOIREPortType;
import com.secusociale.portail.service.soap.moratoire.CMGETINFORMATIONMORATOIREService;
import com.secusociale.portail.service.soap.moratoire.ObjectFactory;

@Service
public class MoratoireService {
	
	public Holder<CMGETINFORMATIONMORATOIRE> demandeMoratoire(CMGETINFORMATIONMORATOIRE demandeMoratoire) throws JAXBException{
		
		Input input = new Input();
		
		input.setIdEmployer(demandeMoratoire.getInput().getIdEmployer());
		input.setDateDebut(demandeMoratoire.getInput().getDateDebut());
		input.setDateFin(demandeMoratoire.getInput().getDateFin());
		
		Holder<CMGETINFORMATIONMORATOIRE> moratoire = new Holder<CMGETINFORMATIONMORATOIRE>();
		ObjectFactory obj = new ObjectFactory();
		
		moratoire.value = obj.createCMGETINFORMATIONMORATOIRE();
		moratoire.value.setInput(input);
		
		final JAXBContext jc = JAXBContext.newInstance(CMGETINFORMATIONMORATOIRE.class);
	    final Marshaller marshaller = jc.createMarshaller();
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshal(moratoire.value, System.out);
		
	    CMGETINFORMATIONMORATOIREService cmgetinformationmoratoireService = new CMGETINFORMATIONMORATOIREService();
	    CMGETINFORMATIONMORATOIREPortType cmgetinformationmoratoirePortType = cmgetinformationmoratoireService.getCMGETINFORMATIONMORATOIREPort();
	    
      BindingProvider prov = (BindingProvider) cmgetinformationmoratoirePortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        
        try {
			cmgetinformationmoratoirePortType.cmGETINFORMATIONMORATOIRE(moratoire);
		} catch (CMGETINFORMATIONMORATOIREFault e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
	    
	    
	    
		return moratoire;
		
	}

}
