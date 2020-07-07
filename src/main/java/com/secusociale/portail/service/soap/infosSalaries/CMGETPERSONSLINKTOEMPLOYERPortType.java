
package com.secusociale.portail.service.soap.infosSalaries;

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
@WebService(name = "CM_GET_PERSONS_LINK_TO_EMPLOYERPortType", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_PERSONS_LINK_TO_EMPLOYER")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CMGETPERSONSLINKTOEMPLOYERPortType {


    /**
     * 
     * @param body
     * @throws CMGETPERSONSLINKTOEMPLOYERFault
     */
    @WebMethod(operationName = "CM_GET_PERSONS_LINK_TO_EMPLOYER", action = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_GET_PERSONS_LINK_TO_EMPLOYER")
    public void cmGETPERSONSLINKTOEMPLOYER(
        @WebParam(name = "CM_GET_PERSONS_LINK_TO_EMPLOYER", targetNamespace = "http://oracle.com/CM_GET_PERSONS_LINK_TO_EMPLOYER.xsd", mode = WebParam.Mode.INOUT, partName = "body")
        Holder<CMGETPERSONSLINKTOEMPLOYER> body)
        throws CMGETPERSONSLINKTOEMPLOYERFault
    ;

}
