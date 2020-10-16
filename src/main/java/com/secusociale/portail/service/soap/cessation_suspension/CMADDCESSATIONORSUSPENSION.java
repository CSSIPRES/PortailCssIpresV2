
package com.secusociale.portail.service.soap.cessation_suspension;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *                   &lt;element name="informationEmployer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idEmployer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="informationDemande" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="typeProcess" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="STOP"/>
 *                                   &lt;enumeration value="SUS"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="typeDemande" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Involontaire"/>
 *                                   &lt;enumeration value="Volontaire"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="optionAjouterAutreDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="nomDocumentOptional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="documents" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="demandeEmployer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="declartionCessationActivite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="dmtDeSortie" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="decisionJudiciare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="decisionAdministrative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="output" minOccurs="0">
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
@XmlRootElement(name = "CM-ADD_CESSATION_OR_SUSPENSION", namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd")
public class CMADDCESSATIONORSUSPENSION {

    @XmlElement(namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd")
    protected CMADDCESSATIONORSUSPENSION.Input input;
    @XmlElement(namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd")
    protected CMADDCESSATIONORSUSPENSION.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CMADDCESSATIONORSUSPENSION.Input }
     *     
     */
    public CMADDCESSATIONORSUSPENSION.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CMADDCESSATIONORSUSPENSION.Input }
     *     
     */
    public void setInput(CMADDCESSATIONORSUSPENSION.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link CMADDCESSATIONORSUSPENSION.Output }
     *     
     */
    public CMADDCESSATIONORSUSPENSION.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link CMADDCESSATIONORSUSPENSION.Output }
     *     
     */
    public void setOutput(CMADDCESSATIONORSUSPENSION.Output value) {
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
     *         &lt;element name="informationEmployer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="idEmployer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="informationDemande" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="typeProcess" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="STOP"/>
     *                         &lt;enumeration value="SUS"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="typeDemande" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Involontaire"/>
     *                         &lt;enumeration value="Volontaire"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="optionAjouterAutreDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="nomDocumentOptional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="documents" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="demandeEmployer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="declartionCessationActivite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="dmtDeSortie" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="decisionJudiciare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="decisionAdministrative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "informationEmployer",
        "informationDemande",
        "documents"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd")
        protected CMADDCESSATIONORSUSPENSION.Input.InformationEmployer informationEmployer;
        @XmlElement(namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd")
        protected CMADDCESSATIONORSUSPENSION.Input.InformationDemande informationDemande;
        @XmlElement(namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd")
        protected CMADDCESSATIONORSUSPENSION.Input.Documents documents;

        /**
         * Obtient la valeur de la propri�t� informationEmployer.
         * 
         * @return
         *     possible object is
         *     {@link CMADDCESSATIONORSUSPENSION.Input.InformationEmployer }
         *     
         */
        public CMADDCESSATIONORSUSPENSION.Input.InformationEmployer getInformationEmployer() {
            return informationEmployer;
        }

        /**
         * D�finit la valeur de la propri�t� informationEmployer.
         * 
         * @param value
         *     allowed object is
         *     {@link CMADDCESSATIONORSUSPENSION.Input.InformationEmployer }
         *     
         */
        public void setInformationEmployer(CMADDCESSATIONORSUSPENSION.Input.InformationEmployer value) {
            this.informationEmployer = value;
        }

        /**
         * Obtient la valeur de la propri�t� informationDemande.
         * 
         * @return
         *     possible object is
         *     {@link CMADDCESSATIONORSUSPENSION.Input.InformationDemande }
         *     
         */
        public CMADDCESSATIONORSUSPENSION.Input.InformationDemande getInformationDemande() {
            return informationDemande;
        }

        /**
         * D�finit la valeur de la propri�t� informationDemande.
         * 
         * @param value
         *     allowed object is
         *     {@link CMADDCESSATIONORSUSPENSION.Input.InformationDemande }
         *     
         */
        public void setInformationDemande(CMADDCESSATIONORSUSPENSION.Input.InformationDemande value) {
            this.informationDemande = value;
        }

        /**
         * Obtient la valeur de la propri�t� documents.
         * 
         * @return
         *     possible object is
         *     {@link CMADDCESSATIONORSUSPENSION.Input.Documents }
         *     
         */
        public CMADDCESSATIONORSUSPENSION.Input.Documents getDocuments() {
            return documents;
        }

        /**
         * D�finit la valeur de la propri�t� documents.
         * 
         * @param value
         *     allowed object is
         *     {@link CMADDCESSATIONORSUSPENSION.Input.Documents }
         *     
         */
        public void setDocuments(CMADDCESSATIONORSUSPENSION.Input.Documents value) {
            this.documents = value;
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
         *         &lt;element name="demandeEmployer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="declartionCessationActivite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="dmtDeSortie" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="decisionJudiciare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="decisionAdministrative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "demandeEmployer",
            "declartionCessationActivite",
            "dmtDeSortie",
            "decisionJudiciare",
            "decisionAdministrative"
        })
        public static class Documents {

            @XmlElementRef(name = "demandeEmployer", namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> demandeEmployer;
            @XmlElementRef(name = "declartionCessationActivite", namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> declartionCessationActivite;
            @XmlElementRef(name = "dmtDeSortie", namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> dmtDeSortie;
            @XmlElementRef(name = "decisionJudiciare", namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> decisionJudiciare;
            @XmlElementRef(name = "decisionAdministrative", namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> decisionAdministrative;

            /**
             * Obtient la valeur de la propri�t� demandeEmployer.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getDemandeEmployer() {
                return demandeEmployer;
            }

            /**
             * D�finit la valeur de la propri�t� demandeEmployer.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setDemandeEmployer(JAXBElement<Boolean> value) {
                this.demandeEmployer = value;
            }

            /**
             * Obtient la valeur de la propri�t� declartionCessationActivite.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getDeclartionCessationActivite() {
                return declartionCessationActivite;
            }

            /**
             * D�finit la valeur de la propri�t� declartionCessationActivite.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setDeclartionCessationActivite(JAXBElement<Boolean> value) {
                this.declartionCessationActivite = value;
            }

            /**
             * Obtient la valeur de la propri�t� dmtDeSortie.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getDmtDeSortie() {
                return dmtDeSortie;
            }

            /**
             * D�finit la valeur de la propri�t� dmtDeSortie.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setDmtDeSortie(JAXBElement<Boolean> value) {
                this.dmtDeSortie = value;
            }

            /**
             * Obtient la valeur de la propri�t� decisionJudiciare.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getDecisionJudiciare() {
                return decisionJudiciare;
            }

            /**
             * D�finit la valeur de la propri�t� decisionJudiciare.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setDecisionJudiciare(JAXBElement<Boolean> value) {
                this.decisionJudiciare = value;
            }

            /**
             * Obtient la valeur de la propri�t� decisionAdministrative.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getDecisionAdministrative() {
                return decisionAdministrative;
            }

            /**
             * D�finit la valeur de la propri�t� decisionAdministrative.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setDecisionAdministrative(JAXBElement<Boolean> value) {
                this.decisionAdministrative = value;
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
         *         &lt;element name="typeProcess" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="STOP"/>
         *               &lt;enumeration value="SUS"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="typeDemande" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Involontaire"/>
         *               &lt;enumeration value="Volontaire"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="optionAjouterAutreDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="nomDocumentOptional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "typeProcess",
            "typeDemande",
            "dateDebut",
            "dateFin",
            "optionAjouterAutreDocument",
            "nomDocumentOptional"
        })
        public static class InformationDemande {

            @XmlElement(namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd")
            protected String typeProcess;
            @XmlElement(namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd")
            protected String typeDemande;
            @XmlElementRef(name = "dateDebut", namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> dateDebut;
            @XmlElementRef(name = "dateFin", namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> dateFin;
            @XmlElementRef(name = "optionAjouterAutreDocument", namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> optionAjouterAutreDocument;
            @XmlElement(namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd")
            protected String nomDocumentOptional;

            /**
             * Obtient la valeur de la propri�t� typeProcess.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeProcess() {
                return typeProcess;
            }

            /**
             * D�finit la valeur de la propri�t� typeProcess.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeProcess(String value) {
                this.typeProcess = value;
            }

            /**
             * Obtient la valeur de la propri�t� typeDemande.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeDemande() {
                return typeDemande;
            }

            /**
             * D�finit la valeur de la propri�t� typeDemande.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeDemande(String value) {
                this.typeDemande = value;
            }

            /**
             * Obtient la valeur de la propri�t� dateDebut.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getDateDebut() {
                return dateDebut;
            }

            /**
             * D�finit la valeur de la propri�t� dateDebut.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setDateDebut(JAXBElement<XMLGregorianCalendar> value) {
                this.dateDebut = value;
            }

            /**
             * Obtient la valeur de la propri�t� dateFin.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getDateFin() {
                return dateFin;
            }

            /**
             * D�finit la valeur de la propri�t� dateFin.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setDateFin(JAXBElement<XMLGregorianCalendar> value) {
                this.dateFin = value;
            }

            /**
             * Obtient la valeur de la propri�t� optionAjouterAutreDocument.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getOptionAjouterAutreDocument() {
                return optionAjouterAutreDocument;
            }

            /**
             * D�finit la valeur de la propri�t� optionAjouterAutreDocument.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setOptionAjouterAutreDocument(JAXBElement<Boolean> value) {
                this.optionAjouterAutreDocument = value;
            }

            /**
             * Obtient la valeur de la propri�t� nomDocumentOptional.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomDocumentOptional() {
                return nomDocumentOptional;
            }

            /**
             * D�finit la valeur de la propri�t� nomDocumentOptional.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomDocumentOptional(String value) {
                this.nomDocumentOptional = value;
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
         *         &lt;element name="idEmployer" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "idEmployer"
        })
        public static class InformationEmployer {

            @XmlElement(namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd", required = true)
            protected String idEmployer;

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
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/CM-ADD_CESSATION_OR_SUSPENSION.xsd")
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

}
