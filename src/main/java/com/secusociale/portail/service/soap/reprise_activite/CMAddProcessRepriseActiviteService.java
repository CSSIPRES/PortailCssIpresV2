
package com.secusociale.portail.service.soap.reprise_activite;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * CM-AddProcessRepriseActivite version 2: Ajouter processus reprise activite
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CM-AddProcessRepriseActiviteService", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM-AddProcessRepriseActivite", wsdlLocation = "http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/CM-AddProcessRepriseActivite?WSDL")
public class CMAddProcessRepriseActiviteService
    extends Service
{

    private final static URL CMADDPROCESSREPRISEACTIVITESERVICE_WSDL_LOCATION;
    private final static WebServiceException CMADDPROCESSREPRISEACTIVITESERVICE_EXCEPTION;
    private final static QName CMADDPROCESSREPRISEACTIVITESERVICE_QNAME = new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM-AddProcessRepriseActivite", "CM-AddProcessRepriseActiviteService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/CM-AddProcessRepriseActivite?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CMADDPROCESSREPRISEACTIVITESERVICE_WSDL_LOCATION = url;
        CMADDPROCESSREPRISEACTIVITESERVICE_EXCEPTION = e;
    }

    public CMAddProcessRepriseActiviteService() {
        super(__getWsdlLocation(), CMADDPROCESSREPRISEACTIVITESERVICE_QNAME);
    }

    public CMAddProcessRepriseActiviteService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CMADDPROCESSREPRISEACTIVITESERVICE_QNAME, features);
    }

    public CMAddProcessRepriseActiviteService(URL wsdlLocation) {
        super(wsdlLocation, CMADDPROCESSREPRISEACTIVITESERVICE_QNAME);
    }

    public CMAddProcessRepriseActiviteService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CMADDPROCESSREPRISEACTIVITESERVICE_QNAME, features);
    }

    public CMAddProcessRepriseActiviteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CMAddProcessRepriseActiviteService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CMAddProcessRepriseActivitePortType
     */
    @WebEndpoint(name = "CM-AddProcessRepriseActivitePort")
    public CMAddProcessRepriseActivitePortType getCMAddProcessRepriseActivitePort() {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM-AddProcessRepriseActivite", "CM-AddProcessRepriseActivitePort"), CMAddProcessRepriseActivitePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CMAddProcessRepriseActivitePortType
     */
    @WebEndpoint(name = "CM-AddProcessRepriseActivitePort")
    public CMAddProcessRepriseActivitePortType getCMAddProcessRepriseActivitePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM-AddProcessRepriseActivite", "CM-AddProcessRepriseActivitePort"), CMAddProcessRepriseActivitePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CMADDPROCESSREPRISEACTIVITESERVICE_EXCEPTION!= null) {
            throw CMADDPROCESSREPRISEACTIVITESERVICE_EXCEPTION;
        }
        return CMADDPROCESSREPRISEACTIVITESERVICE_WSDL_LOCATION;
    }

}