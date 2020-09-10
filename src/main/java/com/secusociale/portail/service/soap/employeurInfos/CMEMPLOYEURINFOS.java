
package com.secusociale.portail.service.soap.employeurInfos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
 *                   &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="identifiants" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="typeIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="descIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numeroIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="status" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="additional" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="employerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sigle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="regType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="BVOLN"/>
 *                                   &lt;enumeration value="CMPL"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="employerType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="GIE"/>
 *                                   &lt;enumeration value="DOM"/>
 *                                   &lt;enumeration value="LIB"/>
 *                                   &lt;enumeration value="TIND"/>
 *                                   &lt;enumeration value="PUB_PARA"/>
 *                                   &lt;enumeration value="PVT"/>
 *                                   &lt;enumeration value="ASSO"/>
 *                                   &lt;enumeration value="COOP"/>
 *                                   &lt;enumeration value="INDV"/>
 *                                   &lt;enumeration value="NGO"/>
 *                                   &lt;enumeration value="PROJ"/>
 *                                   &lt;enumeration value="REP_DIP"/>
 *                                   &lt;enumeration value="MAIN"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="estType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="CNST"/>
 *                                   &lt;enumeration value="BRNC"/>
 *                                   &lt;enumeration value="HDQT"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="legalStatus" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="DEVP"/>
 *                                   &lt;enumeration value="INDV"/>
 *                                   &lt;enumeration value="LOCE"/>
 *                                   &lt;enumeration value="PUBP"/>
 *                                   &lt;enumeration value="DIPR"/>
 *                                   &lt;enumeration value="LIBP"/>
 *                                   &lt;enumeration value="ENTE"/>
 *                                   &lt;enumeration value="PHYP"/>
 *                                   &lt;enumeration value="PUB"/>
 *                                   &lt;enumeration value="CONC"/>
 *                                   &lt;enumeration value="PVT"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="taxIdDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="tradeRegisterDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="dateOfInspection" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="dateOfFirstHire" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="businessSector" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="mainLineOfBusiness" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="atRate" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="-99999"/>
 *                                   &lt;maxExclusive value="99999"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="noOfWorkersInGenScheme" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="-99999"/>
 *                                   &lt;maxExclusive value="99999"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="noOfWorkersInBasicScheme" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minExclusive value="-99999"/>
 *                                   &lt;maxExclusive value="99999"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="website" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tradeRegisterNumber" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="19"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="departement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="arrondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="quartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="postal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="zoneCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="zoneIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="secteurCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="secteurIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="agenceCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="agenceIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "CM_EMPLOYEUR_INFOS", namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
public class CMEMPLOYEURINFOS {

    @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
    protected CMEMPLOYEURINFOS.Input input;
    @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
    protected CMEMPLOYEURINFOS.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propriété input.
     * 
     * @return
     *     possible object is
     *     {@link CMEMPLOYEURINFOS.Input }
     *     
     */
    public CMEMPLOYEURINFOS.Input getInput() {
        return input;
    }

    /**
     * Définit la valeur de la propriété input.
     * 
     * @param value
     *     allowed object is
     *     {@link CMEMPLOYEURINFOS.Input }
     *     
     */
    public void setInput(CMEMPLOYEURINFOS.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propriété output.
     * 
     * @return
     *     possible object is
     *     {@link CMEMPLOYEURINFOS.Output }
     *     
     */
    public CMEMPLOYEURINFOS.Output getOutput() {
        return output;
    }

    /**
     * Définit la valeur de la propriété output.
     * 
     * @param value
     *     allowed object is
     *     {@link CMEMPLOYEURINFOS.Output }
     *     
     */
    public void setOutput(CMEMPLOYEURINFOS.Output value) {
        this.output = value;
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
     *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "personId"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
        protected String personId;

        /**
         * Obtient la valeur de la propriété personId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersonId() {
            return personId;
        }

        /**
         * Définit la valeur de la propriété personId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPersonId(String value) {
            this.personId = value;
        }

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
     *         &lt;element name="identifiants" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="typeIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="descIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numeroIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="status" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="additional" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="employerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sigle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="regType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="BVOLN"/>
     *                         &lt;enumeration value="CMPL"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="employerType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="GIE"/>
     *                         &lt;enumeration value="DOM"/>
     *                         &lt;enumeration value="LIB"/>
     *                         &lt;enumeration value="TIND"/>
     *                         &lt;enumeration value="PUB_PARA"/>
     *                         &lt;enumeration value="PVT"/>
     *                         &lt;enumeration value="ASSO"/>
     *                         &lt;enumeration value="COOP"/>
     *                         &lt;enumeration value="INDV"/>
     *                         &lt;enumeration value="NGO"/>
     *                         &lt;enumeration value="PROJ"/>
     *                         &lt;enumeration value="REP_DIP"/>
     *                         &lt;enumeration value="MAIN"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="estType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="CNST"/>
     *                         &lt;enumeration value="BRNC"/>
     *                         &lt;enumeration value="HDQT"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="legalStatus" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="DEVP"/>
     *                         &lt;enumeration value="INDV"/>
     *                         &lt;enumeration value="LOCE"/>
     *                         &lt;enumeration value="PUBP"/>
     *                         &lt;enumeration value="DIPR"/>
     *                         &lt;enumeration value="LIBP"/>
     *                         &lt;enumeration value="ENTE"/>
     *                         &lt;enumeration value="PHYP"/>
     *                         &lt;enumeration value="PUB"/>
     *                         &lt;enumeration value="CONC"/>
     *                         &lt;enumeration value="PVT"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="taxIdDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="tradeRegisterDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="dateOfInspection" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="dateOfFirstHire" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="businessSector" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="mainLineOfBusiness" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="atRate" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;minExclusive value="-99999"/>
     *                         &lt;maxExclusive value="99999"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="noOfWorkersInGenScheme" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;minExclusive value="-99999"/>
     *                         &lt;maxExclusive value="99999"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="noOfWorkersInBasicScheme" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;minExclusive value="-99999"/>
     *                         &lt;maxExclusive value="99999"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="website" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tradeRegisterNumber" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="19"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="departement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="arrondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="quartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="postal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="zoneCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="zoneIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="secteurCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="secteurIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="agenceCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="agenceIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "identifiants",
        "status",
        "additional"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
        protected List<CMEMPLOYEURINFOS.Output.Identifiants> identifiants;
        @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
        protected CMEMPLOYEURINFOS.Output.Status status;
        @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
        protected CMEMPLOYEURINFOS.Output.Additional additional;

        /**
         * Gets the value of the identifiants property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identifiants property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentifiants().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CMEMPLOYEURINFOS.Output.Identifiants }
         * 
         * 
         */
        public List<CMEMPLOYEURINFOS.Output.Identifiants> getIdentifiants() {
            if (identifiants == null) {
                identifiants = new ArrayList<CMEMPLOYEURINFOS.Output.Identifiants>();
            }
            return this.identifiants;
        }

        /**
         * Obtient la valeur de la propriété status.
         * 
         * @return
         *     possible object is
         *     {@link CMEMPLOYEURINFOS.Output.Status }
         *     
         */
        public CMEMPLOYEURINFOS.Output.Status getStatus() {
            return status;
        }

        /**
         * Définit la valeur de la propriété status.
         * 
         * @param value
         *     allowed object is
         *     {@link CMEMPLOYEURINFOS.Output.Status }
         *     
         */
        public void setStatus(CMEMPLOYEURINFOS.Output.Status value) {
            this.status = value;
        }

        /**
         * Obtient la valeur de la propriété additional.
         * 
         * @return
         *     possible object is
         *     {@link CMEMPLOYEURINFOS.Output.Additional }
         *     
         */
        public CMEMPLOYEURINFOS.Output.Additional getAdditional() {
            return additional;
        }

        /**
         * Définit la valeur de la propriété additional.
         * 
         * @param value
         *     allowed object is
         *     {@link CMEMPLOYEURINFOS.Output.Additional }
         *     
         */
        public void setAdditional(CMEMPLOYEURINFOS.Output.Additional value) {
            this.additional = value;
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
         *         &lt;element name="employerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sigle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="regType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="BVOLN"/>
         *               &lt;enumeration value="CMPL"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="employerType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="GIE"/>
         *               &lt;enumeration value="DOM"/>
         *               &lt;enumeration value="LIB"/>
         *               &lt;enumeration value="TIND"/>
         *               &lt;enumeration value="PUB_PARA"/>
         *               &lt;enumeration value="PVT"/>
         *               &lt;enumeration value="ASSO"/>
         *               &lt;enumeration value="COOP"/>
         *               &lt;enumeration value="INDV"/>
         *               &lt;enumeration value="NGO"/>
         *               &lt;enumeration value="PROJ"/>
         *               &lt;enumeration value="REP_DIP"/>
         *               &lt;enumeration value="MAIN"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="estType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="CNST"/>
         *               &lt;enumeration value="BRNC"/>
         *               &lt;enumeration value="HDQT"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="legalStatus" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="DEVP"/>
         *               &lt;enumeration value="INDV"/>
         *               &lt;enumeration value="LOCE"/>
         *               &lt;enumeration value="PUBP"/>
         *               &lt;enumeration value="DIPR"/>
         *               &lt;enumeration value="LIBP"/>
         *               &lt;enumeration value="ENTE"/>
         *               &lt;enumeration value="PHYP"/>
         *               &lt;enumeration value="PUB"/>
         *               &lt;enumeration value="CONC"/>
         *               &lt;enumeration value="PVT"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="taxIdDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="tradeRegisterDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="dateOfInspection" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="dateOfFirstHire" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="businessSector" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="mainLineOfBusiness" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="atRate" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;minExclusive value="-99999"/>
         *               &lt;maxExclusive value="99999"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="noOfWorkersInGenScheme" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;minExclusive value="-99999"/>
         *               &lt;maxExclusive value="99999"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="noOfWorkersInBasicScheme" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;minExclusive value="-99999"/>
         *               &lt;maxExclusive value="99999"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="website" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tradeRegisterNumber" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="19"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="departement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="arrondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="quartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="postal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="zoneCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="zoneIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="secteurCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="secteurIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="agenceCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="agenceIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "employerName",
            "sigle",
            "regType",
            "employerType",
            "estType",
            "legalStatus",
            "taxIdDate",
            "tradeRegisterDate",
            "dateOfInspection",
            "dateOfFirstHire",
            "businessSector",
            "mainLineOfBusiness",
            "atRate",
            "noOfWorkersInGenScheme",
            "noOfWorkersInBasicScheme",
            "website",
            "tradeRegisterNumber",
            "region",
            "departement",
            "arrondissement",
            "commune",
            "quartier",
            "address",
            "postal",
            "zoneCss",
            "zoneIpres",
            "secteurCss",
            "secteurIpres",
            "agenceCss",
            "agenceIpres"
        })
        public static class Additional {

            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String employerName;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String sigle;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String regType;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String employerType;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String estType;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String legalStatus;
            @XmlElementRef(name = "taxIdDate", namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> taxIdDate;
            @XmlElementRef(name = "tradeRegisterDate", namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> tradeRegisterDate;
            @XmlElementRef(name = "dateOfInspection", namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> dateOfInspection;
            @XmlElementRef(name = "dateOfFirstHire", namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> dateOfFirstHire;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String businessSector;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String mainLineOfBusiness;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected BigDecimal atRate;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected BigDecimal noOfWorkersInGenScheme;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected BigDecimal noOfWorkersInBasicScheme;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String website;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String tradeRegisterNumber;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String region;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String departement;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String arrondissement;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String commune;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String quartier;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String address;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String postal;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String zoneCss;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String zoneIpres;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String secteurCss;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String secteurIpres;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String agenceCss;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String agenceIpres;

            /**
             * Obtient la valeur de la propriété employerName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmployerName() {
                return employerName;
            }

            /**
             * Définit la valeur de la propriété employerName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmployerName(String value) {
                this.employerName = value;
            }

            /**
             * Obtient la valeur de la propriété sigle.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSigle() {
                return sigle;
            }

            /**
             * Définit la valeur de la propriété sigle.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSigle(String value) {
                this.sigle = value;
            }

            /**
             * Obtient la valeur de la propriété regType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegType() {
                return regType;
            }

            /**
             * Définit la valeur de la propriété regType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegType(String value) {
                this.regType = value;
            }

            /**
             * Obtient la valeur de la propriété employerType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmployerType() {
                return employerType;
            }

            /**
             * Définit la valeur de la propriété employerType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmployerType(String value) {
                this.employerType = value;
            }

            /**
             * Obtient la valeur de la propriété estType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEstType() {
                return estType;
            }

            /**
             * Définit la valeur de la propriété estType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEstType(String value) {
                this.estType = value;
            }

            /**
             * Obtient la valeur de la propriété legalStatus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLegalStatus() {
                return legalStatus;
            }

            /**
             * Définit la valeur de la propriété legalStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLegalStatus(String value) {
                this.legalStatus = value;
            }

            /**
             * Obtient la valeur de la propriété taxIdDate.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getTaxIdDate() {
                return taxIdDate;
            }

            /**
             * Définit la valeur de la propriété taxIdDate.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setTaxIdDate(JAXBElement<XMLGregorianCalendar> value) {
                this.taxIdDate = value;
            }

            /**
             * Obtient la valeur de la propriété tradeRegisterDate.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getTradeRegisterDate() {
                return tradeRegisterDate;
            }

            /**
             * Définit la valeur de la propriété tradeRegisterDate.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setTradeRegisterDate(JAXBElement<XMLGregorianCalendar> value) {
                this.tradeRegisterDate = value;
            }

            /**
             * Obtient la valeur de la propriété dateOfInspection.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getDateOfInspection() {
                return dateOfInspection;
            }

            /**
             * Définit la valeur de la propriété dateOfInspection.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setDateOfInspection(JAXBElement<XMLGregorianCalendar> value) {
                this.dateOfInspection = value;
            }

            /**
             * Obtient la valeur de la propriété dateOfFirstHire.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getDateOfFirstHire() {
                return dateOfFirstHire;
            }

            /**
             * Définit la valeur de la propriété dateOfFirstHire.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setDateOfFirstHire(JAXBElement<XMLGregorianCalendar> value) {
                this.dateOfFirstHire = value;
            }

            /**
             * Obtient la valeur de la propriété businessSector.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessSector() {
                return businessSector;
            }

            /**
             * Définit la valeur de la propriété businessSector.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessSector(String value) {
                this.businessSector = value;
            }

            /**
             * Obtient la valeur de la propriété mainLineOfBusiness.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMainLineOfBusiness() {
                return mainLineOfBusiness;
            }

            /**
             * Définit la valeur de la propriété mainLineOfBusiness.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMainLineOfBusiness(String value) {
                this.mainLineOfBusiness = value;
            }

            /**
             * Obtient la valeur de la propriété atRate.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAtRate() {
                return atRate;
            }

            /**
             * Définit la valeur de la propriété atRate.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAtRate(BigDecimal value) {
                this.atRate = value;
            }

            /**
             * Obtient la valeur de la propriété noOfWorkersInGenScheme.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNoOfWorkersInGenScheme() {
                return noOfWorkersInGenScheme;
            }

            /**
             * Définit la valeur de la propriété noOfWorkersInGenScheme.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNoOfWorkersInGenScheme(BigDecimal value) {
                this.noOfWorkersInGenScheme = value;
            }

            /**
             * Obtient la valeur de la propriété noOfWorkersInBasicScheme.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNoOfWorkersInBasicScheme() {
                return noOfWorkersInBasicScheme;
            }

            /**
             * Définit la valeur de la propriété noOfWorkersInBasicScheme.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNoOfWorkersInBasicScheme(BigDecimal value) {
                this.noOfWorkersInBasicScheme = value;
            }

            /**
             * Obtient la valeur de la propriété website.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWebsite() {
                return website;
            }

            /**
             * Définit la valeur de la propriété website.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWebsite(String value) {
                this.website = value;
            }

            /**
             * Obtient la valeur de la propriété tradeRegisterNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTradeRegisterNumber() {
                return tradeRegisterNumber;
            }

            /**
             * Définit la valeur de la propriété tradeRegisterNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTradeRegisterNumber(String value) {
                this.tradeRegisterNumber = value;
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
             * Obtient la valeur de la propriété address.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Définit la valeur de la propriété address.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Obtient la valeur de la propriété postal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostal() {
                return postal;
            }

            /**
             * Définit la valeur de la propriété postal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostal(String value) {
                this.postal = value;
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
             * Obtient la valeur de la propriété secteurCss.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecteurCss() {
                return secteurCss;
            }

            /**
             * Définit la valeur de la propriété secteurCss.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecteurCss(String value) {
                this.secteurCss = value;
            }

            /**
             * Obtient la valeur de la propriété secteurIpres.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecteurIpres() {
                return secteurIpres;
            }

            /**
             * Définit la valeur de la propriété secteurIpres.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecteurIpres(String value) {
                this.secteurIpres = value;
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
         *         &lt;element name="typeIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="descIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numeroIdentifiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "typeIdentifiant",
            "descIdentifiant",
            "numeroIdentifiant"
        })
        public static class Identifiants {

            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String typeIdentifiant;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String descIdentifiant;
            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String numeroIdentifiant;

            /**
             * Obtient la valeur de la propriété typeIdentifiant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeIdentifiant() {
                return typeIdentifiant;
            }

            /**
             * Définit la valeur de la propriété typeIdentifiant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeIdentifiant(String value) {
                this.typeIdentifiant = value;
            }

            /**
             * Obtient la valeur de la propriété descIdentifiant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescIdentifiant() {
                return descIdentifiant;
            }

            /**
             * Définit la valeur de la propriété descIdentifiant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescIdentifiant(String value) {
                this.descIdentifiant = value;
            }

            /**
             * Obtient la valeur de la propriété numeroIdentifiant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroIdentifiant() {
                return numeroIdentifiant;
            }

            /**
             * Définit la valeur de la propriété numeroIdentifiant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroIdentifiant(String value) {
                this.numeroIdentifiant = value;
            }

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
         *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "status"
        })
        public static class Status {

            @XmlElement(namespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd")
            protected String status;

            /**
             * Obtient la valeur de la propriété status.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Définit la valeur de la propriété status.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

        }

    }

}
