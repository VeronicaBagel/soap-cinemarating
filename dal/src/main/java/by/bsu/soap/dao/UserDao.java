package by.bsu.soap.dao;


import by.bsu.soap.enity.User;
import java.util.List;

public interface UserDao {
  List<User> retrieveAllUsers();
  User retrieveUserById(long id) throws DaoException;
  void addUser(User user);
  void updateUser(User user);
  void deleteUser(long id);
}
