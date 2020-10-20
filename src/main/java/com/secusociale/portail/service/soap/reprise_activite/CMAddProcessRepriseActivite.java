
package com.secusociale.portail.service.soap.reprise_activite;

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
 *                   &lt;element name="informationReprise" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nombreDmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="nombreContrat" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="typeDemande" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Involontaire"/>
 *                                   &lt;enumeration value="Volontaire"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
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
 *                             &lt;element name="dmt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="formDeclarationReprise" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="photocopiePiece" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="autreDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="nomAutreDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "CM-AddProcessRepriseActivite")
public class CMAddProcessRepriseActivite {

    protected CMAddProcessRepriseActivite.Input input;
    protected CMAddProcessRepriseActivite.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CMAddProcessRepriseActivite.Input }
     *     
     */
    public CMAddProcessRepriseActivite.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CMAddProcessRepriseActivite.Input }
     *     
     */
    public void setInput(CMAddProcessRepriseActivite.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link CMAddProcessRepriseActivite.Output }
     *     
     */
    public CMAddProcessRepriseActivite.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link CMAddProcessRepriseActivite.Output }
     *     
     */
    public void setOutput(CMAddProcessRepriseActivite.Output value) {
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
     *         &lt;element name="informationReprise" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nombreDmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="nombreContrat" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="typeDemande" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Involontaire"/>
     *                         &lt;enumeration value="Volontaire"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
     *                   &lt;element name="dmt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="formDeclarationReprise" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="photocopiePiece" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="autreDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="nomAutreDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "informationReprise",
        "documents"
    })
    public static class Input {

        protected CMAddProcessRepriseActivite.Input.InformationEmployer informationEmployer;
        protected CMAddProcessRepriseActivite.Input.InformationReprise informationReprise;
        protected CMAddProcessRepriseActivite.Input.Documents documents;

        /**
         * Obtient la valeur de la propri�t� informationEmployer.
         * 
         * @return
         *     possible object is
         *     {@link CMAddProcessRepriseActivite.Input.InformationEmployer }
         *     
         */
        public CMAddProcessRepriseActivite.Input.InformationEmployer getInformationEmployer() {
            return informationEmployer;
        }

        /**
         * D�finit la valeur de la propri�t� informationEmployer.
         * 
         * @param value
         *     allowed object is
         *     {@link CMAddProcessRepriseActivite.Input.InformationEmployer }
         *     
         */
        public void setInformationEmployer(CMAddProcessRepriseActivite.Input.InformationEmployer value) {
            this.informationEmployer = value;
        }

        /**
         * Obtient la valeur de la propri�t� informationReprise.
         * 
         * @return
         *     possible object is
         *     {@link CMAddProcessRepriseActivite.Input.InformationReprise }
         *     
         */
        public CMAddProcessRepriseActivite.Input.InformationReprise getInformationReprise() {
            return informationReprise;
        }

        /**
         * D�finit la valeur de la propri�t� informationReprise.
         * 
         * @param value
         *     allowed object is
         *     {@link CMAddProcessRepriseActivite.Input.InformationReprise }
         *     
         */
        public void setInformationReprise(CMAddProcessRepriseActivite.Input.InformationReprise value) {
            this.informationReprise = value;
        }

        /**
         * Obtient la valeur de la propri�t� documents.
         * 
         * @return
         *     possible object is
         *     {@link CMAddProcessRepriseActivite.Input.Documents }
         *     
         */
        public CMAddProcessRepriseActivite.Input.Documents getDocuments() {
            return documents;
        }

        /**
         * D�finit la valeur de la propri�t� documents.
         * 
         * @param value
         *     allowed object is
         *     {@link CMAddProcessRepriseActivite.Input.Documents }
         *     
         */
        public void setDocuments(CMAddProcessRepriseActivite.Input.Documents value) {
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
         *         &lt;element name="dmt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="formDeclarationReprise" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="photocopiePiece" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="autreDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="nomAutreDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "dmt",
            "formDeclarationReprise",
            "photocopiePiece",
            "autreDocument",
            "nomAutreDocument"
        })
        public static class Documents {

            @XmlElementRef(name = "dmt", namespace = "http://oracle.com/CM-AddProcessRepriseActivite.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> dmt;
            @XmlElementRef(name = "formDeclarationReprise", namespace = "http://oracle.com/CM-AddProcessRepriseActivite.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> formDeclarationReprise;
            @XmlElementRef(name = "photocopiePiece", namespace = "http://oracle.com/CM-AddProcessRepriseActivite.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> photocopiePiece;
            @XmlElementRef(name = "autreDocument", namespace = "http://oracle.com/CM-AddProcessRepriseActivite.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> autreDocument;
            protected String nomAutreDocument;

            /**
             * Obtient la valeur de la propri�t� dmt.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getDmt() {
                return dmt;
            }

            /**
             * D�finit la valeur de la propri�t� dmt.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setDmt(JAXBElement<Boolean> value) {
                this.dmt = value;
            }

            /**
             * Obtient la valeur de la propri�t� formDeclarationReprise.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getFormDeclarationReprise() {
                return formDeclarationReprise;
            }

            /**
             * D�finit la valeur de la propri�t� formDeclarationReprise.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setFormDeclarationReprise(JAXBElement<Boolean> value) {
                this.formDeclarationReprise = value;
            }

            /**
             * Obtient la valeur de la propri�t� photocopiePiece.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getPhotocopiePiece() {
                return photocopiePiece;
            }

            /**
             * D�finit la valeur de la propri�t� photocopiePiece.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setPhotocopiePiece(JAXBElement<Boolean> value) {
                this.photocopiePiece = value;
            }

            /**
             * Obtient la valeur de la propri�t� autreDocument.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getAutreDocument() {
                return autreDocument;
            }

            /**
             * D�finit la valeur de la propri�t� autreDocument.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setAutreDocument(JAXBElement<Boolean> value) {
                this.autreDocument = value;
            }

            /**
             * Obtient la valeur de la propri�t� nomAutreDocument.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomAutreDocument() {
                return nomAutreDocument;
            }

            /**
             * D�finit la valeur de la propri�t� nomAutreDocument.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomAutreDocument(String value) {
                this.nomAutreDocument = value;
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

            @XmlElement(required = true)
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
         *         &lt;element name="nombreDmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="nombreContrat" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="typeDemande" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Involontaire"/>
         *               &lt;enumeration value="Volontaire"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "nombreDmt",
            "nombreContrat",
            "typeDemande"
        })
        public static class InformationReprise {

            @XmlElementRef(name = "nombreDmt", namespace = "http://oracle.com/CM-AddProcessRepriseActivite.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> nombreDmt;
            @XmlElementRef(name = "nombreContrat", namespace = "http://oracle.com/CM-AddProcessRepriseActivite.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> nombreContrat;
            protected String typeDemande;

            /**
             * Obtient la valeur de la propri�t� nombreDmt.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public JAXBElement<BigDecimal> getNombreDmt() {
                return nombreDmt;
            }

            /**
             * D�finit la valeur de la propri�t� nombreDmt.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public void setNombreDmt(JAXBElement<BigDecimal> value) {
                this.nombreDmt = value;
            }

            /**
             * Obtient la valeur de la propri�t� nombreContrat.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public JAXBElement<BigDecimal> getNombreContrat() {
                return nombreContrat;
            }

            /**
             * D�finit la valeur de la propri�t� nombreContrat.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public void setNombreContrat(JAXBElement<BigDecimal> value) {
                this.nombreContrat = value;
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
