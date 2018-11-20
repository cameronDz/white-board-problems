package org.md.education.problem;

import java.util.Arrays;

/**
 * Number of ways to climb steps given n steps, and the number of steps that can
 * be climbed at once are provided in an array.
 * 
 * @author Cameron
 */
public class NumberWaysSteps {

	private Integer stair;
	private Integer[] steps;

	/**
	 * Empty constructor. Default values set to 0 stair and 0 in array.
	 */
	public NumberWaysSteps() {
		stair = 0;
		steps = new Integer[] { 0 };
	}

	/**
	 * Full constructor with values for stairs and steps.
	 * 
	 * @param stair
	 *            Integer of number of stairs to be climbs.
	 * @param steps
	 *            Integer[] of possible values of steps to take.
	 */
	public NumberWaysSteps(Integer stair, Integer[] steps) {
		this.stair = stair;
		this.steps = steps;
	}

	/**
	 * Getter for stair variable.
	 * 
	 * @return Integer value of stair.
	 */
	public Integer getStair() {
		return stair;
	}

	/**
	 * Setter for stair variable.
	 * 
	 * @param stair
	 *            Integer value to be set to stair.
	 */
	public void setStair(Integer stair) {
		this.stair = stair;
	}

	/**
	 * Getter for steps.
	 * 
	 * @return Integer[] for steps variables.
	 */
	public Integer[] getSteps() {
		return steps;
	}

	/**
	 * Setter for steps.
	 * 
	 * @param steps
	 *            Integer[] to be set to steps.
	 */
	public void setSteps(Integer[] steps) {
		this.steps = steps;
	}

	public Integer calculateways() {
		Integer ret = null;

		// TODO figure out solution

		return ret;
	}

	@Override
	public String toString() {
		return "NumberWaysSteps [stair=" + stair + ", steps=" + Arrays.toString(steps) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stair == null) ? 0 : stair.hashCode());
		result = prime * result + Arrays.hashCode(steps);
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
		NumberWaysSteps other = (NumberWaysSteps) obj;
		if (stair == null) {
			if (other.stair != null) {
				return false;
			}
		} else if (!stair.equals(other.stair)) {
			return false;
		}
		if (!Arrays.equals(steps, other.steps)) {
			return false;
		}
		return true;
	}
}
