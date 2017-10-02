
package by.bsu.soap.service;

import by.bsu.soap.dto.UserDto;
import by.bsu.soap.exception.ServiceException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface UserService {
  @WebMethod
  UserDto retrieveUser(long id) throws ServiceException ;

  @WebMethod
  UserDto[] retrieveAllUsers();

  @WebMethod
  void addUser(UserDto dto);

  @WebMethod
  void deleteUser(long id);

  @WebMethod
  void updateUser(long id);

}
