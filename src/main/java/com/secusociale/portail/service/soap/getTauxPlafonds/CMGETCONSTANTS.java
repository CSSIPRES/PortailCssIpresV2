
package com.secusociale.portail.service.soap.getTauxPlafonds;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="output" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="smig" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="plafondPF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="plafondRG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="plafondRCC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="tauxPF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="tauxRG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="tauxRCC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    "output"
})
@XmlRootElement(name = "CM_GET_CONSTANTS", namespace = "http://oracle.com/CM_GET_CONSTANTS.xsd")
public class CMGETCONSTANTS {

    @XmlElement(namespace = "http://oracle.com/CM_GET_CONSTANTS.xsd")
    protected CMGETCONSTANTS.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link CMGETCONSTANTS.Output }
     *     
     */
    public CMGETCONSTANTS.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link CMGETCONSTANTS.Output }
     *     
     */
    public void setOutput(CMGETCONSTANTS.Output value) {
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
     *         &lt;element name="smig" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="plafondPF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="plafondRG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="plafondRCC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="tauxPF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="tauxRG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="tauxRCC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "smig",
        "plafondPF",
        "plafondRG",
        "plafondRCC",
        "tauxPF",
        "tauxRG",
        "tauxRCC"
    })
    public static class Output {

        @XmlElementRef(name = "smig", namespace = "http://oracle.com/CM_GET_CONSTANTS.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> smig;
        @XmlElementRef(name = "plafondPF", namespace = "http://oracle.com/CM_GET_CONSTANTS.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> plafondPF;
        @XmlElementRef(name = "plafondRG", namespace = "http://oracle.com/CM_GET_CONSTANTS.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> plafondRG;
        @XmlElementRef(name = "plafondRCC", namespace = "http://oracle.com/CM_GET_CONSTANTS.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> plafondRCC;
        @XmlElementRef(name = "tauxPF", namespace = "http://oracle.com/CM_GET_CONSTANTS.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tauxPF;
        @XmlElementRef(name = "tauxRG", namespace = "http://oracle.com/CM_GET_CONSTANTS.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tauxRG;
        @XmlElementRef(name = "tauxRCC", namespace = "http://oracle.com/CM_GET_CONSTANTS.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tauxRCC;

        /**
         * Obtient la valeur de la propri�t� smig.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getSmig() {
            return smig;
        }

        /**
         * D�finit la valeur de la propri�t� smig.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setSmig(JAXBElement<BigDecimal> value) {
            this.smig = value;
        }

        /**
         * Obtient la valeur de la propri�t� plafondPF.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPlafondPF() {
            return plafondPF;
        }

        /**
         * D�finit la valeur de la propri�t� plafondPF.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPlafondPF(JAXBElement<BigDecimal> value) {
            this.plafondPF = value;
        }

        /**
         * Obtient la valeur de la propri�t� plafondRG.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPlafondRG() {
            return plafondRG;
        }

        /**
         * D�finit la valeur de la propri�t� plafondRG.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPlafondRG(JAXBElement<BigDecimal> value) {
            this.plafondRG = value;
        }

        /**
         * Obtient la valeur de la propri�t� plafondRCC.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getPlafondRCC() {
            return plafondRCC;
        }

        /**
         * D�finit la valeur de la propri�t� plafondRCC.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setPlafondRCC(JAXBElement<BigDecimal> value) {
            this.plafondRCC = value;
        }

        /**
         * Obtient la valeur de la propri�t� tauxPF.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTauxPF() {
            return tauxPF;
        }

        /**
         * D�finit la valeur de la propri�t� tauxPF.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTauxPF(JAXBElement<BigDecimal> value) {
            this.tauxPF = value;
        }

        /**
         * Obtient la valeur de la propri�t� tauxRG.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTauxRG() {
            return tauxRG;
        }

        /**
         * D�finit la valeur de la propri�t� tauxRG.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTauxRG(JAXBElement<BigDecimal> value) {
            this.tauxRG = value;
        }

        /**
         * Obtient la valeur de la propri�t� tauxRCC.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTauxRCC() {
            return tauxRCC;
        }

        /**
         * D�finit la valeur de la propri�t� tauxRCC.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTauxRCC(JAXBElement<BigDecimal> value) {
            this.tauxRCC = value;
        }

    }

}
