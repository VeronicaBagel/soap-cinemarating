package by.bsu.soap.controller;

import by.bsu.soap.dao.UserDao;
import by.bsu.soap.dto.UserDto;
import by.bsu.soap.exception.ServiceException;
import by.bsu.soap.service.UserService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

  private UserService service;

  @Autowired
  public UserController(UserService service) {
    this.service = service;
  }

  private static final String USER_ATTRIBUTE = "user";
  private static final String USERS_ATTRIBUTE = "users";
  private static final String USER_ADDING_FORM_ATTRIBUTE = "userAddingForm";

  @GetMapping (value = "/users")
  public String showAllUsers(Model model) {
    model.addAttribute(USERS_ATTRIBUTE, service.retrieveAllUsers());
    return "allUsers";
  }

  @GetMapping (value = "/users/{id}")
  public String showUser(@PathVariable("id") long userId, Model model) throws Exception {
    //UserService service = new UserServiceClient().getUserServicePort();
    UserDto dto = service.retrieveUser(userId);
    model.addAttribute(USER_ATTRIBUTE, dto);
    return "user";
  }

  @GetMapping (value = "users/add")
  public String showAddUserForm(Model model){
    UserDto dto = new UserDto();
    model.addAttribute("userAddingForm", dto);
    return "userAddingForm";
  }

  @PostMapping (value = "/users")
  public String saveUser(@ModelAttribute("login") UserDto user){
    service.addUser(user);
    return "redirect:/cinemarating/users/";
  }

  @PostMapping(value = "/users/{id}/delete")
  public String deleteUser(@PathVariable("id") long id) {
    service.deleteUser(id);
    return "redirect:/cinemarating/users";
  }

  // show update form
  @GetMapping(value = "/users/{id}/update")
  public String showUpdateUserForm(@PathVariable("id") long id, Model model)
      throws ServiceException {

    UserDto user = service.retrieveUser(id);
    model.addAttribute("userUpdatingForm", user);

    populateDefaultModel(model);

    return "users/userform";

  }



}
