package by.bsu.soap.dao;


import by.bsu.soap.enity.User;
import by.bsu.soap.mapper.UserRowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

  private JdbcTemplate template;

  @Autowired
  public UserDaoImpl(JdbcTemplate template) {
    this.template = template;
  }

  private static final String SQL_SHOW_USERS = "SELECT user_id, user_login, user_password, "
      + "user_email, user_first_name, user_last_name FROM USERS";
  private static final String SQL_SHOW_USER = "SELECT user_id, user_login, user_password, user_email, "
      + " user_first_name, user_last_name FROM USERS WHERE user_id = ?";
  private static final String SQL_ADD_USER = "INSERT INTO USERS (user_login, user_password, user_email,"
      + " user_first_name, user_last_name) values (?,?,?,?,?)";
  private static final String SQL_UPDATE_USER = "UPDATE USERS set user_login = ?, user_password = ?, user_email = ?, "
      + "user_first_name = ?, user_last_name=  ? where user_id = ?";
  private static final String SQL_DELETE_USER = "DELETE FROM USERS WHERE USER_ID = ?";

  private static final String SQL_VALIDATE_USER = "SELECT user_id, user_login, user_password, "
      + "user_email, user_first_name, user_last_name FROM USERS WHERE user_login = ? AND user_password = ?";

  @Override
  public List<User> retrieveAllUsers(){
    return template.query(SQL_SHOW_USERS, new UserRowMapper());
  }

  @Override
  public User retrieveUserById (long id) {
    User user =  template.queryForObject(SQL_SHOW_USER, new Object[]{id}, new UserRowMapper());
    return user;
  }

  @Override
  public void addUser(User user) {
    Object[] args = new Object[] {user.getLogin(), user.getPassword(),
        user.getEmail(), user.getFirstName(), user.getLastName()};
    template.update(SQL_ADD_USER, args);
  }

  @Override
  public void updateUser(User user) {
    Object[] args = new Object[] {user.getLogin(), user.getPassword(),
        user.getEmail(), user.getFirstName(), user.getLastName(), user.getUserId()};
    template.update(SQL_UPDATE_USER, args);
  }

  @Override
  public void deleteUser(long id) {
    template.update(SQL_DELETE_USER, new Object[]{id});
  }

  @Override
  public User validateUser(String login, String password) {
    Object[] args = new Object[] {login, password};
    List<User> users = template.query(SQL_VALIDATE_USER, args, new UserRowMapper());
    return users.size() > 0 ? users.get(0) : null;
  }
}
