
package by.bsu.soap.service;

import by.bsu.soap.dto.UserDto;
import by.bsu.soap.exception.ServiceException;
import by.bsu.soap.wrapper.UserDtoArray;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://service.soap.bsu.by/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @return
     *     returns by.bsu.soap.wrapper.UserDtoArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public UserDtoArray retrieveAllUsers();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    public void saveOrUpdateUser(
        @WebParam(name = "arg0", partName = "arg0")
            UserDto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns by.bsu.soap.dto.UserDto
     * @throws ServiceException
     */
    @WebMethod
    @WebResult(partName = "return")
    public UserDto retrieveUser(
        @WebParam(name = "arg0", partName = "arg0")
        long arg0)
        throws ServiceException
    ;

    /**
     * 
     * @param arg0
     */
    @WebMethod
    public void deleteUser(
        @WebParam(name = "arg0", partName = "arg0")
        long arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns by.bsu.soap.dto.UserDto
     */
    @WebMethod
    @WebResult(partName = "return")
    public UserDto validateUser(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

}
