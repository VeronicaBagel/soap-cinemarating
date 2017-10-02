package by.bsu.soap.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ratingDto complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ratingDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="movieId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ratingValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ratingDto", propOrder = {
    "userId",
    "movieId",
    "ratingValue"
})
public class RatingDto {

  protected long userId;
  protected long movieId;
  protected String ratingValue;

  /**
   * Gets the value of the userId property.
   *
   */
  public long getUserId() {
    return userId;
  }

  /**
   * Sets the value of the userId property.
   *
   */
  public void setUserId(long userId) {
    this.userId = userId;
  }

  /**
   * Gets the value of the movieId property.
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
   * Gets the value of the ratingValue property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getRatingValue() {
    return ratingValue;
  }


  /**
   * Sets the value of the ratingValue property.
   *
   * @param ratingValue
   *     allowed object is
   *     {@link String }
   *
   */
  public void setRatingValue(String ratingValue) {
    this.ratingValue = ratingValue;
  }
}
