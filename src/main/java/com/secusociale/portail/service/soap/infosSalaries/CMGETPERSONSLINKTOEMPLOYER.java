
package com.secusociale.portail.service.soap.infosSalaries;

import java.math.BigDecimal;
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
 *         &lt;element name="zone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroEmployeur" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="typeRelation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dateDebutRelation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="rowCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxExclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="results" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nomEmployee" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="numeroSecuriteSocialeEmployee" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="typeIdentifiantEmployee" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="numeroPieceEmployee" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dateDebutContrat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dateFinContrat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
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
    "zone",
    "numeroEmployeur",
    "typeRelation",
    "dateDebutRelation",
    "rowCount",
    "results"
})
@XmlRootElement(name = "CM_GET_PERSONS_LINK_TO_EMPLOYER")
public class CMGETPERSONSLINKTOEMPLOYER {

    @XmlElement(namespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd", defaultValue = "CM-GETRELPER")
    protected String zone;
    @XmlElement(namespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd")
    protected String numeroEmployeur;
    @XmlElement(namespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd", defaultValue = "EMPL-EMP")
    protected String typeRelation;
    @XmlElement(namespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd")
    protected String dateDebutRelation;
    @XmlElement(namespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd")
    protected BigDecimal rowCount;
    @XmlElement(namespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd")
    protected List<CMGETPERSONSLINKTOEMPLOYER.Results> results;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� zone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * D�finit la valeur de la propri�t� zone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

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

    /**
     * Obtient la valeur de la propri�t� typeRelation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeRelation() {
        return typeRelation;
    }

    /**
     * D�finit la valeur de la propri�t� typeRelation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeRelation(String value) {
        this.typeRelation = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateDebutRelation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDebutRelation() {
        return dateDebutRelation;
    }

    /**
     * D�finit la valeur de la propri�t� dateDebutRelation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDebutRelation(String value) {
        this.dateDebutRelation = value;
    }

    /**
     * Obtient la valeur de la propri�t� rowCount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRowCount() {
        return rowCount;
    }

    /**
     * D�finit la valeur de la propri�t� rowCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRowCount(BigDecimal value) {
        this.rowCount = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the results property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CMGETPERSONSLINKTOEMPLOYER.Results }
     * 
     * 
     */
    public List<CMGETPERSONSLINKTOEMPLOYER.Results> getResults() {
        if (results == null) {
            results = new ArrayList<CMGETPERSONSLINKTOEMPLOYER.Results>();
        }
        return this.results;
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
     *         &lt;element name="nomEmployee" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="numeroSecuriteSocialeEmployee" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="typeIdentifiantEmployee" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="numeroPieceEmployee" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dateDebutContrat" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dateFinContrat" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nomEmployee",
        "numeroSecuriteSocialeEmployee",
        "typeIdentifiantEmployee",
        "numeroPieceEmployee",
        "dateDebutContrat",
        "dateFinContrat"
    })
    public static class Results {

        @XmlElement(namespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd")
        protected String nomEmployee;
        @XmlElement(namespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd")
        protected String numeroSecuriteSocialeEmployee;
        @XmlElement(namespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd")
        protected String typeIdentifiantEmployee;
        @XmlElement(namespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd")
        protected String numeroPieceEmployee;
        @XmlElement(namespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd")
        protected String dateDebutContrat;
        @XmlElement(namespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd")
        protected String dateFinContrat;
        @XmlAttribute(name = "action")
        protected ListAction action;

        /**
         * Obtient la valeur de la propri�t� nomEmployee.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomEmployee() {
            return nomEmployee;
        }

        /**
         * D�finit la valeur de la propri�t� nomEmployee.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomEmployee(String value) {
            this.nomEmployee = value;
        }

        /**
         * Obtient la valeur de la propri�t� numeroSecuriteSocialeEmployee.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroSecuriteSocialeEmployee() {
            return numeroSecuriteSocialeEmployee;
        }

        /**
         * D�finit la valeur de la propri�t� numeroSecuriteSocialeEmployee.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroSecuriteSocialeEmployee(String value) {
            this.numeroSecuriteSocialeEmployee = value;
        }

        /**
         * Obtient la valeur de la propri�t� typeIdentifiantEmployee.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeIdentifiantEmployee() {
            return typeIdentifiantEmployee;
        }

        /**
         * D�finit la valeur de la propri�t� typeIdentifiantEmployee.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeIdentifiantEmployee(String value) {
            this.typeIdentifiantEmployee = value;
        }

        /**
         * Obtient la valeur de la propri�t� numeroPieceEmployee.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroPieceEmployee() {
            return numeroPieceEmployee;
        }

        /**
         * D�finit la valeur de la propri�t� numeroPieceEmployee.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroPieceEmployee(String value) {
            this.numeroPieceEmployee = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateDebutContrat.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateDebutContrat() {
            return dateDebutContrat;
        }

        /**
         * D�finit la valeur de la propri�t� dateDebutContrat.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateDebutContrat(String value) {
            this.dateDebutContrat = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateFinContrat.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateFinContrat() {
            return dateFinContrat;
        }

        /**
         * D�finit la valeur de la propri�t� dateFinContrat.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateFinContrat(String value) {
            this.dateFinContrat = value;
        }

        /**
         * Obtient la valeur de la propri�t� action.
         * 
         * @return
         *     possible object is
         *     {@link ListAction }
         *     
         */
        public ListAction getAction() {
            return action;
        }

        /**
         * D�finit la valeur de la propri�t� action.
         * 
         * @param value
         *     allowed object is
         *     {@link ListAction }
         *     
         */
        public void setAction(ListAction value) {
            this.action = value;
        }

    }

}
