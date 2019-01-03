package org.md.education.problem;

/**
 * Prints all integers from 1 through n. If number is divisible by 3, print
 * 'Fizz' instead of number. If number is divisible by 5, print 'Buzz' instead
 * of the number. If number is divisible by both 3 and 5, print 'FizzBuzz'.
 * Prints 10 numbers per line, with a tab between each number. Will return an
 * error message string if number integer is less than 1.
 * 
 * @author Cameron
 */
public class FizzBuzz {

	public static final String INVALID_NON_POSITIVE_INTEGER = "Non-valid FizzBuzz integer.";

	/**
	 * Public constructor.
	 */
	public FizzBuzz() {
		// empty constructor
	}

	/**
	 * Given a positive integer, return the FizzBuzz series for the number.
	 * 
	 * @param value
	 *            Integer n to be printed from 1 through.
	 * @return String of FizzBuzz values from 1 through n. Will return error String
	 *         if number is null or less than 1.
	 */
	public String printFizzBuzz(Integer value) {
		StringBuilder sb = new StringBuilder();
		if (value != null && value > 0) {
			for (int i = 1; i <= value; i++) {
				sb.append(determineFizzBuzzValue(i));
				sb.append(determineNextSpace(i, value));
			}
		} else {
			sb.append(INVALID_NON_POSITIVE_INTEGER);
		}
		return sb.toString();
	}

	/**
	 * Determines the FizzBuzz value of an Integer.
	 * 
	 * @param i
	 *            Integer value being evaluated for FizzBuzz value.
	 * @return String of the FizzBuzz value.
	 */
	protected String determineFizzBuzzValue(int i) {
		Boolean fizz = (i % 3 == 0);
		Boolean buzz = (i % 5 == 0);
		StringBuilder sb = new StringBuilder();
		if (fizz) {
			sb.append("Fizz");
		}
		if (buzz) {
			sb.append("Buzz");
		}
		if (!fizz && !buzz) {
			sb.append(i);
		}
		return sb.toString();
	}

	/**
	 * Determine spacing between FizzBuzz values.
	 * 
	 * @param i
	 *            Integer value of number whose FizzBuzz value was just determined.
	 * @param value
	 *            Integer value for last FizzBuzz value that will be determined.
	 * @return String character of either a tab (default) or new line if Integer is
	 *         8th or last in series.
	 */
	protected String determineNextSpace(int i, int value) {
		String ret = "\t";
		if (i == value || i % 8 == 0) {
			ret = "\n";
		}
		return ret;
	}

	@Override
	public String toString() {
		return "FizzBuzz []";
	}
}
