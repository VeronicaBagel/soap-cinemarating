package by.bsu.soap.service;


import by.bsu.soap.dto.MovieDto;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface MovieService {

  @WebMethod
  ArrayList<MovieDto> retrieveMovies();

  @WebMethod
  MovieDto retrieveMovie(long id);


}