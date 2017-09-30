package by.bsu.soap.enity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User implements Serializable {
  private long userId;
  private String login;
  private String password;
  private String email;
  private String firstName;
  private String lastName;

  public User() {
  }

  public User(String login, String password, String email, String firstName,
      String lastName) {
    this.login = login;
    this.password = password;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public User(long userId, String login, String password, String email, String firstName,
      String lastName) {
    this.userId = userId;
    this.login = login;
    this.password = password;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  @Column (name = "USER_ID")
  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  @Column (name = "USER_LOGIN")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  @Column (name = "USER_PASSWORD")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Column (name = "USER_EMAIL")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column (name = "USER_FIRST_NAME")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Column (name = "USER_LAST_NAME")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    User user = (User) o;

    if (userId != user.userId) {
      return false;
    }
    if (!login.equals(user.login)) {
      return false;
    }
    if (!password.equals(user.password)) {
      return false;
    }
    if (!email.equals(user.email)) {
      return false;
    }
    if (!firstName.equals(user.firstName)) {
      return false;
    }
    return lastName.equals(user.lastName);

  }

  @Override
  public int hashCode() {
    int result = (int) (userId ^ (userId >>> 32));
    result = 31 * result + login.hashCode();
    result = 31 * result + password.hashCode();
    result = 31 * result + email.hashCode();
    result = 31 * result + firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "User{" +
        "userId=" + userId +
        ", login='" + login + '\'' +
        ", password='" + password + '\'' +
        ", email='" + email + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}
