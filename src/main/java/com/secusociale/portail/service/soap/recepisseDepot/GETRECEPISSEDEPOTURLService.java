
package com.secusociale.portail.service.soap.recepisseDepot;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import com.secusociale.portail.service.PortailConstant;


/**
 * GET_RECEPISSE_DEPOT_URL version 2: Get recepisse de depot
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GET_RECEPISSE_DEPOT_URLService", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/GET_RECEPISSE_DEPOT_URL", wsdlLocation = PortailConstant.RECEPISSE_WSDL )
public class GETRECEPISSEDEPOTURLService
    extends Service
{

    private final static URL GETRECEPISSEDEPOTURLSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETRECEPISSEDEPOTURLSERVICE_EXCEPTION;
    private final static QName GETRECEPISSEDEPOTURLSERVICE_QNAME = new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/GET_RECEPISSE_DEPOT_URL", "GET_RECEPISSE_DEPOT_URLService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL( PortailConstant.RECEPISSE_WSDL);
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETRECEPISSEDEPOTURLSERVICE_WSDL_LOCATION = url;
        GETRECEPISSEDEPOTURLSERVICE_EXCEPTION = e;
    }

    public GETRECEPISSEDEPOTURLService() {
        super(__getWsdlLocation(), GETRECEPISSEDEPOTURLSERVICE_QNAME);
    }

    public GETRECEPISSEDEPOTURLService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETRECEPISSEDEPOTURLSERVICE_QNAME, features);
    }

    public GETRECEPISSEDEPOTURLService(URL wsdlLocation) {
        super(wsdlLocation, GETRECEPISSEDEPOTURLSERVICE_QNAME);
    }

    public GETRECEPISSEDEPOTURLService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETRECEPISSEDEPOTURLSERVICE_QNAME, features);
    }

    public GETRECEPISSEDEPOTURLService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GETRECEPISSEDEPOTURLService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GETRECEPISSEDEPOTURLPortType
     */
    @WebEndpoint(name = "GET_RECEPISSE_DEPOT_URLPort")
    public GETRECEPISSEDEPOTURLPortType getGETRECEPISSEDEPOTURLPort() {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/GET_RECEPISSE_DEPOT_URL", "GET_RECEPISSE_DEPOT_URLPort"), GETRECEPISSEDEPOTURLPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GETRECEPISSEDEPOTURLPortType
     */
    @WebEndpoint(name = "GET_RECEPISSE_DEPOT_URLPort")
    public GETRECEPISSEDEPOTURLPortType getGETRECEPISSEDEPOTURLPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/GET_RECEPISSE_DEPOT_URL", "GET_RECEPISSE_DEPOT_URLPort"), GETRECEPISSEDEPOTURLPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETRECEPISSEDEPOTURLSERVICE_EXCEPTION!= null) {
            throw GETRECEPISSEDEPOTURLSERVICE_EXCEPTION;
        }
        return GETRECEPISSEDEPOTURLSERVICE_WSDL_LOCATION;
    }

}