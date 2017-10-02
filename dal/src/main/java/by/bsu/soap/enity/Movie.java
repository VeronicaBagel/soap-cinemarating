package by.bsu.soap.enity;


import java.io.Serializable;

public class Movie implements Serializable {
  private long movieId;
  private String title;
  private double runningTime;
  private double budget;

  public Movie() {
  }

  public Movie(String title, double runningTime, double budget) {
    this.title = title;
    this.runningTime = runningTime;
    this.budget = budget;
  }

  public Movie(long movieId, String title, double runningTime,
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
