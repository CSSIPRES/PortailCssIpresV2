
package com.secusociale.portail.service.soap.facturesImpayes;

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
 *                   &lt;element name="numeroFacture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="montantPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="montantTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "FACTURES_IMPAYEES_SERVICE")
public class FACTURESIMPAYEESSERVICE {

    @XmlElement(namespace = "http://oracle.com/FACTURES_IMPAYEES_SERVICE.xsd")
    protected FACTURESIMPAYEESSERVICE.Input input;
    @XmlElement(namespace = "http://oracle.com/FACTURES_IMPAYEES_SERVICE.xsd")
    protected List<FACTURESIMPAYEESSERVICE.Output> output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link FACTURESIMPAYEESSERVICE.Input }
     *     
     */
    public FACTURESIMPAYEESSERVICE.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link FACTURESIMPAYEESSERVICE.Input }
     *     
     */
    public void setInput(FACTURESIMPAYEESSERVICE.Input value) {
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
     * {@link FACTURESIMPAYEESSERVICE.Output }
     * 
     * 
     */
    public List<FACTURESIMPAYEESSERVICE.Output> getOutput() {
        if (output == null) {
            output = new ArrayList<FACTURESIMPAYEESSERVICE.Output>();
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
        "personId"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/FACTURES_IMPAYEES_SERVICE.xsd")
        protected String personId;

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
     *         &lt;element name="numeroFacture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="montantPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="montantTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "numeroFacture",
        "dateDebut",
        "dateFin",
        "montantPrincipal",
        "montantTotal"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/FACTURES_IMPAYEES_SERVICE.xsd")
        protected String numeroFacture;
        @XmlElement(namespace = "http://oracle.com/FACTURES_IMPAYEES_SERVICE.xsd")
        protected String dateDebut;
        @XmlElement(namespace = "http://oracle.com/FACTURES_IMPAYEES_SERVICE.xsd")
        protected String dateFin;
        @XmlElement(namespace = "http://oracle.com/FACTURES_IMPAYEES_SERVICE.xsd")
        protected String montantPrincipal;
        @XmlElement(namespace = "http://oracle.com/FACTURES_IMPAYEES_SERVICE.xsd")
        protected String montantTotal;

        /**
         * Obtient la valeur de la propri�t� numeroFacture.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroFacture() {
            return numeroFacture;
        }

        /**
         * D�finit la valeur de la propri�t� numeroFacture.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroFacture(String value) {
            this.numeroFacture = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateDebut.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateDebut() {
            return dateDebut;
        }

        /**
         * D�finit la valeur de la propri�t� dateDebut.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateDebut(String value) {
            this.dateDebut = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateFin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateFin() {
            return dateFin;
        }

        /**
         * D�finit la valeur de la propri�t� dateFin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateFin(String value) {
            this.dateFin = value;
        }

        /**
         * Obtient la valeur de la propri�t� montantPrincipal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMontantPrincipal() {
            return montantPrincipal;
        }

        /**
         * D�finit la valeur de la propri�t� montantPrincipal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMontantPrincipal(String value) {
            this.montantPrincipal = value;
        }

        /**
         * Obtient la valeur de la propri�t� montantTotal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMontantTotal() {
            return montantTotal;
        }

        /**
         * D�finit la valeur de la propri�t� montantTotal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMontantTotal(String value) {
            this.montantTotal = value;
        }

    }

}
