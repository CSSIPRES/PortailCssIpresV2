package com.secusociale.portail.web.rest.remise_gracieuse;

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

import com.secusociale.portail.service.remise_gracieuse.RemiseGracieuseService;
import com.secusociale.portail.service.soap.remise_gracieuse_accuse_url.CmGetUrlAccuseReceptionRemiseGracieuse;
import com.secusociale.portail.service.soap.remise_gracieuse_add.CmAddDemandeRemiseGracieuse;
import com.secusociale.portail.service.soap.remise_gracieuse_notification_url.CMGETURLNOTIFICATION;
import com.secusociale.portail.service.soap.remise_gracieuse_statut.CMGetStatusRemiseGracieuse;

@RestController
@RequestMapping("/api")
public class RemiseGracieuseResource {
	
	@Autowired
	private RemiseGracieuseService gracieuseService ;
	
	@PostMapping("/remise_gracieuse/add")
    public Holder<CmAddDemandeRemiseGracieuse> createRepriseActivite(@RequestBody CmAddDemandeRemiseGracieuse remise_gracieuse) throws IOException, JAXBException   {
       
		return  gracieuseService.createRemiseGracieuse(remise_gracieuse);

    }
	
	
	@GetMapping("/remise_gracieuse/statut/{idDossier}")
	Holder<CMGetStatusRemiseGracieuse> getStatutRepriseActivite(@PathVariable String idDossier) throws JAXBException {
 	 
		return gracieuseService.getStatutRemise(idDossier);

	}
	
	

	@GetMapping("/remise_gracieuse/accuseReception/{idDossier}")
	Holder<CmGetUrlAccuseReceptionRemiseGracieuse> getAccuseReception(@PathVariable String idDossier) throws JAXBException {
 	 
		return gracieuseService.getUrlRemise(idDossier);

	}
	
	@GetMapping("/remise_gracieuse/notification/{idDossier}")
	Holder<CMGETURLNOTIFICATION> getUrlNotification(@PathVariable String idDossier) throws JAXBException {
 	 
		return gracieuseService.getUrlNotification(idDossier);

	}


}
