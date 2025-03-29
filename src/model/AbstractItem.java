package model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an abstract item in the game.
 * This class provides common attributes and methods for Items and Fixtures.
 */
public abstract class AbstractItem implements IItem {

  @JsonProperty("name")
  protected String name;
  @JsonProperty("description")
  protected String description;
  @JsonProperty("weight")
  protected int weight;
  @JsonProperty("picture")
  protected String picture;

  /**
   * Gets the name of the item.
   * @return the item's name.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the item.
   * The name is converted to uppercase when set.
   * @param name the name to assign to the item. If null, the name will be set to null.
   */
  protected void setName(String name) {
    this.name = (name != null) ? name.toUpperCase() : null;
  }

  /**
   * Gets the description of the item.
   * @return the item's description.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the weight of the item.
   * @return the item's weight.
   */
  public int getWeight() {
    return weight;
  }

  /**
   * Gets the picture associated with the item.
   * @return the picture URL or file path of the item.
   */
  public String getPicture() {
    return picture;
  }
}
