package frc.robot;

// import staements

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.Command;

public class pneumatics {
    // variables
    private DoubleSolenoid pistonOne;
    private boolean isExtended;

    public pneumatics()
   {
    pistonOne = new DoubleSolenoid(PneumaticsModuleType.REVPH, 5, 3);
   }
    // methods
    public void Extend() {

        pistonOne.set(Value.kForward);
        //pistonTwo.set(Value.kForward);
        this.isExtended = true; 
    
      }
    
    public void Retract() {
        pistonOne.set(Value.kReverse);
        //pistonTwo.set(Value.kReverse);
        this.isExtended = false;
        
      }


    private static pneumatics instance = new pneumatics();
    public static pneumatics getInstance() {
    if (instance == null ) {
      instance = new pneumatics();
    }
      return instance;}

}
