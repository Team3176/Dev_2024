// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;



import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.pneumatics;
import edu.wpi.first.wpilibj2.command.Command;


public class extendPiston extends Command{
  /** Creates a new ClawInhale. */
  pneumatics m_pneumatics = pneumatics.getInstance();
  public  extendPiston() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_pneumatics);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  @Override
  public void execute() 
  {
    m_pneumatics.Extend();
  }

}

