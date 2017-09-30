package by.bsu.soap.dao;


import by.bsu.soap.enity.User;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

  private final SessionFactory sessionFactory;

  @Autowired
  public UserDaoImpl(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @Override
  public ArrayList<User> retrieveAllUsers() {
    Session session = sessionFactory.openSession();
    ArrayList<User> allUsers = (ArrayList<User>) session.createCriteria(User.class).list();
    session.close();
    return allUsers;
  }
}
