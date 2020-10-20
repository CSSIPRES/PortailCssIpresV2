
package com.secusociale.portail.service.soap.duplicata_facture_recherche;

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
 *                   &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "CM_GET_NUMERO_FACTURE")
public class CMGETNUMEROFACTURE {

    @XmlElement(namespace = "http://oracle.com/CM_GET_NUMERO_FACTURE.xsd")
    protected CMGETNUMEROFACTURE.Input input;
    @XmlElement(namespace = "http://oracle.com/CM_GET_NUMERO_FACTURE.xsd")
    protected List<CMGETNUMEROFACTURE.Output> output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CMGETNUMEROFACTURE.Input }
     *     
     */
    public CMGETNUMEROFACTURE.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CMGETNUMEROFACTURE.Input }
     *     
     */
    public void setInput(CMGETNUMEROFACTURE.Input value) {
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
     * {@link CMGETNUMEROFACTURE.Output }
     * 
     * 
     */
    public List<CMGETNUMEROFACTURE.Output> getOutput() {
        if (output == null) {
            output = new ArrayList<CMGETNUMEROFACTURE.Output>();
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
     *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "dateDebut",
        "dateFin"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CM_GET_NUMERO_FACTURE.xsd", required = true)
        protected String personId;
        @XmlElement(namespace = "http://oracle.com/CM_GET_NUMERO_FACTURE.xsd", required = true)
        protected String dateDebut;
        @XmlElement(namespace = "http://oracle.com/CM_GET_NUMERO_FACTURE.xsd")
        protected String dateFin;

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
        "dateFin"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/CM_GET_NUMERO_FACTURE.xsd")
        protected String numeroFacture;
        @XmlElement(namespace = "http://oracle.com/CM_GET_NUMERO_FACTURE.xsd")
        protected String dateDebut;
        @XmlElement(namespace = "http://oracle.com/CM_GET_NUMERO_FACTURE.xsd")
        protected String dateFin;

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

    }

}
