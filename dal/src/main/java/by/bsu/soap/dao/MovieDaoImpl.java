package by.bsu.soap.dao;


import by.bsu.soap.enity.Movie;
import by.bsu.soap.enity.Rating;
import by.bsu.soap.mapper.MovieRowMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl implements MovieDao{

  private JdbcTemplate template;

  @Autowired
  public void UserDaoImpl(JdbcTemplate template) {
    this.template = template;
  }

  private static final String SQL_SHOW_MOVIES = "SELECT movie_id, movie_title,"
      + "movie_running_time, movie_budget FROM MOVIES";
  private static final String SQL_SHOW_MOVIE = "SELECT movie_id, movie_title, "
      + "movie_running_time, movie_budget FROM MOVIES WHERE movie_id = ?";
  private static final String SQL_ADD_MOVIE = "INSERT INTO MOVIES (movie_title, "
      + " movie_running_time, movie_budget) values (?,?,?)";
  private static final String SQL_UPDATE_MOVIE = "UPDATE MOVIES set movie_title = ?, "
      + "movie_running_time = ?, movie_budget = ? where movie_id = ?";
  private static final String SQL_DELETE_MOVIE = "DELETE FROM MOVIES WHERE movie_id = ?";

  private static final String SQL_RATE_A_MOVIE = "INSERT INTO RATINGS (user_id, movie_id, rating_value) "
      + "VALUES (?,?,?) ";
  private static final String SQL_GET_RATING = "SELECT AVG(RATING_VALUE) FROM RATINGS WHERE MOVIE_ID = ?";

  @Override
  public List<Movie> retrieveAllMovies(){
    return template.query(SQL_SHOW_MOVIES, new MovieRowMapper());
  }

  @Override
  public Movie retrieveMovieById(long id) {
    Movie movie = template.queryForObject(SQL_SHOW_MOVIE, new Object[]{id},
        new MovieRowMapper());
    return movie;
  }

  @Override
  public void addMovie(Movie movie) {
    Object[] args = new Object[] {movie.getTitle(), movie.getRunningTime(), movie.getBudget()};
    template.update(SQL_ADD_MOVIE, args);
  }

  @Override
  public void updateMovie(Movie movie) {
    Object[] args = new Object[] {movie.getTitle(), movie.getRunningTime(), movie.getBudget(), movie.getMovieId()};
    template.update(SQL_UPDATE_MOVIE, args);
  }

  @Override
  public void deleteMovie(long id) {
    template.update(SQL_DELETE_MOVIE, new Object[]{id});
  }

  @Override
  public void rateAMovie(Rating rating) {
    Object[] args = new Object[] {rating.getUserId(), rating.getMovieId(), rating.getRatingValue()};
    template.update(SQL_RATE_A_MOVIE, args);
  }

  @Override
  public double retrieveAverageRating(long movieId) {
    return template.queryForObject(SQL_GET_RATING, new Object[]{movieId}, Double.class);
  }
}
