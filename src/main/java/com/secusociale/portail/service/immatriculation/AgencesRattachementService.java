package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.agencesRattachement.AGENCESEMPLOYEURSERVICE;
import com.secusociale.portail.service.soap.agencesRattachement.AGENCESEMPLOYEURSERVICE.Input;
import com.secusociale.portail.service.soap.agencesRattachement.AGENCESEMPLOYEURSERVICEFault;
import com.secusociale.portail.service.soap.agencesRattachement.AGENCESEMPLOYEURSERVICEPortType;
import com.secusociale.portail.service.soap.agencesRattachement.AGENCESEMPLOYEURSERVICEService;
import com.secusociale.portail.service.soap.agencesRattachement.ObjectFactory;

@Service
public class AgencesRattachementService {
	
	public Holder<AGENCESEMPLOYEURSERVICE> getAgencesRattachement(String numeroUnique) throws JAXBException{
		
		
		Holder<AGENCESEMPLOYEURSERVICE> agences = new Holder<AGENCESEMPLOYEURSERVICE>();
		
		Input input = new Input() ;
		input.setPersonId(numeroUnique);
		
		ObjectFactory obj = new ObjectFactory();
		agences.value = obj.createAGENCESEMPLOYEURSERVICE();
		agences.value.setInput(input);
		

		 final JAXBContext jc = JAXBContext.newInstance(AGENCESEMPLOYEURSERVICE.class); 
		 final Marshaller marshaller = jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 marshaller.marshal(agences.value, System.out);
		
		 AGENCESEMPLOYEURSERVICEService agencesemployeurserviceService = new AGENCESEMPLOYEURSERVICEService();
		 AGENCESEMPLOYEURSERVICEPortType agencesemployeurservicePortType = agencesemployeurserviceService.getAGENCESEMPLOYEURSERVICEPort();
		 
		 
		 BindingProvider prov = (BindingProvider) agencesemployeurservicePortType ;
			
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
		    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		    
		    try {
				agencesemployeurservicePortType.agencesEMPLOYEURSERVICE(agences);
			} catch (AGENCESEMPLOYEURSERVICEFault e) {
				throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
			}
		 
		return agences;
		
		
	}

}
