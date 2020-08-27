
package com.secusociale.portail.service.soap.derniersPaiements;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * DERN_PAY_EMPLOYEUR_SERVICE version 2: La liste des 10 derni�res paiements
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DERN_PAY_EMPLOYEUR_SERVICEService", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/DERN_PAY_EMPLOYEUR_SERVICE", wsdlLocation = "http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/DERN_PAY_EMPLOYEUR_SERVICE?WSDL")
public class DERNPAYEMPLOYEURSERVICEService
    extends Service
{

    private final static URL DERNPAYEMPLOYEURSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException DERNPAYEMPLOYEURSERVICESERVICE_EXCEPTION;
    private final static QName DERNPAYEMPLOYEURSERVICESERVICE_QNAME = new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/DERN_PAY_EMPLOYEUR_SERVICE", "DERN_PAY_EMPLOYEUR_SERVICEService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.125.23:7500/ouaf/XAIApp/xaiserver/DERN_PAY_EMPLOYEUR_SERVICE?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DERNPAYEMPLOYEURSERVICESERVICE_WSDL_LOCATION = url;
        DERNPAYEMPLOYEURSERVICESERVICE_EXCEPTION = e;
    }

    public DERNPAYEMPLOYEURSERVICEService() {
        super(__getWsdlLocation(), DERNPAYEMPLOYEURSERVICESERVICE_QNAME);
    }

    public DERNPAYEMPLOYEURSERVICEService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DERNPAYEMPLOYEURSERVICESERVICE_QNAME, features);
    }

    public DERNPAYEMPLOYEURSERVICEService(URL wsdlLocation) {
        super(wsdlLocation, DERNPAYEMPLOYEURSERVICESERVICE_QNAME);
    }

    public DERNPAYEMPLOYEURSERVICEService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DERNPAYEMPLOYEURSERVICESERVICE_QNAME, features);
    }

    public DERNPAYEMPLOYEURSERVICEService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DERNPAYEMPLOYEURSERVICEService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DERNPAYEMPLOYEURSERVICEPortType
     */
    @WebEndpoint(name = "DERN_PAY_EMPLOYEUR_SERVICEPort")
    public DERNPAYEMPLOYEURSERVICEPortType getDERNPAYEMPLOYEURSERVICEPort() {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/DERN_PAY_EMPLOYEUR_SERVICE", "DERN_PAY_EMPLOYEUR_SERVICEPort"), DERNPAYEMPLOYEURSERVICEPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DERNPAYEMPLOYEURSERVICEPortType
     */
    @WebEndpoint(name = "DERN_PAY_EMPLOYEUR_SERVICEPort")
    public DERNPAYEMPLOYEURSERVICEPortType getDERNPAYEMPLOYEURSERVICEPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ouaf.oracle.com/spl/XAIXapp/xaiserver/DERN_PAY_EMPLOYEUR_SERVICE", "DERN_PAY_EMPLOYEUR_SERVICEPort"), DERNPAYEMPLOYEURSERVICEPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DERNPAYEMPLOYEURSERVICESERVICE_EXCEPTION!= null) {
            throw DERNPAYEMPLOYEURSERVICESERVICE_EXCEPTION;
        }
        return DERNPAYEMPLOYEURSERVICESERVICE_WSDL_LOCATION;
    }

}
