package Ethan.Kennedy.Chapter7.GradleJava.Project;

public class SimpleMath {
	double divide(double numerator, double denominator) {
		if (denominator == 0) {
			throw new ArithmeticException();
		}
		double result = numerator/denominator;
		return result;
		
	}
	double multiply(double number1, double number2) {
		double result = number1*number2;
		return result;
	}

}
