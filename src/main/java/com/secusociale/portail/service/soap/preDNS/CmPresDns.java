
package com.secusociale.portail.service.soap.preDNS;

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
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeIdentifiant" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroIdentifiant" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="raisonSociale" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="address" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="typeDeclaration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dateDebutPeriodeCotisation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dateFinPeriodeCotisation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="totalSalaries" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxExclusive value="999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="totalSalaireAssujetisRg" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *         &lt;element name="totalSalaireAssujetisRcc" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *         &lt;element name="totalSalaireAssujetisPf" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *         &lt;element name="totalSalaireAssujetisAtmp" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *         &lt;element name="totalSalaireVerses" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *         &lt;element name="montantCotisationPfEmp" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *         &lt;element name="montantCotisationAtmpEmp" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *         &lt;element name="montantCotisationRgEmpl" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *         &lt;element name="montantCotisationRccEmp" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *         &lt;element name="informationSalaries" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroAssureSocial" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nom" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="prenom" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dateNaissance" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="typePiece" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="numeroPiece" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="natureContrat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dateEntree" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="dateSortie" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="motif" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="totalSalaireAssujetisPfMois1" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="totalSalaireAssujetisAtmpMois1" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="totalSalaireAssujetisRgMois1" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="totalSalaireAssujetisRccMois1" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="salaireBrutMois1" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="tempsPresenceJourMois1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxExclusive value="9999999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tempsPresenceHeureMois1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxExclusive value="99999999999999999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tempsTravailMois1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tranceDeTravailMois1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="regimeGeneralMois1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="regimeCadreMois1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="dateEffetRegimeCadreMois1" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="totalSalaireAssujetisPfMois2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="totalSalaireAssujetisAtmpMois2" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="totalSalaireAssujetisRgMois2" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="totalSalaireAssujetisRccMois2" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="salaireBrutMois2" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="tempsPresenceJourMois2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="tempsPresenceHeureMois2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="tempsTravailMois2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tranceDeTravailMois2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="regimeGeneralMois2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="regimeCadreMois2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="dateEffetRegimeCadreMois2" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="totalSalaireAssujetisPfMois3" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="totalSalaireAssujetisAtmpMois3" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="totalSalaireAssujetisRgMois3" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="totalSalaireAssujetisRccMois3" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="salaireBrutMois3" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
 *                   &lt;element name="tempsPresenceJourMois3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="tempsPresenceHeureMois3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="tempsTravailMois3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tranceDeTravailMois3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="regimeGeneralMois3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="regimeCadreMois3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="dateEffetRegimeCadreMois3" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    "typeIdentifiant",
    "numeroIdentifiant",
    "raisonSociale",
    "address",
    "typeDeclaration",
    "dateDebutPeriodeCotisation",
    "dateFinPeriodeCotisation",
    "totalSalaries",
    "totalSalaireAssujetisRg",
    "totalSalaireAssujetisRcc",
    "totalSalaireAssujetisPf",
    "totalSalaireAssujetisAtmp",
    "totalSalaireVerses",
    "montantCotisationPfEmp",
    "montantCotisationAtmpEmp",
    "montantCotisationRgEmpl",
    "montantCotisationRccEmp",
    "informationSalaries"
})
@XmlRootElement(name = "CmPresDns", namespace = "http://oracle.com/CmPresDns.xsd")
public class CmPresDns {

    @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
    protected String typeIdentifiant;
    @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
    protected String numeroIdentifiant;
    @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
    protected String raisonSociale;
    @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
    protected String address;
    @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
    protected String typeDeclaration;
    @XmlElementRef(name = "dateDebutPeriodeCotisation", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateDebutPeriodeCotisation;
    @XmlElementRef(name = "dateFinPeriodeCotisation", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateFinPeriodeCotisation;
    @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
    protected BigDecimal totalSalaries;
    @XmlElementRef(name = "totalSalaireAssujetisRg", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalSalaireAssujetisRg;
    @XmlElementRef(name = "totalSalaireAssujetisRcc", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalSalaireAssujetisRcc;
    @XmlElementRef(name = "totalSalaireAssujetisPf", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalSalaireAssujetisPf;
    @XmlElementRef(name = "totalSalaireAssujetisAtmp", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalSalaireAssujetisAtmp;
    @XmlElementRef(name = "totalSalaireVerses", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalSalaireVerses;
    @XmlElementRef(name = "montantCotisationPfEmp", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> montantCotisationPfEmp;
    @XmlElementRef(name = "montantCotisationAtmpEmp", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> montantCotisationAtmpEmp;
    @XmlElementRef(name = "montantCotisationRgEmpl", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> montantCotisationRgEmpl;
    @XmlElementRef(name = "montantCotisationRccEmp", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> montantCotisationRccEmp;
    @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
    protected List<CmPresDns.InformationSalaries> informationSalaries;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� typeIdentifiant.
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
     * D�finit la valeur de la propri�t� typeIdentifiant.
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
     * Obtient la valeur de la propri�t� numeroIdentifiant.
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
     * D�finit la valeur de la propri�t� numeroIdentifiant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentifiant(String value) {
        this.numeroIdentifiant = value;
    }

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
     * Obtient la valeur de la propri�t� typeDeclaration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDeclaration() {
        return typeDeclaration;
    }

    /**
     * D�finit la valeur de la propri�t� typeDeclaration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDeclaration(String value) {
        this.typeDeclaration = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateDebutPeriodeCotisation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateDebutPeriodeCotisation() {
        return dateDebutPeriodeCotisation;
    }

    /**
     * D�finit la valeur de la propri�t� dateDebutPeriodeCotisation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateDebutPeriodeCotisation(JAXBElement<XMLGregorianCalendar> value) {
        this.dateDebutPeriodeCotisation = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateFinPeriodeCotisation.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateFinPeriodeCotisation() {
        return dateFinPeriodeCotisation;
    }

    /**
     * D�finit la valeur de la propri�t� dateFinPeriodeCotisation.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateFinPeriodeCotisation(JAXBElement<XMLGregorianCalendar> value) {
        this.dateFinPeriodeCotisation = value;
    }

    /**
     * Obtient la valeur de la propri�t� totalSalaries.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSalaries() {
        return totalSalaries;
    }

    /**
     * D�finit la valeur de la propri�t� totalSalaries.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSalaries(BigDecimal value) {
        this.totalSalaries = value;
    }

    /**
     * Obtient la valeur de la propri�t� totalSalaireAssujetisRg.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalSalaireAssujetisRg() {
        return totalSalaireAssujetisRg;
    }

    /**
     * D�finit la valeur de la propri�t� totalSalaireAssujetisRg.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalSalaireAssujetisRg(JAXBElement<BigDecimal> value) {
        this.totalSalaireAssujetisRg = value;
    }

    /**
     * Obtient la valeur de la propri�t� totalSalaireAssujetisRcc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalSalaireAssujetisRcc() {
        return totalSalaireAssujetisRcc;
    }

    /**
     * D�finit la valeur de la propri�t� totalSalaireAssujetisRcc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalSalaireAssujetisRcc(JAXBElement<BigDecimal> value) {
        this.totalSalaireAssujetisRcc = value;
    }

    /**
     * Obtient la valeur de la propri�t� totalSalaireAssujetisPf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalSalaireAssujetisPf() {
        return totalSalaireAssujetisPf;
    }

    /**
     * D�finit la valeur de la propri�t� totalSalaireAssujetisPf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalSalaireAssujetisPf(JAXBElement<BigDecimal> value) {
        this.totalSalaireAssujetisPf = value;
    }

    /**
     * Obtient la valeur de la propri�t� totalSalaireAssujetisAtmp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalSalaireAssujetisAtmp() {
        return totalSalaireAssujetisAtmp;
    }

    /**
     * D�finit la valeur de la propri�t� totalSalaireAssujetisAtmp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalSalaireAssujetisAtmp(JAXBElement<BigDecimal> value) {
        this.totalSalaireAssujetisAtmp = value;
    }

    /**
     * Obtient la valeur de la propri�t� totalSalaireVerses.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalSalaireVerses() {
        return totalSalaireVerses;
    }

    /**
     * D�finit la valeur de la propri�t� totalSalaireVerses.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalSalaireVerses(JAXBElement<BigDecimal> value) {
        this.totalSalaireVerses = value;
    }

    /**
     * Obtient la valeur de la propri�t� montantCotisationPfEmp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMontantCotisationPfEmp() {
        return montantCotisationPfEmp;
    }

    /**
     * D�finit la valeur de la propri�t� montantCotisationPfEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMontantCotisationPfEmp(JAXBElement<BigDecimal> value) {
        this.montantCotisationPfEmp = value;
    }

    /**
     * Obtient la valeur de la propri�t� montantCotisationAtmpEmp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMontantCotisationAtmpEmp() {
        return montantCotisationAtmpEmp;
    }

    /**
     * D�finit la valeur de la propri�t� montantCotisationAtmpEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMontantCotisationAtmpEmp(JAXBElement<BigDecimal> value) {
        this.montantCotisationAtmpEmp = value;
    }

    /**
     * Obtient la valeur de la propri�t� montantCotisationRgEmpl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMontantCotisationRgEmpl() {
        return montantCotisationRgEmpl;
    }

    /**
     * D�finit la valeur de la propri�t� montantCotisationRgEmpl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMontantCotisationRgEmpl(JAXBElement<BigDecimal> value) {
        this.montantCotisationRgEmpl = value;
    }

    /**
     * Obtient la valeur de la propri�t� montantCotisationRccEmp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMontantCotisationRccEmp() {
        return montantCotisationRccEmp;
    }

    /**
     * D�finit la valeur de la propri�t� montantCotisationRccEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMontantCotisationRccEmp(JAXBElement<BigDecimal> value) {
        this.montantCotisationRccEmp = value;
    }

    /**
     * Gets the value of the informationSalaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationSalaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationSalaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmPresDns.InformationSalaries }
     * 
     * 
     */
    public List<CmPresDns.InformationSalaries> getInformationSalaries() {
        if (informationSalaries == null) {
            informationSalaries = new ArrayList<CmPresDns.InformationSalaries>();
        }
        return this.informationSalaries;
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
     *         &lt;element name="numeroAssureSocial" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nom" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="prenom" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dateNaissance" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="typePiece" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="numeroPiece" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="40"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="natureContrat" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dateEntree" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="dateSortie" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="motif" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="totalSalaireAssujetisPfMois1" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="totalSalaireAssujetisAtmpMois1" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="totalSalaireAssujetisRgMois1" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="totalSalaireAssujetisRccMois1" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="salaireBrutMois1" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="tempsPresenceJourMois1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxExclusive value="9999999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tempsPresenceHeureMois1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxExclusive value="99999999999999999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tempsTravailMois1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tranceDeTravailMois1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="regimeGeneralMois1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="regimeCadreMois1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="dateEffetRegimeCadreMois1" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="totalSalaireAssujetisPfMois2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="totalSalaireAssujetisAtmpMois2" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="totalSalaireAssujetisRgMois2" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="totalSalaireAssujetisRccMois2" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="salaireBrutMois2" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="tempsPresenceJourMois2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="tempsPresenceHeureMois2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="tempsTravailMois2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tranceDeTravailMois2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="regimeGeneralMois2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="regimeCadreMois2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="dateEffetRegimeCadreMois2" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="totalSalaireAssujetisPfMois3" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="totalSalaireAssujetisAtmpMois3" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="totalSalaireAssujetisRgMois3" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="totalSalaireAssujetisRccMois3" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="salaireBrutMois3" type="{http://ouaf.oracle.com/}money" minOccurs="0"/>
     *         &lt;element name="tempsPresenceJourMois3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="tempsPresenceHeureMois3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="tempsTravailMois3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tranceDeTravailMois3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="regimeGeneralMois3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="regimeCadreMois3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="dateEffetRegimeCadreMois3" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "numeroAssureSocial",
        "nom",
        "prenom",
        "dateNaissance",
        "typePiece",
        "numeroPiece",
        "natureContrat",
        "dateEntree",
        "dateSortie",
        "motif",
        "totalSalaireAssujetisPfMois1",
        "totalSalaireAssujetisAtmpMois1",
        "totalSalaireAssujetisRgMois1",
        "totalSalaireAssujetisRccMois1",
        "salaireBrutMois1",
        "tempsPresenceJourMois1",
        "tempsPresenceHeureMois1",
        "tempsTravailMois1",
        "tranceDeTravailMois1",
        "regimeGeneralMois1",
        "regimeCadreMois1",
        "dateEffetRegimeCadreMois1",
        "totalSalaireAssujetisPfMois2",
        "totalSalaireAssujetisAtmpMois2",
        "totalSalaireAssujetisRgMois2",
        "totalSalaireAssujetisRccMois2",
        "salaireBrutMois2",
        "tempsPresenceJourMois2",
        "tempsPresenceHeureMois2",
        "tempsTravailMois2",
        "tranceDeTravailMois2",
        "regimeGeneralMois2",
        "regimeCadreMois2",
        "dateEffetRegimeCadreMois2",
        "totalSalaireAssujetisPfMois3",
        "totalSalaireAssujetisAtmpMois3",
        "totalSalaireAssujetisRgMois3",
        "totalSalaireAssujetisRccMois3",
        "salaireBrutMois3",
        "tempsPresenceJourMois3",
        "tempsPresenceHeureMois3",
        "tempsTravailMois3",
        "tranceDeTravailMois3",
        "regimeGeneralMois3",
        "regimeCadreMois3",
        "dateEffetRegimeCadreMois3"
    })
    public static class InformationSalaries {

        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String numeroAssureSocial;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String nom;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String prenom;
        @XmlElementRef(name = "dateNaissance", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> dateNaissance;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String typePiece;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String numeroPiece;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String natureContrat;
        @XmlElementRef(name = "dateEntree", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> dateEntree;
        @XmlElementRef(name = "dateSortie", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> dateSortie;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String motif;
        @XmlElementRef(name = "totalSalaireAssujetisPfMois1", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> totalSalaireAssujetisPfMois1;
        @XmlElementRef(name = "totalSalaireAssujetisAtmpMois1", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> totalSalaireAssujetisAtmpMois1;
        @XmlElementRef(name = "totalSalaireAssujetisRgMois1", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> totalSalaireAssujetisRgMois1;
        @XmlElementRef(name = "totalSalaireAssujetisRccMois1", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> totalSalaireAssujetisRccMois1;
        @XmlElementRef(name = "salaireBrutMois1", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> salaireBrutMois1;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected BigDecimal tempsPresenceJourMois1;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected BigDecimal tempsPresenceHeureMois1;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String tempsTravailMois1;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String tranceDeTravailMois1;
        @XmlElementRef(name = "regimeGeneralMois1", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> regimeGeneralMois1;
        @XmlElementRef(name = "regimeCadreMois1", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> regimeCadreMois1;
        @XmlElementRef(name = "dateEffetRegimeCadreMois1", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> dateEffetRegimeCadreMois1;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String totalSalaireAssujetisPfMois2;
        @XmlElementRef(name = "totalSalaireAssujetisAtmpMois2", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> totalSalaireAssujetisAtmpMois2;
        @XmlElementRef(name = "totalSalaireAssujetisRgMois2", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> totalSalaireAssujetisRgMois2;
        @XmlElementRef(name = "totalSalaireAssujetisRccMois2", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> totalSalaireAssujetisRccMois2;
        @XmlElementRef(name = "salaireBrutMois2", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> salaireBrutMois2;
        @XmlElementRef(name = "tempsPresenceJourMois2", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tempsPresenceJourMois2;
        @XmlElementRef(name = "tempsPresenceHeureMois2", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tempsPresenceHeureMois2;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String tempsTravailMois2;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String tranceDeTravailMois2;
        @XmlElementRef(name = "regimeGeneralMois2", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> regimeGeneralMois2;
        @XmlElementRef(name = "regimeCadreMois2", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> regimeCadreMois2;
        @XmlElementRef(name = "dateEffetRegimeCadreMois2", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> dateEffetRegimeCadreMois2;
        @XmlElementRef(name = "totalSalaireAssujetisPfMois3", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> totalSalaireAssujetisPfMois3;
        @XmlElementRef(name = "totalSalaireAssujetisAtmpMois3", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> totalSalaireAssujetisAtmpMois3;
        @XmlElementRef(name = "totalSalaireAssujetisRgMois3", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> totalSalaireAssujetisRgMois3;
        @XmlElementRef(name = "totalSalaireAssujetisRccMois3", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> totalSalaireAssujetisRccMois3;
        @XmlElementRef(name = "salaireBrutMois3", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> salaireBrutMois3;
        @XmlElementRef(name = "tempsPresenceJourMois3", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tempsPresenceJourMois3;
        @XmlElementRef(name = "tempsPresenceHeureMois3", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tempsPresenceHeureMois3;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String tempsTravailMois3;
        @XmlElement(namespace = "http://oracle.com/CmPresDns.xsd")
        protected String tranceDeTravailMois3;
        @XmlElementRef(name = "regimeGeneralMois3", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> regimeGeneralMois3;
        @XmlElementRef(name = "regimeCadreMois3", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> regimeCadreMois3;
        @XmlElementRef(name = "dateEffetRegimeCadreMois3", namespace = "http://oracle.com/CmPresDns.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> dateEffetRegimeCadreMois3;
        @XmlAttribute(name = "action")
        protected ListAction action;

        /**
         * Obtient la valeur de la propri�t� numeroAssureSocial.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroAssureSocial() {
            return numeroAssureSocial;
        }

        /**
         * D�finit la valeur de la propri�t� numeroAssureSocial.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroAssureSocial(String value) {
            this.numeroAssureSocial = value;
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
         * Obtient la valeur de la propri�t� dateNaissance.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getDateNaissance() {
            return dateNaissance;
        }

        /**
         * D�finit la valeur de la propri�t� dateNaissance.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setDateNaissance(JAXBElement<XMLGregorianCalendar> value) {
            this.dateNaissance = value;
        }

        /**
         * Obtient la valeur de la propri�t� typePiece.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypePiece() {
            return typePiece;
        }

        /**
         * D�finit la valeur de la propri�t� typePiece.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypePiece(String value) {
            this.typePiece = value;
        }

        /**
         * Obtient la valeur de la propri�t� numeroPiece.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroPiece() {
            return numeroPiece;
        }

        /**
         * D�finit la valeur de la propri�t� numeroPiece.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroPiece(String value) {
            this.numeroPiece = value;
        }

        /**
         * Obtient la valeur de la propri�t� natureContrat.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNatureContrat() {
            return natureContrat;
        }

        /**
         * D�finit la valeur de la propri�t� natureContrat.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNatureContrat(String value) {
            this.natureContrat = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateEntree.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getDateEntree() {
            return dateEntree;
        }

        /**
         * D�finit la valeur de la propri�t� dateEntree.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setDateEntree(JAXBElement<XMLGregorianCalendar> value) {
            this.dateEntree = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateSortie.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getDateSortie() {
            return dateSortie;
        }

        /**
         * D�finit la valeur de la propri�t� dateSortie.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setDateSortie(JAXBElement<XMLGregorianCalendar> value) {
            this.dateSortie = value;
        }

        /**
         * Obtient la valeur de la propri�t� motif.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMotif() {
            return motif;
        }

        /**
         * D�finit la valeur de la propri�t� motif.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMotif(String value) {
            this.motif = value;
        }

        /**
         * Obtient la valeur de la propri�t� totalSalaireAssujetisPfMois1.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTotalSalaireAssujetisPfMois1() {
            return totalSalaireAssujetisPfMois1;
        }

        /**
         * D�finit la valeur de la propri�t� totalSalaireAssujetisPfMois1.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTotalSalaireAssujetisPfMois1(JAXBElement<BigDecimal> value) {
            this.totalSalaireAssujetisPfMois1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� totalSalaireAssujetisAtmpMois1.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTotalSalaireAssujetisAtmpMois1() {
            return totalSalaireAssujetisAtmpMois1;
        }

        /**
         * D�finit la valeur de la propri�t� totalSalaireAssujetisAtmpMois1.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTotalSalaireAssujetisAtmpMois1(JAXBElement<BigDecimal> value) {
            this.totalSalaireAssujetisAtmpMois1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� totalSalaireAssujetisRgMois1.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTotalSalaireAssujetisRgMois1() {
            return totalSalaireAssujetisRgMois1;
        }

        /**
         * D�finit la valeur de la propri�t� totalSalaireAssujetisRgMois1.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTotalSalaireAssujetisRgMois1(JAXBElement<BigDecimal> value) {
            this.totalSalaireAssujetisRgMois1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� totalSalaireAssujetisRccMois1.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTotalSalaireAssujetisRccMois1() {
            return totalSalaireAssujetisRccMois1;
        }

        /**
         * D�finit la valeur de la propri�t� totalSalaireAssujetisRccMois1.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTotalSalaireAssujetisRccMois1(JAXBElement<BigDecimal> value) {
            this.totalSalaireAssujetisRccMois1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� salaireBrutMois1.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getSalaireBrutMois1() {
            return salaireBrutMois1;
        }

        /**
         * D�finit la valeur de la propri�t� salaireBrutMois1.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setSalaireBrutMois1(JAXBElement<BigDecimal> value) {
            this.salaireBrutMois1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tempsPresenceJourMois1.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTempsPresenceJourMois1() {
            return tempsPresenceJourMois1;
        }

        /**
         * D�finit la valeur de la propri�t� tempsPresenceJourMois1.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTempsPresenceJourMois1(BigDecimal value) {
            this.tempsPresenceJourMois1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tempsPresenceHeureMois1.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTempsPresenceHeureMois1() {
            return tempsPresenceHeureMois1;
        }

        /**
         * D�finit la valeur de la propri�t� tempsPresenceHeureMois1.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTempsPresenceHeureMois1(BigDecimal value) {
            this.tempsPresenceHeureMois1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tempsTravailMois1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTempsTravailMois1() {
            return tempsTravailMois1;
        }

        /**
         * D�finit la valeur de la propri�t� tempsTravailMois1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTempsTravailMois1(String value) {
            this.tempsTravailMois1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tranceDeTravailMois1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranceDeTravailMois1() {
            return tranceDeTravailMois1;
        }

        /**
         * D�finit la valeur de la propri�t� tranceDeTravailMois1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranceDeTravailMois1(String value) {
            this.tranceDeTravailMois1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� regimeGeneralMois1.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getRegimeGeneralMois1() {
            return regimeGeneralMois1;
        }

        /**
         * D�finit la valeur de la propri�t� regimeGeneralMois1.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setRegimeGeneralMois1(JAXBElement<Boolean> value) {
            this.regimeGeneralMois1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� regimeCadreMois1.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getRegimeCadreMois1() {
            return regimeCadreMois1;
        }

        /**
         * D�finit la valeur de la propri�t� regimeCadreMois1.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setRegimeCadreMois1(JAXBElement<Boolean> value) {
            this.regimeCadreMois1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateEffetRegimeCadreMois1.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getDateEffetRegimeCadreMois1() {
            return dateEffetRegimeCadreMois1;
        }

        /**
         * D�finit la valeur de la propri�t� dateEffetRegimeCadreMois1.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setDateEffetRegimeCadreMois1(JAXBElement<XMLGregorianCalendar> value) {
            this.dateEffetRegimeCadreMois1 = value;
        }

        /**
         * Obtient la valeur de la propri�t� totalSalaireAssujetisPfMois2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalSalaireAssujetisPfMois2() {
            return totalSalaireAssujetisPfMois2;
        }

        /**
         * D�finit la valeur de la propri�t� totalSalaireAssujetisPfMois2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalSalaireAssujetisPfMois2(String value) {
            this.totalSalaireAssujetisPfMois2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� totalSalaireAssujetisAtmpMois2.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTotalSalaireAssujetisAtmpMois2() {
            return totalSalaireAssujetisAtmpMois2;
        }

        /**
         * D�finit la valeur de la propri�t� totalSalaireAssujetisAtmpMois2.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTotalSalaireAssujetisAtmpMois2(JAXBElement<BigDecimal> value) {
            this.totalSalaireAssujetisAtmpMois2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� totalSalaireAssujetisRgMois2.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTotalSalaireAssujetisRgMois2() {
            return totalSalaireAssujetisRgMois2;
        }

        /**
         * D�finit la valeur de la propri�t� totalSalaireAssujetisRgMois2.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTotalSalaireAssujetisRgMois2(JAXBElement<BigDecimal> value) {
            this.totalSalaireAssujetisRgMois2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� totalSalaireAssujetisRccMois2.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTotalSalaireAssujetisRccMois2() {
            return totalSalaireAssujetisRccMois2;
        }

        /**
         * D�finit la valeur de la propri�t� totalSalaireAssujetisRccMois2.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTotalSalaireAssujetisRccMois2(JAXBElement<BigDecimal> value) {
            this.totalSalaireAssujetisRccMois2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� salaireBrutMois2.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getSalaireBrutMois2() {
            return salaireBrutMois2;
        }

        /**
         * D�finit la valeur de la propri�t� salaireBrutMois2.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setSalaireBrutMois2(JAXBElement<BigDecimal> value) {
            this.salaireBrutMois2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tempsPresenceJourMois2.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTempsPresenceJourMois2() {
            return tempsPresenceJourMois2;
        }

        /**
         * D�finit la valeur de la propri�t� tempsPresenceJourMois2.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTempsPresenceJourMois2(JAXBElement<BigDecimal> value) {
            this.tempsPresenceJourMois2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tempsPresenceHeureMois2.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTempsPresenceHeureMois2() {
            return tempsPresenceHeureMois2;
        }

        /**
         * D�finit la valeur de la propri�t� tempsPresenceHeureMois2.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTempsPresenceHeureMois2(JAXBElement<BigDecimal> value) {
            this.tempsPresenceHeureMois2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tempsTravailMois2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTempsTravailMois2() {
            return tempsTravailMois2;
        }

        /**
         * D�finit la valeur de la propri�t� tempsTravailMois2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTempsTravailMois2(String value) {
            this.tempsTravailMois2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tranceDeTravailMois2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranceDeTravailMois2() {
            return tranceDeTravailMois2;
        }

        /**
         * D�finit la valeur de la propri�t� tranceDeTravailMois2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranceDeTravailMois2(String value) {
            this.tranceDeTravailMois2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� regimeGeneralMois2.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getRegimeGeneralMois2() {
            return regimeGeneralMois2;
        }

        /**
         * D�finit la valeur de la propri�t� regimeGeneralMois2.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setRegimeGeneralMois2(JAXBElement<Boolean> value) {
            this.regimeGeneralMois2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� regimeCadreMois2.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getRegimeCadreMois2() {
            return regimeCadreMois2;
        }

        /**
         * D�finit la valeur de la propri�t� regimeCadreMois2.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setRegimeCadreMois2(JAXBElement<Boolean> value) {
            this.regimeCadreMois2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateEffetRegimeCadreMois2.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getDateEffetRegimeCadreMois2() {
            return dateEffetRegimeCadreMois2;
        }

        /**
         * D�finit la valeur de la propri�t� dateEffetRegimeCadreMois2.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setDateEffetRegimeCadreMois2(JAXBElement<XMLGregorianCalendar> value) {
            this.dateEffetRegimeCadreMois2 = value;
        }

        /**
         * Obtient la valeur de la propri�t� totalSalaireAssujetisPfMois3.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTotalSalaireAssujetisPfMois3() {
            return totalSalaireAssujetisPfMois3;
        }

        /**
         * D�finit la valeur de la propri�t� totalSalaireAssujetisPfMois3.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTotalSalaireAssujetisPfMois3(JAXBElement<BigDecimal> value) {
            this.totalSalaireAssujetisPfMois3 = value;
        }

        /**
         * Obtient la valeur de la propri�t� totalSalaireAssujetisAtmpMois3.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTotalSalaireAssujetisAtmpMois3() {
            return totalSalaireAssujetisAtmpMois3;
        }

        /**
         * D�finit la valeur de la propri�t� totalSalaireAssujetisAtmpMois3.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTotalSalaireAssujetisAtmpMois3(JAXBElement<BigDecimal> value) {
            this.totalSalaireAssujetisAtmpMois3 = value;
        }

        /**
         * Obtient la valeur de la propri�t� totalSalaireAssujetisRgMois3.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTotalSalaireAssujetisRgMois3() {
            return totalSalaireAssujetisRgMois3;
        }

        /**
         * D�finit la valeur de la propri�t� totalSalaireAssujetisRgMois3.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTotalSalaireAssujetisRgMois3(JAXBElement<BigDecimal> value) {
            this.totalSalaireAssujetisRgMois3 = value;
        }

        /**
         * Obtient la valeur de la propri�t� totalSalaireAssujetisRccMois3.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTotalSalaireAssujetisRccMois3() {
            return totalSalaireAssujetisRccMois3;
        }

        /**
         * D�finit la valeur de la propri�t� totalSalaireAssujetisRccMois3.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTotalSalaireAssujetisRccMois3(JAXBElement<BigDecimal> value) {
            this.totalSalaireAssujetisRccMois3 = value;
        }

        /**
         * Obtient la valeur de la propri�t� salaireBrutMois3.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getSalaireBrutMois3() {
            return salaireBrutMois3;
        }

        /**
         * D�finit la valeur de la propri�t� salaireBrutMois3.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setSalaireBrutMois3(JAXBElement<BigDecimal> value) {
            this.salaireBrutMois3 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tempsPresenceJourMois3.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTempsPresenceJourMois3() {
            return tempsPresenceJourMois3;
        }

        /**
         * D�finit la valeur de la propri�t� tempsPresenceJourMois3.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTempsPresenceJourMois3(JAXBElement<BigDecimal> value) {
            this.tempsPresenceJourMois3 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tempsPresenceHeureMois3.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTempsPresenceHeureMois3() {
            return tempsPresenceHeureMois3;
        }

        /**
         * D�finit la valeur de la propri�t� tempsPresenceHeureMois3.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTempsPresenceHeureMois3(JAXBElement<BigDecimal> value) {
            this.tempsPresenceHeureMois3 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tempsTravailMois3.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTempsTravailMois3() {
            return tempsTravailMois3;
        }

        /**
         * D�finit la valeur de la propri�t� tempsTravailMois3.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTempsTravailMois3(String value) {
            this.tempsTravailMois3 = value;
        }

        /**
         * Obtient la valeur de la propri�t� tranceDeTravailMois3.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranceDeTravailMois3() {
            return tranceDeTravailMois3;
        }

        /**
         * D�finit la valeur de la propri�t� tranceDeTravailMois3.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranceDeTravailMois3(String value) {
            this.tranceDeTravailMois3 = value;
        }

        /**
         * Obtient la valeur de la propri�t� regimeGeneralMois3.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getRegimeGeneralMois3() {
            return regimeGeneralMois3;
        }

        /**
         * D�finit la valeur de la propri�t� regimeGeneralMois3.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setRegimeGeneralMois3(JAXBElement<Boolean> value) {
            this.regimeGeneralMois3 = value;
        }

        /**
         * Obtient la valeur de la propri�t� regimeCadreMois3.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getRegimeCadreMois3() {
            return regimeCadreMois3;
        }

        /**
         * D�finit la valeur de la propri�t� regimeCadreMois3.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setRegimeCadreMois3(JAXBElement<Boolean> value) {
            this.regimeCadreMois3 = value;
        }

        /**
         * Obtient la valeur de la propri�t� dateEffetRegimeCadreMois3.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getDateEffetRegimeCadreMois3() {
            return dateEffetRegimeCadreMois3;
        }

        /**
         * D�finit la valeur de la propri�t� dateEffetRegimeCadreMois3.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setDateEffetRegimeCadreMois3(JAXBElement<XMLGregorianCalendar> value) {
            this.dateEffetRegimeCadreMois3 = value;
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
