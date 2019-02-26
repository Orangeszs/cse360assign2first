package cse360assign2;
/**
 * Calculates simple calculations, such as adding, subtracting, multiplication, division, and other methods pertaining to history of calculations.
 * @author thais, id 404, 1212866926
 * @param total Used for getTotal,holds the total value 
 * @param history Used to remember the history of all operations.
 *
 */
public class Calculator {

	private int total;
	private String history = "0";
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;

	}
	
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;

	}
	
	public void divide (int value) {
		if (value != 0) total = total / value;
		else total = 0;
		history = history + " / " + value;

	}
	
	public String getHistory () {
		return history;
	}
}