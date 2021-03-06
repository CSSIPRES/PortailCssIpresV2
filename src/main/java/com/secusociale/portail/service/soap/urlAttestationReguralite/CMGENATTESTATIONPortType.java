
package com.secusociale.portail.service.soap.urlAttestationReguralite;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CM_GEN_ATTESTATIONPortType", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GEN_ATTESTATION")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CMGENATTESTATIONPortType {


    /**
     * 
     * @param body
     * @throws CMGENATTESTATIONFault
     */
    @WebMethod(operationName = "CM_GEN_ATTESTATION", action = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GEN_ATTESTATION")
    public void cmGENATTESTATION(
        @WebParam(name = "CM_GEN_ATTESTATION", targetNamespace = "http://oracle.com/CM_GEN_ATTESTATION.xsd", mode = WebParam.Mode.INOUT, partName = "body")
        Holder<CMGENATTESTATION> body)
        throws CMGENATTESTATIONFault
    ;

}
