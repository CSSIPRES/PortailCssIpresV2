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

public class CessationSuspension {
	
	protected Input input;
	
	
	
	 public Input getInput() {
		return input;
	}



	public void setInput(Input input) {
		this.input = input;
	}



	public static class Input { 
		 
		protected InformationEmployer informationEmployer ;

		protected InformationDemande informationDemande ;
		
		protected Documents documents ;
		
		
		public InformationEmployer getInformationEmployer() {
			return informationEmployer;
		}

		public void setInformationEmployer(InformationEmployer informationEmployer) {
			this.informationEmployer = informationEmployer;
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
		
		
		
		 public static class Documents {
			    protected  Boolean demandeEmployer;
 	            protected  Boolean declartionCessationActivite;
 	            protected  Boolean dmtDeSortie;
 	            protected  Boolean decisionJudiciare;
 	            protected  Boolean decisionAdministrative;
 	            
				public Boolean getDemandeEmployer() {
					return demandeEmployer;
				}
				public void setDemandeEmployer(Boolean demandeEmployer) {
					this.demandeEmployer = demandeEmployer;
				}
				public Boolean getDeclartionCessationActivite() {
					return declartionCessationActivite;
				}
				public void setDeclartionCessationActivite(Boolean declartionCessationActivite) {
					this.declartionCessationActivite = declartionCessationActivite;
				}
				public Boolean getDmtDeSortie() {
					return dmtDeSortie;
				}
				public void setDmtDeSortie(Boolean dmtDeSortie) {
					this.dmtDeSortie = dmtDeSortie;
				}
				public Boolean getDecisionJudiciare() {
					return decisionJudiciare;
				}
				public void setDecisionJudiciare(Boolean decisionJudiciare) {
					this.decisionJudiciare = decisionJudiciare;
				}
				public Boolean getDecisionAdministrative() {
					return decisionAdministrative;
				}
				public void setDecisionAdministrative(Boolean decisionAdministrative) {
					this.decisionAdministrative = decisionAdministrative;
				}
			 
		 }
		 
		 public static class InformationDemande {
			 protected String typeProcess;
 	         protected String typeDemande;
 	         protected String dateDebut;
 	         protected  String dateFin;
 	         protected Boolean optionAjouterAutreDocument;
 	         protected String nomDocumentOptional;
 	         
			public String getTypeProcess() {
				return typeProcess;
			}
			public void setTypeProcess(String typeProcess) {
				this.typeProcess = typeProcess;
			}
			public String getTypeDemande() {
				return typeDemande;
			}
			public void setTypeDemande(String typeDemande) {
				this.typeDemande = typeDemande;
			}
			public String getDateDebut() {
				return dateDebut;
			}
			public void setDateDebut(String dateDebut) {
				this.dateDebut = dateDebut;
			}
			public String getDateFin() {
				return dateFin;
			}
			public void setDateFin(String dateFin) {
				this.dateFin = dateFin;
			}
			public Boolean getOptionAjouterAutreDocument() {
				return optionAjouterAutreDocument;
			}
			public void setOptionAjouterAutreDocument(Boolean optionAjouterAutreDocument) {
				this.optionAjouterAutreDocument = optionAjouterAutreDocument;
			}
			public String getNomDocumentOptional() {
				return nomDocumentOptional;
			}
			public void setNomDocumentOptional(String nomDocumentOptional) {
				this.nomDocumentOptional = nomDocumentOptional;
			}
 	         
 	         
 	         
		 }
		 
		 public static class InformationEmployer{
			 protected String idEmployer;

			public String getIdEmployer() {
				return idEmployer;
			}

			public void setIdEmployer(String idEmployer) {
				this.idEmployer = idEmployer;
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
