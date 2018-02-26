package org.usfirst.frc.team6476.robot.subsystems;

import org.usfirst.frc.team6476.robot.RobotMap;

import org.usfirst.frc.team6476.robot.commands.DriveTrainCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	// Create CANTalon Objects that coresspond to each Talon Motor
	WPI_TalonSRX m_frontLeft, m_frontRight, m_rearRight, m_rearLeft;
	
	SpeedControllerGroup m_left, m_right;
	//Create a RobotDrive
	DifferentialDrive tankDrive;
	
	 public class Robot {
		   WPI_TalonSRX m_frontLeft = new WPI_TalonSRX(RobotMap.LFTalon);
		   WPI_TalonSRX m_rearLeft = new WPI_TalonSRX(RobotMap.LBTalon);
		   SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);
		   WPI_TalonSRX m_frontRight = new WPI_TalonSRX(RobotMap.RFTalon);
		   WPI_TalonSRX m_rearRight = new WPI_TalonSRX(RobotMap.RBTalon);
		   SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);

		   DifferentialDrive tankDrive = new DifferentialDrive(m_left, m_right);
		 }
	
	// This brings the motorcontrollers variables into the subsystem and we can visualise this as turning them into motors for the drive train
	
	public void arcadeDrive(double x, double y)
	{
		tankDrive.arcadeDrive(x, y);
	}
	
	
	
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveTrainCommand());
        
    }
}

