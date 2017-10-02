package by.bsu.soap.service;


import by.bsu.soap.dto.MovieDto;
import by.bsu.soap.dto.RatingDto;
import by.bsu.soap.exception.ServiceException;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface MovieService {

  @WebMethod
  MovieDto retrieveMovie(long id) throws ServiceException;

  @WebMethod
  MovieDto[] retrieveAllMovies();

  @WebMethod
  void saveOrUpdateMovie(MovieDto dto);

  @WebMethod
  void deleteMovie(long id);

  @WebMethod
  void rateAMovie(RatingDto dto);

}
