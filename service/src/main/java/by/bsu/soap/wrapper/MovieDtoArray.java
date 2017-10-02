package by.bsu.soap.wrapper;


import by.bsu.soap.dto.MovieDto;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for movieDtoArray complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="movieDtoArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://service.soap.bsu.by/}movieDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userDtoArray", propOrder = {
    "item"
})
public class MovieDtoArray {

  @XmlElement(nillable = true)
  protected List<MovieDto> item;

  /**
   * Gets the value of the item property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the item property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getItem().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link MovieDto }
   *
   *
   */
  public List<MovieDto> getItem() {
    if (item == null) {
      item = new ArrayList<MovieDto>();
    }
    return this.item;
  }

}
