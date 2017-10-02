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



}
