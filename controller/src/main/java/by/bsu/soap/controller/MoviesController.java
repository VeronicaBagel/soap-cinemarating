package by.bsu.soap.controller;


import by.bsu.soap.dto.MovieDto;
import by.bsu.soap.dto.UserDto;
import by.bsu.soap.exception.ServiceException;
import by.bsu.soap.service.MovieService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MoviesController {

  private MovieService service;

  @Autowired
  public MoviesController(MovieService service) {
    this.service = service;
  }

  private static final String MOVIE_ATTRIBUTE = "movie";
  private static final String MOVIES_ATTRIBUTE = "movies";

  @GetMapping(value = "/movies")
  public String showAllUsers(Model model) {
    model.addAttribute(MOVIES_ATTRIBUTE, service.retrieveAllMovies());
    return "movie/allMovies";
  }

  @GetMapping (value = "/movies/{id}")
  public String showUser(@PathVariable("id") long movieId, Model model) throws Exception {
    MovieDto dto = service.retrieveMovie(movieId);
    model.addAttribute(MOVIE_ATTRIBUTE, dto);
    return "movie/movie";
  }

  @GetMapping (value = "movies/add")
  public String showMovieForm(Model model){
    MovieDto dto = new MovieDto();
    model.addAttribute("movieForm", dto);
    return "movie/movieForm";
  }

  @PostMapping(value = "/movies")
  public String saveMovie(@ModelAttribute("login") MovieDto movie, HttpServletRequest request){
    service.saveOrUpdateMovie(movie);
    request.getSession().setAttribute(MOVIE_ATTRIBUTE, movie);
    return "redirect:/cinemarating/main";
  }

  @GetMapping(value = "/movies/{id}/update")
  public String showUpdateMovieForm(@PathVariable("id") long id, Model model)
      throws ServiceException {

    MovieDto movie = service.retrieveMovie(id);
    model.addAttribute("movieForm", movie);

    return "movie/movieForm";

  }

  @PostMapping(value = "/movies/{id}/delete")
  public String deleteMovie(@PathVariable("id") long id) {
    service.deleteMovie(id);
    return "redirect:/cinemarating/movies";
  }



}
