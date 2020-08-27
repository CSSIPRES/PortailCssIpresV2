package com.secusociale.portail.service.paiement;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.derniersPaiements.DERNPAYEMPLOYEURSERVICE;
import com.secusociale.portail.service.soap.derniersPaiements.DERNPAYEMPLOYEURSERVICE.Input;
import com.secusociale.portail.service.soap.derniersPaiements.DERNPAYEMPLOYEURSERVICEFault;
import com.secusociale.portail.service.soap.derniersPaiements.DERNPAYEMPLOYEURSERVICEPortType;
import com.secusociale.portail.service.soap.derniersPaiements.DERNPAYEMPLOYEURSERVICEService;
import com.secusociale.portail.service.soap.derniersPaiements.ObjectFactory;

@Service
public class DerniersPaiementsService {

	public Holder<DERNPAYEMPLOYEURSERVICE> getDerniersPaiementEmployeur(String numeroUnique) throws JAXBException{
		
		Holder<DERNPAYEMPLOYEURSERVICE> derniersPaiements = new Holder<DERNPAYEMPLOYEURSERVICE>();
		Input input = new Input() ;
		input.setPersonId(numeroUnique);
		
		ObjectFactory obj = new ObjectFactory();
		derniersPaiements.value = obj.createDERNPAYEMPLOYEURSERVICE();
		derniersPaiements.value.setInput(input);
		
		 final JAXBContext jc = JAXBContext.newInstance(DERNPAYEMPLOYEURSERVICE.class); 
		 final Marshaller marshaller = jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 marshaller.marshal(derniersPaiements.value, System.out);
		
		 DERNPAYEMPLOYEURSERVICEService dernpayemployeurserviceService = new DERNPAYEMPLOYEURSERVICEService();
		 DERNPAYEMPLOYEURSERVICEPortType dernpayemployeurservicePortType = dernpayemployeurserviceService.getDERNPAYEMPLOYEURSERVICEPort();
		 
		 BindingProvider prov = (BindingProvider) dernpayemployeurservicePortType ;
			
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
		    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		    
		    try {
				dernpayemployeurservicePortType.dernPAYEMPLOYEURSERVICE(derniersPaiements);
			} catch (DERNPAYEMPLOYEURSERVICEFault e) {
				throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
			}
		    
		
		return derniersPaiements;
		
		
	}
}
