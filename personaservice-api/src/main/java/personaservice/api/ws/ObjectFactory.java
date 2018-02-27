
package personaservice.api.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the personaservice.api.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _User_QNAME = new QName("http:/walmart.com.mx/user/", "User");
    private final static QName _LoginParams_QNAME = new QName("http:/walmart.com.mx/user/", "LoginParams");
    private final static QName _Users_QNAME = new QName("http:/walmart.com.mx/user/", "Users");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: personaservice.api.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserList }
     * 
     */
    public UserList createUserList() {
        return new UserList();
    }

    /**
     * Create an instance of {@link LoginParams }
     * 
     */
    public LoginParams createLoginParams() {
        return new LoginParams();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/walmart.com.mx/user/", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/walmart.com.mx/user/", name = "LoginParams")
    public JAXBElement<LoginParams> createLoginParams(LoginParams value) {
        return new JAXBElement<LoginParams>(_LoginParams_QNAME, LoginParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/walmart.com.mx/user/", name = "Users")
    public JAXBElement<UserList> createUsers(UserList value) {
        return new JAXBElement<UserList>(_Users_QNAME, UserList.class, null, value);
    }

}
