package frc.robot.subsystems.rollers;

import edu.wpi.first.math.controller.SimpleMotorFeedforward;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.sysid.SysIdRoutine;
import frc.robot.Constants;
import org.littletonrobotics.junction.AutoLogOutput;
import org.littletonrobotics.junction.Logger;

public class Rollers extends SubsystemBase{
    private final RollersIO io;
    //private final RollersIOInputsAutoLogged inputs = new RollersIOInputsAutoLogged();

    public Rollers(RollersIO io){
        this.io = io;
    }

    public void runVolts(double volts){
        io.setVoltage(volts);
    }
}
