
package com.secusociale.portail.service.soap.employeurInfos;

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
@WebService(name = "CM_EMPLOYEUR_INFOSPortType", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_EMPLOYEUR_INFOS")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CMEMPLOYEURINFOSPortType {


    /**
     * 
     * @param body
     * @throws CMEMPLOYEURINFOSFault
     */
    @WebMethod(operationName = "CM_EMPLOYEUR_INFOS", action = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM_EMPLOYEUR_INFOS")
    public void cmEMPLOYEURINFOS(
        @WebParam(name = "CM_EMPLOYEUR_INFOS", targetNamespace = "http://oracle.com/CM_EMPLOYEUR_INFOS.xsd", mode = WebParam.Mode.INOUT, partName = "body")
        Holder<CMEMPLOYEURINFOS> body)
        throws CMEMPLOYEURINFOSFault
    ;

}