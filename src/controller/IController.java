package controller;

import java.io.IOException;
import java.util.List;

/**
 * Represents a game controller that manages the flow of the game.
 * Implementing this interface defines how the game should be initiated.
 */
public interface IController {

  /**
   * Starts and manages the game loop.
   *
   * @throws IOException if an I/O error occurs during execution.
   */
  void go() throws IOException;

  /**
   * Sets the name of the player.
   *
   * @param name : name of player
   */
  void setPlayerName(String name);
}
