
package by.bsu.soap.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

public class UserDto {

    private String email;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private long userId;


    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return lastName;
    }


    public void setLastName(String value) {
        this.lastName = value;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String value) {
        this.login = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the userId property.
     *
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     *
     */
    public void setUserId(long value) {
        this.userId = value;
    }

}
