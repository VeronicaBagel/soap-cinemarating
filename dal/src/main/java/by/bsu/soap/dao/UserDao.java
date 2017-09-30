package by.bsu.soap.dao;


import by.bsu.soap.enity.User;
import java.util.ArrayList;

public interface UserDao {
  ArrayList<User> retrieveAllUsers();
}
