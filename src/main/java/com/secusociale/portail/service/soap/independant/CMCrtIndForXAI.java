
package com.secusociale.portail.service.soap.independant;

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
 *                   &lt;element name="typeDemandeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="typePieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="carteIdentiteCEDEAO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="carteConsulaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="carteIdentiteNationale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="passport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nationalite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cityOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="landLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="businessSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mainLineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="arrondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="quartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tauxAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="zoneCSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="zoneIPRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sectorCSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sectorIPRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="agenceCSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="agenceIPRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="documents" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="demandeEcrit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="formDemande" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="registreCommerce" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="declarationEtablissement" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="photocopieStatus" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="decretMinisteriel" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="avisImmatriculation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="dmt" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="contratsTravail" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="cni" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="carteIdentiteConsulaire" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="etatRecensement" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="attestationChomage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="bulletinsSalaire" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="cessationActivity" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="carteNationaleIdentite" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="derniersBulletins" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="manuscriteAdressee" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="passportDoc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="pieceIdDoc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="pieceIdGerantDoc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="output" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="formulaireId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dossierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="zoneCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="zoneIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sectorCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sectorIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="agenceCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="agenceIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tauxAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "CM-CrtIndForXAI", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
public class CMCrtIndForXAI {

    @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
    protected CMCrtIndForXAI.Input input;
    @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
    protected CMCrtIndForXAI.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link CMCrtIndForXAI.Input }
     *     
     */
    public CMCrtIndForXAI.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link CMCrtIndForXAI.Input }
     *     
     */
    public void setInput(CMCrtIndForXAI.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link CMCrtIndForXAI.Output }
     *     
     */
    public CMCrtIndForXAI.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link CMCrtIndForXAI.Output }
     *     
     */
    public void setOutput(CMCrtIndForXAI.Output value) {
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
     *         &lt;element name="typeDemandeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="typePieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="carteIdentiteCEDEAO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="carteConsulaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="carteIdentiteNationale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="passport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nationalite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cityOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="landLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="businessSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mainLineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="arrondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="quartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tauxAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="zoneCSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="zoneIPRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sectorCSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sectorIPRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="agenceCSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="agenceIPRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="documents" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="demandeEcrit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="formDemande" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="registreCommerce" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="declarationEtablissement" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="photocopieStatus" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="decretMinisteriel" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="avisImmatriculation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="dmt" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="contratsTravail" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="cni" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="carteIdentiteConsulaire" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="etatRecensement" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="attestationChomage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="bulletinsSalaire" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="cessationActivity" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="carteNationaleIdentite" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="derniersBulletins" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="manuscriteAdressee" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="passportDoc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="pieceIdDoc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="pieceIdGerantDoc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "typeDemandeur",
        "nom",
        "prenom",
        "typePieceIdentite",
        "carteIdentiteCEDEAO",
        "carteConsulaire",
        "carteIdentiteNationale",
        "passport",
        "nationalite",
        "issueDate",
        "expiryDate",
        "dateOfBirth",
        "country",
        "cityOfBirth",
        "landLineNumber",
        "mobileNumber",
        "email",
        "businessSector",
        "mainLineOfBusiness",
        "region",
        "department",
        "arrondissement",
        "commune",
        "quartier",
        "address",
        "tauxAt",
        "zoneCSS",
        "zoneIPRES",
        "sectorCSS",
        "sectorIPRES",
        "agenceCSS",
        "agenceIPRES",
        "documents"
    })
    public static class Input {

        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String typeDemandeur;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String nom;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String prenom;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String typePieceIdentite;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String carteIdentiteCEDEAO;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String carteConsulaire;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String carteIdentiteNationale;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String passport;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String nationalite;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String issueDate;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String expiryDate;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String dateOfBirth;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String country;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String cityOfBirth;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String landLineNumber;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String mobileNumber;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String email;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String businessSector;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String mainLineOfBusiness;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String region;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String department;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String arrondissement;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String commune;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String quartier;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String address;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String tauxAt;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String zoneCSS;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String zoneIPRES;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String sectorCSS;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String sectorIPRES;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String agenceCSS;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String agenceIPRES;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected CMCrtIndForXAI.Input.Documents documents;

        /**
         * Obtient la valeur de la propri�t� typeDemandeur.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeDemandeur() {
            return typeDemandeur;
        }

        /**
         * D�finit la valeur de la propri�t� typeDemandeur.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeDemandeur(String value) {
            this.typeDemandeur = value;
        }

        /**
         * Obtient la valeur de la propri�t� nom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNom() {
            return nom;
        }

        /**
         * D�finit la valeur de la propri�t� nom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNom(String value) {
            this.nom = value;
        }

        /**
         * Obtient la valeur de la propri�t� prenom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrenom() {
            return prenom;
        }

        /**
         * D�finit la valeur de la propri�t� prenom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrenom(String value) {
            this.prenom = value;
        }

        /**
         * Obtient la valeur de la propri�t� typePieceIdentite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypePieceIdentite() {
            return typePieceIdentite;
        }

        /**
         * D�finit la valeur de la propri�t� typePieceIdentite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypePieceIdentite(String value) {
            this.typePieceIdentite = value;
        }

        /**
         * Obtient la valeur de la propri�t� carteIdentiteCEDEAO.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarteIdentiteCEDEAO() {
            return carteIdentiteCEDEAO;
        }

        /**
         * D�finit la valeur de la propri�t� carteIdentiteCEDEAO.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarteIdentiteCEDEAO(String value) {
            this.carteIdentiteCEDEAO = value;
        }

        /**
         * Obtient la valeur de la propri�t� carteConsulaire.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarteConsulaire() {
            return carteConsulaire;
        }

        /**
         * D�finit la valeur de la propri�t� carteConsulaire.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarteConsulaire(String value) {
            this.carteConsulaire = value;
        }

        /**
         * Obtient la valeur de la propri�t� carteIdentiteNationale.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarteIdentiteNationale() {
            return carteIdentiteNationale;
        }

        /**
         * D�finit la valeur de la propri�t� carteIdentiteNationale.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarteIdentiteNationale(String value) {
            this.carteIdentiteNationale = value;
        }

        /**
         * Obtient la valeur de la propri�t� passport.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassport() {
            return passport;
        }

        /**
         * D�finit la valeur de la propri�t� passport.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassport(String value) {
            this.passport = value;
        }

        /**
         * Obtient la valeur de la propri�t� nationalite.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationalite() {
            return nationalite;
        }

        /**
         * D�finit la valeur de la propri�t� nationalite.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationalite(String value) {
            this.nationalite = value;
        }

        /**
         * Obtient la valeur de la propri�t� issueDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssueDate() {
            return issueDate;
        }

        /**
         * D�finit la valeur de la propri�t� issueDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssueDate(String value) {
            this.issueDate = value;
        }

        /**
         * Obtient la valeur de la propri�t� expiryDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpiryDate() {
            return expiryDate;
        }

        /**
         * D�finit la valeur de la propri�t� expiryDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpiryDate(String value) {
            this.expiryDate = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateOfBirth.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * D�finit la valeur de la propri�t� dateOfBirth.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOfBirth(String value) {
            this.dateOfBirth = value;
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
         * Obtient la valeur de la propri�t� cityOfBirth.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCityOfBirth() {
            return cityOfBirth;
        }

        /**
         * D�finit la valeur de la propri�t� cityOfBirth.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCityOfBirth(String value) {
            this.cityOfBirth = value;
        }

        /**
         * Obtient la valeur de la propri�t� landLineNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLandLineNumber() {
            return landLineNumber;
        }

        /**
         * D�finit la valeur de la propri�t� landLineNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLandLineNumber(String value) {
            this.landLineNumber = value;
        }

        /**
         * Obtient la valeur de la propri�t� mobileNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobileNumber() {
            return mobileNumber;
        }

        /**
         * D�finit la valeur de la propri�t� mobileNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobileNumber(String value) {
            this.mobileNumber = value;
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
         * Obtient la valeur de la propri�t� businessSector.
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
         * D�finit la valeur de la propri�t� businessSector.
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
         * Obtient la valeur de la propri�t� mainLineOfBusiness.
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
         * D�finit la valeur de la propri�t� mainLineOfBusiness.
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
         * Obtient la valeur de la propri�t� department.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartment() {
            return department;
        }

        /**
         * D�finit la valeur de la propri�t� department.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartment(String value) {
            this.department = value;
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
         * Obtient la valeur de la propri�t� address.
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
         * D�finit la valeur de la propri�t� address.
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
         * Obtient la valeur de la propri�t� tauxAt.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTauxAt() {
            return tauxAt;
        }

        /**
         * D�finit la valeur de la propri�t� tauxAt.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTauxAt(String value) {
            this.tauxAt = value;
        }

        /**
         * Obtient la valeur de la propri�t� zoneCSS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZoneCSS() {
            return zoneCSS;
        }

        /**
         * D�finit la valeur de la propri�t� zoneCSS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZoneCSS(String value) {
            this.zoneCSS = value;
        }

        /**
         * Obtient la valeur de la propri�t� zoneIPRES.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZoneIPRES() {
            return zoneIPRES;
        }

        /**
         * D�finit la valeur de la propri�t� zoneIPRES.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZoneIPRES(String value) {
            this.zoneIPRES = value;
        }

        /**
         * Obtient la valeur de la propri�t� sectorCSS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSectorCSS() {
            return sectorCSS;
        }

        /**
         * D�finit la valeur de la propri�t� sectorCSS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSectorCSS(String value) {
            this.sectorCSS = value;
        }

        /**
         * Obtient la valeur de la propri�t� sectorIPRES.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSectorIPRES() {
            return sectorIPRES;
        }

        /**
         * D�finit la valeur de la propri�t� sectorIPRES.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSectorIPRES(String value) {
            this.sectorIPRES = value;
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
         * Obtient la valeur de la propri�t� documents.
         * 
         * @return
         *     possible object is
         *     {@link CMCrtIndForXAI.Input.Documents }
         *     
         */
        public CMCrtIndForXAI.Input.Documents getDocuments() {
            return documents;
        }

        /**
         * D�finit la valeur de la propri�t� documents.
         * 
         * @param value
         *     allowed object is
         *     {@link CMCrtIndForXAI.Input.Documents }
         *     
         */
        public void setDocuments(CMCrtIndForXAI.Input.Documents value) {
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
         *         &lt;element name="demandeEcrit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="formDemande" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="registreCommerce" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="declarationEtablissement" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="photocopieStatus" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="decretMinisteriel" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="avisImmatriculation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="dmt" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="contratsTravail" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="cni" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="carteIdentiteConsulaire" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="etatRecensement" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="attestationChomage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="bulletinsSalaire" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="cessationActivity" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="carteNationaleIdentite" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="derniersBulletins" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="manuscriteAdressee" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="passportDoc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="pieceIdDoc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="pieceIdGerantDoc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "demandeEcrit",
            "formDemande",
            "registreCommerce",
            "declarationEtablissement",
            "photocopieStatus",
            "decretMinisteriel",
            "avisImmatriculation",
            "dmt",
            "contratsTravail",
            "cni",
            "carteIdentiteConsulaire",
            "etatRecensement",
            "attestationChomage",
            "bulletinsSalaire",
            "cessationActivity",
            "carteNationaleIdentite",
            "derniersBulletins",
            "manuscriteAdressee",
            "passportDoc",
            "pieceIdDoc",
            "pieceIdGerantDoc"
        })
        public static class Documents {

            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.DemandeEcrit demandeEcrit;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.FormDemande formDemande;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.RegistreCommerce registreCommerce;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.DeclarationEtablissement declarationEtablissement;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.PhotocopieStatus photocopieStatus;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.DecretMinisteriel decretMinisteriel;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.AvisImmatriculation avisImmatriculation;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.Dmt dmt;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.ContratsTravail contratsTravail;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.Cni cni;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.CarteIdentiteConsulaire carteIdentiteConsulaire;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.EtatRecensement etatRecensement;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.AttestationChomage attestationChomage;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.BulletinsSalaire bulletinsSalaire;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.CessationActivity cessationActivity;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.CarteNationaleIdentite carteNationaleIdentite;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.DerniersBulletins derniersBulletins;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.ManuscriteAdressee manuscriteAdressee;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.PassportDoc passportDoc;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.PieceIdDoc pieceIdDoc;
            @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
            protected CMCrtIndForXAI.Input.Documents.PieceIdGerantDoc pieceIdGerantDoc;

            /**
             * Obtient la valeur de la propri�t� demandeEcrit.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.DemandeEcrit }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.DemandeEcrit getDemandeEcrit() {
                return demandeEcrit;
            }

            /**
             * D�finit la valeur de la propri�t� demandeEcrit.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.DemandeEcrit }
             *     
             */
            public void setDemandeEcrit(CMCrtIndForXAI.Input.Documents.DemandeEcrit value) {
                this.demandeEcrit = value;
            }

            /**
             * Obtient la valeur de la propri�t� formDemande.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.FormDemande }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.FormDemande getFormDemande() {
                return formDemande;
            }

            /**
             * D�finit la valeur de la propri�t� formDemande.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.FormDemande }
             *     
             */
            public void setFormDemande(CMCrtIndForXAI.Input.Documents.FormDemande value) {
                this.formDemande = value;
            }

            /**
             * Obtient la valeur de la propri�t� registreCommerce.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.RegistreCommerce }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.RegistreCommerce getRegistreCommerce() {
                return registreCommerce;
            }

            /**
             * D�finit la valeur de la propri�t� registreCommerce.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.RegistreCommerce }
             *     
             */
            public void setRegistreCommerce(CMCrtIndForXAI.Input.Documents.RegistreCommerce value) {
                this.registreCommerce = value;
            }

            /**
             * Obtient la valeur de la propri�t� declarationEtablissement.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.DeclarationEtablissement }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.DeclarationEtablissement getDeclarationEtablissement() {
                return declarationEtablissement;
            }

            /**
             * D�finit la valeur de la propri�t� declarationEtablissement.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.DeclarationEtablissement }
             *     
             */
            public void setDeclarationEtablissement(CMCrtIndForXAI.Input.Documents.DeclarationEtablissement value) {
                this.declarationEtablissement = value;
            }

            /**
             * Obtient la valeur de la propri�t� photocopieStatus.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.PhotocopieStatus }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.PhotocopieStatus getPhotocopieStatus() {
                return photocopieStatus;
            }

            /**
             * D�finit la valeur de la propri�t� photocopieStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.PhotocopieStatus }
             *     
             */
            public void setPhotocopieStatus(CMCrtIndForXAI.Input.Documents.PhotocopieStatus value) {
                this.photocopieStatus = value;
            }

            /**
             * Obtient la valeur de la propri�t� decretMinisteriel.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.DecretMinisteriel }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.DecretMinisteriel getDecretMinisteriel() {
                return decretMinisteriel;
            }

            /**
             * D�finit la valeur de la propri�t� decretMinisteriel.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.DecretMinisteriel }
             *     
             */
            public void setDecretMinisteriel(CMCrtIndForXAI.Input.Documents.DecretMinisteriel value) {
                this.decretMinisteriel = value;
            }

            /**
             * Obtient la valeur de la propri�t� avisImmatriculation.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.AvisImmatriculation }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.AvisImmatriculation getAvisImmatriculation() {
                return avisImmatriculation;
            }

            /**
             * D�finit la valeur de la propri�t� avisImmatriculation.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.AvisImmatriculation }
             *     
             */
            public void setAvisImmatriculation(CMCrtIndForXAI.Input.Documents.AvisImmatriculation value) {
                this.avisImmatriculation = value;
            }

            /**
             * Obtient la valeur de la propri�t� dmt.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.Dmt }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.Dmt getDmt() {
                return dmt;
            }

            /**
             * D�finit la valeur de la propri�t� dmt.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.Dmt }
             *     
             */
            public void setDmt(CMCrtIndForXAI.Input.Documents.Dmt value) {
                this.dmt = value;
            }

            /**
             * Obtient la valeur de la propri�t� contratsTravail.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.ContratsTravail }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.ContratsTravail getContratsTravail() {
                return contratsTravail;
            }

            /**
             * D�finit la valeur de la propri�t� contratsTravail.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.ContratsTravail }
             *     
             */
            public void setContratsTravail(CMCrtIndForXAI.Input.Documents.ContratsTravail value) {
                this.contratsTravail = value;
            }

            /**
             * Obtient la valeur de la propri�t� cni.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.Cni }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.Cni getCni() {
                return cni;
            }

            /**
             * D�finit la valeur de la propri�t� cni.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.Cni }
             *     
             */
            public void setCni(CMCrtIndForXAI.Input.Documents.Cni value) {
                this.cni = value;
            }

            /**
             * Obtient la valeur de la propri�t� carteIdentiteConsulaire.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.CarteIdentiteConsulaire }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.CarteIdentiteConsulaire getCarteIdentiteConsulaire() {
                return carteIdentiteConsulaire;
            }

            /**
             * D�finit la valeur de la propri�t� carteIdentiteConsulaire.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.CarteIdentiteConsulaire }
             *     
             */
            public void setCarteIdentiteConsulaire(CMCrtIndForXAI.Input.Documents.CarteIdentiteConsulaire value) {
                this.carteIdentiteConsulaire = value;
            }

            /**
             * Obtient la valeur de la propri�t� etatRecensement.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.EtatRecensement }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.EtatRecensement getEtatRecensement() {
                return etatRecensement;
            }

            /**
             * D�finit la valeur de la propri�t� etatRecensement.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.EtatRecensement }
             *     
             */
            public void setEtatRecensement(CMCrtIndForXAI.Input.Documents.EtatRecensement value) {
                this.etatRecensement = value;
            }

            /**
             * Obtient la valeur de la propri�t� attestationChomage.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.AttestationChomage }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.AttestationChomage getAttestationChomage() {
                return attestationChomage;
            }

            /**
             * D�finit la valeur de la propri�t� attestationChomage.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.AttestationChomage }
             *     
             */
            public void setAttestationChomage(CMCrtIndForXAI.Input.Documents.AttestationChomage value) {
                this.attestationChomage = value;
            }

            /**
             * Obtient la valeur de la propri�t� bulletinsSalaire.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.BulletinsSalaire }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.BulletinsSalaire getBulletinsSalaire() {
                return bulletinsSalaire;
            }

            /**
             * D�finit la valeur de la propri�t� bulletinsSalaire.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.BulletinsSalaire }
             *     
             */
            public void setBulletinsSalaire(CMCrtIndForXAI.Input.Documents.BulletinsSalaire value) {
                this.bulletinsSalaire = value;
            }

            /**
             * Obtient la valeur de la propri�t� cessationActivity.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.CessationActivity }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.CessationActivity getCessationActivity() {
                return cessationActivity;
            }

            /**
             * D�finit la valeur de la propri�t� cessationActivity.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.CessationActivity }
             *     
             */
            public void setCessationActivity(CMCrtIndForXAI.Input.Documents.CessationActivity value) {
                this.cessationActivity = value;
            }

            /**
             * Obtient la valeur de la propri�t� carteNationaleIdentite.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.CarteNationaleIdentite }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.CarteNationaleIdentite getCarteNationaleIdentite() {
                return carteNationaleIdentite;
            }

            /**
             * D�finit la valeur de la propri�t� carteNationaleIdentite.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.CarteNationaleIdentite }
             *     
             */
            public void setCarteNationaleIdentite(CMCrtIndForXAI.Input.Documents.CarteNationaleIdentite value) {
                this.carteNationaleIdentite = value;
            }

            /**
             * Obtient la valeur de la propri�t� derniersBulletins.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.DerniersBulletins }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.DerniersBulletins getDerniersBulletins() {
                return derniersBulletins;
            }

            /**
             * D�finit la valeur de la propri�t� derniersBulletins.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.DerniersBulletins }
             *     
             */
            public void setDerniersBulletins(CMCrtIndForXAI.Input.Documents.DerniersBulletins value) {
                this.derniersBulletins = value;
            }

            /**
             * Obtient la valeur de la propri�t� manuscriteAdressee.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.ManuscriteAdressee }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.ManuscriteAdressee getManuscriteAdressee() {
                return manuscriteAdressee;
            }

            /**
             * D�finit la valeur de la propri�t� manuscriteAdressee.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.ManuscriteAdressee }
             *     
             */
            public void setManuscriteAdressee(CMCrtIndForXAI.Input.Documents.ManuscriteAdressee value) {
                this.manuscriteAdressee = value;
            }

            /**
             * Obtient la valeur de la propri�t� passportDoc.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.PassportDoc }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.PassportDoc getPassportDoc() {
                return passportDoc;
            }

            /**
             * D�finit la valeur de la propri�t� passportDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.PassportDoc }
             *     
             */
            public void setPassportDoc(CMCrtIndForXAI.Input.Documents.PassportDoc value) {
                this.passportDoc = value;
            }

            /**
             * Obtient la valeur de la propri�t� pieceIdDoc.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.PieceIdDoc }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.PieceIdDoc getPieceIdDoc() {
                return pieceIdDoc;
            }

            /**
             * D�finit la valeur de la propri�t� pieceIdDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.PieceIdDoc }
             *     
             */
            public void setPieceIdDoc(CMCrtIndForXAI.Input.Documents.PieceIdDoc value) {
                this.pieceIdDoc = value;
            }

            /**
             * Obtient la valeur de la propri�t� pieceIdGerantDoc.
             * 
             * @return
             *     possible object is
             *     {@link CMCrtIndForXAI.Input.Documents.PieceIdGerantDoc }
             *     
             */
            public CMCrtIndForXAI.Input.Documents.PieceIdGerantDoc getPieceIdGerantDoc() {
                return pieceIdGerantDoc;
            }

            /**
             * D�finit la valeur de la propri�t� pieceIdGerantDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link CMCrtIndForXAI.Input.Documents.PieceIdGerantDoc }
             *     
             */
            public void setPieceIdGerantDoc(CMCrtIndForXAI.Input.Documents.PieceIdGerantDoc value) {
                this.pieceIdGerantDoc = value;
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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class AttestationChomage {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class AvisImmatriculation {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class BulletinsSalaire {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class CarteIdentiteConsulaire {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class CarteNationaleIdentite {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class CessationActivity {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class Cni {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class ContratsTravail {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class DeclarationEtablissement {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class DecretMinisteriel {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class DemandeEcrit {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class DerniersBulletins {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class Dmt {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class EtatRecensement {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class FormDemande {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class ManuscriteAdressee {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class PassportDoc {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class PhotocopieStatus {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class PieceIdDoc {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class PieceIdGerantDoc {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
             *         &lt;element name="delivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "delivered",
                "url"
            })
            public static class RegistreCommerce {

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/CM-CrtIndForXAI.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
                @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
                protected String url;

                /**
                 * Obtient la valeur de la propri�t� delivered.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getDelivered() {
                    return delivered;
                }

                /**
                 * D�finit la valeur de la propri�t� delivered.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setDelivered(JAXBElement<Boolean> value) {
                    this.delivered = value;
                }

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
     *         &lt;element name="formulaireId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dossierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="zoneCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="zoneIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sectorCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sectorIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="agenceCss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="agenceIpres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tauxAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "formulaireId",
        "dossierId",
        "zoneCss",
        "zoneIpres",
        "sectorCss",
        "sectorIpres",
        "agenceCss",
        "agenceIpres",
        "tauxAt"
    })
    public static class Output {

        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String formulaireId;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String dossierId;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String zoneCss;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String zoneIpres;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String sectorCss;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String sectorIpres;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String agenceCss;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String agenceIpres;
        @XmlElement(namespace = "http://oracle.com/CM-CrtIndForXAI.xsd")
        protected String tauxAt;

        /**
         * Obtient la valeur de la propri�t� formulaireId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormulaireId() {
            return formulaireId;
        }

        /**
         * D�finit la valeur de la propri�t� formulaireId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormulaireId(String value) {
            this.formulaireId = value;
        }

        /**
         * Obtient la valeur de la propri�t� dossierId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDossierId() {
            return dossierId;
        }

        /**
         * D�finit la valeur de la propri�t� dossierId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDossierId(String value) {
            this.dossierId = value;
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
         * Obtient la valeur de la propri�t� sectorCss.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSectorCss() {
            return sectorCss;
        }

        /**
         * D�finit la valeur de la propri�t� sectorCss.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSectorCss(String value) {
            this.sectorCss = value;
        }

        /**
         * Obtient la valeur de la propri�t� sectorIpres.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSectorIpres() {
            return sectorIpres;
        }

        /**
         * D�finit la valeur de la propri�t� sectorIpres.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSectorIpres(String value) {
            this.sectorIpres = value;
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
         * Obtient la valeur de la propri�t� tauxAt.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTauxAt() {
            return tauxAt;
        }

        /**
         * D�finit la valeur de la propri�t� tauxAt.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTauxAt(String value) {
            this.tauxAt = value;
        }

    }

}
