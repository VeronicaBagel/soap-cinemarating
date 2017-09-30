package by.bsu.soap.service;


import by.bsu.soap.dao.UserDao;
import by.bsu.soap.dto.UserDto;
import by.bsu.soap.enity.User;
import by.bsu.soap.util.UserDtoUtil;
import java.util.ArrayList;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@WebService (endpointInterface = "by.bsu.soap.service.UserService")
public class UserServiceImpl implements UserService{

  private UserDao dao;

  @Autowired
  public UserServiceImpl(UserDao dao) {
    this.dao = dao;
  }

  public UserServiceImpl(){
  }


  @Override
  public ArrayList<UserDto> retrieveUsers() {
    ArrayList<User> users = dao.retrieveAllUsers();
    return UserDtoUtil.createUserDTOs(users);
  }

  @Override
  public UserDto retrieveUser(long id) {
    return null;
  }
}
