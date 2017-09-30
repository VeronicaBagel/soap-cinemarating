package by.bsu.soap.dto;


import by.bsu.soap.adapter.LocalDateAdapter;
import java.time.LocalDate;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class MovieDto {
  private long movieId;
  private String title;
  private LocalDate releaseDate;
  private double runningTime;
  private double budget;

  public MovieDto() {
  }

  public MovieDto(String title, LocalDate releaseDate, double runningTime, double budget) {
    this.title = title;
    this.releaseDate = releaseDate;
    this.runningTime = runningTime;
    this.budget = budget;
  }

  public MovieDto(long movieId, String title, LocalDate releaseDate, double runningTime,
      double budget) {
    this.movieId = movieId;
    this.title = title;
    this.releaseDate = releaseDate;
    this.runningTime = runningTime;
    this.budget = budget;
  }

  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @XmlJavaTypeAdapter(LocalDateAdapter.class)
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public double getRunningTime() {
    return runningTime;
  }

  public void setRunningTime(double runningTime) {
    this.runningTime = runningTime;
  }

  public double getBudget() {
    return budget;
  }

  public void setBudget(double budget) {
    this.budget = budget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    MovieDto movie = (MovieDto) o;

    if (movieId != movie.movieId) {
      return false;
    }
    if (Double.compare(movie.runningTime, runningTime) != 0) {
      return false;
    }
    if (Double.compare(movie.budget, budget) != 0) {
      return false;
    }
    if (!title.equals(movie.title)) {
      return false;
    }
    return releaseDate.equals(movie.releaseDate);

  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = (int) (movieId ^ (movieId >>> 32));
    result = 31 * result + title.hashCode();
    result = 31 * result + releaseDate.hashCode();
    temp = Double.doubleToLongBits(runningTime);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(budget);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "Movie{" +
        "movieId=" + movieId +
        ", title='" + title + '\'' +
        ", releaseDate=" + releaseDate +
        ", runningTime=" + runningTime +
        ", budget=" + budget +
        '}';
  }

}
