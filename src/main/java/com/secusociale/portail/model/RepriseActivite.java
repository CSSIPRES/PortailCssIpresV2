package com.secusociale.portail.model;

import java.math.BigDecimal;

public class RepriseActivite {

	protected Input input;
	
	
	public Input getInput() {
		return input;
	}


	public void setInput(Input input) {
		this.input = input;
	}


	public static class Input { 
		 
		protected InformationEmployer informationEmployer ;

		protected InformationReprise informationReprise ;
		
		protected Documents documents ;

		public InformationEmployer getInformationEmployer() {
			return informationEmployer;
		}

		public void setInformationEmployer(InformationEmployer informationEmployer) {
			this.informationEmployer = informationEmployer;
		}

		public InformationReprise getInformationReprise() {
			return informationReprise;
		}

		public void setInformationReprise(InformationReprise informationReprise) {
			this.informationReprise = informationReprise;
		}

		public Documents getDocuments() {
			return documents;
		}

		public void setDocuments(Documents documents) {
			this.documents = documents;
		}
		
		
	
	}
	
	public static class InformationEmployer {
		
		protected String idEmployer;

		public String getIdEmployer() {
			return idEmployer;
		}

		public void setIdEmployer(String idEmployer) {
			this.idEmployer = idEmployer;
		}
		
		
	}
	
	
	
	public static class InformationReprise {
		protected BigDecimal nombreDmt;
		protected BigDecimal nombreContrat;
		protected String typeDemande;
		public BigDecimal getNombreDmt() {
			return nombreDmt;
		}
		public void setNombreDmt(BigDecimal nombreDmt) {
			this.nombreDmt = nombreDmt;
		}
		public BigDecimal getNombreContrat() {
			return nombreContrat;
		}
		public void setNombreContrat(BigDecimal nombreContrat) {
			this.nombreContrat = nombreContrat;
		}
		public String getTypeDemande() {
			return typeDemande;
		}
		public void setTypeDemande(String typeDemande) {
			this.typeDemande = typeDemande;
		}
		
		
	}
	
	
	public static class Documents {
		
		protected Boolean dmt;
        protected Boolean formDeclarationReprise;
        protected Boolean photocopiePiece;
		public Boolean getDmt() {
			return dmt;
		}
		public void setDmt(Boolean dmt) {
			this.dmt = dmt;
		}
		public Boolean getFormDeclarationReprise() {
			return formDeclarationReprise;
		}
		public void setFormDeclarationReprise(Boolean formDeclarationReprise) {
			this.formDeclarationReprise = formDeclarationReprise;
		}
		public Boolean getPhotocopiePiece() {
			return photocopiePiece;
		}
		public void setPhotocopiePiece(Boolean photocopiePiece) {
			this.photocopiePiece = photocopiePiece;
		}
        
        
	}
}
