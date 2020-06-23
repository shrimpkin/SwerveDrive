
public class Drive {
	public void drive(double speed, double angle) {
	    speedMotor.set (speed);

	    //angle 1 or -1 it will setPoint to be 0
	    double setPoint = angle * (MAX_VOLTS * .5) + (MAX_VOLTS * .5);
	    
	    //bounding the setPoint so that it is within (0, MAX_VOLTS)
	    //this won't just be a round to nearest endpoint

	    pidController.setPoint (setPoint);
	}
}
