package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.identifiantsEmployeurs.IDsEMPLOYEURSERVICE;
import com.secusociale.portail.service.soap.identifiantsEmployeurs.IDsEMPLOYEURSERVICE.Input;
import com.secusociale.portail.service.soap.identifiantsEmployeurs.IDsEMPLOYEURSERVICEFault;
import com.secusociale.portail.service.soap.identifiantsEmployeurs.IDsEMPLOYEURSERVICEPortType;
import com.secusociale.portail.service.soap.identifiantsEmployeurs.IDsEMPLOYEURSERVICEService;
import com.secusociale.portail.service.soap.identifiantsEmployeurs.ObjectFactory;

@Service
public class IdentifiantsEmployeurService {
	
	public Holder<IDsEMPLOYEURSERVICE> getIdentifiantsEmployeurs(String numeroUnique) throws JAXBException{
		
		Holder<IDsEMPLOYEURSERVICE> identifiants = new Holder<IDsEMPLOYEURSERVICE>();
		Input input = new Input();
		input.setPersonId(numeroUnique);
		
		ObjectFactory obj = new ObjectFactory();
		identifiants.value = obj.createIDsEMPLOYEURSERVICE();
		identifiants.value.setInput(input);
		

		 final JAXBContext jc = JAXBContext.newInstance(IDsEMPLOYEURSERVICE.class); 
		 final Marshaller marshaller = jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 marshaller.marshal(identifiants.value, System.out);
		 
		 IDsEMPLOYEURSERVICEService dsEMPLOYEURSERVICEService = new IDsEMPLOYEURSERVICEService();
		 IDsEMPLOYEURSERVICEPortType dsEMPLOYEURSERVICEPortType = dsEMPLOYEURSERVICEService.getIDsEMPLOYEURSERVICEPort();
		 
		 BindingProvider prov = (BindingProvider) dsEMPLOYEURSERVICEPortType ;
			
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
		    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		
		 try {
			dsEMPLOYEURSERVICEPortType.iDsEMPLOYEURSERVICE(identifiants);
		} catch (IDsEMPLOYEURSERVICEFault e) {
			 
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
		
		
		return null;
		
	}

}
