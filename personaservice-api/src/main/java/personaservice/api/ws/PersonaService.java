
package personaservice.api.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PersonaService", targetNamespace = "http:/walmart.com.mx/PersonaService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonaService {


    /**
     * 
     * @return
     *     returns personaservice.api.ws.User
     */
    @WebMethod(operationName = "GetAllUsers", action = "http:/walmart.com.mx/PersonaService/GetAllUsers")
    @WebResult(name = "User", targetNamespace = "http:/walmart.com.mx/PersonaService/", partName = "parameters")
    public User getAllUsers();

}
