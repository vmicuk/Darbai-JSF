package VM;

import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class GuessNumber {

	private int number;
	private String msg;
	private int randomNumber;
	private int count;
	Random rand = new Random();

	public GuessNumber() {
		this.msg = "";
		this.randomNumber = rand.nextInt(100);
		this.count = 0;
	}
	
	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void guess() {
		if (number == randomNumber) {
			count++;
			msg = "You are won";
		}
		else if (number > randomNumber) {
			count++;
			msg = "Number too high";
		}
		else {
			count++;
			msg = "Number too low";
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void reset() {
		this.randomNumber = rand.nextInt(1000);
		this.msg = "";
		this.count = 0;
	}
	
}
