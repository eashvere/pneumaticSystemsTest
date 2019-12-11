/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.movePiston;
import frc.robot.subsystems.Pistons;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  private Joystick leftjoystick = new Joystick(0);

  public JoystickButton extendPiston = new JoystickButton(leftjoystick, 1);
  public JoystickButton rectractPiston = new JoystickButton(leftjoystick, 2);

  OI() {
    extendPiston.whenPressed(new movePiston(Pistons.State.EXTEND));
    rectractPiston.whenPressed(new movePiston(Pistons.State.RETRACT));
  }
}