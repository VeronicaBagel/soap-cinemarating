package by.bsu.soap.util;


import by.bsu.soap.dto.UserDto;
import by.bsu.soap.enity.User;
import java.util.ArrayList;
import java.util.List;

public class UserDtoUtil {

  public static UserDto[] createUserDTOs(List<User> users){
    List<UserDto> dtos = new ArrayList<>();

    for(User user: users){
      dtos.add(createUserDto(user));
    }

    UserDto[] result = new UserDto[dtos.size()];
    return dtos.toArray(result);
  }

  public static UserDto createUserDto (User user){
    UserDto dto = new UserDto();

    dto.setUserId(user.getUserId());
    dto.setLogin(user.getLogin());
    dto.setPassword(user.getPassword());
    dto.setEmail(user.getEmail());
    dto.setFirstName(user.getFirstName());
    dto.setLastName(user.getLastName());

    return dto;
  }

  /*public static List<User> createUserEntities(List<UserDto> dtos){
    List<User> users = new ArrayList<>();

    for(UserDto dto: dtos){
      users.add(createUserEntity(dto));
    }

    return users;
  }*/

  public static User createUserEntity(UserDto dto){
    User user = new User();

    user.setUserId(dto.getUserId());
    user.setLogin(dto.getLogin());
    user.setPassword(dto.getPassword());
    user.setEmail(dto.getEmail());
    user.setFirstName(dto.getFirstName());
    user.setLastName(dto.getLastName());

    return user;
  }
}
