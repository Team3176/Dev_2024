package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;



public class Controller {
  private static Controller instance = new Controller();

  public static Controller getInstance() {
    if (instance == null ) {
      instance = new Controller();
    }
      return instance;}

   public CommandXboxController operator;

// physical controller
 public Controller(){

  operator = new CommandXboxController(OP_ID);


}
 public final static int OP_ID = 2;
}