package by.bsu.soap.util;


import by.bsu.soap.dto.MovieDto;
import by.bsu.soap.enity.Movie;

public class MovieDtoUtil {



  public static MovieDto createMovieDto (Movie movie){
    MovieDto dto = new MovieDto();

    dto.setMovieId(movie.getMovieId());
    dto.setTitle(movie.getTitle());
    dto.setReleaseDate(movie.getReleaseDate());
    dto.setRunningTime(movie.getRunningTime());
    dto.setBudget(movie.getBudget());

    return dto;
  }



}
