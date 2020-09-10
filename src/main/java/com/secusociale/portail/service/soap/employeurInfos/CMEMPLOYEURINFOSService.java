
package com.secusociale.portail.service.soap.employeurInfos;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * CM_EMPLOYEUR_INFOS version 2: Get Informations employeur � partir du personId
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CM_EMPLOYEUR_INFOSService", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_EMPLOYEUR_INFOS", wsdlLocation = "http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/CM_EMPLOYEUR_INFOS?WSDL")
public class CMEMPLOYEURINFOSService
    extends Service
{

    private final static URL CMEMPLOYEURINFOSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CMEMPLOYEURINFOSSERVICE_EXCEPTION;
    private final static QName CMEMPLOYEURINFOSSERVICE_QNAME = new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_EMPLOYEUR_INFOS", "CM_EMPLOYEUR_INFOSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/CM_EMPLOYEUR_INFOS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CMEMPLOYEURINFOSSERVICE_WSDL_LOCATION = url;
        CMEMPLOYEURINFOSSERVICE_EXCEPTION = e;
    }

    public CMEMPLOYEURINFOSService() {
        super(__getWsdlLocation(), CMEMPLOYEURINFOSSERVICE_QNAME);
    }

    public CMEMPLOYEURINFOSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CMEMPLOYEURINFOSSERVICE_QNAME, features);
    }

    public CMEMPLOYEURINFOSService(URL wsdlLocation) {
        super(wsdlLocation, CMEMPLOYEURINFOSSERVICE_QNAME);
    }

    public CMEMPLOYEURINFOSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CMEMPLOYEURINFOSSERVICE_QNAME, features);
    }

    public CMEMPLOYEURINFOSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CMEMPLOYEURINFOSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CMEMPLOYEURINFOSPortType
     */
    @WebEndpoint(name = "CM_EMPLOYEUR_INFOSPort")
    public CMEMPLOYEURINFOSPortType getCMEMPLOYEURINFOSPort() {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_EMPLOYEUR_INFOS", "CM_EMPLOYEUR_INFOSPort"), CMEMPLOYEURINFOSPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CMEMPLOYEURINFOSPortType
     */
    @WebEndpoint(name = "CM_EMPLOYEUR_INFOSPort")
    public CMEMPLOYEURINFOSPortType getCMEMPLOYEURINFOSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_EMPLOYEUR_INFOS", "CM_EMPLOYEUR_INFOSPort"), CMEMPLOYEURINFOSPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CMEMPLOYEURINFOSSERVICE_EXCEPTION!= null) {
            throw CMEMPLOYEURINFOSSERVICE_EXCEPTION;
        }
        return CMEMPLOYEURINFOSSERVICE_WSDL_LOCATION;
    }

}