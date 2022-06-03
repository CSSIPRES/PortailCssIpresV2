
package com.secusociale.portail.service.soap.duplicata_facture_recherche;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * CM_GET_NUMERO_FACTURE version 3: La liste des factures par id
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CM_GET_NUMERO_FACTUREService", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_NUMERO_FACTURE", wsdlLocation = "http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/CM_GET_NUMERO_FACTURE?WSDL")
public class CMGETNUMEROFACTUREService
    extends Service
{

    private final static URL CMGETNUMEROFACTURESERVICE_WSDL_LOCATION;
    private final static WebServiceException CMGETNUMEROFACTURESERVICE_EXCEPTION;
    private final static QName CMGETNUMEROFACTURESERVICE_QNAME = new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_NUMERO_FACTURE", "CM_GET_NUMERO_FACTUREService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/CM_GET_NUMERO_FACTURE?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CMGETNUMEROFACTURESERVICE_WSDL_LOCATION = url;
        CMGETNUMEROFACTURESERVICE_EXCEPTION = e;
    }

    public CMGETNUMEROFACTUREService() {
        super(__getWsdlLocation(), CMGETNUMEROFACTURESERVICE_QNAME);
    }

    public CMGETNUMEROFACTUREService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CMGETNUMEROFACTURESERVICE_QNAME, features);
    }

    public CMGETNUMEROFACTUREService(URL wsdlLocation) {
        super(wsdlLocation, CMGETNUMEROFACTURESERVICE_QNAME);
    }

    public CMGETNUMEROFACTUREService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CMGETNUMEROFACTURESERVICE_QNAME, features);
    }

    public CMGETNUMEROFACTUREService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CMGETNUMEROFACTUREService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CMGETNUMEROFACTUREPortType
     */
    @WebEndpoint(name = "CM_GET_NUMERO_FACTUREPort")
    public CMGETNUMEROFACTUREPortType getCMGETNUMEROFACTUREPort() {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_NUMERO_FACTURE", "CM_GET_NUMERO_FACTUREPort"), CMGETNUMEROFACTUREPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CMGETNUMEROFACTUREPortType
     */
    @WebEndpoint(name = "CM_GET_NUMERO_FACTUREPort")
    public CMGETNUMEROFACTUREPortType getCMGETNUMEROFACTUREPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_NUMERO_FACTURE", "CM_GET_NUMERO_FACTUREPort"), CMGETNUMEROFACTUREPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CMGETNUMEROFACTURESERVICE_EXCEPTION!= null) {
            throw CMGETNUMEROFACTURESERVICE_EXCEPTION;
        }
        return CMGETNUMEROFACTURESERVICE_WSDL_LOCATION;
    }

}