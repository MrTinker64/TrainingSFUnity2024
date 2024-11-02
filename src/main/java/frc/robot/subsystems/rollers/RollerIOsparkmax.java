package frc.robot.subsystems.rollers;

import com.revrobotics.CANSparkBase.ControlType;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkPIDController;
import com.revrobotics.SparkPIDController.ArbFFUnits;
import edu.wpi.first.math.util.Units;



public class RollerIOsparkmax implements RollersIO {
    private final CANSparkMax rollerMotor = new CANSparkMax(0,MotorType.kBrushless);

    public RollerIOsparkmax() {
        rollerMotor.restoreFactoryDefaults();
    }
    @Override
    public void updateInputs(RollerIOInputs inputs){
        inputs.appliedVolts = rollerMotor.getAppliedOutput() * rollerMotor.getBusVoltage();
        inputs.currentAmps = rollerMotor.getOutputCurrent();
    }
    
    @Override
    public void runVolts(double volts){
        rollerMotor.setVoltage(volts);
    }
}

