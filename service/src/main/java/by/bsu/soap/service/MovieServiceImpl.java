package by.bsu.soap.service;


import by.bsu.soap.dto.MovieDto;
import by.bsu.soap.enity.Movie;
import java.util.ArrayList;
import javax.jws.WebService;

@WebService(endpointInterface = "by.bsu.soap.service.MovieService")
public class MovieServiceImpl implements MovieService {

  @Override
  public ArrayList<MovieDto> retrieveMovies() {
    return null;
  }

  @Override
  public MovieDto retrieveMovie(long id) {
    return null;
  }
}
