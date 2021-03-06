
package com.secusociale.portail.service.soap.checkExistenceEmployeur;

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
@WebService(name = "CmCheckExistenceEmployeurPortType", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CmCheckExistenceEmployeur")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CmCheckExistenceEmployeurPortType {


    /**
     * 
     * @param body
     * @throws CmCheckExistenceEmployeurFault
     */
    @WebMethod(operationName = "CmCheckExistenceEmployeur", action = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CmCheckExistenceEmployeur")
    public void cmCheckExistenceEmployeur(
        @WebParam(name = "CmCheckExistenceEmployeur", targetNamespace = "http://oracle.com/CmCheckExistenceEmployeur.xsd", mode = WebParam.Mode.INOUT, partName = "body")
        Holder<CmCheckExistenceEmployeur> body)
        throws CmCheckExistenceEmployeurFault
    ;

}
