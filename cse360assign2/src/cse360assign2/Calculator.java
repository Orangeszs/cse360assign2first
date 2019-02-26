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
	/**
	 * Returns total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * Adds input value
	 * @param value input value
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	/**
	 * Subtracts input value
	 * @param value input value
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;

	}
	/**
	 * Multiplies input value
	 * @param value input value
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;

	}
	/**
	 * Divides input value
	 * @param value input value
	 */
	public void divide (int value) {
		if (value != 0) total = total / value;
		else total = 0;
		history = history + " / " + value;

	}
	/**
	 * Returns operation history as a string
	 * @return operation history
	 */
	public String getHistory () {
		return history;
	}
}