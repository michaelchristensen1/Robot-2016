package org.usfirst.frc.team2509.robot.subsystems;

import org.usfirst.frc.team2509.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
private Victor DriveLeft1 = RobotMap.DriveLeft1;
private Victor DriveLeft2 = RobotMap.DriveLeft2;
private Victor DriveRight1 = RobotMap.DriveRight1;
private Victor DriveRight2 = RobotMap.DriveRight2;
private RobotDrive robotdrive = RobotMap.robotdrive;
public void Drive() {
	robotdrive.tankDrive(null,null);
}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
