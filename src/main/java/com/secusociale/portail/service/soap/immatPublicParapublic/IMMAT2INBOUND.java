
package com.secusociale.portail.service.soap.immatPublicParapublic;

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
 *                   &lt;element name="employerQuery" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="regType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="employerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="estType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="employerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="hqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nineaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="arretOuDecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dateArreteOuDecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="companyOriginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="mainRegistrationForm" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dateOfInspection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dateOfFirstHire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="businessSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mainLineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="noOfWorkersInGenScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="noOfWorkersInBasicScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="arondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="qartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="postboxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="personneContact" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="recherche" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="typeOfIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="identityIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ninCedeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="telephoneFixe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numeroMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="employeList" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="rechercheEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prenomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sexe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="etatCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dateNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numRegNaiss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nomPere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prenomPere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nomMere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prenomMere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nationalite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="typePieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ninCedeao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numPieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="delivreLe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LieuDelivrance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="expireLe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="villeNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="paysNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="employeurPrec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="departement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="arrondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="quartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="boitePostale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="typeMouvement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="natureContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dateDebutContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dateFinContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="emploi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nonCadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ouiCadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="conventionApplicable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="salaireContractuel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="tempsTravail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="categorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="employerRegistrationFormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employeeRegistrationFormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="processFlowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "IMMAT2_INBOUND")
public class IMMAT2INBOUND {

    protected IMMAT2INBOUND.Input input;
    protected IMMAT2INBOUND.Output output;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;

    /**
     * Obtient la valeur de la propri�t� input.
     * 
     * @return
     *     possible object is
     *     {@link IMMAT2INBOUND.Input }
     *     
     */
    public IMMAT2INBOUND.Input getInput() {
        return input;
    }

    /**
     * D�finit la valeur de la propri�t� input.
     * 
     * @param value
     *     allowed object is
     *     {@link IMMAT2INBOUND.Input }
     *     
     */
    public void setInput(IMMAT2INBOUND.Input value) {
        this.input = value;
    }

    /**
     * Obtient la valeur de la propri�t� output.
     * 
     * @return
     *     possible object is
     *     {@link IMMAT2INBOUND.Output }
     *     
     */
    public IMMAT2INBOUND.Output getOutput() {
        return output;
    }

    /**
     * D�finit la valeur de la propri�t� output.
     * 
     * @param value
     *     allowed object is
     *     {@link IMMAT2INBOUND.Output }
     *     
     */
    public void setOutput(IMMAT2INBOUND.Output value) {
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
     *         &lt;element name="employerQuery" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="regType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="employerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="estType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="employerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="hqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nineaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="arretOuDecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dateArreteOuDecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="companyOriginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="mainRegistrationForm" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dateOfInspection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dateOfFirstHire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="businessSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mainLineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="noOfWorkersInGenScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="noOfWorkersInBasicScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="arondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="qartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="postboxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="personneContact" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="recherche" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="typeOfIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="identityIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ninCedeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="telephoneFixe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numeroMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="employeList" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="rechercheEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prenomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sexe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="etatCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dateNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numRegNaiss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nomPere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prenomPere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nomMere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prenomMere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nationalite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="typePieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ninCedeao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numPieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="delivreLe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LieuDelivrance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="expireLe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="villeNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="paysNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="employeurPrec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="departement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="arrondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="quartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="boitePostale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="typeMouvement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="natureContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dateDebutContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dateFinContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="emploi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nonCadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ouiCadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="conventionApplicable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="salaireContractuel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="tempsTravail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="categorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "employerQuery",
        "mainRegistrationForm",
        "personneContact",
        "documents",
        "employeList"
    })
    public static class Input {

        protected IMMAT2INBOUND.Input.EmployerQuery employerQuery;
        protected IMMAT2INBOUND.Input.MainRegistrationForm mainRegistrationForm;
        protected IMMAT2INBOUND.Input.PersonneContact personneContact;
        protected IMMAT2INBOUND.Input.Documents documents;
        protected List<IMMAT2INBOUND.Input.EmployeList> employeList;

        /**
         * Obtient la valeur de la propri�t� employerQuery.
         * 
         * @return
         *     possible object is
         *     {@link IMMAT2INBOUND.Input.EmployerQuery }
         *     
         */
        public IMMAT2INBOUND.Input.EmployerQuery getEmployerQuery() {
            return employerQuery;
        }

        /**
         * D�finit la valeur de la propri�t� employerQuery.
         * 
         * @param value
         *     allowed object is
         *     {@link IMMAT2INBOUND.Input.EmployerQuery }
         *     
         */
        public void setEmployerQuery(IMMAT2INBOUND.Input.EmployerQuery value) {
            this.employerQuery = value;
        }

        /**
         * Obtient la valeur de la propri�t� mainRegistrationForm.
         * 
         * @return
         *     possible object is
         *     {@link IMMAT2INBOUND.Input.MainRegistrationForm }
         *     
         */
        public IMMAT2INBOUND.Input.MainRegistrationForm getMainRegistrationForm() {
            return mainRegistrationForm;
        }

        /**
         * D�finit la valeur de la propri�t� mainRegistrationForm.
         * 
         * @param value
         *     allowed object is
         *     {@link IMMAT2INBOUND.Input.MainRegistrationForm }
         *     
         */
        public void setMainRegistrationForm(IMMAT2INBOUND.Input.MainRegistrationForm value) {
            this.mainRegistrationForm = value;
        }

        /**
         * Obtient la valeur de la propri�t� personneContact.
         * 
         * @return
         *     possible object is
         *     {@link IMMAT2INBOUND.Input.PersonneContact }
         *     
         */
        public IMMAT2INBOUND.Input.PersonneContact getPersonneContact() {
            return personneContact;
        }

        /**
         * D�finit la valeur de la propri�t� personneContact.
         * 
         * @param value
         *     allowed object is
         *     {@link IMMAT2INBOUND.Input.PersonneContact }
         *     
         */
        public void setPersonneContact(IMMAT2INBOUND.Input.PersonneContact value) {
            this.personneContact = value;
        }

        /**
         * Obtient la valeur de la propri�t� documents.
         * 
         * @return
         *     possible object is
         *     {@link IMMAT2INBOUND.Input.Documents }
         *     
         */
        public IMMAT2INBOUND.Input.Documents getDocuments() {
            return documents;
        }

        /**
         * D�finit la valeur de la propri�t� documents.
         * 
         * @param value
         *     allowed object is
         *     {@link IMMAT2INBOUND.Input.Documents }
         *     
         */
        public void setDocuments(IMMAT2INBOUND.Input.Documents value) {
            this.documents = value;
        }

        /**
         * Gets the value of the employeList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employeList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployeList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IMMAT2INBOUND.Input.EmployeList }
         * 
         * 
         */
        public List<IMMAT2INBOUND.Input.EmployeList> getEmployeList() {
            if (employeList == null) {
                employeList = new ArrayList<IMMAT2INBOUND.Input.EmployeList>();
            }
            return this.employeList;
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

            protected IMMAT2INBOUND.Input.Documents.DemandeEcrit demandeEcrit;
            protected IMMAT2INBOUND.Input.Documents.FormDemande formDemande;
            protected IMMAT2INBOUND.Input.Documents.RegistreCommerce registreCommerce;
            protected IMMAT2INBOUND.Input.Documents.DeclarationEtablissement declarationEtablissement;
            protected IMMAT2INBOUND.Input.Documents.PhotocopieStatus photocopieStatus;
            protected IMMAT2INBOUND.Input.Documents.DecretMinisteriel decretMinisteriel;
            protected IMMAT2INBOUND.Input.Documents.AvisImmatriculation avisImmatriculation;
            protected IMMAT2INBOUND.Input.Documents.Dmt dmt;
            protected IMMAT2INBOUND.Input.Documents.ContratsTravail contratsTravail;
            protected IMMAT2INBOUND.Input.Documents.Cni cni;
            protected IMMAT2INBOUND.Input.Documents.CarteIdentiteConsulaire carteIdentiteConsulaire;
            protected IMMAT2INBOUND.Input.Documents.EtatRecensement etatRecensement;
            protected IMMAT2INBOUND.Input.Documents.AttestationChomage attestationChomage;
            protected IMMAT2INBOUND.Input.Documents.BulletinsSalaire bulletinsSalaire;
            protected IMMAT2INBOUND.Input.Documents.CessationActivity cessationActivity;
            protected IMMAT2INBOUND.Input.Documents.CarteNationaleIdentite carteNationaleIdentite;
            protected IMMAT2INBOUND.Input.Documents.DerniersBulletins derniersBulletins;
            protected IMMAT2INBOUND.Input.Documents.ManuscriteAdressee manuscriteAdressee;
            protected IMMAT2INBOUND.Input.Documents.PassportDoc passportDoc;
            protected IMMAT2INBOUND.Input.Documents.PieceIdDoc pieceIdDoc;
            protected IMMAT2INBOUND.Input.Documents.PieceIdGerantDoc pieceIdGerantDoc;

            /**
             * Obtient la valeur de la propri�t� demandeEcrit.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.DemandeEcrit }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.DemandeEcrit getDemandeEcrit() {
                return demandeEcrit;
            }

            /**
             * D�finit la valeur de la propri�t� demandeEcrit.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.DemandeEcrit }
             *     
             */
            public void setDemandeEcrit(IMMAT2INBOUND.Input.Documents.DemandeEcrit value) {
                this.demandeEcrit = value;
            }

            /**
             * Obtient la valeur de la propri�t� formDemande.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.FormDemande }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.FormDemande getFormDemande() {
                return formDemande;
            }

            /**
             * D�finit la valeur de la propri�t� formDemande.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.FormDemande }
             *     
             */
            public void setFormDemande(IMMAT2INBOUND.Input.Documents.FormDemande value) {
                this.formDemande = value;
            }

            /**
             * Obtient la valeur de la propri�t� registreCommerce.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.RegistreCommerce }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.RegistreCommerce getRegistreCommerce() {
                return registreCommerce;
            }

            /**
             * D�finit la valeur de la propri�t� registreCommerce.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.RegistreCommerce }
             *     
             */
            public void setRegistreCommerce(IMMAT2INBOUND.Input.Documents.RegistreCommerce value) {
                this.registreCommerce = value;
            }

            /**
             * Obtient la valeur de la propri�t� declarationEtablissement.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.DeclarationEtablissement }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.DeclarationEtablissement getDeclarationEtablissement() {
                return declarationEtablissement;
            }

            /**
             * D�finit la valeur de la propri�t� declarationEtablissement.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.DeclarationEtablissement }
             *     
             */
            public void setDeclarationEtablissement(IMMAT2INBOUND.Input.Documents.DeclarationEtablissement value) {
                this.declarationEtablissement = value;
            }

            /**
             * Obtient la valeur de la propri�t� photocopieStatus.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.PhotocopieStatus }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.PhotocopieStatus getPhotocopieStatus() {
                return photocopieStatus;
            }

            /**
             * D�finit la valeur de la propri�t� photocopieStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.PhotocopieStatus }
             *     
             */
            public void setPhotocopieStatus(IMMAT2INBOUND.Input.Documents.PhotocopieStatus value) {
                this.photocopieStatus = value;
            }

            /**
             * Obtient la valeur de la propri�t� decretMinisteriel.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.DecretMinisteriel }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.DecretMinisteriel getDecretMinisteriel() {
                return decretMinisteriel;
            }

            /**
             * D�finit la valeur de la propri�t� decretMinisteriel.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.DecretMinisteriel }
             *     
             */
            public void setDecretMinisteriel(IMMAT2INBOUND.Input.Documents.DecretMinisteriel value) {
                this.decretMinisteriel = value;
            }

            /**
             * Obtient la valeur de la propri�t� avisImmatriculation.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.AvisImmatriculation }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.AvisImmatriculation getAvisImmatriculation() {
                return avisImmatriculation;
            }

            /**
             * D�finit la valeur de la propri�t� avisImmatriculation.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.AvisImmatriculation }
             *     
             */
            public void setAvisImmatriculation(IMMAT2INBOUND.Input.Documents.AvisImmatriculation value) {
                this.avisImmatriculation = value;
            }

            /**
             * Obtient la valeur de la propri�t� dmt.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.Dmt }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.Dmt getDmt() {
                return dmt;
            }

            /**
             * D�finit la valeur de la propri�t� dmt.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.Dmt }
             *     
             */
            public void setDmt(IMMAT2INBOUND.Input.Documents.Dmt value) {
                this.dmt = value;
            }

            /**
             * Obtient la valeur de la propri�t� contratsTravail.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.ContratsTravail }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.ContratsTravail getContratsTravail() {
                return contratsTravail;
            }

            /**
             * D�finit la valeur de la propri�t� contratsTravail.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.ContratsTravail }
             *     
             */
            public void setContratsTravail(IMMAT2INBOUND.Input.Documents.ContratsTravail value) {
                this.contratsTravail = value;
            }

            /**
             * Obtient la valeur de la propri�t� cni.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.Cni }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.Cni getCni() {
                return cni;
            }

            /**
             * D�finit la valeur de la propri�t� cni.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.Cni }
             *     
             */
            public void setCni(IMMAT2INBOUND.Input.Documents.Cni value) {
                this.cni = value;
            }

            /**
             * Obtient la valeur de la propri�t� carteIdentiteConsulaire.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.CarteIdentiteConsulaire }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.CarteIdentiteConsulaire getCarteIdentiteConsulaire() {
                return carteIdentiteConsulaire;
            }

            /**
             * D�finit la valeur de la propri�t� carteIdentiteConsulaire.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.CarteIdentiteConsulaire }
             *     
             */
            public void setCarteIdentiteConsulaire(IMMAT2INBOUND.Input.Documents.CarteIdentiteConsulaire value) {
                this.carteIdentiteConsulaire = value;
            }

            /**
             * Obtient la valeur de la propri�t� etatRecensement.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.EtatRecensement }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.EtatRecensement getEtatRecensement() {
                return etatRecensement;
            }

            /**
             * D�finit la valeur de la propri�t� etatRecensement.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.EtatRecensement }
             *     
             */
            public void setEtatRecensement(IMMAT2INBOUND.Input.Documents.EtatRecensement value) {
                this.etatRecensement = value;
            }

            /**
             * Obtient la valeur de la propri�t� attestationChomage.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.AttestationChomage }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.AttestationChomage getAttestationChomage() {
                return attestationChomage;
            }

            /**
             * D�finit la valeur de la propri�t� attestationChomage.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.AttestationChomage }
             *     
             */
            public void setAttestationChomage(IMMAT2INBOUND.Input.Documents.AttestationChomage value) {
                this.attestationChomage = value;
            }

            /**
             * Obtient la valeur de la propri�t� bulletinsSalaire.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.BulletinsSalaire }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.BulletinsSalaire getBulletinsSalaire() {
                return bulletinsSalaire;
            }

            /**
             * D�finit la valeur de la propri�t� bulletinsSalaire.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.BulletinsSalaire }
             *     
             */
            public void setBulletinsSalaire(IMMAT2INBOUND.Input.Documents.BulletinsSalaire value) {
                this.bulletinsSalaire = value;
            }

            /**
             * Obtient la valeur de la propri�t� cessationActivity.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.CessationActivity }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.CessationActivity getCessationActivity() {
                return cessationActivity;
            }

            /**
             * D�finit la valeur de la propri�t� cessationActivity.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.CessationActivity }
             *     
             */
            public void setCessationActivity(IMMAT2INBOUND.Input.Documents.CessationActivity value) {
                this.cessationActivity = value;
            }

            /**
             * Obtient la valeur de la propri�t� carteNationaleIdentite.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.CarteNationaleIdentite }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.CarteNationaleIdentite getCarteNationaleIdentite() {
                return carteNationaleIdentite;
            }

            /**
             * D�finit la valeur de la propri�t� carteNationaleIdentite.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.CarteNationaleIdentite }
             *     
             */
            public void setCarteNationaleIdentite(IMMAT2INBOUND.Input.Documents.CarteNationaleIdentite value) {
                this.carteNationaleIdentite = value;
            }

            /**
             * Obtient la valeur de la propri�t� derniersBulletins.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.DerniersBulletins }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.DerniersBulletins getDerniersBulletins() {
                return derniersBulletins;
            }

            /**
             * D�finit la valeur de la propri�t� derniersBulletins.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.DerniersBulletins }
             *     
             */
            public void setDerniersBulletins(IMMAT2INBOUND.Input.Documents.DerniersBulletins value) {
                this.derniersBulletins = value;
            }

            /**
             * Obtient la valeur de la propri�t� manuscriteAdressee.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.ManuscriteAdressee }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.ManuscriteAdressee getManuscriteAdressee() {
                return manuscriteAdressee;
            }

            /**
             * D�finit la valeur de la propri�t� manuscriteAdressee.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.ManuscriteAdressee }
             *     
             */
            public void setManuscriteAdressee(IMMAT2INBOUND.Input.Documents.ManuscriteAdressee value) {
                this.manuscriteAdressee = value;
            }

            /**
             * Obtient la valeur de la propri�t� passportDoc.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.PassportDoc }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.PassportDoc getPassportDoc() {
                return passportDoc;
            }

            /**
             * D�finit la valeur de la propri�t� passportDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.PassportDoc }
             *     
             */
            public void setPassportDoc(IMMAT2INBOUND.Input.Documents.PassportDoc value) {
                this.passportDoc = value;
            }

            /**
             * Obtient la valeur de la propri�t� pieceIdDoc.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.PieceIdDoc }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.PieceIdDoc getPieceIdDoc() {
                return pieceIdDoc;
            }

            /**
             * D�finit la valeur de la propri�t� pieceIdDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.PieceIdDoc }
             *     
             */
            public void setPieceIdDoc(IMMAT2INBOUND.Input.Documents.PieceIdDoc value) {
                this.pieceIdDoc = value;
            }

            /**
             * Obtient la valeur de la propri�t� pieceIdGerantDoc.
             * 
             * @return
             *     possible object is
             *     {@link IMMAT2INBOUND.Input.Documents.PieceIdGerantDoc }
             *     
             */
            public IMMAT2INBOUND.Input.Documents.PieceIdGerantDoc getPieceIdGerantDoc() {
                return pieceIdGerantDoc;
            }

            /**
             * D�finit la valeur de la propri�t� pieceIdGerantDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IMMAT2INBOUND.Input.Documents.PieceIdGerantDoc }
             *     
             */
            public void setPieceIdGerantDoc(IMMAT2INBOUND.Input.Documents.PieceIdGerantDoc value) {
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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

                @XmlElementRef(name = "delivered", namespace = "http://oracle.com/IMMAT2_INBOUND.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> delivered;
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
         *         &lt;element name="rechercheEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prenomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sexe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="etatCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dateNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numRegNaiss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nomPere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prenomPere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nomMere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prenomMere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nationalite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="typePieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ninCedeao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numPieceIdentite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="delivreLe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LieuDelivrance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="expireLe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="villeNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="paysNaissance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="employeurPrec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="departement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="arrondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="quartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="boitePostale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="typeMouvement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="natureContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dateDebutContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dateFinContrat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="emploi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nonCadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ouiCadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="conventionApplicable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="salaireContractuel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="tempsTravail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="categorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "rechercheEmploye",
            "nomEmploye",
            "prenomEmploye",
            "sexe",
            "etatCivil",
            "dateNaissance",
            "numRegNaiss",
            "nomPere",
            "prenomPere",
            "nomMere",
            "prenomMere",
            "nationalite",
            "typePieceIdentite",
            "nin",
            "ninCedeao",
            "numPieceIdentite",
            "delivreLe",
            "lieuDelivrance",
            "expireLe",
            "villeNaissance",
            "paysNaissance",
            "employeurPrec",
            "pays",
            "region",
            "departement",
            "arrondissement",
            "commune",
            "quartier",
            "adresse",
            "boitePostale",
            "typeMouvement",
            "natureContrat",
            "dateDebutContrat",
            "dateFinContrat",
            "profession",
            "emploi",
            "nonCadre",
            "ouiCadre",
            "conventionApplicable",
            "salaireContractuel",
            "tempsTravail",
            "categorie"
        })
        public static class EmployeList {

            protected String rechercheEmploye;
            protected String nomEmploye;
            protected String prenomEmploye;
            protected String sexe;
            protected String etatCivil;
            protected String dateNaissance;
            protected String numRegNaiss;
            protected String nomPere;
            protected String prenomPere;
            protected String nomMere;
            protected String prenomMere;
            protected String nationalite;
            protected String typePieceIdentite;
            protected String nin;
            protected String ninCedeao;
            protected String numPieceIdentite;
            protected String delivreLe;
            @XmlElement(name = "LieuDelivrance")
            protected String lieuDelivrance;
            protected String expireLe;
            protected String villeNaissance;
            protected String paysNaissance;
            protected String employeurPrec;
            protected String pays;
            protected String region;
            protected String departement;
            protected String arrondissement;
            protected String commune;
            protected String quartier;
            protected String adresse;
            protected String boitePostale;
            protected String typeMouvement;
            protected String natureContrat;
            protected String dateDebutContrat;
            protected String dateFinContrat;
            protected String profession;
            protected String emploi;
            protected String nonCadre;
            protected String ouiCadre;
            protected String conventionApplicable;
            protected String salaireContractuel;
            protected String tempsTravail;
            protected String categorie;

            /**
             * Obtient la valeur de la propri�t� rechercheEmploye.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRechercheEmploye() {
                return rechercheEmploye;
            }

            /**
             * D�finit la valeur de la propri�t� rechercheEmploye.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRechercheEmploye(String value) {
                this.rechercheEmploye = value;
            }

            /**
             * Obtient la valeur de la propri�t� nomEmploye.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomEmploye() {
                return nomEmploye;
            }

            /**
             * D�finit la valeur de la propri�t� nomEmploye.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomEmploye(String value) {
                this.nomEmploye = value;
            }

            /**
             * Obtient la valeur de la propri�t� prenomEmploye.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrenomEmploye() {
                return prenomEmploye;
            }

            /**
             * D�finit la valeur de la propri�t� prenomEmploye.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrenomEmploye(String value) {
                this.prenomEmploye = value;
            }

            /**
             * Obtient la valeur de la propri�t� sexe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSexe() {
                return sexe;
            }

            /**
             * D�finit la valeur de la propri�t� sexe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSexe(String value) {
                this.sexe = value;
            }

            /**
             * Obtient la valeur de la propri�t� etatCivil.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEtatCivil() {
                return etatCivil;
            }

            /**
             * D�finit la valeur de la propri�t� etatCivil.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEtatCivil(String value) {
                this.etatCivil = value;
            }

            /**
             * Obtient la valeur de la propri�t� dateNaissance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateNaissance() {
                return dateNaissance;
            }

            /**
             * D�finit la valeur de la propri�t� dateNaissance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateNaissance(String value) {
                this.dateNaissance = value;
            }

            /**
             * Obtient la valeur de la propri�t� numRegNaiss.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumRegNaiss() {
                return numRegNaiss;
            }

            /**
             * D�finit la valeur de la propri�t� numRegNaiss.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumRegNaiss(String value) {
                this.numRegNaiss = value;
            }

            /**
             * Obtient la valeur de la propri�t� nomPere.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomPere() {
                return nomPere;
            }

            /**
             * D�finit la valeur de la propri�t� nomPere.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomPere(String value) {
                this.nomPere = value;
            }

            /**
             * Obtient la valeur de la propri�t� prenomPere.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrenomPere() {
                return prenomPere;
            }

            /**
             * D�finit la valeur de la propri�t� prenomPere.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrenomPere(String value) {
                this.prenomPere = value;
            }

            /**
             * Obtient la valeur de la propri�t� nomMere.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNomMere() {
                return nomMere;
            }

            /**
             * D�finit la valeur de la propri�t� nomMere.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNomMere(String value) {
                this.nomMere = value;
            }

            /**
             * Obtient la valeur de la propri�t� prenomMere.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrenomMere() {
                return prenomMere;
            }

            /**
             * D�finit la valeur de la propri�t� prenomMere.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrenomMere(String value) {
                this.prenomMere = value;
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
             * Obtient la valeur de la propri�t� nin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNin() {
                return nin;
            }

            /**
             * D�finit la valeur de la propri�t� nin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNin(String value) {
                this.nin = value;
            }

            /**
             * Obtient la valeur de la propri�t� ninCedeao.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNinCedeao() {
                return ninCedeao;
            }

            /**
             * D�finit la valeur de la propri�t� ninCedeao.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNinCedeao(String value) {
                this.ninCedeao = value;
            }

            /**
             * Obtient la valeur de la propri�t� numPieceIdentite.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPieceIdentite() {
                return numPieceIdentite;
            }

            /**
             * D�finit la valeur de la propri�t� numPieceIdentite.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPieceIdentite(String value) {
                this.numPieceIdentite = value;
            }

            /**
             * Obtient la valeur de la propri�t� delivreLe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDelivreLe() {
                return delivreLe;
            }

            /**
             * D�finit la valeur de la propri�t� delivreLe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDelivreLe(String value) {
                this.delivreLe = value;
            }

            /**
             * Obtient la valeur de la propri�t� lieuDelivrance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLieuDelivrance() {
                return lieuDelivrance;
            }

            /**
             * D�finit la valeur de la propri�t� lieuDelivrance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLieuDelivrance(String value) {
                this.lieuDelivrance = value;
            }

            /**
             * Obtient la valeur de la propri�t� expireLe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpireLe() {
                return expireLe;
            }

            /**
             * D�finit la valeur de la propri�t� expireLe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpireLe(String value) {
                this.expireLe = value;
            }

            /**
             * Obtient la valeur de la propri�t� villeNaissance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVilleNaissance() {
                return villeNaissance;
            }

            /**
             * D�finit la valeur de la propri�t� villeNaissance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVilleNaissance(String value) {
                this.villeNaissance = value;
            }

            /**
             * Obtient la valeur de la propri�t� paysNaissance.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaysNaissance() {
                return paysNaissance;
            }

            /**
             * D�finit la valeur de la propri�t� paysNaissance.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaysNaissance(String value) {
                this.paysNaissance = value;
            }

            /**
             * Obtient la valeur de la propri�t� employeurPrec.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmployeurPrec() {
                return employeurPrec;
            }

            /**
             * D�finit la valeur de la propri�t� employeurPrec.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmployeurPrec(String value) {
                this.employeurPrec = value;
            }

            /**
             * Obtient la valeur de la propri�t� pays.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPays() {
                return pays;
            }

            /**
             * D�finit la valeur de la propri�t� pays.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPays(String value) {
                this.pays = value;
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
             * Obtient la valeur de la propri�t� departement.
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
             * D�finit la valeur de la propri�t� departement.
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
             * Obtient la valeur de la propri�t� adresse.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdresse() {
                return adresse;
            }

            /**
             * D�finit la valeur de la propri�t� adresse.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdresse(String value) {
                this.adresse = value;
            }

            /**
             * Obtient la valeur de la propri�t� boitePostale.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBoitePostale() {
                return boitePostale;
            }

            /**
             * D�finit la valeur de la propri�t� boitePostale.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBoitePostale(String value) {
                this.boitePostale = value;
            }

            /**
             * Obtient la valeur de la propri�t� typeMouvement.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeMouvement() {
                return typeMouvement;
            }

            /**
             * D�finit la valeur de la propri�t� typeMouvement.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeMouvement(String value) {
                this.typeMouvement = value;
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
             * Obtient la valeur de la propri�t� dateDebutContrat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateDebutContrat() {
                return dateDebutContrat;
            }

            /**
             * D�finit la valeur de la propri�t� dateDebutContrat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateDebutContrat(String value) {
                this.dateDebutContrat = value;
            }

            /**
             * Obtient la valeur de la propri�t� dateFinContrat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateFinContrat() {
                return dateFinContrat;
            }

            /**
             * D�finit la valeur de la propri�t� dateFinContrat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateFinContrat(String value) {
                this.dateFinContrat = value;
            }

            /**
             * Obtient la valeur de la propri�t� profession.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfession() {
                return profession;
            }

            /**
             * D�finit la valeur de la propri�t� profession.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfession(String value) {
                this.profession = value;
            }

            /**
             * Obtient la valeur de la propri�t� emploi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmploi() {
                return emploi;
            }

            /**
             * D�finit la valeur de la propri�t� emploi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmploi(String value) {
                this.emploi = value;
            }

            /**
             * Obtient la valeur de la propri�t� nonCadre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNonCadre() {
                return nonCadre;
            }

            /**
             * D�finit la valeur de la propri�t� nonCadre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNonCadre(String value) {
                this.nonCadre = value;
            }

            /**
             * Obtient la valeur de la propri�t� ouiCadre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOuiCadre() {
                return ouiCadre;
            }

            /**
             * D�finit la valeur de la propri�t� ouiCadre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOuiCadre(String value) {
                this.ouiCadre = value;
            }

            /**
             * Obtient la valeur de la propri�t� conventionApplicable.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConventionApplicable() {
                return conventionApplicable;
            }

            /**
             * D�finit la valeur de la propri�t� conventionApplicable.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConventionApplicable(String value) {
                this.conventionApplicable = value;
            }

            /**
             * Obtient la valeur de la propri�t� salaireContractuel.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSalaireContractuel() {
                return salaireContractuel;
            }

            /**
             * D�finit la valeur de la propri�t� salaireContractuel.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSalaireContractuel(String value) {
                this.salaireContractuel = value;
            }

            /**
             * Obtient la valeur de la propri�t� tempsTravail.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTempsTravail() {
                return tempsTravail;
            }

            /**
             * D�finit la valeur de la propri�t� tempsTravail.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTempsTravail(String value) {
                this.tempsTravail = value;
            }

            /**
             * Obtient la valeur de la propri�t� categorie.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategorie() {
                return categorie;
            }

            /**
             * D�finit la valeur de la propri�t� categorie.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategorie(String value) {
                this.categorie = value;
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
         *         &lt;element name="regType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="employerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="estType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="employerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="hqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nineaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="arretOuDecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dateArreteOuDecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="companyOriginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "regType",
            "employerType",
            "estType",
            "employerName",
            "hqId",
            "nineaNumber",
            "arretOuDecret",
            "dateArreteOuDecret",
            "companyOriginId"
        })
        public static class EmployerQuery {

            protected String regType;
            protected String employerType;
            protected String estType;
            protected String employerName;
            protected String hqId;
            protected String nineaNumber;
            protected String arretOuDecret;
            protected String dateArreteOuDecret;
            protected String companyOriginId;

            /**
             * Obtient la valeur de la propri�t� regType.
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
             * D�finit la valeur de la propri�t� regType.
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
             * Obtient la valeur de la propri�t� employerType.
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
             * D�finit la valeur de la propri�t� employerType.
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
             * Obtient la valeur de la propri�t� estType.
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
             * D�finit la valeur de la propri�t� estType.
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
             * Obtient la valeur de la propri�t� employerName.
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
             * D�finit la valeur de la propri�t� employerName.
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
             * Obtient la valeur de la propri�t� hqId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHqId() {
                return hqId;
            }

            /**
             * D�finit la valeur de la propri�t� hqId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHqId(String value) {
                this.hqId = value;
            }

            /**
             * Obtient la valeur de la propri�t� nineaNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNineaNumber() {
                return nineaNumber;
            }

            /**
             * D�finit la valeur de la propri�t� nineaNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNineaNumber(String value) {
                this.nineaNumber = value;
            }

            /**
             * Obtient la valeur de la propri�t� arretOuDecret.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArretOuDecret() {
                return arretOuDecret;
            }

            /**
             * D�finit la valeur de la propri�t� arretOuDecret.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArretOuDecret(String value) {
                this.arretOuDecret = value;
            }

            /**
             * Obtient la valeur de la propri�t� dateArreteOuDecret.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateArreteOuDecret() {
                return dateArreteOuDecret;
            }

            /**
             * D�finit la valeur de la propri�t� dateArreteOuDecret.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateArreteOuDecret(String value) {
                this.dateArreteOuDecret = value;
            }

            /**
             * Obtient la valeur de la propri�t� companyOriginId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanyOriginId() {
                return companyOriginId;
            }

            /**
             * D�finit la valeur de la propri�t� companyOriginId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyOriginId(String value) {
                this.companyOriginId = value;
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
         *         &lt;element name="dateOfInspection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dateOfFirstHire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="businessSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mainLineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="noOfWorkersInGenScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="noOfWorkersInBasicScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="arondissement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="commune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="qartier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="postboxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "dateOfInspection",
            "dateOfFirstHire",
            "shortName",
            "businessSector",
            "mainLineOfBusiness",
            "noOfWorkersInGenScheme",
            "noOfWorkersInBasicScheme",
            "region",
            "department",
            "arondissement",
            "commune",
            "qartier",
            "address",
            "postboxNo",
            "telephone",
            "email",
            "website"
        })
        public static class MainRegistrationForm {

            protected String dateOfInspection;
            protected String dateOfFirstHire;
            protected String shortName;
            protected String businessSector;
            protected String mainLineOfBusiness;
            protected String noOfWorkersInGenScheme;
            protected String noOfWorkersInBasicScheme;
            protected String region;
            protected String department;
            protected String arondissement;
            protected String commune;
            protected String qartier;
            protected String address;
            protected String postboxNo;
            protected String telephone;
            protected String email;
            protected String website;

            /**
             * Obtient la valeur de la propri�t� dateOfInspection.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateOfInspection() {
                return dateOfInspection;
            }

            /**
             * D�finit la valeur de la propri�t� dateOfInspection.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfInspection(String value) {
                this.dateOfInspection = value;
            }

            /**
             * Obtient la valeur de la propri�t� dateOfFirstHire.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateOfFirstHire() {
                return dateOfFirstHire;
            }

            /**
             * D�finit la valeur de la propri�t� dateOfFirstHire.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateOfFirstHire(String value) {
                this.dateOfFirstHire = value;
            }

            /**
             * Obtient la valeur de la propri�t� shortName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShortName() {
                return shortName;
            }

            /**
             * D�finit la valeur de la propri�t� shortName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShortName(String value) {
                this.shortName = value;
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
             * Obtient la valeur de la propri�t� noOfWorkersInGenScheme.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoOfWorkersInGenScheme() {
                return noOfWorkersInGenScheme;
            }

            /**
             * D�finit la valeur de la propri�t� noOfWorkersInGenScheme.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoOfWorkersInGenScheme(String value) {
                this.noOfWorkersInGenScheme = value;
            }

            /**
             * Obtient la valeur de la propri�t� noOfWorkersInBasicScheme.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoOfWorkersInBasicScheme() {
                return noOfWorkersInBasicScheme;
            }

            /**
             * D�finit la valeur de la propri�t� noOfWorkersInBasicScheme.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoOfWorkersInBasicScheme(String value) {
                this.noOfWorkersInBasicScheme = value;
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
             * Obtient la valeur de la propri�t� arondissement.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArondissement() {
                return arondissement;
            }

            /**
             * D�finit la valeur de la propri�t� arondissement.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArondissement(String value) {
                this.arondissement = value;
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
             * Obtient la valeur de la propri�t� qartier.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQartier() {
                return qartier;
            }

            /**
             * D�finit la valeur de la propri�t� qartier.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQartier(String value) {
                this.qartier = value;
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
             * Obtient la valeur de la propri�t� postboxNo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostboxNo() {
                return postboxNo;
            }

            /**
             * D�finit la valeur de la propri�t� postboxNo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostboxNo(String value) {
                this.postboxNo = value;
            }

            /**
             * Obtient la valeur de la propri�t� telephone.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelephone() {
                return telephone;
            }

            /**
             * D�finit la valeur de la propri�t� telephone.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelephone(String value) {
                this.telephone = value;
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
             * Obtient la valeur de la propri�t� website.
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
             * D�finit la valeur de la propri�t� website.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWebsite(String value) {
                this.website = value;
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
         *         &lt;element name="recherche" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="typeOfIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="identityIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ninCedeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="telephoneFixe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numeroMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "recherche",
            "nom",
            "prenom",
            "typeOfIdentity",
            "nin",
            "identityIdNumber",
            "ninCedeo",
            "telephoneFixe",
            "numeroMobile",
            "email"
        })
        public static class PersonneContact {

            protected String recherche;
            protected String nom;
            protected String prenom;
            protected String typeOfIdentity;
            protected String nin;
            protected String identityIdNumber;
            protected String ninCedeo;
            protected String telephoneFixe;
            protected String numeroMobile;
            protected String email;

            /**
             * Obtient la valeur de la propri�t� recherche.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecherche() {
                return recherche;
            }

            /**
             * D�finit la valeur de la propri�t� recherche.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecherche(String value) {
                this.recherche = value;
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
             * Obtient la valeur de la propri�t� typeOfIdentity.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeOfIdentity() {
                return typeOfIdentity;
            }

            /**
             * D�finit la valeur de la propri�t� typeOfIdentity.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeOfIdentity(String value) {
                this.typeOfIdentity = value;
            }

            /**
             * Obtient la valeur de la propri�t� nin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNin() {
                return nin;
            }

            /**
             * D�finit la valeur de la propri�t� nin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNin(String value) {
                this.nin = value;
            }

            /**
             * Obtient la valeur de la propri�t� identityIdNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentityIdNumber() {
                return identityIdNumber;
            }

            /**
             * D�finit la valeur de la propri�t� identityIdNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentityIdNumber(String value) {
                this.identityIdNumber = value;
            }

            /**
             * Obtient la valeur de la propri�t� ninCedeo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNinCedeo() {
                return ninCedeo;
            }

            /**
             * D�finit la valeur de la propri�t� ninCedeo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNinCedeo(String value) {
                this.ninCedeo = value;
            }

            /**
             * Obtient la valeur de la propri�t� telephoneFixe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelephoneFixe() {
                return telephoneFixe;
            }

            /**
             * D�finit la valeur de la propri�t� telephoneFixe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelephoneFixe(String value) {
                this.telephoneFixe = value;
            }

            /**
             * Obtient la valeur de la propri�t� numeroMobile.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroMobile() {
                return numeroMobile;
            }

            /**
             * D�finit la valeur de la propri�t� numeroMobile.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroMobile(String value) {
                this.numeroMobile = value;
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
     *         &lt;element name="employerRegistrationFormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employeeRegistrationFormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="processFlowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "employerRegistrationFormId",
        "employeeRegistrationFormId",
        "processFlowId",
        "zoneCss",
        "zoneIpres",
        "sectorCss",
        "sectorIpres",
        "agenceCss",
        "agenceIpres",
        "tauxAt"
    })
    public static class Output {

        protected String employerRegistrationFormId;
        protected String employeeRegistrationFormId;
        protected String processFlowId;
        protected String zoneCss;
        protected String zoneIpres;
        protected String sectorCss;
        protected String sectorIpres;
        protected String agenceCss;
        protected String agenceIpres;
        protected String tauxAt;

        /**
         * Obtient la valeur de la propri�t� employerRegistrationFormId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployerRegistrationFormId() {
            return employerRegistrationFormId;
        }

        /**
         * D�finit la valeur de la propri�t� employerRegistrationFormId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployerRegistrationFormId(String value) {
            this.employerRegistrationFormId = value;
        }

        /**
         * Obtient la valeur de la propri�t� employeeRegistrationFormId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployeeRegistrationFormId() {
            return employeeRegistrationFormId;
        }

        /**
         * D�finit la valeur de la propri�t� employeeRegistrationFormId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployeeRegistrationFormId(String value) {
            this.employeeRegistrationFormId = value;
        }

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
