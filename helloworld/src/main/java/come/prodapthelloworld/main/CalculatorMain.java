package come.prodapthelloworld.main;
public class CalculatorMain {

	private double numberOne;
	private double numberTwo;

	public double getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(double numberOne) {
		this.numberOne = numberOne;
	}

	public double getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(double numberTwo) {
		this.numberTwo = numberTwo;
	}

	public double addition(double numberOne, double numberTwo) {

		return numberOne + numberTwo;
	}

	public double subtraction(double numberOne, double numberTwo) {

		return numberOne - numberTwo;
	}

	@Override
	public String toString() {
		return "Calculator [numberOne=" + numberOne + ", numberTwo=" + numberTwo + "]";
	}
	}