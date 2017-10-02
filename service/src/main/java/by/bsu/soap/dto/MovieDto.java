package by.bsu.soap.dto;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for movieDto complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="movieDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="movieId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="runningTime" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="budget" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movieDto", propOrder = {
    "movieId",
    "title",
    "runningTime",
    "budget",
    "rating"
})
public class MovieDto {
  protected long movieId;
  protected String title;
  protected double runningTime;
  protected double budget;
  protected double rating;

  /**
   * Gets the value of the movie property.
   *
   */
  public long getMovieId() {
    return movieId;
  }

  /**
   * Sets the value of the movieId property.
   *
   */
  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }

  /**
   * Gets the value of the title property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   *
   * @param title
   *     allowed object is
   *     {@link String }
   *
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Gets the value of the runningTime property.
   *
   */
  public double getRunningTime() {
    return runningTime;
  }

  /**
   * Sets the value of the runningTime property.
   *
   */
  public void setRunningTime(double runningTime) {
    this.runningTime = runningTime;
  }

  /**
   * Gets the value of the budget property.
   *
   */
  public double getBudget() {
    return budget;
  }

  /**
   * Sets the value of the budget property.
   *
   */
  public void setBudget(double budget) {
    this.budget = budget;
  }

  /**
   * Gets the value of the rating property.
   *
   */
  public double getRating() {
    return rating;
  }

  /**
   * Sets the value of the rating property.
   *
   */
  public void setRating(double rating) {
    this.rating = rating;
  }
}
