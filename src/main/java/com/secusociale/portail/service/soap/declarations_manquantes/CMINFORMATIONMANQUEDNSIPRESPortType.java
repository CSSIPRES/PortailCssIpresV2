
package com.secusociale.portail.service.soap.declarations_manquantes;

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
@WebService(name = "CM_INFORMATION_MANQUE_DNS_IPRESPortType", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_INFORMATION_MANQUE_DNS_IPRES")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CMINFORMATIONMANQUEDNSIPRESPortType {


    /**
     * 
     * @param body
     * @throws CMINFORMATIONMANQUEDNSIPRESFault
     */
    @WebMethod(operationName = "CM_INFORMATION_MANQUE_DNS_IPRES", action = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_INFORMATION_MANQUE_DNS_IPRES")
    public void cmINFORMATIONMANQUEDNSIPRES(
        @WebParam(name = "CM_INFORMATION_MANQUE_DNS_IPRES", targetNamespace = "http://oracle.com/CM_INFORMATION_MANQUE_DNS_IPRES.xsd", mode = WebParam.Mode.INOUT, partName = "body")
        Holder<CMINFORMATIONMANQUEDNSIPRES> body)
        throws CMINFORMATIONMANQUEDNSIPRESFault
    ;

}
