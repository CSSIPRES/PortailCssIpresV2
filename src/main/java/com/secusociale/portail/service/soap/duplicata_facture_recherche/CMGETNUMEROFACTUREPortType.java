
package com.secusociale.portail.service.soap.duplicata_facture_recherche;

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
@WebService(name = "CM_GET_NUMERO_FACTUREPortType", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_NUMERO_FACTURE")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CMGETNUMEROFACTUREPortType {


    /**
     * 
     * @param body
     * @throws CMGETNUMEROFACTUREFault
     */
    @WebMethod(operationName = "CM_GET_NUMERO_FACTURE", action = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_NUMERO_FACTURE")
    public void cmGETNUMEROFACTURE(
        @WebParam(name = "CM_GET_NUMERO_FACTURE", targetNamespace = "http://oracle.com/CM_GET_NUMERO_FACTURE.xsd", mode = WebParam.Mode.INOUT, partName = "body")
        Holder<CMGETNUMEROFACTURE> body)
        throws CMGETNUMEROFACTUREFault
    ;

}
