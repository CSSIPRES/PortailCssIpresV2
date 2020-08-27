package com.secusociale.portail.service.paiement;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.facturesImpayes.FACTURESIMPAYEESSERVICE;
import com.secusociale.portail.service.soap.facturesImpayes.FACTURESIMPAYEESSERVICE.Input;
import com.secusociale.portail.service.soap.facturesImpayes.FACTURESIMPAYEESSERVICEFault;
import com.secusociale.portail.service.soap.facturesImpayes.FACTURESIMPAYEESSERVICEPortType;
import com.secusociale.portail.service.soap.facturesImpayes.FACTURESIMPAYEESSERVICEService;
import com.secusociale.portail.service.soap.facturesImpayes.ObjectFactory;

@Service
public class FacturesImpayesService {
	
	public Holder<FACTURESIMPAYEESSERVICE> getFactureImpaye(String numeroUnique) throws JAXBException{
		
		Holder<FACTURESIMPAYEESSERVICE> impayes = new Holder<FACTURESIMPAYEESSERVICE>();
		Input input = new Input();
		input.setPersonId(numeroUnique);
		
		ObjectFactory obj = new ObjectFactory();
		impayes.value = obj.createFACTURESIMPAYEESSERVICE();
		impayes.value.setInput(input);
		
		final JAXBContext jc = JAXBContext.newInstance(FACTURESIMPAYEESSERVICE.class); 
		 final Marshaller marshaller = jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 marshaller.marshal(impayes.value, System.out);
		
		 
		 FACTURESIMPAYEESSERVICEService facturesimpayeesserviceService = new FACTURESIMPAYEESSERVICEService();
		 FACTURESIMPAYEESSERVICEPortType facturesimpayeesservicePortType = facturesimpayeesserviceService.getFACTURESIMPAYEESSERVICEPort();
		 
		 BindingProvider prov = (BindingProvider) facturesimpayeesservicePortType ;
			
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
		    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		    
		    try {
				facturesimpayeesservicePortType.facturesIMPAYEESSERVICE(impayes);
			} catch (FACTURESIMPAYEESSERVICEFault e) {
				throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
			}
		
		return impayes;
		
	}

}
