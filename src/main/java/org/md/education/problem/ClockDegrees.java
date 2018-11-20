package org.md.education.problem;

/**
 * Calculate the angles of a clock hands in a circle given the time on an AM/PM
 * clock.
 * 
 * @author Cameron
 */
public class ClockDegrees {

	private Integer minutes;
	private Integer hours;

	/**
	 * Empty constructor. Variable values initialized as null.
	 */
	public ClockDegrees() {
		minutes = null;
		hours = null;
	}

	/**
	 * 
	 * @param hours
	 *            Integer of hours.
	 * @param minutes
	 *            Integer of minutes.
	 */
	public ClockDegrees(Integer hours, Integer minutes) {
		this.minutes = minutes;
		this.hours = hours;
	}

	/**
	 * Getter for minutes.
	 * 
	 * @return Integer of minutes variable.
	 */
	public Integer getMinutes() {
		return minutes;
	}

	/**
	 * Setter for minutes.
	 * 
	 * @param minutes
	 *            Integer to be set as minutes variable.
	 */
	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	/**
	 * Getter for hours.
	 * 
	 * @return Integer value of hours variable.
	 */
	public Integer getHours() {
		return hours;
	}

	/**
	 * Setter for hours.
	 * 
	 * @param hours
	 *            Integer to be set as hours variables.
	 */
	public void setHours(Integer hours) {
		this.hours = hours;
	}

	/**
	 * Calculate the degree of the minute hand based on the provided time.
	 * 
	 * @return
	 */
	public Integer calculateMinuteHandDegree() {
		Integer ret = null;
		if (minutes != null && minutes >= 0 && minutes < 60) {
			ret = minutes * 6;
		}
		return ret;
	}

	/**
	 * Calculate the degree of the hour hand based on the provided time.
	 * 
	 * @return
	 */
	public Integer calculateHourHandDegree() {
		Integer ret = null;
		if (hours != null && hours > 0 && hours <= 12) {
			ret = (hours == 12 ? 0 : hours * 30);
			Integer min = calculateMinuteHandDegree();
			ret = (min == null ? null : ret + (min / 12));
		}
		return ret;
	}

	@Override
	public String toString() {
		return "ClockDegrees [minutes=" + minutes + ", hours=" + hours + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hours == null) ? 0 : hours.hashCode());
		result = prime * result + ((minutes == null) ? 0 : minutes.hashCode());
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
		ClockDegrees other = (ClockDegrees) obj;
		if (hours == null) {
			if (other.hours != null) {
				return false;
			}
		} else if (!hours.equals(other.hours)) {
			return false;
		}
		if (minutes == null) {
			if (other.minutes != null) {
				return false;
			}
		} else if (!minutes.equals(other.minutes)) {
			return false;
		}
		return true;
	}
}
