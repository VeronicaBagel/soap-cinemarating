package by.bsu.soap.service;


import by.bsu.soap.dao.DaoException;
import by.bsu.soap.dao.UserDao;
import by.bsu.soap.dto.UserDto;
import by.bsu.soap.enity.User;
import by.bsu.soap.exception.ServiceException;
import by.bsu.soap.util.UserDtoUtil;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@WebService (endpointInterface = "by.bsu.soap.service.UserService",
    portName = "userServicePort",
    serviceName = "userService"
)
public class UserServiceImpl implements UserService{

  @Autowired
  private UserDao dao;

  public UserServiceImpl(){
  }

  @Override
  public UserDto[] retrieveAllUsers() {
    return UserDtoUtil.createUserDTOs(dao.retrieveAllUsers());
  }

  @Override
  public UserDto retrieveUser(long id) throws ServiceException {
    try {
      return UserDtoUtil.createUserDto(dao.retrieveUserById(id));
    } catch (DaoException e) {
      throw new ServiceException("Can't find user with such id", e);
    }
  }

  @Override
  public void addUser(UserDto dto) {
    dao.addUser(UserDtoUtil.createUserEntity(dto));
  }

  @Override
  public void updateUser(long id) {
    dao.deleteUser(id);
  }

  @Override
  public void deleteUser(long id) {
    dao.deleteUser(id);
  }

}
