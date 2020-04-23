
package com.secusociale.portail.service.soap.employeurExistant;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * CM_GET_EMPLOYEUR_DETAILS version 2: Retrive details employeur
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CM_GET_EMPLOYEUR_DETAILSService", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_EMPLOYEUR_DETAILS", wsdlLocation = "http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/CM_GET_EMPLOYEUR_DETAILS?wsdl")
public class CMGETEMPLOYEURDETAILSService
    extends Service
{

    private final static URL CMGETEMPLOYEURDETAILSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CMGETEMPLOYEURDETAILSSERVICE_EXCEPTION;
    private final static QName CMGETEMPLOYEURDETAILSSERVICE_QNAME = new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_EMPLOYEUR_DETAILS", "CM_GET_EMPLOYEUR_DETAILSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/CM_GET_EMPLOYEUR_DETAILS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CMGETEMPLOYEURDETAILSSERVICE_WSDL_LOCATION = url;
        CMGETEMPLOYEURDETAILSSERVICE_EXCEPTION = e;
    }

    public CMGETEMPLOYEURDETAILSService() {
        super(__getWsdlLocation(), CMGETEMPLOYEURDETAILSSERVICE_QNAME);
    }

    public CMGETEMPLOYEURDETAILSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CMGETEMPLOYEURDETAILSSERVICE_QNAME, features);
    }

    public CMGETEMPLOYEURDETAILSService(URL wsdlLocation) {
        super(wsdlLocation, CMGETEMPLOYEURDETAILSSERVICE_QNAME);
    }

    public CMGETEMPLOYEURDETAILSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CMGETEMPLOYEURDETAILSSERVICE_QNAME, features);
    }

    public CMGETEMPLOYEURDETAILSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CMGETEMPLOYEURDETAILSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CMGETEMPLOYEURDETAILSPortType
     */
    @WebEndpoint(name = "CM_GET_EMPLOYEUR_DETAILSPort")
    public CMGETEMPLOYEURDETAILSPortType getCMGETEMPLOYEURDETAILSPort() {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_EMPLOYEUR_DETAILS", "CM_GET_EMPLOYEUR_DETAILSPort"), CMGETEMPLOYEURDETAILSPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CMGETEMPLOYEURDETAILSPortType
     */
    @WebEndpoint(name = "CM_GET_EMPLOYEUR_DETAILSPort")
    public CMGETEMPLOYEURDETAILSPortType getCMGETEMPLOYEURDETAILSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_EMPLOYEUR_DETAILS", "CM_GET_EMPLOYEUR_DETAILSPort"), CMGETEMPLOYEURDETAILSPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CMGETEMPLOYEURDETAILSSERVICE_EXCEPTION!= null) {
            throw CMGETEMPLOYEURDETAILSSERVICE_EXCEPTION;
        }
        return CMGETEMPLOYEURDETAILSSERVICE_WSDL_LOCATION;
    }

}
