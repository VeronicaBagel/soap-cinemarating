package by.bsu.soap.dao;


import by.bsu.soap.enity.User;

public class DaoUtil {

  protected static boolean isNotAnExistingUser(User user) {
    return user == null;
  }


}
