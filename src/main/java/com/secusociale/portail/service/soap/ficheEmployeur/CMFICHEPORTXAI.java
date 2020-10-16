
package com.secusociale.portail.service.soap.ficheEmployeur;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *                   &lt;element name="identifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="changeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="typeOfContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="demandeEcrite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nouveauStatut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="procFlowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "CM-FICHEPORT_XAI")
public class CMFICHEPORTXAI {

    @XmlElement(namespace = "http://oracle.com/CM-FICHEPORT_XAI.xsd")
    protected CMFICHEPORTXAI.Input input;
    @XmlElement(namespace = "http://oracle.com/CM-FICHEPORT_XAI.xsd")
    protected CMFICHEPORTXAI.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CMFICHEPORTXAI.Input }
     *     
     */
    public CMFICHEPORTXAI.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CMFICHEPORTXAI.Input }
     *     
     */
    public void setInput(CMFICHEPORTXAI.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link CMFICHEPORTXAI.Output }
     *     
     */
    public CMFICHEPORTXAI.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link CMFICHEPORTXAI.Output }
     *     
     */
    public void setOutput(CMFICHEPORTXAI.Output value) {
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
     *         &lt;element name="identifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="changeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="typeOfContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="demandeEcrite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nouveauStatut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "identifiant",
        "changeStatus",
        "typeOfContact",
        "demandeEcrite",
        "nouveauStatut",
        "commentaire"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CM-FICHEPORT_XAI.xsd")
        protected String identifiant;
        @XmlElement(namespace = "http://oracle.com/CM-FICHEPORT_XAI.xsd")
        protected String changeStatus;
        @XmlElement(namespace = "http://oracle.com/CM-FICHEPORT_XAI.xsd")
        protected String typeOfContact;
        @XmlElement(namespace = "http://oracle.com/CM-FICHEPORT_XAI.xsd")
        protected String demandeEcrite;
        @XmlElement(namespace = "http://oracle.com/CM-FICHEPORT_XAI.xsd")
        protected String nouveauStatut;
        @XmlElement(namespace = "http://oracle.com/CM-FICHEPORT_XAI.xsd")
        protected String commentaire;

        /**
         * Obtient la valeur de la propri�t� identifiant.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifiant() {
            return identifiant;
        }

        /**
         * D�finit la valeur de la propri�t� identifiant.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifiant(String value) {
            this.identifiant = value;
        }

        /**
         * Obtient la valeur de la propri�t� changeStatus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChangeStatus() {
            return changeStatus;
        }

        /**
         * D�finit la valeur de la propri�t� changeStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChangeStatus(String value) {
            this.changeStatus = value;
        }

        /**
         * Obtient la valeur de la propri�t� typeOfContact.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeOfContact() {
            return typeOfContact;
        }

        /**
         * D�finit la valeur de la propri�t� typeOfContact.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeOfContact(String value) {
            this.typeOfContact = value;
        }

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

        /**
         * Obtient la valeur de la propri�t� nouveauStatut.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNouveauStatut() {
            return nouveauStatut;
        }

        /**
         * D�finit la valeur de la propri�t� nouveauStatut.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNouveauStatut(String value) {
            this.nouveauStatut = value;
        }

        /**
         * Obtient la valeur de la propri�t� commentaire.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommentaire() {
            return commentaire;
        }

        /**
         * D�finit la valeur de la propri�t� commentaire.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommentaire(String value) {
            this.commentaire = value;
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
     *         &lt;element name="procFlowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "procFlowId"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/CM-FICHEPORT_XAI.xsd")
        protected String procFlowId;

        /**
         * Obtient la valeur de la propri�t� procFlowId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcFlowId() {
            return procFlowId;
        }

        /**
         * D�finit la valeur de la propri�t� procFlowId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcFlowId(String value) {
            this.procFlowId = value;
        }

    }

}
