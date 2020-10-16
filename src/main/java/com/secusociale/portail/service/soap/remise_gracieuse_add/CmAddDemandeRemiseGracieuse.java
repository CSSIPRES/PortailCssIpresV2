
package com.secusociale.portail.service.soap.remise_gracieuse_add;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="input" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="informationEmployeur" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numeroEmployeur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="informationDemande" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="institution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="dateDebutPeriode" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dateFinPeriode" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="motifDemande" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="documents" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="demandeEcrite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="output" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idDossier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="dateTimeTagFormat" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="xsd:strict" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "input",
    "output"
})
@XmlRootElement(name = "CmAddDemandeRemiseGracieuse", namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd")
public class CmAddDemandeRemiseGracieuse {

    @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd")
    protected CmAddDemandeRemiseGracieuse.Input input;
    @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd")
    protected CmAddDemandeRemiseGracieuse.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CmAddDemandeRemiseGracieuse.Input }
     *     
     */
    public CmAddDemandeRemiseGracieuse.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CmAddDemandeRemiseGracieuse.Input }
     *     
     */
    public void setInput(CmAddDemandeRemiseGracieuse.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link CmAddDemandeRemiseGracieuse.Output }
     *     
     */
    public CmAddDemandeRemiseGracieuse.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link CmAddDemandeRemiseGracieuse.Output }
     *     
     */
    public void setOutput(CmAddDemandeRemiseGracieuse.Output value) {
        this.output = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateTimeTagFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeTagFormat() {
        if (dateTimeTagFormat == null) {
            return "xsd:strict";
        } else {
            return dateTimeTagFormat;
        }
    }

    /**
     * D�finit la valeur de la propri�t� dateTimeTagFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeTagFormat(String value) {
        this.dateTimeTagFormat = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="informationEmployeur" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="numeroEmployeur" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="informationDemande" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="institution" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="dateDebutPeriode" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dateFinPeriode" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="motifDemande" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="documents" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="demandeEcrite" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "informationEmployeur",
        "informationDemande",
        "documents"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd")
        protected CmAddDemandeRemiseGracieuse.Input.InformationEmployeur informationEmployeur;
        @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd")
        protected CmAddDemandeRemiseGracieuse.Input.InformationDemande informationDemande;
        @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd")
        protected CmAddDemandeRemiseGracieuse.Input.Documents documents;

        /**
         * Obtient la valeur de la propri�t� informationEmployeur.
         * 
         * @return
         *     possible object is
         *     {@link CmAddDemandeRemiseGracieuse.Input.InformationEmployeur }
         *     
         */
        public CmAddDemandeRemiseGracieuse.Input.InformationEmployeur getInformationEmployeur() {
            return informationEmployeur;
        }

        /**
         * D�finit la valeur de la propri�t� informationEmployeur.
         * 
         * @param value
         *     allowed object is
         *     {@link CmAddDemandeRemiseGracieuse.Input.InformationEmployeur }
         *     
         */
        public void setInformationEmployeur(CmAddDemandeRemiseGracieuse.Input.InformationEmployeur value) {
            this.informationEmployeur = value;
        }

        /**
         * Obtient la valeur de la propri�t� informationDemande.
         * 
         * @return
         *     possible object is
         *     {@link CmAddDemandeRemiseGracieuse.Input.InformationDemande }
         *     
         */
        public CmAddDemandeRemiseGracieuse.Input.InformationDemande getInformationDemande() {
            return informationDemande;
        }

        /**
         * D�finit la valeur de la propri�t� informationDemande.
         * 
         * @param value
         *     allowed object is
         *     {@link CmAddDemandeRemiseGracieuse.Input.InformationDemande }
         *     
         */
        public void setInformationDemande(CmAddDemandeRemiseGracieuse.Input.InformationDemande value) {
            this.informationDemande = value;
        }

        /**
         * Obtient la valeur de la propri�t� documents.
         * 
         * @return
         *     possible object is
         *     {@link CmAddDemandeRemiseGracieuse.Input.Documents }
         *     
         */
        public CmAddDemandeRemiseGracieuse.Input.Documents getDocuments() {
            return documents;
        }

        /**
         * D�finit la valeur de la propri�t� documents.
         * 
         * @param value
         *     allowed object is
         *     {@link CmAddDemandeRemiseGracieuse.Input.Documents }
         *     
         */
        public void setDocuments(CmAddDemandeRemiseGracieuse.Input.Documents value) {
            this.documents = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="demandeEcrite" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "demandeEcrite"
        })
        public static class Documents {

            @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd", required = true)
            protected String demandeEcrite;

            /**
             * Obtient la valeur de la propri�t� demandeEcrite.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDemandeEcrite() {
                return demandeEcrite;
            }

            /**
             * D�finit la valeur de la propri�t� demandeEcrite.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDemandeEcrite(String value) {
                this.demandeEcrite = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="institution" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="dateDebutPeriode" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dateFinPeriode" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="motifDemande" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "institution",
            "dateDebutPeriode",
            "dateFinPeriode",
            "motifDemande",
            "montant"
        })
        public static class InformationDemande {

            @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd", required = true)
            protected String institution;
            @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd", required = true, nillable = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateDebutPeriode;
            @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd", required = true, nillable = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateFinPeriode;
            @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd")
            protected String motifDemande;
            @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd")
            protected String montant;

            /**
             * Obtient la valeur de la propri�t� institution.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInstitution() {
                return institution;
            }

            /**
             * D�finit la valeur de la propri�t� institution.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInstitution(String value) {
                this.institution = value;
            }

            /**
             * Obtient la valeur de la propri�t� dateDebutPeriode.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateDebutPeriode() {
                return dateDebutPeriode;
            }

            /**
             * D�finit la valeur de la propri�t� dateDebutPeriode.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateDebutPeriode(XMLGregorianCalendar value) {
                this.dateDebutPeriode = value;
            }

            /**
             * Obtient la valeur de la propri�t� dateFinPeriode.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateFinPeriode() {
                return dateFinPeriode;
            }

            /**
             * D�finit la valeur de la propri�t� dateFinPeriode.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateFinPeriode(XMLGregorianCalendar value) {
                this.dateFinPeriode = value;
            }

            /**
             * Obtient la valeur de la propri�t� motifDemande.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMotifDemande() {
                return motifDemande;
            }

            /**
             * D�finit la valeur de la propri�t� motifDemande.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMotifDemande(String value) {
                this.motifDemande = value;
            }

            /**
             * Obtient la valeur de la propri�t� montant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMontant() {
                return montant;
            }

            /**
             * D�finit la valeur de la propri�t� montant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMontant(String value) {
                this.montant = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="numeroEmployeur" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numeroEmployeur"
        })
        public static class InformationEmployeur {

            @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd", required = true)
            protected String numeroEmployeur;

            /**
             * Obtient la valeur de la propri�t� numeroEmployeur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroEmployeur() {
                return numeroEmployeur;
            }

            /**
             * D�finit la valeur de la propri�t� numeroEmployeur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroEmployeur(String value) {
                this.numeroEmployeur = value;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="idDossier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idDossier"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/CmAddDemandeRemiseGracieuse.xsd")
        protected String idDossier;

        /**
         * Obtient la valeur de la propri�t� idDossier.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdDossier() {
            return idDossier;
        }

        /**
         * D�finit la valeur de la propri�t� idDossier.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdDossier(String value) {
            this.idDossier = value;
        }

    }

}
