package VM;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Calculator {
	private double number1 = 1.0;
	private double number2 = 2.0;
	private double answer;
	
	public Calculator() {}
	
	public double getNumber1() {
		return number1;
	}
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	public double getNumber2() {
		return number2;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	public double getAnswer() {
		return answer;
	}
	public void setAnswer(double answer) {
		this.answer = answer;
	}
	public void sum() {
		answer = number1 + number2;
	}
	
	public void multiple() {
		answer = number1 * number2;
	}
	
	public void subtract() {
		answer = number1 - number2;
	}
	public void divide() {
		answer = number1 / number2;
	}
	
	
	
}
