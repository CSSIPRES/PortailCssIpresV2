
package com.secusociale.portail.service.soap.duplicata_facture_url;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * CM_GET_FACTURE version 2: Obtenir la facture par son id
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CM_GET_FACTUREService", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_FACTURE", wsdlLocation = "http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/CM_GET_FACTURE?wsdl")
public class CMGETFACTUREService
    extends Service
{

    private final static URL CMGETFACTURESERVICE_WSDL_LOCATION;
    private final static WebServiceException CMGETFACTURESERVICE_EXCEPTION;
    private final static QName CMGETFACTURESERVICE_QNAME = new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_FACTURE", "CM_GET_FACTUREService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/CM_GET_FACTURE?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CMGETFACTURESERVICE_WSDL_LOCATION = url;
        CMGETFACTURESERVICE_EXCEPTION = e;
    }

    public CMGETFACTUREService() {
        super(__getWsdlLocation(), CMGETFACTURESERVICE_QNAME);
    }

    public CMGETFACTUREService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CMGETFACTURESERVICE_QNAME, features);
    }

    public CMGETFACTUREService(URL wsdlLocation) {
        super(wsdlLocation, CMGETFACTURESERVICE_QNAME);
    }

    public CMGETFACTUREService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CMGETFACTURESERVICE_QNAME, features);
    }

    public CMGETFACTUREService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CMGETFACTUREService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CMGETFACTUREPortType
     */
    @WebEndpoint(name = "CM_GET_FACTUREPort")
    public CMGETFACTUREPortType getCMGETFACTUREPort() {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_FACTURE", "CM_GET_FACTUREPort"), CMGETFACTUREPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CMGETFACTUREPortType
     */
    @WebEndpoint(name = "CM_GET_FACTUREPort")
    public CMGETFACTUREPortType getCMGETFACTUREPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_FACTURE", "CM_GET_FACTUREPort"), CMGETFACTUREPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CMGETFACTURESERVICE_EXCEPTION!= null) {
            throw CMGETFACTURESERVICE_EXCEPTION;
        }
        return CMGETFACTURESERVICE_WSDL_LOCATION;
    }

}