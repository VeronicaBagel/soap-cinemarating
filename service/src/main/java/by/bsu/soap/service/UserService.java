
package by.bsu.soap.service;

import by.bsu.soap.dto.UserDto;
import by.bsu.soap.enity.User;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService(name = "UserService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserService {

    @WebMethod
    public ArrayList<UserDto> retrieveUsers();


    @WebMethod
    public UserDto retrieveUser (long id);

}
