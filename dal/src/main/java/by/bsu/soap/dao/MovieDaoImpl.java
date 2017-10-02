package by.bsu.soap.dao;


import by.bsu.soap.enity.Movie;
import by.bsu.soap.mapper.MovieRowMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDaoImpl implements MovieDao{

  private JdbcTemplate template;

  @Autowired
  public void UserDaoImpl(JdbcTemplate template) {
    this.template = template;
  }

  private static final String SQL_SHOW_MOVIES = "SELECT movie_id, movie_title, movie_release_date, "
      + "movie_running_time, movie_budget FROM MOVIES";
  private static final String SQL_SHOW_MOVIE = "SELECT movie_id, movie_title, movie_release_date, "
      + "movie_running_time, movie_budget FROM MOVIES WHERE user_id = ?";
  private static final String SQL_ADD_MOVIE = "INSERT INTO MOVIES (movie_title, movie_release_date,"
      + " movie_running_time, movie_budget) values (?,?,?,?)";
  private static final String SQL_UPDATE_MOVIE = "UPDATE MOVIES set movie_title = ?, movie_release_date = ?, "
      + "movie_running_time = ?, movie_budget = ? where movie_id = ?";
  private static final String SQL_DELETE_MOVIE = "DELETE FROM MOVIES WHERE MOVIE_ID = ?";

  @Override
  public List<Movie> retrieveAllMovies(){
    return template.query(SQL_SHOW_MOVIES, new MovieRowMapper());
  }

  @Override
  public Movie retrieveMovieById(long id) throws DaoException {
    Movie movie = (Movie) template.queryForObject(SQL_SHOW_MOVIE, new Object[]{id},
        new MovieRowMapper());
    return movie;
  }

  @Override
  public void addMovie(Movie movie) {
    Object[] args = new Object[] {movie.getTitle(),movie.getReleaseDate(),
        movie.getRunningTime(), movie.getBudget()};
    template.update(SQL_ADD_MOVIE, args);
  }

  @Override
  public void updateMovie(Movie movie) {
    Object[] args = new Object[] {movie.getTitle(),movie.getReleaseDate(),
        movie.getRunningTime(), movie.getBudget(), movie.getMovieId()};
    template.update(SQL_UPDATE_MOVIE, args);
  }

  @Override
  public void deleteMovie(long id) {
    template.update(SQL_DELETE_MOVIE, new Object[]{id});
  }
}
