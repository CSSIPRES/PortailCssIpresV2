
package com.secusociale.portail.service.soap.reprise_activite_accuse_url;

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
 *                   &lt;element name="idDossier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "CM-GetUrlAccuseReceptionReprise", namespace = "http://oracle.com/CM-GetUrlAccuseReceptionReprise.xsd")
public class CMGetUrlAccuseReceptionReprise {

    @XmlElement(namespace = "http://oracle.com/CM-GetUrlAccuseReceptionReprise.xsd")
    protected CMGetUrlAccuseReceptionReprise.Input input;
    @XmlElement(namespace = "http://oracle.com/CM-GetUrlAccuseReceptionReprise.xsd")
    protected CMGetUrlAccuseReceptionReprise.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CMGetUrlAccuseReceptionReprise.Input }
     *     
     */
    public CMGetUrlAccuseReceptionReprise.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CMGetUrlAccuseReceptionReprise.Input }
     *     
     */
    public void setInput(CMGetUrlAccuseReceptionReprise.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link CMGetUrlAccuseReceptionReprise.Output }
     *     
     */
    public CMGetUrlAccuseReceptionReprise.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link CMGetUrlAccuseReceptionReprise.Output }
     *     
     */
    public void setOutput(CMGetUrlAccuseReceptionReprise.Output value) {
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
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CM-GetUrlAccuseReceptionReprise.xsd")
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
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "url"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/CM-GetUrlAccuseReceptionReprise.xsd")
        protected String url;

        /**
         * Obtient la valeur de la propri�t� url.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * D�finit la valeur de la propri�t� url.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

    }

}