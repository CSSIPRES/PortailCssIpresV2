
package com.secusociale.portail.service.soap.moratoire;

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
 *                   &lt;element name="idEmployer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="listMoratoire" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idMoratoire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="payments" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="datePayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="isPaymentDone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
@XmlRootElement(name = "CM_GET_INFORMATION_MORATOIRE")
public class CMGETINFORMATIONMORATOIRE {

    @XmlElement(namespace = "http://oracle.com/CM_GET_INFORMATION_MORATOIRE.xsd")
    protected CMGETINFORMATIONMORATOIRE.Input input;
    @XmlElement(namespace = "http://oracle.com/CM_GET_INFORMATION_MORATOIRE.xsd")
    protected CMGETINFORMATIONMORATOIRE.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CMGETINFORMATIONMORATOIRE.Input }
     *     
     */
    public CMGETINFORMATIONMORATOIRE.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CMGETINFORMATIONMORATOIRE.Input }
     *     
     */
    public void setInput(CMGETINFORMATIONMORATOIRE.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link CMGETINFORMATIONMORATOIRE.Output }
     *     
     */
    public CMGETINFORMATIONMORATOIRE.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link CMGETINFORMATIONMORATOIRE.Output }
     *     
     */
    public void setOutput(CMGETINFORMATIONMORATOIRE.Output value) {
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
     *         &lt;element name="idEmployer" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "idEmployer",
        "dateDebut",
        "dateFin"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CM_GET_INFORMATION_MORATOIRE.xsd", required = true)
        protected String idEmployer;
        @XmlElement(namespace = "http://oracle.com/CM_GET_INFORMATION_MORATOIRE.xsd")
        protected String dateDebut;
        @XmlElement(namespace = "http://oracle.com/CM_GET_INFORMATION_MORATOIRE.xsd")
        protected String dateFin;

        /**
         * Obtient la valeur de la propri�t� idEmployer.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdEmployer() {
            return idEmployer;
        }

        /**
         * D�finit la valeur de la propri�t� idEmployer.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdEmployer(String value) {
            this.idEmployer = value;
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
     *         &lt;element name="listMoratoire" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="idMoratoire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="payments" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="datePayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="isPaymentDone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "listMoratoire"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/CM_GET_INFORMATION_MORATOIRE.xsd")
        protected List<CMGETINFORMATIONMORATOIRE.Output.ListMoratoire> listMoratoire;

        /**
         * Gets the value of the listMoratoire property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listMoratoire property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListMoratoire().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CMGETINFORMATIONMORATOIRE.Output.ListMoratoire }
         * 
         * 
         */
        public List<CMGETINFORMATIONMORATOIRE.Output.ListMoratoire> getListMoratoire() {
            if (listMoratoire == null) {
                listMoratoire = new ArrayList<CMGETINFORMATIONMORATOIRE.Output.ListMoratoire>();
            }
            return this.listMoratoire;
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
         *         &lt;element name="idMoratoire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="payments" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="datePayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="isPaymentDone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "idMoratoire",
            "payments"
        })
        public static class ListMoratoire {

            @XmlElement(namespace = "http://oracle.com/CM_GET_INFORMATION_MORATOIRE.xsd")
            protected String idMoratoire;
            @XmlElement(namespace = "http://oracle.com/CM_GET_INFORMATION_MORATOIRE.xsd")
            protected List<CMGETINFORMATIONMORATOIRE.Output.ListMoratoire.Payments> payments;

            /**
             * Obtient la valeur de la propri�t� idMoratoire.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdMoratoire() {
                return idMoratoire;
            }

            /**
             * D�finit la valeur de la propri�t� idMoratoire.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdMoratoire(String value) {
                this.idMoratoire = value;
            }

            /**
             * Gets the value of the payments property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the payments property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPayments().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CMGETINFORMATIONMORATOIRE.Output.ListMoratoire.Payments }
             * 
             * 
             */
            public List<CMGETINFORMATIONMORATOIRE.Output.ListMoratoire.Payments> getPayments() {
                if (payments == null) {
                    payments = new ArrayList<CMGETINFORMATIONMORATOIRE.Output.ListMoratoire.Payments>();
                }
                return this.payments;
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
             *         &lt;element name="datePayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="isPaymentDone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "datePayment",
                "montant",
                "isPaymentDone"
            })
            public static class Payments {

                @XmlElement(namespace = "http://oracle.com/CM_GET_INFORMATION_MORATOIRE.xsd")
                protected String datePayment;
                @XmlElement(namespace = "http://oracle.com/CM_GET_INFORMATION_MORATOIRE.xsd")
                protected String montant;
                @XmlElement(namespace = "http://oracle.com/CM_GET_INFORMATION_MORATOIRE.xsd")
                protected String isPaymentDone;

                /**
                 * Obtient la valeur de la propri�t� datePayment.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatePayment() {
                    return datePayment;
                }

                /**
                 * D�finit la valeur de la propri�t� datePayment.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatePayment(String value) {
                    this.datePayment = value;
                }

                /**
                 * Obtient la valeur de la propri�t� montant.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMontant() {
                    return montant;
                }

                /**
                 * D�finit la valeur de la propri�t� montant.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMontant(String value) {
                    this.montant = value;
                }

                /**
                 * Obtient la valeur de la propri�t� isPaymentDone.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsPaymentDone() {
                    return isPaymentDone;
                }

                /**
                 * D�finit la valeur de la propri�t� isPaymentDone.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsPaymentDone(String value) {
                    this.isPaymentDone = value;
                }

            }

        }

    }

}
