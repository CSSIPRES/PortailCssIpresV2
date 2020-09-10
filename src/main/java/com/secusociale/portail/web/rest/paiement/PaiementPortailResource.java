package com.secusociale.portail.web.rest.paiement;

import javax.xml.bind.JAXBException;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.service.paiement.DerniersPaiementsService;
import com.secusociale.portail.service.paiement.FacturesImpayesService;
import com.secusociale.portail.service.paiement.ListefacturesService;
import com.secusociale.portail.service.soap.derniersPaiements.DERNPAYEMPLOYEURSERVICE;
import com.secusociale.portail.service.soap.facturesDns.CMPAYDNSXAI;
import com.secusociale.portail.service.soap.facturesImpayes.FACTURESIMPAYEESSERVICE;

@RestController
@RequestMapping("/api")
public class PaiementPortailResource {
	
	@Autowired
	private DerniersPaiementsService derniersPaiementsService;
	
	@Autowired
	private FacturesImpayesService facturesImpayesService;
	
	@Autowired
	private ListefacturesService listefactureService ;

	
	@GetMapping("/listPaiement/{numeroUnique}")
	Holder<DERNPAYEMPLOYEURSERVICE> getListePaiement(@PathVariable String numeroUnique) throws JAXBException {

		Holder<DERNPAYEMPLOYEURSERVICE> paiements = new Holder<DERNPAYEMPLOYEURSERVICE>();

		paiements =   derniersPaiementsService.getDerniersPaiementEmployeur(numeroUnique);

		return paiements;

	}
	
	@GetMapping("/facturesImpayes/{numeroUnique}")
	Holder<FACTURESIMPAYEESSERVICE> getListfactureImapye(@PathVariable String numeroUnique) throws JAXBException {

		Holder<FACTURESIMPAYEESSERVICE> impayes = new Holder<FACTURESIMPAYEESSERVICE>();

		impayes =    facturesImpayesService.getFactureImpaye(numeroUnique);

		return impayes;

	}
	
	@GetMapping("/listefacture/{numeroCompte}")
	Holder<CMPAYDNSXAI> getListfactures(@PathVariable String numeroCompte) throws JAXBException {

		Holder<CMPAYDNSXAI> factures = new Holder<CMPAYDNSXAI>();

		factures=    listefactureService.getListFactures(numeroCompte);

		return factures;

	}
	
	
}
