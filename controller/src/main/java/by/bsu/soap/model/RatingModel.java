package by.bsu.soap.model;


public class RatingModel {

  private long ratingId;
  private long userId;
  private long movieId;
  private String ratingValue;

  public long getRatingId() {
    return ratingId;
  }

  public void setRatingId(long ratingId) {
    this.ratingId = ratingId;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }

  public String getRatingValue() {
    return ratingValue;
  }

  public void setRatingValue(String ratingValue) {
    this.ratingValue = ratingValue;
  }
}
