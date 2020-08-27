
package com.secusociale.portail.service.soap.identifiantsEmployeurs;

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
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
 *                   &lt;element name="typeIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="descIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numeroIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "IDs_EMPLOYEUR_SERVICE", namespace = "http://oracle.com/IDs_EMPLOYEUR_SERVICE.xsd")
public class IDsEMPLOYEURSERVICE {

    @XmlElement(namespace = "http://oracle.com/IDs_EMPLOYEUR_SERVICE.xsd")
    protected IDsEMPLOYEURSERVICE.Input input;
    @XmlElement(namespace = "http://oracle.com/IDs_EMPLOYEUR_SERVICE.xsd")
    protected List<IDsEMPLOYEURSERVICE.Output> output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propriété input.
     * 
     * @return
     *     possible object is
     *     {@link IDsEMPLOYEURSERVICE.Input }
     *     
     */
    public IDsEMPLOYEURSERVICE.Input getInput() {
        return input;
    }

    /**
     * Définit la valeur de la propriété input.
     * 
     * @param value
     *     allowed object is
     *     {@link IDsEMPLOYEURSERVICE.Input }
     *     
     */
    public void setInput(IDsEMPLOYEURSERVICE.Input value) {
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
     * {@link IDsEMPLOYEURSERVICE.Output }
     * 
     * 
     */
    public List<IDsEMPLOYEURSERVICE.Output> getOutput() {
        if (output == null) {
            output = new ArrayList<IDsEMPLOYEURSERVICE.Output>();
        }
        return this.output;
    }

    /**
     * Obtient la valeur de la propriété dateTimeTagFormat.
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
     * Définit la valeur de la propriété dateTimeTagFormat.
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
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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

        @XmlElement(namespace = "http://oracle.com/IDs_EMPLOYEUR_SERVICE.xsd")
        protected String personId;

        /**
         * Obtient la valeur de la propriété personId.
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
         * Définit la valeur de la propriété personId.
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
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="typeIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="descIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numeroIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "descIdentifiant",
        "numeroIdentifiant"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/IDs_EMPLOYEUR_SERVICE.xsd")
        protected String typeIdentifiant;
        @XmlElement(namespace = "http://oracle.com/IDs_EMPLOYEUR_SERVICE.xsd")
        protected String descIdentifiant;
        @XmlElement(namespace = "http://oracle.com/IDs_EMPLOYEUR_SERVICE.xsd")
        protected String numeroIdentifiant;

        /**
         * Obtient la valeur de la propriété typeIdentifiant.
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
         * Définit la valeur de la propriété typeIdentifiant.
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
         * Obtient la valeur de la propriété descIdentifiant.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescIdentifiant() {
            return descIdentifiant;
        }

        /**
         * Définit la valeur de la propriété descIdentifiant.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescIdentifiant(String value) {
            this.descIdentifiant = value;
        }

        /**
         * Obtient la valeur de la propriété numeroIdentifiant.
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
         * Définit la valeur de la propriété numeroIdentifiant.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroIdentifiant(String value) {
            this.numeroIdentifiant = value;
        }

    }

}
