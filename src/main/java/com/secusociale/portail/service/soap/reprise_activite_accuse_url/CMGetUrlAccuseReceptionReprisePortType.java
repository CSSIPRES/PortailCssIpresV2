
package com.secusociale.portail.service.soap.reprise_activite_accuse_url;

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
@WebService(name = "CM-GetUrlAccuseReceptionReprisePortType", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM-GetUrlAccuseReceptionReprise")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CMGetUrlAccuseReceptionReprisePortType {


    /**
     * 
     * @param body
     * @throws CMGetUrlAccuseReceptionRepriseFault
     */
    @WebMethod(operationName = "CM-GetUrlAccuseReceptionReprise", action = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM-GetUrlAccuseReceptionReprise")
    public void cmGetUrlAccuseReceptionReprise(
        @WebParam(name = "CM-GetUrlAccuseReceptionReprise", targetNamespace = "http://oracle.com/CM-GetUrlAccuseReceptionReprise.xsd", mode = WebParam.Mode.INOUT, partName = "body")
        Holder<CMGetUrlAccuseReceptionReprise> body)
        throws CMGetUrlAccuseReceptionRepriseFault
    ;

}