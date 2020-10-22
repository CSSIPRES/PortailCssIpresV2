package com.secusociale.portail.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.google.protobuf.TextFormat.ParseException;

public class RemiseGracieuse {
	
	
	Input input ;
	
	
	public Input getInput() {
		return input;
	}


	public void setInput(Input input) {
		this.input = input;
	}


	public static class Input {
		
		InformationEmployeur informationEmployeur;
		InformationDemande informationDemande;
		Documents documents;
		
		
		public InformationEmployeur getInformationEmployeur() {
			return informationEmployeur;
		}


		public void setInformationEmployeur(InformationEmployeur informationEmployeur) {
			this.informationEmployeur = informationEmployeur;
		}


		public InformationDemande getInformationDemande() {
			return informationDemande;
		}


		public void setInformationDemande(InformationDemande informationDemande) {
			this.informationDemande = informationDemande;
		}


		public Documents getDocuments() {
			return documents;
		}


		public void setDocuments(Documents documents) {
			this.documents = documents;
		}


		public static class InformationEmployeur {
		
			protected String numeroEmployeur;

			public String getNumeroEmployeur() {
				return numeroEmployeur;
			}

			public void setNumeroEmployeur(String numeroEmployeur) {
				this.numeroEmployeur = numeroEmployeur;
			}
			
			
		}
		
		
		 public static class InformationDemande{
			 protected String institution;
			 protected String dateDebutPeriode;
			 protected String dateFinPeriode;
			 protected String motifDemande;
			 protected String montant;
			 
			 
			public String getInstitution() {
				return institution;
			}
			public void setInstitution(String institution) {
				this.institution = institution;
			}
			public String getDateDebutPeriode() {
				return dateDebutPeriode;
			}
			public void setDateDebutPeriode(String dateDebutPeriode) {
				this.dateDebutPeriode = dateDebutPeriode;
			}
			public String getDateFinPeriode() {
				return dateFinPeriode;
			}
			public void setDateFinPeriode(String dateFinPeriode) {
				this.dateFinPeriode = dateFinPeriode;
			}
			public String getMotifDemande() {
				return motifDemande;
			}
			public void setMotifDemande(String motifDemande) {
				this.motifDemande = motifDemande;
			}
			public String getMontant() {
				return montant;
			}
			public void setMontant(String montant) {
				this.montant = montant;
			}
			 
			 
		 }
		 
		 
		 public static class Documents{
			 
			 protected String demandeEcrite;

			public String getDemandeEcrite() {
				return demandeEcrite;
			}

			public void setDemandeEcrite(String demandeEcrite) {
				this.demandeEcrite = demandeEcrite;
			}
			 
			 

		 }
		
	}
	
	public XMLGregorianCalendar formatToGregorianCalendar(String dateFormat) throws ParseException, DatatypeConfigurationException, java.text.ParseException {
		 
		 
		 XMLGregorianCalendar xmlGregorianCalendar = null ;
	 if(dateFormat != null && !dateFormat.isEmpty() && !"".equals(dateFormat)) {
			 
		 Date format = new SimpleDateFormat("yyyy-MM-dd").parse(dateFormat);
		 GregorianCalendar gCalendar = new GregorianCalendar();
		 gCalendar.setTime(format);
		 xmlGregorianCalendar= DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gCalendar.get(Calendar.YEAR), gCalendar.get(Calendar.MONTH)+1, gCalendar.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
		
		 return xmlGregorianCalendar;
	}
	 else {
		 return null;
	 }
		 
	}
	
	public String formaToString(Date date) {
		
		 
		
		 
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
		return formatDate.format(date);
	 
		
		
		 
		
		
	}
	

}
