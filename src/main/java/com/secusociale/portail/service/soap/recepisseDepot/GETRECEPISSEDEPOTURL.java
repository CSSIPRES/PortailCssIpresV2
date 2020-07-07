
package com.secusociale.portail.service.soap.recepisseDepot;

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
 *         &lt;element name="processFolwId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlRecepisseDepot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "processFolwId",
    "urlRecepisseDepot"
})
@XmlRootElement(name = "GET_RECEPISSE_DEPOT_URL")
public class GETRECEPISSEDEPOTURL {

    @XmlElement(namespace = "http://oracle.com/GET_RECEPISSE_DEPOT_URL.xsd")
    protected String processFolwId;
    @XmlElement(namespace = "http://oracle.com/GET_RECEPISSE_DEPOT_URL.xsd")
    protected String urlRecepisseDepot;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� processFolwId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessFolwId() {
        return processFolwId;
    }

    /**
     * D�finit la valeur de la propri�t� processFolwId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessFolwId(String value) {
        this.processFolwId = value;
    }

    /**
     * Obtient la valeur de la propri�t� urlRecepisseDepot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlRecepisseDepot() {
        return urlRecepisseDepot;
    }

    /**
     * D�finit la valeur de la propri�t� urlRecepisseDepot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlRecepisseDepot(String value) {
        this.urlRecepisseDepot = value;
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

}
