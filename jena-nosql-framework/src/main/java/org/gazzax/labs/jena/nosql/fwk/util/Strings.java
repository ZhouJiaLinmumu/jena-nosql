package org.gazzax.labs.jena.nosql.fwk.util;

/**
 * Booch utility for string manipulation.
 * 
 * @author Andrea Gazzarini
 * @since 1.0
 */
public abstract class Strings {
	/**
	 * Checks if the given string is not null or (not) empty string.
	 * 
	 * @param value the string to check.
	 * @return true if the string is not null and is not empty string
	 */
	public static boolean isNotNullOrEmptyString(final String value) {
		return value != null && value.trim().length() != 0;
	}
	
	/**
	 * Checks if the given string is null or empty string.
	 * 
	 * @param value the string to check.
	 * @return true if the string is not null and is not empty string
	 */
	public static boolean isNullOrEmptyString(final String value) {
		return value == null || value.trim().length() == 0;
	}	
}