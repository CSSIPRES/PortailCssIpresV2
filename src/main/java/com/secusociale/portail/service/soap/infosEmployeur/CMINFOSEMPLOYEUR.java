
package com.secusociale.portail.service.soap.infosEmployeur;

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
 *                   &lt;element name="processFlowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Output" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="raisonSociale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="activitePrincipale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="adresseEmployeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tauxAt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="tauxRG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="tauxRC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="numeroEmployeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tauxPF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ninea" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="dateEmbauchePremierSalarie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="agenceCSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="agenceIPRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="adresseAgenceCSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="telephoneAgCSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="localiteAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="adresseAgenceIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="telephoneAgIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "CM_INFOS_EMPLOYEUR")
public class CMINFOSEMPLOYEUR {

    protected CMINFOSEMPLOYEUR.Input input;
    @XmlElement(name = "Output")
    protected CMINFOSEMPLOYEUR.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CMINFOSEMPLOYEUR.Input }
     *     
     */
    public CMINFOSEMPLOYEUR.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CMINFOSEMPLOYEUR.Input }
     *     
     */
    public void setInput(CMINFOSEMPLOYEUR.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link CMINFOSEMPLOYEUR.Output }
     *     
     */
    public CMINFOSEMPLOYEUR.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link CMINFOSEMPLOYEUR.Output }
     *     
     */
    public void setOutput(CMINFOSEMPLOYEUR.Output value) {
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
     *         &lt;element name="processFlowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "processFlowId"
    })
    public static class Input {

        protected String processFlowId;

        /**
         * Obtient la valeur de la propri�t� processFlowId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcessFlowId() {
            return processFlowId;
        }

        /**
         * D�finit la valeur de la propri�t� processFlowId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcessFlowId(String value) {
            this.processFlowId = value;
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
     *         &lt;element name="raisonSociale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="activitePrincipale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="adresseEmployeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tauxAt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="tauxRG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="tauxRC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="numeroEmployeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tauxPF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ninea" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="dateEmbauchePremierSalarie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="agenceCSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="agenceIPRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="adresseAgenceCSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="telephoneAgCSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="localiteAgence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="adresseAgenceIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="telephoneAgIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "raisonSociale",
        "activitePrincipale",
        "adresseEmployeur",
        "tauxAt",
        "tauxRG",
        "tauxRC",
        "numeroEmployeur",
        "tauxPF",
        "ninea",
        "dateEmbauchePremierSalarie",
        "agenceCSS",
        "agenceIPRES",
        "adresseAgenceCSS",
        "telephoneAgCSS",
        "localiteAgence",
        "adresseAgenceIpres",
        "telephoneAgIpres"
    })
    public static class Output {

        protected String raisonSociale;
        protected String activitePrincipale;
        protected String adresseEmployeur;
        @XmlElementRef(name = "tauxAt", namespace = "http://oracle.com/CM_INFOS_EMPLOYEUR.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tauxAt;
        @XmlElementRef(name = "tauxRG", namespace = "http://oracle.com/CM_INFOS_EMPLOYEUR.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tauxRG;
        @XmlElementRef(name = "tauxRC", namespace = "http://oracle.com/CM_INFOS_EMPLOYEUR.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tauxRC;
        protected String numeroEmployeur;
        @XmlElementRef(name = "tauxPF", namespace = "http://oracle.com/CM_INFOS_EMPLOYEUR.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tauxPF;
        @XmlElementRef(name = "ninea", namespace = "http://oracle.com/CM_INFOS_EMPLOYEUR.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> ninea;
        protected String dateEmbauchePremierSalarie;
        protected String agenceCSS;
        protected String agenceIPRES;
        protected String adresseAgenceCSS;
        protected String telephoneAgCSS;
        protected String localiteAgence;
        protected String adresseAgenceIpres;
        protected String telephoneAgIpres;

        /**
         * Obtient la valeur de la propri�t� raisonSociale.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRaisonSociale() {
            return raisonSociale;
        }

        /**
         * D�finit la valeur de la propri�t� raisonSociale.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRaisonSociale(String value) {
            this.raisonSociale = value;
        }

        /**
         * Obtient la valeur de la propri�t� activitePrincipale.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActivitePrincipale() {
            return activitePrincipale;
        }

        /**
         * D�finit la valeur de la propri�t� activitePrincipale.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActivitePrincipale(String value) {
            this.activitePrincipale = value;
        }

        /**
         * Obtient la valeur de la propri�t� adresseEmployeur.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdresseEmployeur() {
            return adresseEmployeur;
        }

        /**
         * D�finit la valeur de la propri�t� adresseEmployeur.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdresseEmployeur(String value) {
            this.adresseEmployeur = value;
        }

        /**
         * Obtient la valeur de la propri�t� tauxAt.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTauxAt() {
            return tauxAt;
        }

        /**
         * D�finit la valeur de la propri�t� tauxAt.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTauxAt(JAXBElement<BigDecimal> value) {
            this.tauxAt = value;
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
         * Obtient la valeur de la propri�t� tauxRC.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTauxRC() {
            return tauxRC;
        }

        /**
         * D�finit la valeur de la propri�t� tauxRC.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTauxRC(JAXBElement<BigDecimal> value) {
            this.tauxRC = value;
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
         * Obtient la valeur de la propri�t� ninea.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getNinea() {
            return ninea;
        }

        /**
         * D�finit la valeur de la propri�t� ninea.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setNinea(JAXBElement<BigDecimal> value) {
            this.ninea = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateEmbauchePremierSalarie.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateEmbauchePremierSalarie() {
            return dateEmbauchePremierSalarie;
        }

        /**
         * D�finit la valeur de la propri�t� dateEmbauchePremierSalarie.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateEmbauchePremierSalarie(String value) {
            this.dateEmbauchePremierSalarie = value;
        }

        /**
         * Obtient la valeur de la propri�t� agenceCSS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgenceCSS() {
            return agenceCSS;
        }

        /**
         * D�finit la valeur de la propri�t� agenceCSS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgenceCSS(String value) {
            this.agenceCSS = value;
        }

        /**
         * Obtient la valeur de la propri�t� agenceIPRES.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgenceIPRES() {
            return agenceIPRES;
        }

        /**
         * D�finit la valeur de la propri�t� agenceIPRES.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgenceIPRES(String value) {
            this.agenceIPRES = value;
        }

        /**
         * Obtient la valeur de la propri�t� adresseAgenceCSS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdresseAgenceCSS() {
            return adresseAgenceCSS;
        }

        /**
         * D�finit la valeur de la propri�t� adresseAgenceCSS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdresseAgenceCSS(String value) {
            this.adresseAgenceCSS = value;
        }

        /**
         * Obtient la valeur de la propri�t� telephoneAgCSS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelephoneAgCSS() {
            return telephoneAgCSS;
        }

        /**
         * D�finit la valeur de la propri�t� telephoneAgCSS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelephoneAgCSS(String value) {
            this.telephoneAgCSS = value;
        }

        /**
         * Obtient la valeur de la propri�t� localiteAgence.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocaliteAgence() {
            return localiteAgence;
        }

        /**
         * D�finit la valeur de la propri�t� localiteAgence.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocaliteAgence(String value) {
            this.localiteAgence = value;
        }

        /**
         * Obtient la valeur de la propri�t� adresseAgenceIpres.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdresseAgenceIpres() {
            return adresseAgenceIpres;
        }

        /**
         * D�finit la valeur de la propri�t� adresseAgenceIpres.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdresseAgenceIpres(String value) {
            this.adresseAgenceIpres = value;
        }

        /**
         * Obtient la valeur de la propri�t� telephoneAgIpres.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelephoneAgIpres() {
            return telephoneAgIpres;
        }

        /**
         * D�finit la valeur de la propri�t� telephoneAgIpres.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelephoneAgIpres(String value) {
            this.telephoneAgIpres = value;
        }

    }

}
