package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcontroller.external.samples.HardwarePushbot;

@TeleOp(name="Pushbot: Teleop Tank", group="Pushbot")
@Disabled
public class OpMode_1 extends OpMode{

    /* Declare OpMode members. */
    HardwareSlideDrive robot       = new HardwareSlideDrive(); // use the class created to define a Pushbot's hardware
    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        /* Initialize the hardware variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);

    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
        double frontBack;
        double rightLeft;
        double spin;

        frontBack = -gamepad1.left_stick_y;
        rightLeft = -gamepad1.left_stick_x;
        spin = -gamepad1.right_stick_x;

        robot.leftDrive.setPower(frontBack + spin);
        robot.rightDrive.setPower(- frontBack - spin);
        robot.strafe.setPower(rightLeft);
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }
}
