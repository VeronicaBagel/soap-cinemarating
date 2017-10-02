package by.bsu.soap.util;


import by.bsu.soap.dto.MovieDto;
import by.bsu.soap.dto.RatingDto;
import by.bsu.soap.enity.Movie;
import by.bsu.soap.enity.Rating;
import by.bsu.soap.wrapper.MovieDtoArray;
import java.util.List;

public class MovieDtoUtil {


  public static MovieDtoArray createMovieDTOs(List<Movie> movies){
    MovieDtoArray result = new MovieDtoArray();

    for(Movie movie : movies){
      result.getItem().add(createMovieDto(movie));
    }


    return result;
  }

  public static MovieDto createMovieDto (Movie movie){
    MovieDto dto = new MovieDto();

    dto.setMovieId(movie.getMovieId());
    dto.setTitle(movie.getTitle());
    dto.setRunningTime(movie.getRunningTime());
    dto.setBudget(movie.getBudget());

    return dto;
  }

  public static Movie createMovieEntity(MovieDto dto){
    Movie movie = new Movie();

    movie.setMovieId(dto.getMovieId());
    movie.setTitle(dto.getTitle());
    movie.setRunningTime(dto.getRunningTime());
    movie.setBudget(dto.getBudget());

    return movie;
  }

  public static Rating createRatingEntity(RatingDto dto){
    Rating rating = new Rating();

    rating.setUserId(dto.getUserId());
    rating.setMovieId(dto.getMovieId());
    rating.setRatingValue(Integer.parseInt(dto.getRatingValue()));

    return rating;
  }





}
