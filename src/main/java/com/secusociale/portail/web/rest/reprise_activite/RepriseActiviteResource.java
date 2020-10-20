package com.secusociale.portail.web.rest.reprise_activite;

import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secusociale.portail.service.reprise_activite.RepriseActiviteService;
import com.secusociale.portail.service.soap.reprise_activite.CMAddProcessRepriseActivite;
import com.secusociale.portail.service.soap.reprise_activite_accuse_url.CMGetUrlAccuseReceptionReprise;
import com.secusociale.portail.service.soap.reprise_activite_statut.CMGetStatusRepriseActivite;
 

@RestController
@RequestMapping("/api")
public class RepriseActiviteResource {
	
	@Autowired
	private RepriseActiviteService activiteService ;
	
	
	@PostMapping("/reprise_activite/add")
    public Holder<CMAddProcessRepriseActivite> createRepriseActivite(@RequestBody CMAddProcessRepriseActivite reprise_activite) throws IOException, JAXBException   {
       
		return activiteService.createReprise(reprise_activite);

    }
	
	
	@GetMapping("/reprise_activite/statut/{idDossier}")
	Holder<CMGetStatusRepriseActivite> getStatutRepriseActivite(@PathVariable String idDossier) throws JAXBException {
 	 
		return activiteService.getStatutReprise(idDossier);

	}
	
	

	@GetMapping("/reprise_activite/urlReception/{idDossier}")
	Holder<CMGetUrlAccuseReceptionReprise> getUrlRepriseActivite(@PathVariable String idDossier) throws JAXBException {
 	 
		return activiteService.getUrlAccuseReprise(idDossier);

	}


}
