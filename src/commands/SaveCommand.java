package commands;

import java.io.IOException;

import eventhandler.IEventHandler;
import model.IGameModel;

/**
 * The {@code SaveCommand} class represents a command for saving the state of adventure game.
 * It implements the {@link ICommand} interface.
 */
public class SaveCommand implements ICommand {
  private final IEventHandler output;

  /**
   * Constructs an {@code SaveCommand} object with the specified output destination for the save
   * message.
   *
   * @param output : the {@link IEventHandler} object where the command's output will be written.
   */
  public SaveCommand(IEventHandler output) {
    this.output = output;
  }

  /**
   * Executes the save command to save the current state of the game.
   *
   * @param model : the {@link IGameModel} instance that processes the answer.
   * @throws IOException when an I/O error occurs while appending the output.
   */
  @Override
  public void execute(IGameModel model) throws IOException {
    output.write(model.saveGame());
  }
}
