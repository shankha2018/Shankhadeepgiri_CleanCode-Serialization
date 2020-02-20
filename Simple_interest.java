package epam.interest;

public class Simple_interest {
	public double interest;
	Simple_interest(double principle, double rate, double time){
		interest = (principle*rate*time)/100;
	}
	double returnInterest() {
		return interest;
	}
}
