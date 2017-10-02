package by.bsu.soap.enity;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class Movie implements Serializable {
  private long movieId;
  private String title;
  private LocalDate releaseDate;
  private double runningTime;
  private double budget;

  public Movie() {
  }

  public Movie(String title, LocalDate releaseDate, double runningTime, double budget) {
    this.title = title;
    this.releaseDate = releaseDate;
    this.runningTime = runningTime;
    this.budget = budget;
  }

  public Movie(long movieId, String title, LocalDate releaseDate, double runningTime,
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
