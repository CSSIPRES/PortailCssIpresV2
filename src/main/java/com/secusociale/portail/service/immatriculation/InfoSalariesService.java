package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculation;
import com.secusociale.portail.service.soap.infosSalaries.CMGETPERSONSLINKTOEMPLOYER;
import com.secusociale.portail.service.soap.infosSalaries.CMGETPERSONSLINKTOEMPLOYERFault;
import com.secusociale.portail.service.soap.infosSalaries.CMGETPERSONSLINKTOEMPLOYERPortType;
import com.secusociale.portail.service.soap.infosSalaries.CMGETPERSONSLINKTOEMPLOYERService;
import com.secusociale.portail.service.soap.infosSalaries.ObjectFactory;

@Service
public class InfoSalariesService {
	
	public Holder<CMGETPERSONSLINKTOEMPLOYER> getInfosalarie (String numeroEmployeur) throws JAXBException{
		
		Holder<CMGETPERSONSLINKTOEMPLOYER> infoSalaries = new Holder<CMGETPERSONSLINKTOEMPLOYER>();
		ObjectFactory obj = new ObjectFactory() ;
		
		infoSalaries.value = obj.createCMGETPERSONSLINKTOEMPLOYER();
		infoSalaries.value.setNumeroEmployeur(numeroEmployeur);
		

		/*
		 * final JAXBContext jc =
		 * JAXBContext.newInstance(CmGetCertificatImmatriculation.class); final
		 * Marshaller marshaller = jc.createMarshaller();
		 * marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 * marshaller.marshal(infoSalaries.value, System.out);
		 */
		
		CMGETPERSONSLINKTOEMPLOYERService cmgetpersonslinktoemployerService = new CMGETPERSONSLINKTOEMPLOYERService() ;
		CMGETPERSONSLINKTOEMPLOYERPortType cmgetpersonslinktoemployerPortType = cmgetpersonslinktoemployerService.getCMGETPERSONSLINKTOEMPLOYERPort();
		
        BindingProvider prov = (BindingProvider) cmgetpersonslinktoemployerPortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        try {
			cmgetpersonslinktoemployerPortType.cmGETPERSONSLINKTOEMPLOYER(infoSalaries);
		} catch (CMGETPERSONSLINKTOEMPLOYERFault e) {
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
		
		
		return infoSalaries;
			
	}

}
