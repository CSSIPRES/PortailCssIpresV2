package com.secusociale.portail.service.immatriculation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.certificatImmatriculation.CmGetCertificatImmatriculation;
import com.secusociale.portail.service.soap.infosEmployeur.CMINFOSEMPLOYEUR;
import com.secusociale.portail.service.soap.infosEmployeur.CMINFOSEMPLOYEUR.Input;
import com.secusociale.portail.service.soap.infosEmployeur.CMINFOSEMPLOYEURFault;
import com.secusociale.portail.service.soap.infosEmployeur.CMINFOSEMPLOYEURPortType;
import com.secusociale.portail.service.soap.infosEmployeur.CMINFOSEMPLOYEURService;
import com.secusociale.portail.service.soap.infosEmployeur.ObjectFactory;

@Service
public class InfosCompteEmployeurService {

	
	public Holder<CMINFOSEMPLOYEUR> getInfosCompteEmployeur(String idDossier) throws JAXBException{
		
		Input input = new Input();
		input.setProcessFlowId(idDossier);
		
		Holder<CMINFOSEMPLOYEUR> infosEmployeur = new Holder<CMINFOSEMPLOYEUR>();
		ObjectFactory obj = new ObjectFactory();
		
		
		
		infosEmployeur.value = obj.createCMINFOSEMPLOYEUR();
		infosEmployeur.value.setInput(input);
		
		
		/*
		 * final JAXBContext jc =
		 * JAXBContext.newInstance(CmGetCertificatImmatriculation.class); final
		 * Marshaller marshaller = jc.createMarshaller();
		 * marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 * marshaller.marshal(infosEmployeur.value, System.out);
		 */
		
		
		CMINFOSEMPLOYEURService cminfosemployeurService = new CMINFOSEMPLOYEURService();
		CMINFOSEMPLOYEURPortType cminfosemployeurPortType = cminfosemployeurService.getCMINFOSEMPLOYEURPort();
		
        BindingProvider prov = (BindingProvider) cminfosemployeurPortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        try {
			cminfosemployeurPortType.cmINFOSEMPLOYEUR(infosEmployeur);
		} catch (CMINFOSEMPLOYEURFault e) {
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
		
		return infosEmployeur;
		
	}
}
