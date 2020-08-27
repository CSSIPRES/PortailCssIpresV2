package com.secusociale.portail.service.declaration;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.derniersDeclarations.DERNDNSEMPLOYEURSERVICE;
import com.secusociale.portail.service.soap.derniersDeclarations.DERNDNSEMPLOYEURSERVICE.Input;
import com.secusociale.portail.service.soap.derniersDeclarations.DERNDNSEMPLOYEURSERVICEFault;
import com.secusociale.portail.service.soap.derniersDeclarations.DERNDNSEMPLOYEURSERVICEPortType;
import com.secusociale.portail.service.soap.derniersDeclarations.DERNDNSEMPLOYEURSERVICEService;
import com.secusociale.portail.service.soap.derniersDeclarations.ObjectFactory;

@Service
public class ListeDeclarationsService {

	
	public Holder<DERNDNSEMPLOYEURSERVICE> getListeDeclarations(String numeroUnique) throws JAXBException{
		
		
		Holder<DERNDNSEMPLOYEURSERVICE> derniersDns = new Holder<DERNDNSEMPLOYEURSERVICE>();
		
		Input input = new Input();
		
		input.setPersonId(numeroUnique);
		
		ObjectFactory obj = new ObjectFactory();
		
		derniersDns.value = obj.createDERNDNSEMPLOYEURSERVICE();
		derniersDns.value.setInput(input);
		
		
		 final JAXBContext jc = JAXBContext.newInstance(DERNDNSEMPLOYEURSERVICE.class); 
		 final Marshaller marshaller = jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 marshaller.marshal(derniersDns.value, System.out);
		 
		 
		 DERNDNSEMPLOYEURSERVICEService derndnsemployeurserviceService = new DERNDNSEMPLOYEURSERVICEService();
		 DERNDNSEMPLOYEURSERVICEPortType derndnsemployeurservicePortType = derndnsemployeurserviceService.getDERNDNSEMPLOYEURSERVICEPort();
		
		 BindingProvider prov = (BindingProvider) derndnsemployeurservicePortType ;
			
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
		    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		    
		    try {
				derndnsemployeurservicePortType.dernDNSEMPLOYEURSERVICE(derniersDns);
			} catch (DERNDNSEMPLOYEURSERVICEFault e) {
				throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
			}
		return derniersDns;
		
	}
}
