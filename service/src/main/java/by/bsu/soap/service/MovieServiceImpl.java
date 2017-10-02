package by.bsu.soap.service;


import by.bsu.soap.dao.MovieDao;
import by.bsu.soap.dto.MovieDto;
import by.bsu.soap.dto.RatingDto;
import by.bsu.soap.exception.ServiceException;
import by.bsu.soap.util.MovieDtoUtil;
import by.bsu.soap.wrapper.MovieDtoArray;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@WebService(endpointInterface = "by.bsu.soap.service.MovieService",
    portName = "movieServicePort",
    serviceName = "movieService"
)
public class MovieServiceImpl implements MovieService{
  @Autowired
  private MovieDao dao;

  public MovieServiceImpl(){
  }

  @Override
  public MovieDtoArray retrieveAllMovies() {
    return MovieDtoUtil.createMovieDTOs(dao.retrieveAllMovies());
  }

  @Override
  public MovieDto retrieveMovie(long id) throws ServiceException {
    MovieDto dto = MovieDtoUtil.createMovieDto(dao.retrieveMovieById(id));
    dto.setRating(dao.retrieveAverageRating(id));
    return dto;
  }


  @Override
  public void saveOrUpdateMovie(MovieDto dto) {
    if (dto.getMovieId() == 0) {
      dao.addMovie(MovieDtoUtil.createMovieEntity(dto));
    } else{
      dao.updateMovie(MovieDtoUtil.createMovieEntity(dto));
    }
  }

  @Override
  public void deleteMovie(long id) {
    dao.deleteMovie(id);
  }

  @Override
  public void rateAMovie(RatingDto dto) {
    dao.rateAMovie(MovieDtoUtil.createRatingEntity(dto));
  }
}
