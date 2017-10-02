
package by.bsu.soap.service;

import by.bsu.soap.dto.UserDto;
import by.bsu.soap.exception.ServiceFault;
import by.bsu.soap.wrapper.UserDtoArray;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the by.bsu.soap.service package. 
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

    private final static QName _ServiceException_QNAME = new QName("http://service.soap.bsu.by/", "ServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: by.bsu.soap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceFault }
     * 
     */
    public ServiceFault createServiceFault() {
        return new ServiceFault();
    }

    /**
     * Create an instance of {@link UserDtoArray }
     * 
     */
    public UserDtoArray createUserDtoArray() {
        return new UserDtoArray();
    }

    /**
     * Create an instance of {@link UserDto }
     * 
     */
    public UserDto createUserDto() {
        return new UserDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.bsu.by/", name = "ServiceException")
    public JAXBElement<ServiceFault> createServiceException(ServiceFault value) {
        return new JAXBElement<ServiceFault>(_ServiceException_QNAME, ServiceFault.class, null, value);
    }

}
