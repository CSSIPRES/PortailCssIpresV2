
package com.secusociale.portail.service.soap.duplicata_recu_recherche;

import java.util.ArrayList;
import java.util.List;
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
 *                   &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="datePaiement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="output" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="montantEncaisse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="idPaiement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "CM_GET_PAYMENT")
public class CMGETPAYMENT {

    @XmlElement(namespace = "http://oracle.com/CM_GET_PAYMENT.xsd")
    protected CMGETPAYMENT.Input input;
    @XmlElement(namespace = "http://oracle.com/CM_GET_PAYMENT.xsd")
    protected List<CMGETPAYMENT.Output> output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CMGETPAYMENT.Input }
     *     
     */
    public CMGETPAYMENT.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CMGETPAYMENT.Input }
     *     
     */
    public void setInput(CMGETPAYMENT.Input value) {
        this.input = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMGETPAYMENT.Output }
     * 
     * 
     */
    public List<CMGETPAYMENT.Output> getOutput() {
        if (output == null) {
            output = new ArrayList<CMGETPAYMENT.Output>();
        }
        return this.output;
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
     *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="datePaiement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "personId",
        "datePaiement"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CM_GET_PAYMENT.xsd")
        protected String personId;
        @XmlElement(namespace = "http://oracle.com/CM_GET_PAYMENT.xsd")
        protected String datePaiement;

        /**
         * Obtient la valeur de la propri�t� personId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersonId() {
            return personId;
        }

        /**
         * D�finit la valeur de la propri�t� personId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPersonId(String value) {
            this.personId = value;
        }

        /**
         * Obtient la valeur de la propri�t� datePaiement.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatePaiement() {
            return datePaiement;
        }

        /**
         * D�finit la valeur de la propri�t� datePaiement.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatePaiement(String value) {
            this.datePaiement = value;
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
     *         &lt;element name="montantEncaisse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="idPaiement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "montantEncaisse",
        "idPaiement"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/CM_GET_PAYMENT.xsd")
        protected String montantEncaisse;
        @XmlElement(namespace = "http://oracle.com/CM_GET_PAYMENT.xsd")
        protected String idPaiement;

        /**
         * Obtient la valeur de la propri�t� montantEncaisse.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMontantEncaisse() {
            return montantEncaisse;
        }

        /**
         * D�finit la valeur de la propri�t� montantEncaisse.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMontantEncaisse(String value) {
            this.montantEncaisse = value;
        }

        /**
         * Obtient la valeur de la propri�t� idPaiement.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdPaiement() {
            return idPaiement;
        }

        /**
         * D�finit la valeur de la propri�t� idPaiement.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdPaiement(String value) {
            this.idPaiement = value;
        }

    }

}
