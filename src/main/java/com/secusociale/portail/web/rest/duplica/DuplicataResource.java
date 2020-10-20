package com.secusociale.portail.web.rest.duplica;

import javax.xml.bind.JAXBException;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.service.duplicata.DuplicataService;
import com.secusociale.portail.service.soap.duplicata_facture_recherche.CMGETNUMEROFACTURE;
import com.secusociale.portail.service.soap.duplicata_facture_url.CMGETFACTURE;
import com.secusociale.portail.service.soap.duplicata_recu_recherche.CMGETPAYMENT;
import com.secusociale.portail.service.soap.duplicata_recu_url.CMGETPAYMENTURL;

@RestController
@RequestMapping("/api")
public class DuplicataResource {
	
	 @Autowired
	private DuplicataService duplicataService ;
	 
	 

		@GetMapping("/duplicata/facture/{numeroFacture}")
		Holder<CMGETFACTURE> getFacture(@PathVariable String numeroFacture) throws JAXBException {
	 	 
			return duplicataService.getDuplicataFacture(numeroFacture);

		}
		
		@PostMapping("/duplicata/rechercheFacture")
		Holder<CMGETNUMEROFACTURE> rechercheFacture(@RequestBody CMGETNUMEROFACTURE  rechercheFacture) throws JAXBException {
	 	 
			return duplicataService.rechercheFacture(rechercheFacture);

		}
		
		@GetMapping("/duplicata/recu/{idPaiement}")
		Holder<CMGETPAYMENTURL> getRecu(@PathVariable String idPaiement) throws JAXBException {
	 	 
			return duplicataService.getDuplicataRecu(idPaiement);

		}
		
		@PostMapping("/duplicata/rechercheRecu")
		Holder<CMGETPAYMENT> rechercheFacture(@RequestBody CMGETPAYMENT rechercheRecu) throws JAXBException {
	 	 
			return duplicataService.rechercheRecu(rechercheRecu);

		}
		

}
