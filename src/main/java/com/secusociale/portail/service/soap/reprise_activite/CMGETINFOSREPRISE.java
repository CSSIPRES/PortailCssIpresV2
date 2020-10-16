
package com.secusociale.portail.service.soap.reprise_activite;

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
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
 *         &lt;element name="idType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="idNumber" minOccurs="0">
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
 *                   &lt;element name="empType" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="perId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="entityName" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="idType" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="idNumber" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="country" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="region" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="departement" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="arrondissement" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="commune" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="quartier" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="adresse" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="email" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mobilNumber" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zoneCss" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zoneIpres" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="secCss" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="secIpres" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="agenceCss" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="agenceIpres" minOccurs="0">
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
    "idType",
    "idNumber",
    "rowCount",
    "results"
})
@XmlRootElement(name = "CM-GET_INFOS_REPRISE")
public class CMGETINFOSREPRISE {

    @XmlElement(defaultValue = "CM-GETRPDTA")
    protected String zone;
    protected String idType;
    protected String idNumber;
    protected BigDecimal rowCount;
    protected List<CMGETINFOSREPRISE.Results> results;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propriété zone.
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
     * Définit la valeur de la propriété zone.
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
     * Obtient la valeur de la propriété idType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Définit la valeur de la propriété idType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Obtient la valeur de la propriété idNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Définit la valeur de la propriété idNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Obtient la valeur de la propriété rowCount.
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
     * Définit la valeur de la propriété rowCount.
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
     * {@link CMGETINFOSREPRISE.Results }
     * 
     * 
     */
    public List<CMGETINFOSREPRISE.Results> getResults() {
        if (results == null) {
            results = new ArrayList<CMGETINFOSREPRISE.Results>();
        }
        return this.results;
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
     *         &lt;element name="empType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="perId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="entityName" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="idType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="idNumber" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="country" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="region" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="departement" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="arrondissement" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="commune" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="quartier" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="adresse" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="email" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mobilNumber" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zoneCss" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zoneIpres" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="secCss" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="secIpres" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="agenceCss" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="agenceIpres" minOccurs="0">
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
        "empType",
        "perId",
        "entityName",
        "idType",
        "idNumber",
        "country",
        "region",
        "departement",
        "arrondissement",
        "commune",
        "quartier",
        "adresse",
        "email",
        "mobilNumber",
        "zoneCss",
        "zoneIpres",
        "secCss",
        "secIpres",
        "agenceCss",
        "agenceIpres"
    })
    public static class Results {

        protected String empType;
        protected String perId;
        protected String entityName;
        protected String idType;
        protected String idNumber;
        protected String country;
        protected String region;
        protected String departement;
        protected String arrondissement;
        protected String commune;
        protected String quartier;
        protected String adresse;
        protected String email;
        protected String mobilNumber;
        protected String zoneCss;
        protected String zoneIpres;
        protected String secCss;
        protected String secIpres;
        protected String agenceCss;
        protected String agenceIpres;
        @XmlAttribute(name = "action")
        protected ListAction action;

        /**
         * Obtient la valeur de la propriété empType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmpType() {
            return empType;
        }

        /**
         * Définit la valeur de la propriété empType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmpType(String value) {
            this.empType = value;
        }

        /**
         * Obtient la valeur de la propriété perId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPerId() {
            return perId;
        }

        /**
         * Définit la valeur de la propriété perId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPerId(String value) {
            this.perId = value;
        }

        /**
         * Obtient la valeur de la propriété entityName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntityName() {
            return entityName;
        }

        /**
         * Définit la valeur de la propriété entityName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntityName(String value) {
            this.entityName = value;
        }

        /**
         * Obtient la valeur de la propriété idType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdType() {
            return idType;
        }

        /**
         * Définit la valeur de la propriété idType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdType(String value) {
            this.idType = value;
        }

        /**
         * Obtient la valeur de la propriété idNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdNumber() {
            return idNumber;
        }

        /**
         * Définit la valeur de la propriété idNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdNumber(String value) {
            this.idNumber = value;
        }

        /**
         * Obtient la valeur de la propriété country.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Définit la valeur de la propriété country.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

        /**
         * Obtient la valeur de la propriété region.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegion() {
            return region;
        }

        /**
         * Définit la valeur de la propriété region.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegion(String value) {
            this.region = value;
        }

        /**
         * Obtient la valeur de la propriété departement.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartement() {
            return departement;
        }

        /**
         * Définit la valeur de la propriété departement.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartement(String value) {
            this.departement = value;
        }

        /**
         * Obtient la valeur de la propriété arrondissement.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrondissement() {
            return arrondissement;
        }

        /**
         * Définit la valeur de la propriété arrondissement.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrondissement(String value) {
            this.arrondissement = value;
        }

        /**
         * Obtient la valeur de la propriété commune.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommune() {
            return commune;
        }

        /**
         * Définit la valeur de la propriété commune.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommune(String value) {
            this.commune = value;
        }

        /**
         * Obtient la valeur de la propriété quartier.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuartier() {
            return quartier;
        }

        /**
         * Définit la valeur de la propriété quartier.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuartier(String value) {
            this.quartier = value;
        }

        /**
         * Obtient la valeur de la propriété adresse.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdresse() {
            return adresse;
        }

        /**
         * Définit la valeur de la propriété adresse.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdresse(String value) {
            this.adresse = value;
        }

        /**
         * Obtient la valeur de la propriété email.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Définit la valeur de la propriété email.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Obtient la valeur de la propriété mobilNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobilNumber() {
            return mobilNumber;
        }

        /**
         * Définit la valeur de la propriété mobilNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobilNumber(String value) {
            this.mobilNumber = value;
        }

        /**
         * Obtient la valeur de la propriété zoneCss.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZoneCss() {
            return zoneCss;
        }

        /**
         * Définit la valeur de la propriété zoneCss.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZoneCss(String value) {
            this.zoneCss = value;
        }

        /**
         * Obtient la valeur de la propriété zoneIpres.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZoneIpres() {
            return zoneIpres;
        }

        /**
         * Définit la valeur de la propriété zoneIpres.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZoneIpres(String value) {
            this.zoneIpres = value;
        }

        /**
         * Obtient la valeur de la propriété secCss.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecCss() {
            return secCss;
        }

        /**
         * Définit la valeur de la propriété secCss.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecCss(String value) {
            this.secCss = value;
        }

        /**
         * Obtient la valeur de la propriété secIpres.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecIpres() {
            return secIpres;
        }

        /**
         * Définit la valeur de la propriété secIpres.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecIpres(String value) {
            this.secIpres = value;
        }

        /**
         * Obtient la valeur de la propriété agenceCss.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgenceCss() {
            return agenceCss;
        }

        /**
         * Définit la valeur de la propriété agenceCss.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgenceCss(String value) {
            this.agenceCss = value;
        }

        /**
         * Obtient la valeur de la propriété agenceIpres.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgenceIpres() {
            return agenceIpres;
        }

        /**
         * Définit la valeur de la propriété agenceIpres.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgenceIpres(String value) {
            this.agenceIpres = value;
        }

        /**
         * Obtient la valeur de la propriété action.
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
         * Définit la valeur de la propriété action.
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
