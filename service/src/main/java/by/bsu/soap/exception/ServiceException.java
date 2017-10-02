package by.bsu.soap.exception;

import javax.xml.ws.WebFault;

@WebFault
public class ServiceException extends Exception {

  private ServiceFault fault;

  public ServiceException() {
  }

  public ServiceException(String message) {
    super(message);
  }

  public ServiceException(String message, Throwable cause) {
    super(message, cause);
  }

  public ServiceException(Throwable cause) {
    super(cause);
  }

  public ServiceException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public ServiceFault getFaultInfo(){
    return fault;
  }


}
