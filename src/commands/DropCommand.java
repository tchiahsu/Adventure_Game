package commands;

import java.io.IOException;

import eventhandler.IEventHandler;
import model.IGameModel;

/**
 * The {@code DropCommand} class represents a command for dropping an item in the adventure game.
 * It implements the {@link ICommand} interface.
 */
public class DropCommand implements ICommand {
  private final String item;
  private final IEventHandler output;

  /**
   * Constructs an {@code DropCommand} object with the specified object and output destination.
   *
   * @param item : item we want to drop.
   * @param output : the {@link IEventHandler} object where the command's output will be written.
   */
  public DropCommand(String item, IEventHandler output) {
    this.item = item;
    this.output = output;
  }

  /**
   * Executes the drop command by passing item we want to drop to the game model.
   *
   * @param model : the {@link IGameModel} instance that processes the answer.
   * @throws IOException when an I/O error occurs while appending the output.
   */
  @Override
  public void execute(IGameModel model) throws IOException {
    this.output.write(model.dropItem(this.item));
  }
}
