package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.employeurInfos.CMEMPLOYEURINFOS;
import com.secusociale.portail.service.soap.employeurInfos.CMEMPLOYEURINFOS.Input;
import com.secusociale.portail.service.soap.employeurInfos.CMEMPLOYEURINFOSFault;
import com.secusociale.portail.service.soap.employeurInfos.CMEMPLOYEURINFOSPortType;
import com.secusociale.portail.service.soap.employeurInfos.CMEMPLOYEURINFOSService;
import com.secusociale.portail.service.soap.employeurInfos.ObjectFactory;
 

@Service
public class InfosEmployeurService {

	public Holder<CMEMPLOYEURINFOS> getEmployeurInfos(CMEMPLOYEURINFOS empl) throws JAXBException{
		
		Holder<CMEMPLOYEURINFOS> employeurInfos = new Holder<CMEMPLOYEURINFOS>();
		
		Input input = new Input() ;
		
		input.setTypeIdentifiant(empl.getInput().getTypeIdentifiant());
		input.setNumeroUnique(empl.getInput().getNumeroIdentifiant());
		input.setNumeroUnique(empl.getInput().getNumeroUnique());
		
		ObjectFactory obj = new ObjectFactory() ;
		
		employeurInfos.value = obj.createCMEMPLOYEURINFOS();
		employeurInfos.value.setInput(input);
		
		final JAXBContext jc = JAXBContext.newInstance(CMEMPLOYEURINFOS.class); 
		 final Marshaller marshaller = jc.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 marshaller.marshal(employeurInfos.value, System.out);
		 
		 CMEMPLOYEURINFOSService cmemployeurinfosService = new CMEMPLOYEURINFOSService();
		 CMEMPLOYEURINFOSPortType cmemployeurinfosPortType = cmemployeurinfosService.getCMEMPLOYEURINFOSPort();
		 
		 BindingProvider prov = (BindingProvider) cmemployeurinfosPortType ;
			
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
		    prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		 
	    
		    try {
				cmemployeurinfosPortType.cmEMPLOYEURINFOS(employeurInfos);
			} catch (CMEMPLOYEURINFOSFault e) {
				// TODO Auto-generated catch block
				throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
			}
		return employeurInfos;
		
	}
}
