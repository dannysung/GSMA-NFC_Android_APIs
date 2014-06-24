package com.gsma.services.utils;

/**
 * This class handles exception raised from the commit method when CLF routing table has no more free space.
 * @since NFCHST6.0
 */
@SuppressWarnings("serial")
public class InsufficientResourcesException extends Exception {

	/**
	 * Constructs a new <code>InsufficientResourcesException</code> that includes the current stack trace.
	 * @since NFCHST6.0
	 */
	public InsufficientResourcesException() {};

	/**
	 * Constructs a new <code>InsufficientResourcesException</code> with the current stack trace and the specified detail message.
	 * @param detailMessage	The detail message for this exception
	 * @since NFCHST6.0
	 */
	public InsufficientResourcesException(String detailMessage) {};

}
