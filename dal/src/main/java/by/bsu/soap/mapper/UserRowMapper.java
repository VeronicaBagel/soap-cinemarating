package by.bsu.soap.mapper;


import by.bsu.soap.enity.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

  @Override
  public User mapRow(ResultSet rs, int rowNum) throws SQLException {
    User user = new User();
    user.setUserId(rs.getInt(1));
    user.setLogin(rs.getString(2));
    user.setPassword(rs.getString(3));
    user.setEmail(rs.getString(4));
    user.setFirstName(rs.getString(5));
    user.setLastName(rs.getString(6));
    return user;
  }
}
