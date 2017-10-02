
package by.bsu.soap.service;

import by.bsu.soap.dto.UserDto;
import by.bsu.soap.exception.ServiceException;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.RPC)
public interface UserService {
  @WebMethod
  UserDto retrieveUser(long id) throws ServiceException ;

  @WebMethod
  UserDto[] retrieveAllUsers();

  @WebMethod
  void saveOrUpdateUser(UserDto dto);

  @WebMethod
  void deleteUser(long id);

  @WebMethod
  UserDto validateUser(String login, String password);

}
