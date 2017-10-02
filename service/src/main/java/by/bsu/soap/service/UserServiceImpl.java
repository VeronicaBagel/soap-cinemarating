package by.bsu.soap.service;


import by.bsu.soap.dao.UserDao;
import by.bsu.soap.dto.UserDto;
import by.bsu.soap.util.UserDtoUtil;
import by.bsu.soap.wrapper.UserDtoArray;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@WebService (endpointInterface = "by.bsu.soap.service.UserService",
    portName = "userServicePort",
    serviceName = "userService"
)
public class UserServiceImpl implements UserService{

  private UserDao dao;

  @Autowired
  public UserServiceImpl(UserDao dao){
    this.dao = dao;
  }

  public UserServiceImpl() {
  }

  @Override
  public UserDtoArray retrieveAllUsers() {
    return UserDtoUtil.createUserDTOs(dao.retrieveAllUsers());
  }

  @Override
  public UserDto retrieveUser(long id) {
    return UserDtoUtil.createUserDto(dao.retrieveUserById(id));
  }

  @Override
  public void saveOrUpdateUser(UserDto dto) {
    if (dto.getUserId() == 0) {
      dao.addUser(UserDtoUtil.createUserEntity(dto));
    } else{
      dao.updateUser(UserDtoUtil.createUserEntity(dto));
    }

  }

  @Override
  public void deleteUser(long id) {
    dao.deleteUser(id);
  }

  @Override
  public UserDto validateUser(String login, String password) {
    if(dao.validateUser(login, password) != null){
      return UserDtoUtil.createUserDto(dao.validateUser(login, password));
    }
    return null;
  }

}
