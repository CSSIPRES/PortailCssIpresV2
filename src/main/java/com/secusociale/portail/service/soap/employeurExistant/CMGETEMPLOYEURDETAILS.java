
package com.secusociale.portail.service.soap.employeurExistant;

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
 *                   &lt;element name="typeIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numeroIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numeroUnique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="raisonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="address4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tauxAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "CM_GET_EMPLOYEUR_DETAILS")
public class CMGETEMPLOYEURDETAILS {

    @XmlElement(namespace = "http://oracle.com/CM_GET_EMPLOYEUR_DETAILS.xsd")
    protected CMGETEMPLOYEURDETAILS.Input input;
    @XmlElement(namespace = "http://oracle.com/CM_GET_EMPLOYEUR_DETAILS.xsd")
    protected CMGETEMPLOYEURDETAILS.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CMGETEMPLOYEURDETAILS.Input }
     *     
     */
    public CMGETEMPLOYEURDETAILS.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CMGETEMPLOYEURDETAILS.Input }
     *     
     */
    public void setInput(CMGETEMPLOYEURDETAILS.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link CMGETEMPLOYEURDETAILS.Output }
     *     
     */
    public CMGETEMPLOYEURDETAILS.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link CMGETEMPLOYEURDETAILS.Output }
     *     
     */
    public void setOutput(CMGETEMPLOYEURDETAILS.Output value) {
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
     *         &lt;element name="typeIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numeroIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numeroUnique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "typeIdentifiant",
        "numeroIdentifiant",
        "numeroUnique"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CM_GET_EMPLOYEUR_DETAILS.xsd")
        protected String typeIdentifiant;
        @XmlElement(namespace = "http://oracle.com/CM_GET_EMPLOYEUR_DETAILS.xsd")
        protected String numeroIdentifiant;
        @XmlElement(namespace = "http://oracle.com/CM_GET_EMPLOYEUR_DETAILS.xsd")
        protected String numeroUnique;

        /**
         * Obtient la valeur de la propri�t� typeIdentifiant.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeIdentifiant() {
            return typeIdentifiant;
        }

        /**
         * D�finit la valeur de la propri�t� typeIdentifiant.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeIdentifiant(String value) {
            this.typeIdentifiant = value;
        }

        /**
         * Obtient la valeur de la propri�t� numeroIdentifiant.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroIdentifiant() {
            return numeroIdentifiant;
        }

        /**
         * D�finit la valeur de la propri�t� numeroIdentifiant.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroIdentifiant(String value) {
            this.numeroIdentifiant = value;
        }

        /**
         * Obtient la valeur de la propri�t� numeroUnique.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroUnique() {
            return numeroUnique;
        }

        /**
         * D�finit la valeur de la propri�t� numeroUnique.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroUnique(String value) {
            this.numeroUnique = value;
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
     *         &lt;element name="raisonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="address4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tauxAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "raisonSocial",
        "address1",
        "address2",
        "address3",
        "address4",
        "tauxAt"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/CM_GET_EMPLOYEUR_DETAILS.xsd")
        protected String raisonSocial;
        @XmlElement(namespace = "http://oracle.com/CM_GET_EMPLOYEUR_DETAILS.xsd")
        protected String address1;
        @XmlElement(namespace = "http://oracle.com/CM_GET_EMPLOYEUR_DETAILS.xsd")
        protected String address2;
        @XmlElement(namespace = "http://oracle.com/CM_GET_EMPLOYEUR_DETAILS.xsd")
        protected String address3;
        @XmlElement(namespace = "http://oracle.com/CM_GET_EMPLOYEUR_DETAILS.xsd")
        protected String address4;
        @XmlElement(namespace = "http://oracle.com/CM_GET_EMPLOYEUR_DETAILS.xsd")
        protected String tauxAt;

        /**
         * Obtient la valeur de la propri�t� raisonSocial.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRaisonSocial() {
            return raisonSocial;
        }

        /**
         * D�finit la valeur de la propri�t� raisonSocial.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRaisonSocial(String value) {
            this.raisonSocial = value;
        }

        /**
         * Obtient la valeur de la propri�t� address1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress1() {
            return address1;
        }

        /**
         * D�finit la valeur de la propri�t� address1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress1(String value) {
            this.address1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� address2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress2() {
            return address2;
        }

        /**
         * D�finit la valeur de la propri�t� address2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress2(String value) {
            this.address2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� address3.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress3() {
            return address3;
        }

        /**
         * D�finit la valeur de la propri�t� address3.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress3(String value) {
            this.address3 = value;
        }

        /**
         * Obtient la valeur de la propri�t� address4.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress4() {
            return address4;
        }

        /**
         * D�finit la valeur de la propri�t� address4.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress4(String value) {
            this.address4 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tauxAt.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTauxAt() {
            return tauxAt;
        }

        /**
         * D�finit la valeur de la propri�t� tauxAt.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTauxAt(String value) {
            this.tauxAt = value;
        }

    }

}
