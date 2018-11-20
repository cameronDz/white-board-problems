package org.md.education.problem;

/**
 * Calculates factorial of any number using recusion.
 * 
 * @author Cameron
 */
public class RecursiveFactorial {

	private Integer number;

	/**
	 * Empty constructor, sets number to 0
	 */
	public RecursiveFactorial() {
		number = null;
	}

	/**
	 * Constructor with parameter
	 * 
	 * @param number
	 *            Integer number to be factorial-ized
	 */
	public RecursiveFactorial(Integer number) {
		this.number = number;
	}

	/**
	 * Number getter.
	 * 
	 * @return Integer of number.
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * Number setter.
	 * 
	 * @param number
	 *            Integer of number to be set.
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}

	/**
	 * Calculates the value of the factorial of the value of the Integer number
	 * variable.
	 * 
	 * @return Integer object. If number variable is null or negative, returns null
	 *         reference. Otherwise calculates factorial.
	 */
	public Integer calculateFactorial() {
		Integer ret = null;
		if (number != null && number >= 0) {
			ret = recursiveFactorial(number);
		}
		return ret;
	}

	/**
	 * After determining an Integer object is non-negative value, recursively
	 * determine factorial value.
	 * 
	 * @param i
	 *            int primitive value to calculate factorial.
	 * @return
	 */
	private int recursiveFactorial(int i) {
		if (i == 0 || i == 1) {
			return 1;
		}
		return recursiveFactorial(i - 1) * i;
	}

	@Override
	public String toString() {
		return "RecursiveFactorial [number=" + number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		RecursiveFactorial other = (RecursiveFactorial) obj;
		if (number == null) {
			if (other.number != null) {
				return false;
			}
		} else if (!number.equals(other.number)) {
			return false;
		}
		return true;
	}
}
