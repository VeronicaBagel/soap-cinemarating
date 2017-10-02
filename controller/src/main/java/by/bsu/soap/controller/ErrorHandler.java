package by.bsu.soap.controller;

import by.bsu.soap.model.ErrorModel;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorHandler {

  @ExceptionHandler(Exception.class)
  public String handleEmptyData(Exception ex) {
    ModelAndView model = new ModelAndView();
    model.addObject("exception", new ErrorModel(ex));
    return "error";

  }

}
