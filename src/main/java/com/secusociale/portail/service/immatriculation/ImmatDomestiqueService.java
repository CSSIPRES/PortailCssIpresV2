package com.secusociale.portail.service.immatriculation;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.domestique.InboundDomFrm;
import com.secusociale.portail.service.soap.domestique.InboundDomFrm.Input;
import com.secusociale.portail.service.soap.domestique.InboundDomFrmFault;
import com.secusociale.portail.service.soap.domestique.InboundDomFrmPortType;
import com.secusociale.portail.service.soap.domestique.InboundDomFrmService;
import com.secusociale.portail.service.soap.domestique.ObjectFactory;

@Service
public class ImmatDomestiqueService {
	
	public Holder<InboundDomFrm> createImmatDomestique(InboundDomFrm immatriculation){
		
		Holder<InboundDomFrm> inboundDomForm = new Holder<InboundDomFrm>();
		
		Input input = new Input();
		
		input.getEmployeList().addAll(immatriculation.getInput().getEmployeList());
		input.setRegistrationFormInfos(immatriculation.getInput().getRegistrationFormInfos());
		input.setDomesticRegistrationForm(immatriculation.getInput().getDomesticRegistrationForm());
		input.setDocuments(immatriculation.getInput().getDocuments());
		
		
		ObjectFactory obj = new ObjectFactory();
		
		inboundDomForm.value = obj.createInboundDomFrm();
		inboundDomForm.value.setInput(input);
		
		InboundDomFrmService domFrmService = new InboundDomFrmService();
		InboundDomFrmPortType domFrmPortType = domFrmService.getInboundDomFrmPort();
		
		BindingProvider prov = (BindingProvider) domFrmPortType ;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
        
        try {
			domFrmPortType.inboundDomFrm(inboundDomForm);
		} catch (InboundDomFrmFault e) {
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
		
		return inboundDomForm;
		
		
		
	}

}
