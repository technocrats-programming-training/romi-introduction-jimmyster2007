// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import lib.ProceduralRobot;

import static lib.Romi.driveTime;
import static lib.Romi.turnTime;


public class Robot extends ProceduralRobot {
  @Override
  public void autonomousProcedure() throws InterruptedException {
    // Write your code here:
System.out.println("waking up");
sleepSeconds(1)
System.out.println("starting navigation");
driveTime(1, 3);
turnTime(0.5, 0.5);
driveTime(0.2, 5)
System.out.println("waiting");
sleepSeconds(1);
System.out.println("moving again");
driveTime(-0.2, 5);
sleepSeconds(1);
System.out.println("all done")

  }
}
