
package com.secusociale.portail.service.soap.urlAttestationReguralite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *                   &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reportTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reportKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reportLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="parameters" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sendEmail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="emailBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="emailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="emailTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sendEmail",
    "output"
})
@XmlRootElement(name = "CM_GEN_ATTESTATION")
public class CMGENATTESTATION {

    protected CMGENATTESTATION.Input input;
    protected CMGENATTESTATION.SendEmail sendEmail;
    protected CMGENATTESTATION.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CMGENATTESTATION.Input }
     *     
     */
    public CMGENATTESTATION.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CMGENATTESTATION.Input }
     *     
     */
    public void setInput(CMGENATTESTATION.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� sendEmail.
     * 
     * @return
     *     possible object is
     *     {@link CMGENATTESTATION.SendEmail }
     *     
     */
    public CMGENATTESTATION.SendEmail getSendEmail() {
        return sendEmail;
    }

    /**
     * D�finit la valeur de la propri�t� sendEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link CMGENATTESTATION.SendEmail }
     *     
     */
    public void setSendEmail(CMGENATTESTATION.SendEmail value) {
        this.sendEmail = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link CMGENATTESTATION.Output }
     *     
     */
    public CMGENATTESTATION.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link CMGENATTESTATION.Output }
     *     
     */
    public void setOutput(CMGENATTESTATION.Output value) {
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
     *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reportTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reportKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reportLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="parameters" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "reportName",
        "reportTemplate",
        "reportKey",
        "reportLanguage",
        "parameters"
    })
    public static class Input {

        protected String reportName;
        protected String reportTemplate;
        protected String reportKey;
        protected String reportLanguage;
        protected List<CMGENATTESTATION.Input.Parameters> parameters;

        /**
         * Obtient la valeur de la propri�t� reportName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReportName() {
            return reportName;
        }

        /**
         * D�finit la valeur de la propri�t� reportName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReportName(String value) {
            this.reportName = value;
        }

        /**
         * Obtient la valeur de la propri�t� reportTemplate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReportTemplate() {
            return reportTemplate;
        }

        /**
         * D�finit la valeur de la propri�t� reportTemplate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReportTemplate(String value) {
            this.reportTemplate = value;
        }

        /**
         * Obtient la valeur de la propri�t� reportKey.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReportKey() {
            return reportKey;
        }

        /**
         * D�finit la valeur de la propri�t� reportKey.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReportKey(String value) {
            this.reportKey = value;
        }

        /**
         * Obtient la valeur de la propri�t� reportLanguage.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReportLanguage() {
            return reportLanguage;
        }

        /**
         * D�finit la valeur de la propri�t� reportLanguage.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReportLanguage(String value) {
            this.reportLanguage = value;
        }

        /**
         * Gets the value of the parameters property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameters property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameters().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CMGENATTESTATION.Input.Parameters }
         * 
         * 
         */
        public List<CMGENATTESTATION.Input.Parameters> getParameters() {
            if (parameters == null) {
                parameters = new ArrayList<CMGENATTESTATION.Input.Parameters>();
            }
            return this.parameters;
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
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "name",
            "value"
        })
        public static class Parameters {

            protected String name;
            protected String value;

            /**
             * Obtient la valeur de la propri�t� name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * D�finit la valeur de la propri�t� name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtient la valeur de la propri�t� value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * D�finit la valeur de la propri�t� value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

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
     *         &lt;element name="emailBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="emailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="emailTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "emailBody",
        "emailSubject",
        "emailTo"
    })
    public static class SendEmail {

        protected String emailBody;
        protected String emailSubject;
        protected String emailTo;

        /**
         * Obtient la valeur de la propri�t� emailBody.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailBody() {
            return emailBody;
        }

        /**
         * D�finit la valeur de la propri�t� emailBody.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailBody(String value) {
            this.emailBody = value;
        }

        /**
         * Obtient la valeur de la propri�t� emailSubject.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailSubject() {
            return emailSubject;
        }

        /**
         * D�finit la valeur de la propri�t� emailSubject.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailSubject(String value) {
            this.emailSubject = value;
        }

        /**
         * Obtient la valeur de la propri�t� emailTo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailTo() {
            return emailTo;
        }

        /**
         * D�finit la valeur de la propri�t� emailTo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailTo(String value) {
            this.emailTo = value;
        }

    }

}
