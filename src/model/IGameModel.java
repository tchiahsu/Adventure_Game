package model;

import java.io.IOException;
import java.util.List;

/**
 * Defines the interactions and functionalities for the game model.
 */
public interface IGameModel {

  /**
   * Moves the player in the specified direction.
   * @param direction the direction to move.
   * @return String describing the result of the move
   */
  String move(String direction);

  /**
   * Checks and returns the player's inventory.
   * @return a list of items currently in the player's inventory.
   */
  String checkInventory();

  /**
   * Provides a description of the current room and surroundings.
   * @return a message detailing what the player sees.
   */
  String look();

  /**
   * Uses a specified item.
   * @param itemName the name of the item to use.
   * @return The sequence of events from using an item.
   */
  String useItem(String itemName);

  /**
   * Takes an item and adds it to the player's inventory.
   * @param itemName the name of the item to take.
   * @return The sequence of events from taking an item from a room.
   */
  String takeItem(String itemName);

  /**
   * Drops an item from the player's inventory.
   * @param itemName the name of the item to drop.
   * @return The sequence of events from dropping an item.
   */
  String dropItem(String itemName);

  /**
   * Examines an object for more details.
   * @param object the name of the object to examine.
   * @return The sequence of events from dropping an item.
   */
  String examine(String object);

  /**
   * Solves a puzzle with an answer.
   * @param answer the player's answer.
   * @return The sequence of events from solving a puzzle.
   */
  String answer(String answer);

  /**
   * Saves the current game state.
   * @return a message confirming the game has been saved.
   * @throws IOException if an error occurs during saving.
   */
  String saveGame() throws IOException;

  /**
   * Restores a previously saved game state.
   * @return a message confirming the game has been restored.
   * @throws IOException if an error occurs during restoration.
   */
  String restoreGame() throws IOException;

  /**
   * Retrieves the player instance.
   * @return the player object.
   */
  IPlayer getPlayer();

  /**
   * Method that returns the name of the game.
   * @return name of the game.
   */
  String getGameName();

  /**
   * Gets the game's ending message.
   * @return the final message displayed at the end of the game.
   */
  String getEndingMessage();

  /**
   * Method that returns the current state of the Room and Player.
   * @return state of the game.
   */
  List<String> getCurrentState();

  /**
   * Returns the items in the Player's inventory.
   * @return the item in inventory.
   */
  String[] getInventoryItems();

  /**
   * Returns the items in the Player's inventory.
   * @return items in players inventory.
   */
  String[] getRoomItems();

  /**
   * Method that returns a list of examinable items in the current room.
   * @return examinable objects in a room.
   */
  String[] getExaminableObjects();

  /**
   * Method that gets the image path of the object.
   * @param object object of which image path is to be returned.
   */
  String getImagePath(String object);
}
