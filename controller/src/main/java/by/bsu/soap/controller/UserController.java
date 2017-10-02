package by.bsu.soap.controller;

import by.bsu.soap.exception.ServiceException;
import by.bsu.soap.model.LoginModel;
import by.bsu.soap.model.UserModel;
import by.bsu.soap.service.UserService;
import by.bsu.soap.service.UserServiceClient;
import by.bsu.soap.util.UserModelUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

  private UserService service = new UserServiceClient().getUserServicePort();

  private static final String USER_ATTRIBUTE = "user";
  private static final String USERS_ATTRIBUTE = "users";

  @GetMapping (value = "/users")
  public String showAllUsers(Model model) {
    model.addAttribute(USERS_ATTRIBUTE, service.retrieveAllUsers().getItem());
    return "user/allUsers";
  }

  @GetMapping (value = "/users/{id}")
  public String showUser(@PathVariable("id") long userId, Model model) throws Exception {
    UserModel user = UserModelUtil.createUserModel(service.retrieveUser(userId));
    model.addAttribute(USER_ATTRIBUTE, user);
    return "user/user";
  }

  @GetMapping (value = "users/add")
  public String showAddUserForm(Model model){
    UserModel user = new UserModel();
    model.addAttribute("userAddForm", user);
    return "user/userAddForm";
  }

  @PostMapping (value = "/users")
  public String saveUser(@ModelAttribute("login") UserModel user, HttpServletRequest request){
    service.saveOrUpdateUser(UserModelUtil.createUserDto(user));
    request.getSession().setAttribute(USER_ATTRIBUTE, user);
    return "redirect:/cinemarating/main";
  }

  @PostMapping(value = "/users/{id}/delete")
  public String deleteUser(@PathVariable("id") long id) {
    service.deleteUser(id);
    return "redirect:/cinemarating/users";
  }

  @GetMapping(value = "/users/{id}/update")
  public String showUpdateUserForm(@PathVariable("id") long id, Model model)
      throws ServiceException {

    UserModel user = UserModelUtil.createUserModel(service.retrieveUser(id));
    model.addAttribute("userUpdateForm", user);

    return "user/userUpdateForm";

  }

  @PostMapping(value = "/loginProcess")
  public String loginProcess(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("login") LoginModel login) {
    UserModel user = UserModelUtil.createUserModel(service.validateUser(login.getUsername(),
        login.getPassword()));
    if (null != user) {
      request.getSession().setAttribute(USER_ATTRIBUTE, user);
      return "main";
    }
    return "user/login";
  }


  @GetMapping (value = "/login")
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("user/login");
    mav.addObject("login", new LoginModel());
    return mav;
  }


  @PostMapping(value = "/logout")
  public String logoutProcess(HttpServletRequest request, HttpServletResponse response) {
   request.getSession().removeAttribute(USER_ATTRIBUTE);
    return "main";
  }



}
