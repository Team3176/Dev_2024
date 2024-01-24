package frc.robot;

// import staements

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class pneumatics extends SubsystemBase {
    // variables
    private DoubleSolenoid pistonOne;
    private boolean isExtended;

    public pneumatics()
   {
    pistonOne = new DoubleSolenoid(PneumaticsModuleType.REVPH, 3, 4);
   }
    

    private static pneumatics instance = new pneumatics();
    public static pneumatics getInstance() {
    if (instance == null ) {
      instance = new pneumatics();
    }
      return instance;}

}
