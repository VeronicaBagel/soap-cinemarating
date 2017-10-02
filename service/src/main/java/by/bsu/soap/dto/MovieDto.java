package by.bsu.soap.dto;


import java.time.LocalDate;

public class MovieDto {
  private long movieId;
  private String title;
  private double runningTime;
  private double budget;

  public MovieDto() {
  }

  public MovieDto(String title, LocalDate releaseDate, double runningTime, double budget) {
    this.title = title;
    this.runningTime = runningTime;
    this.budget = budget;
  }

  public MovieDto(long movieId, String title, LocalDate releaseDate, double runningTime,
      double budget) {
    this.movieId = movieId;
    this.title = title;
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
