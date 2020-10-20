package com.secusociale.portail.web.rest.cessation_suspension;

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

import com.secusociale.portail.service.cessation_suspension.CessationSuspensionService;
import com.secusociale.portail.service.soap.cessation_suspension.CMADDCESSATIONORSUSPENSION;
import com.secusociale.portail.service.soap.cessation_suspension_statut.CMGETSTATUSCESSATIONSUSPENSION;
import com.secusociale.portail.service.soap.url_reception_cessation_suspension.CMGetUrlAccuseReceptionCessationAndSuspension;

@RestController
@RequestMapping("/api")
public class CessationSuspensionResource {
	
	@Autowired
	private CessationSuspensionService cessationSuspensionService;
	
	@PostMapping("/cessation_suspension/add")
    public Holder<CMADDCESSATIONORSUSPENSION> createCessationSuspension(@RequestBody CMADDCESSATIONORSUSPENSION cessation_suspension) throws IOException, JAXBException   {
       
		return cessationSuspensionService.createCessationSuspension(cessation_suspension);

    }
	
	
	@GetMapping("/cessation_suspension/statut/{idDossier}")
	Holder<CMGETSTATUSCESSATIONSUSPENSION> getStatutCessationSuspension(@PathVariable String idDossier) throws JAXBException {
 	 
		return cessationSuspensionService.getStatutCessationSuspension(idDossier);

	}
	
	

	@GetMapping("/cessation_suspension/urlReception/{idDossier}")
	Holder<CMGetUrlAccuseReceptionCessationAndSuspension> getUrlCessationSuspension(@PathVariable String idDossier) throws JAXBException {
 	 
		return cessationSuspensionService.getUrlReceptionCessationSuspension(idDossier);

	}

}
