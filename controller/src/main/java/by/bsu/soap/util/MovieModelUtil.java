package by.bsu.soap.util;


import by.bsu.soap.dto.MovieDto;
import by.bsu.soap.dto.RatingDto;
import by.bsu.soap.model.MovieModel;
import by.bsu.soap.model.RatingModel;

public class MovieModelUtil {

  public static MovieModel createMovieModel(MovieDto dto){
    MovieModel movie = new MovieModel();

    movie.setMovieId(dto.getMovieId());
    movie.setTitle(dto.getTitle());
    movie.setRunningTime(dto.getRunningTime());
    movie.setBudget(dto.getBudget());
    movie.setRating(dto.getRating());

    return movie;
  }

  public static MovieDto createMovieDto(MovieModel model){
    MovieDto movie = new MovieDto();

    movie.setMovieId(model.getMovieId());
    movie.setTitle(model.getTitle());
    movie.setRunningTime(model.getRunningTime());
    movie.setBudget(model.getBudget());
    movie.setRating(model.getRating());

    return movie;
  }

  public static RatingDto createRatingDto(RatingModel model){
    RatingDto rating = new RatingDto();

    rating.setUserId(model.getUserId());
    rating.setMovieId(model.getMovieId());
    rating.setRatingValue(model.getRatingValue());

    return rating;
  }



}
