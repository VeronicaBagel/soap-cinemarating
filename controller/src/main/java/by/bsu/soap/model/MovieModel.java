package by.bsu.soap.model;



public class MovieModel {

  private long movieId;
  private String title;
  private double runningTime;
  private double budget;
  private double rating;

  public MovieModel() {
  }

  public MovieModel(String title, double runningTime, double budget, double rating) {
    this.title = title;
    this.runningTime = runningTime;
    this.budget = budget;
    this.rating = rating;
  }

  public MovieModel(long movieId, String title, double runningTime,
      double budget, double rating) {
    this.movieId = movieId;
    this.title = title;
    this.runningTime = runningTime;
    this.budget = budget;
    this.rating = rating;
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

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }
}
