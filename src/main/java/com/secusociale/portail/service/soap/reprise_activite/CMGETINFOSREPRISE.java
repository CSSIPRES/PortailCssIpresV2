
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
     * Obtient la valeur de la propri�t� idType.
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
     * D�finit la valeur de la propri�t� idType.
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
     * Obtient la valeur de la propri�t� idNumber.
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
     * D�finit la valeur de la propri�t� idNumber.
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
         * Obtient la valeur de la propri�t� empType.
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
         * D�finit la valeur de la propri�t� empType.
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
         * Obtient la valeur de la propri�t� perId.
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
         * D�finit la valeur de la propri�t� perId.
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
         * Obtient la valeur de la propri�t� entityName.
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
         * D�finit la valeur de la propri�t� entityName.
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
         * Obtient la valeur de la propri�t� idType.
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
         * D�finit la valeur de la propri�t� idType.
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
         * Obtient la valeur de la propri�t� idNumber.
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
         * D�finit la valeur de la propri�t� idNumber.
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
         * Obtient la valeur de la propri�t� country.
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
         * D�finit la valeur de la propri�t� country.
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
         * Obtient la valeur de la propri�t� region.
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
         * D�finit la valeur de la propri�t� region.
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
         * Obtient la valeur de la propri�t� departement.
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
         * D�finit la valeur de la propri�t� departement.
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
         * Obtient la valeur de la propri�t� arrondissement.
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
         * D�finit la valeur de la propri�t� arrondissement.
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
         * Obtient la valeur de la propri�t� commune.
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
         * D�finit la valeur de la propri�t� commune.
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
         * Obtient la valeur de la propri�t� quartier.
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
         * D�finit la valeur de la propri�t� quartier.
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
         * Obtient la valeur de la propri�t� adresse.
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
         * D�finit la valeur de la propri�t� adresse.
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
         * Obtient la valeur de la propri�t� email.
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
         * D�finit la valeur de la propri�t� email.
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
         * Obtient la valeur de la propri�t� mobilNumber.
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
         * D�finit la valeur de la propri�t� mobilNumber.
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
         * Obtient la valeur de la propri�t� zoneCss.
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
         * D�finit la valeur de la propri�t� zoneCss.
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
         * Obtient la valeur de la propri�t� zoneIpres.
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
         * D�finit la valeur de la propri�t� zoneIpres.
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
         * Obtient la valeur de la propri�t� secCss.
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
         * D�finit la valeur de la propri�t� secCss.
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
         * Obtient la valeur de la propri�t� secIpres.
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
         * D�finit la valeur de la propri�t� secIpres.
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
         * Obtient la valeur de la propri�t� agenceCss.
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
         * D�finit la valeur de la propri�t� agenceCss.
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
         * Obtient la valeur de la propri�t� agenceIpres.
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
         * D�finit la valeur de la propri�t� agenceIpres.
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
