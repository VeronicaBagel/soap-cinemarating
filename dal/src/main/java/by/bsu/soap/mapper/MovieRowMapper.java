package by.bsu.soap.mapper;


import by.bsu.soap.enity.Movie;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class MovieRowMapper implements RowMapper<Movie> {

  @Override
  public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
    Movie movie = new Movie();
    movie.setMovieId(rs.getInt(1));
    movie.setTitle(rs.getString(2));
    movie.setReleaseDate(rs.getDate(3).toLocalDate());
    movie.setRunningTime(rs.getDouble(4));
    movie.setBudget(rs.getDouble(5));
    return movie;
  }
}
