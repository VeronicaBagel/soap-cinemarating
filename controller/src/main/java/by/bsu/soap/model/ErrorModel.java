package by.bsu.soap.model;



public class ErrorModel {
  public final String msg;

  public ErrorModel(Exception exception) {
    this.msg = exception.getLocalizedMessage();
  }
}
