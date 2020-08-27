package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.listeEmployes.EMPLOYESLISTSERVICE;
import com.secusociale.portail.service.soap.listeEmployes.EMPLOYESLISTSERVICE.Input;
import com.secusociale.portail.service.soap.listeEmployes.EMPLOYESLISTSERVICEFault;
import com.secusociale.portail.service.soap.listeEmployes.EMPLOYESLISTSERVICEPortType;
import com.secusociale.portail.service.soap.listeEmployes.EMPLOYESLISTSERVICEService;
import com.secusociale.portail.service.soap.listeEmployes.ObjectFactory;

@Service
public class ListeEmployesService {
	
	public Holder<EMPLOYESLISTSERVICE> getListeEmployes(String numeroUnique) throws JAXBException{
		
		Holder<EMPLOYESLISTSERVICE> listeEmployes = new Holder<EMPLOYESLISTSERVICE>();
		Input input = new Input();
		
		input.setPersonId(numeroUnique);
		ObjectFactory obj = new ObjectFactory();
		listeEmployes.value = obj.createEMPLOYESLISTSERVICE() ;
		listeEmployes.value.setInput(input);
		
		 final JAXBContext jc = JAXBContext.newInstance(EMPLOYESLISTSERVICE.class); 
		 final Marshaller marshaller = jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 marshaller.marshal(listeEmployes.value, System.out);
		
		EMPLOYESLISTSERVICEService employeslistserviceService = new EMPLOYESLISTSERVICEService();
		EMPLOYESLISTSERVICEPortType employeslistservicePortType = employeslistserviceService.getEMPLOYESLISTSERVICEPort();
		
		 BindingProvider prov = (BindingProvider) employeslistservicePortType ;
			
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
		    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		    
		    try {
				employeslistservicePortType.employesLISTSERVICE(listeEmployes);
			} catch (EMPLOYESLISTSERVICEFault e) {
				throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
			}
		
		return listeEmployes;
		
		
	}

}
