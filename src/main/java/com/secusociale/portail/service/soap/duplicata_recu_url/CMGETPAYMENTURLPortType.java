
package com.secusociale.portail.service.soap.duplicata_recu_url;

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
@WebService(name = "CM_GET_PAYMENT_URLPortType", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_PAYMENT_URL")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CMGETPAYMENTURLPortType {


    /**
     * 
     * @param body
     * @throws CMGETPAYMENTURLFault
     */
    @WebMethod(operationName = "CM_GET_PAYMENT_URL", action = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_PAYMENT_URL")
    public void cmGETPAYMENTURL(
        @WebParam(name = "CM_GET_PAYMENT_URL", targetNamespace = "http://oracle.com/CM_GET_PAYMENT_URL.xsd", mode = WebParam.Mode.INOUT, partName = "body")
        Holder<CMGETPAYMENTURL> body)
        throws CMGETPAYMENTURLFault
    ;

}
