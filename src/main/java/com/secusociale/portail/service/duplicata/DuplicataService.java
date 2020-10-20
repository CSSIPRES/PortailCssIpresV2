package com.secusociale.portail.service.duplicata;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.secusociale.portail.service.PortailConstant;
import com.secusociale.portail.service.soap.duplicata_facture_recherche.CMGETNUMEROFACTURE;
import com.secusociale.portail.service.soap.duplicata_facture_recherche.CMGETNUMEROFACTUREFault;
import com.secusociale.portail.service.soap.duplicata_facture_recherche.CMGETNUMEROFACTUREPortType;
import com.secusociale.portail.service.soap.duplicata_facture_recherche.CMGETNUMEROFACTUREService;
import com.secusociale.portail.service.soap.duplicata_facture_url.CMGETFACTURE;
import com.secusociale.portail.service.soap.duplicata_facture_url.CMGETFACTURE.Input;
import com.secusociale.portail.service.soap.duplicata_facture_url.CMGETFACTUREFault;
import com.secusociale.portail.service.soap.duplicata_facture_url.CMGETFACTUREPortType;
import com.secusociale.portail.service.soap.duplicata_facture_url.CMGETFACTUREService;
import com.secusociale.portail.service.soap.duplicata_facture_url.ObjectFactory;
import com.secusociale.portail.service.soap.duplicata_recu_recherche.CMGETPAYMENT;
import com.secusociale.portail.service.soap.duplicata_recu_recherche.CMGETPAYMENTFault;
import com.secusociale.portail.service.soap.duplicata_recu_recherche.CMGETPAYMENTPortType;
import com.secusociale.portail.service.soap.duplicata_recu_recherche.CMGETPAYMENTService;
import com.secusociale.portail.service.soap.duplicata_recu_url.CMGETPAYMENTURL;
import com.secusociale.portail.service.soap.duplicata_recu_url.CMGETPAYMENTURLFault;
import com.secusociale.portail.service.soap.duplicata_recu_url.CMGETPAYMENTURLPortType;
import com.secusociale.portail.service.soap.duplicata_recu_url.CMGETPAYMENTURLService;

@Service
public class DuplicataService {
	
	public Holder<CMGETFACTURE> getDuplicataFacture(String numeroFacture)  {
		
		Input input = new Input();
		
		input.setNumeroFacture(numeroFacture);
		Holder<CMGETFACTURE> facture = new Holder<CMGETFACTURE>();
		ObjectFactory obj = new ObjectFactory();
		
		facture.value = obj.createCMGETFACTURE();
		facture.value.setInput(input);
		
		CMGETFACTUREService cmgetfactureService = new CMGETFACTUREService();
		CMGETFACTUREPortType cmgetfacturePortType = cmgetfactureService.getCMGETFACTUREPort();
		
        BindingProvider prov = (BindingProvider) cmgetfacturePortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		
		
        try {
			cmgetfacturePortType.cmGETFACTURE(facture);
		} catch (CMGETFACTUREFault e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
		
		
		return facture;
		
		
		
	}
	
	public Holder<CMGETNUMEROFACTURE> rechercheFacture(CMGETNUMEROFACTURE numerofacture){
		
		com.secusociale.portail.service.soap.duplicata_facture_recherche.CMGETNUMEROFACTURE.Input input = new com.secusociale.portail.service.soap.duplicata_facture_recherche.CMGETNUMEROFACTURE.Input();
		input.setPersonId(numerofacture.getInput().getPersonId());
		input.setDateDebut(numerofacture.getInput().getDateDebut());
		input.setDateFin(numerofacture.getInput().getDateFin());
		
		
		Holder<CMGETNUMEROFACTURE> rechercheFacture = new Holder<CMGETNUMEROFACTURE>();
		com.secusociale.portail.service.soap.duplicata_facture_recherche.ObjectFactory obj = new com.secusociale.portail.service.soap.duplicata_facture_recherche.ObjectFactory();
		
		rechercheFacture.value = obj.createCMGETNUMEROFACTURE();
		rechercheFacture.value.setInput(input);
		
		CMGETNUMEROFACTUREService cmgetnumerofactureService = new CMGETNUMEROFACTUREService();	
		CMGETNUMEROFACTUREPortType cmgetnumerofacturePortType = cmgetnumerofactureService.getCMGETNUMEROFACTUREPort();
		
        BindingProvider prov = (BindingProvider) cmgetnumerofacturePortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		
        try {
			cmgetnumerofacturePortType.cmGETNUMEROFACTURE(rechercheFacture);
		} catch (CMGETNUMEROFACTUREFault e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
		return rechercheFacture;
		
		
	}
	
	
	public Holder<CMGETPAYMENTURL> getDuplicataRecu(String idPaiement){
		
		com.secusociale.portail.service.soap.duplicata_recu_url.CMGETPAYMENTURL.Input input = new com.secusociale.portail.service.soap.duplicata_recu_url.CMGETPAYMENTURL.Input();
		input.setIdPaiement(idPaiement);
		
		Holder<CMGETPAYMENTURL> recu = new Holder<CMGETPAYMENTURL>();
		com.secusociale.portail.service.soap.duplicata_recu_url.ObjectFactory obj = new com.secusociale.portail.service.soap.duplicata_recu_url.ObjectFactory();
		
		recu.value = obj.createCMGETPAYMENTURL();
		recu.value.setInput(input);
		
		CMGETPAYMENTURLService cmgetpaymenturlService = new CMGETPAYMENTURLService();
		CMGETPAYMENTURLPortType cmgetpaymenturlPortType = cmgetpaymenturlService.getCMGETPAYMENTURLPort();
		
        BindingProvider prov = (BindingProvider) cmgetpaymenturlPortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		
        try {
			cmgetpaymenturlPortType.cmGETPAYMENTURL(recu);
		} catch (CMGETPAYMENTURLFault e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
		
		return recu;
		
		
	}
	
	public Holder<CMGETPAYMENT> rechercheRecu(CMGETPAYMENT payment){
		
		com.secusociale.portail.service.soap.duplicata_recu_recherche.CMGETPAYMENT.Input input = new com.secusociale.portail.service.soap.duplicata_recu_recherche.CMGETPAYMENT.Input();
		input.setPersonId(payment.getInput().getPersonId());
		input.setDatePaiement(payment.getInput().getDatePaiement());
		
		Holder<CMGETPAYMENT> rechercheRecu = new Holder<CMGETPAYMENT>();
		com.secusociale.portail.service.soap.duplicata_recu_recherche.ObjectFactory obj = new com.secusociale.portail.service.soap.duplicata_recu_recherche.ObjectFactory();
		
		rechercheRecu.value = obj.createCMGETPAYMENT();
		rechercheRecu.value.setInput(input);
		
		CMGETPAYMENTService cmgetpaymentService = new CMGETPAYMENTService();
		CMGETPAYMENTPortType cmgetpaymentPortType = cmgetpaymentService.getCMGETPAYMENTPort();
		

        BindingProvider prov = (BindingProvider) cmgetpaymentPortType ;
	    
	    prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, PortailConstant.USERNAME);
        prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PortailConstant.PASSWORD);
		
        
        try {
			cmgetpaymentPortType.cmGETPAYMENT(rechercheRecu);
		} catch (CMGETPAYMENTFault e) {
			// TODO Auto-generated catch block
			throw new  RuntimeException(e.getFaultInfo().getServerMessage().getText(), e);
		}
        
		return rechercheRecu;
		
		
	}

}
