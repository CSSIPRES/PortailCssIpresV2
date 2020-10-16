
package com.secusociale.portail.service.soap.reprise_activite_accuse_url;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Fault", targetNamespace = "http://ouaf.oracle.com/")
public class CMGetUrlAccuseReceptionRepriseFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Fault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CMGetUrlAccuseReceptionRepriseFault(String message, Fault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CMGetUrlAccuseReceptionRepriseFault(String message, Fault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.secusociale.portail.service.soap.reprise_activite_accuse_url.Fault
     */
    public Fault getFaultInfo() {
        return faultInfo;
    }

}
