package com.secusociale.portail.web.rest.immatriculation;

import java.net.URISyntaxException;

import javax.xml.bind.JAXBException;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.service.immatriculation.ImmatDomestiqueService;
import com.secusociale.portail.service.soap.demandeImmatriculation.IMMATRICULATIONINBOUNDFault;
import com.secusociale.portail.service.soap.domestique.InboundDomFrm;

@RestController
@RequestMapping("/api")
public class ImmatDomestiqueResource {
	 @Autowired
	   private ImmatDomestiqueService domestiqueService ;

	 
	 
	 @PostMapping("/domestique")
	    public Holder<InboundDomFrm> createImmatriculationPortail(@RequestBody InboundDomFrm immatriculation) throws URISyntaxException, IMMATRICULATIONINBOUNDFault, JAXBException {
	       // log.debug("REST request to save Immatriculation : {}", ENTITY_NAME);

	        Holder<InboundDomFrm> immatriculationInbound = new Holder<InboundDomFrm>();

	           immatriculationInbound = domestiqueService.createImmatDomestique(immatriculation);

			return immatriculationInbound;

	    }
		
}
