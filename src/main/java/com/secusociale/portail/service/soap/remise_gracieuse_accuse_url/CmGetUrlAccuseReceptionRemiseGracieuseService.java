
package com.secusociale.portail.service.soap.remise_gracieuse_accuse_url;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * CmGetUrlAccuseReceptionRemiseGracieuse version 2: Recuperer l'accuse de reception remise gracieuse
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CmGetUrlAccuseReceptionRemiseGracieuseService", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CmGetUrlAccuseReceptionRemiseGracieuse", wsdlLocation = "http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/CmGetUrlAccuseReceptionRemiseGracieuse?WSDL")
public class CmGetUrlAccuseReceptionRemiseGracieuseService
    extends Service
{

    private final static URL CMGETURLACCUSERECEPTIONREMISEGRACIEUSESERVICE_WSDL_LOCATION;
    private final static WebServiceException CMGETURLACCUSERECEPTIONREMISEGRACIEUSESERVICE_EXCEPTION;
    private final static QName CMGETURLACCUSERECEPTIONREMISEGRACIEUSESERVICE_QNAME = new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CmGetUrlAccuseReceptionRemiseGracieuse", "CmGetUrlAccuseReceptionRemiseGracieuseService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/CmGetUrlAccuseReceptionRemiseGracieuse?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CMGETURLACCUSERECEPTIONREMISEGRACIEUSESERVICE_WSDL_LOCATION = url;
        CMGETURLACCUSERECEPTIONREMISEGRACIEUSESERVICE_EXCEPTION = e;
    }

    public CmGetUrlAccuseReceptionRemiseGracieuseService() {
        super(__getWsdlLocation(), CMGETURLACCUSERECEPTIONREMISEGRACIEUSESERVICE_QNAME);
    }

    public CmGetUrlAccuseReceptionRemiseGracieuseService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CMGETURLACCUSERECEPTIONREMISEGRACIEUSESERVICE_QNAME, features);
    }

    public CmGetUrlAccuseReceptionRemiseGracieuseService(URL wsdlLocation) {
        super(wsdlLocation, CMGETURLACCUSERECEPTIONREMISEGRACIEUSESERVICE_QNAME);
    }

    public CmGetUrlAccuseReceptionRemiseGracieuseService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CMGETURLACCUSERECEPTIONREMISEGRACIEUSESERVICE_QNAME, features);
    }

    public CmGetUrlAccuseReceptionRemiseGracieuseService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CmGetUrlAccuseReceptionRemiseGracieuseService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CmGetUrlAccuseReceptionRemiseGracieusePortType
     */
    @WebEndpoint(name = "CmGetUrlAccuseReceptionRemiseGracieusePort")
    public CmGetUrlAccuseReceptionRemiseGracieusePortType getCmGetUrlAccuseReceptionRemiseGracieusePort() {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CmGetUrlAccuseReceptionRemiseGracieuse", "CmGetUrlAccuseReceptionRemiseGracieusePort"), CmGetUrlAccuseReceptionRemiseGracieusePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CmGetUrlAccuseReceptionRemiseGracieusePortType
     */
    @WebEndpoint(name = "CmGetUrlAccuseReceptionRemiseGracieusePort")
    public CmGetUrlAccuseReceptionRemiseGracieusePortType getCmGetUrlAccuseReceptionRemiseGracieusePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CmGetUrlAccuseReceptionRemiseGracieuse", "CmGetUrlAccuseReceptionRemiseGracieusePort"), CmGetUrlAccuseReceptionRemiseGracieusePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CMGETURLACCUSERECEPTIONREMISEGRACIEUSESERVICE_EXCEPTION!= null) {
            throw CMGETURLACCUSERECEPTIONREMISEGRACIEUSESERVICE_EXCEPTION;
        }
        return CMGETURLACCUSERECEPTIONREMISEGRACIEUSESERVICE_WSDL_LOCATION;
    }

}