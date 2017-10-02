package by.bsu.soap.dao;


import by.bsu.soap.enity.Movie;
import by.bsu.soap.enity.Rating;
import java.util.List;

public interface MovieDao {
  List<Movie> retrieveAllMovies();
  Movie retrieveMovieById(long id);
  void addMovie(Movie movie);
  void updateMovie(Movie movie);
  void deleteMovie(long id);

  void rateAMovie(Rating rating);
  double retrieveAverageRating(long movieId);

}
