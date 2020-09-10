package com.secusociale.portail.web.rest.declaration;

import java.text.ParseException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.Holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.model.DeclarationModel;
import com.secusociale.portail.service.declaration.DnsService;
import com.secusociale.portail.service.declaration.GetTauxEtPlafondsService;
import com.secusociale.portail.service.declaration.ListeDeclarationsService;
import com.secusociale.portail.service.declaration.PreDNSService;
import com.secusociale.portail.service.soap.declaration.DNSINBOUNDSERVICEFault;
import com.secusociale.portail.service.soap.derniersDeclarations.DERNDNSEMPLOYEURSERVICE;
import com.secusociale.portail.service.soap.getTauxPlafonds.CMGETCONSTANTS;
import com.secusociale.portail.service.soap.preDNS.CmPresDnsFault;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculation;
import com.secusociale.portail.service.soap.statutDossierImmatriculation.CmGetStatusDossierImmatriculationFault;


@RestController
@RequestMapping("/api")
public class DeclarationPortailResource {

	private final Logger log = LoggerFactory.getLogger(DeclarationPortailResource.class);
	private static final String ENTITY_NAME = "CmPresDns";
	
	
	@Autowired
	private ListeDeclarationsService listeDeclarationsservice;
	
	@Autowired
	private PreDNSService  prednsService ;
	
	
	@Autowired
	private DnsService dnsService ;
	
	@Autowired
	private GetTauxEtPlafondsService getTauxPlafondService ;
	
	
	@PostMapping("/preDNS")
	public Holder<DeclarationModel> getPreDNSEmployeur(@RequestBody DeclarationModel preDnsInput) throws CmPresDnsFault, JAXBException, DatatypeConfigurationException{
		
		log.debug("REST request to get PreDNS: {}", ENTITY_NAME);
		
		 
		
		return  prednsService.getPreDns(preDnsInput);
		
	}
	
	@PostMapping("/dns")
	public Holder<DeclarationModel> createDeclaration(@RequestBody DeclarationModel preDnsInput) throws   JAXBException, DatatypeConfigurationException, DNSINBOUNDSERVICEFault, ParseException, com.google.protobuf.TextFormat.ParseException{
		
		log.debug("REST request to get PreDNS: {}", ENTITY_NAME);
		
		 
		return dnsService.createDns(preDnsInput);
		
		
	}
	
	@GetMapping("/listDeclarations/{numeroUnique}")
	Holder<DERNDNSEMPLOYEURSERVICE> getListeDeclarations(@PathVariable String numeroUnique) throws JAXBException {

		Holder<DERNDNSEMPLOYEURSERVICE> declarations = new Holder<DERNDNSEMPLOYEURSERVICE>();

		declarations =  listeDeclarationsservice.getListeDeclarations(numeroUnique);

		return declarations;

	}
	
	@GetMapping("/tauxEtPlafonds")
	Holder<CMGETCONSTANTS> getTauxEtPlafond() throws JAXBException {

		Holder<CMGETCONSTANTS> tauxPlafond = new Holder<CMGETCONSTANTS>();

		tauxPlafond =   getTauxPlafondService.getTauxPlafonds();

		return tauxPlafond;

	}

	
}
