package com.gsma.services.nfc;

import android.content.Context;

/**
 * This class handles the available Secure Elements
 * @since NFCHST4.1 <I>(REQ_??)</I>
 * @deprecated <a style="color:#FF0000">When Host Card Emulation (HCE) is supported</a>
 */
public class SEController {
	
	SEController() {}
	

	// Callback interface
	
	/**
	 * This interface provide callback methods for {@link SEController} class
	 * @since NFCHST4.1 
	 * @deprecated <a style="color:#FF0000">When Host Card Emulation (HCE) is supported</a>
	 */
	public static interface Callbacks {

		/**	
		 * Called when process for getting the default Controller is finished.
		 * @param controller Instance of default controller or <code>null</code> if an error occurred 
		 * @since NFCHST4.1
		 */
		public abstract void onGetDefaultController(SEController controller);
		
	}
	
	
	// Handling the SE Controller
	
	/**
	 * Helper for getting an instance of the SE Controller.
	 * @param context Calling application's context
	 * @param cb Callback interface
	 * @since NFCHST4.1

	 */
	public static void getDefaultController(Context context, SEController.Callbacks cb) {
	}
	
	/**
	 * Return the name of the active Secure Element.
	 * @return Name of the active Secure Element
	 * @see <a href="http://www.simalliance.org" target="_blank">SIM Alliance Open Mobile APIs</a> for Secure Element name guidelines
	 * @since NFCHST4.1 <I>(REQ_XX)</I>
	 */
	public String getActiveSecureElement() {
		return "";
	}
	
	/**
	 * Set a specified Secure Element as "active" one.
	 * @param SEName Secure Element name
	 * @exception IllegalStateException <BR>Indicate that NFC Controller is not enabled.
	 * @exception SecurityException <BR>Indicate that application SHALL be signed with a trusted certificate for using this API.
	 * @see <a href="http://www.simalliance.org" target="_blank">SIM Alliance Open Mobile APIs</a> for Secure Element name guidelines
	 * @since NFCHST4.1 <I>(REQ_XX)</I>
	 */
	public void setActiveSecureElement(String SEName) {
	}
	
}
