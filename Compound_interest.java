package epam.interest;
import java.lang.Math;

public class Compound_interest {
	public double interest;
	Compound_interest(double principle, double rate, double time){
		interest = principle*Math.pow((1 + (rate/100)), time);
	}
	double returnInterest() {
		return interest;
	}

}
