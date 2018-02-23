
package personaservice.api.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PersonaService", targetNamespace = "http:/walmart.com.mx/PersonaService/", wsdlLocation = "file:/C:/Users/vn0x53q/workspaceTesop/custodiassams/scu/personaservice-api/src/main/resources/PersonaService.wsdl")
public class PersonaService_Service
    extends Service
{

    private final static URL PERSONASERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(personaservice.api.ws.PersonaService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = personaservice.api.ws.PersonaService_Service.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/Users/vn0x53q/workspaceTesop/custodiassams/scu/personaservice-api/src/main/resources/PersonaService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Users/vn0x53q/workspaceTesop/custodiassams/scu/personaservice-api/src/main/resources/PersonaService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PERSONASERVICE_WSDL_LOCATION = url;
    }

    public PersonaService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonaService_Service() {
        super(PERSONASERVICE_WSDL_LOCATION, new QName("http:/walmart.com.mx/PersonaService/", "PersonaService"));
    }

    /**
     * 
     * @return
     *     returns PersonaService
     */
    @WebEndpoint(name = "PersonaServiceSOAP")
    public PersonaService getPersonaServiceSOAP() {
        return super.getPort(new QName("http:/walmart.com.mx/PersonaService/", "PersonaServiceSOAP"), PersonaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonaService
     */
    @WebEndpoint(name = "PersonaServiceSOAP")
    public PersonaService getPersonaServiceSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http:/walmart.com.mx/PersonaService/", "PersonaServiceSOAP"), PersonaService.class, features);
    }

}