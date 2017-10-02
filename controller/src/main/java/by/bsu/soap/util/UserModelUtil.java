package by.bsu.soap.util;

import by.bsu.soap.dto.UserDto;
import by.bsu.soap.model.UserModel;

public class UserModelUtil {

  public static UserModel createUserModel(UserDto dto){
    UserModel user = new UserModel();

    user.setUserId(dto.getUserId());
    user.setLogin(dto.getLogin());
    user.setPassword(dto.getPassword());
    user.setEmail(dto.getEmail());
    user.setFirstName(dto.getFirstName());
    user.setLastName(dto.getLastName());

    return user;
  }

  public static UserDto createUserDto(UserModel model){
    UserDto user = new UserDto();

    user.setUserId(model.getUserId());
    user.setLogin(model.getLogin());
    user.setPassword(model.getPassword());
    user.setEmail(model.getEmail());
    user.setFirstName(model.getFirstName());
    user.setLastName(model.getLastName());

    return user;
  }

}
