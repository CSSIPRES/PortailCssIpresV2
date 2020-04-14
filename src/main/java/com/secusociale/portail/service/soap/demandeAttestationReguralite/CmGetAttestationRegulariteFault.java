
package com.secusociale.portail.service.soap.demandeAttestationReguralite;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Fault", targetNamespace = "http://ouaf.oracle.com/")
public class CmGetAttestationRegulariteFault
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
    public CmGetAttestationRegulariteFault(String message, Fault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CmGetAttestationRegulariteFault(String message, Fault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.secusociale.portail.service.soap.attestationReguralite.Fault
     */
    public Fault getFaultInfo() {
        return faultInfo;
    }

}
