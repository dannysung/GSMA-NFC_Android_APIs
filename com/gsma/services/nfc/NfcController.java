package com.gsma.services.nfc;

import android.content.Context;

/**	
 * This class handles the NFC Controller
 * @since NFCHST4.1
 */
public class NfcController {

	NfcController() {}
	
	/** <code>NFC_RF_TECHNOLOGY_A</code> as defined by 
	 * <a href="http://www.nfc-forum.org" target="_blank">NFC Controller Interface (NCI)</a> specification*/	
	public static final int TECHNOLOGY_NFC_A=0x01;
	/** <code>NFC_RF_TECHNOLOGY_B</code> as defined by 
	 * <a href="http://www.nfc-forum.org" target="_blank">NFC Controller Interface (NCI)</a> specification*/
	public static final int TECHNOLOGY_NFC_B=0x02;
	/** <code>NFC_RF_TECHNOLOGY_F</code> as defined by 
	 * <a href="http://www.nfc-forum.org" target="_blank">NFC Controller Interface (NCI)</a> specification*/
	public static final int TECHNOLOGY_NFC_F=0x04;
	
	/** <code>PROTOCOL_ISO_DEP</code> as defined by 
	 * <a href="http://www.nfc-forum.org" target="_blank">NFC Controller Interface (NCI)</a> specification*/
	public static final int PROTOCOL_ISO_DEP=0x10;
	
	/** Battery of the handset is in "Operational" mode*/
	public static final int BATTERY_OPERATIONAL_STATE=0x01;
	/** Any battery power levels*/
	public static final int BATTERY_ALL_STATES=0x02;
	
	/** Screen is "ON" (not in "Screen Off" mode) and locked*/
	public static final int SCREEN_ON_AND_LOCKED_MODE=0x01;
	/** Any screen mode*/
	public static final int SCREEN_ALL_MODES=0x02;	
	
	
	// Callback interface
	
	/**
	 * This interface provide callback methods for {@link NfcController} class
	 * @since NFCHST4.1
	 */
	public static interface Callbacks {

		/** Card Emulation mode has been disabled*/
		public static final int CARD_EMULATION_DISABLED=0x00;
		/** Card Emulation mode has been enabled*/
		public static final int CARD_EMULATION_ENABLED=0x01;
		/** An error occurred when handset tried to enable/disable Card Emulation mode*/
		public static final int CARD_EMULATION_ERROR=0x100;
		
		/**	
		 * Called when process for getting the default Controller is finished.
		 * @param controller Instance of default controller or <code>null</code> if an error occurred 
		 * @since NFCHST5.0
		 */
		public abstract void onGetDefaultController(NfcController controller);
		
		/**	
		 * Called when process for enabling the NFC Controller is finished.	
		 * @param success <code>true</code> if the NFC adapter is enabled; <code>false</code> otherwise
		 * @since NFCHST5.0
		 */
		public abstract void onEnableNfcController(boolean success);
		
		/**	
		 * Called when process for enabling/disabling the Card Emulation mode is finished.	
		 * @param status Status of the Card Emulation mode as defined below<BR>
		 * {@link Callbacks#CARD_EMULATION_DISABLED}, {@link Callbacks#CARD_EMULATION_ENABLED}, 
		 * {@link Callbacks#CARD_EMULATION_ERROR}
		 * @since NFCHST4.1
		 * @deprecated <a style="color:#FF0000">When Host Card Emulation (HCE) is supported</a>
		 */
		public abstract void onCardEmulationMode(int status);
		
	}
	
	
	// Handling the NFC Controller
	
	/**
	 * Helper for getting an instance of the NFC Controller.
	 * @param context Calling application's context
	 * @param cb Callback interface
	 * @since NFCHST4.1
	 */
	public static void getDefaultController(Context context, NfcController.Callbacks cb) {
	}
	
	/**
	 * Check if the NFC Controller is enabled or disabled.
	 * @return <code>true</code> if the NFC adapter is enabled; <code>false</code> otherwise
	 * @since NFCHST4.1 <I>(REQ_??)</I>
	 */
	public boolean isEnabled() {
		return false;
	}
	
	/**
	 * Asks the system to enable the NFC Controller. User input is required to enable NFC.<BR>
	 * A question will be asked if the user wants to enable NFC or not.
	 * <center><img src="EnableNfcController.png" width="40%" height="40%"/></center><BR>
	 * This question shall be generated within the OS context.
	 * @param cb Callback interface
	 * @since NFCHST4.1 <I>(REQ_??)</I>
	 */
	public void enableNfcController(NfcController.Callbacks cb) {
	}
	
	
	// Handling Card Emulation
	
	/**
	 * Check if the Card Emulation mode is enabled or disabled.
	 * @return <code>true</code> if the Card Emulation mode is enabled; <code>false</code> otherwise
	 * @since NFCHST4.1 <I>(REQ_??)</I>
	 * @deprecated <a style="color:#FF0000">When Host Card Emulation (HCE) is supported</a>
	 */
	public boolean isCardEmulationEnabled() {
		return false;
	}	

	/**
	 * Asks the system to enable the Card Emulation mode.<BR>
	 * Change is not persistent and SHALL be overridden by the following events:<UL>
	 * <LI>Turning OFF and ON the NFC Controller</LI>
	 * <LI>Full power cycle of the handset</LI></UL>
	 * @param cb Callback interface
	 * @exception IllegalStateException <BR>Indicate that NFC Controller is not enabled.
	 * @exception SecurityEception <BR>Indicate that application is not allowed to use this API.<UL>
	 * <LI>When UICC is the "active" SE,
	 * <BR>only applications signed with certificates stored in the UICC are granted to call this API.</LI>
	 * <LI>When eSE is the "active" SE,
	 * <BR>only applications signed with system certificates are granted to call this API.</LI></UL>
	 * @since NFCHST4.1 <I>(REQ_??)</I>
	 * @deprecated <a style="color:#FF0000">When Host Card Emulation (HCE) is supported</a>
	 */
	public void enableCardEmulationMode(NfcController.Callbacks cb) {
	}

	/**
	 * Asks the system to disable the Card Emulation mode.<BR>
	 * Change is not persistent and SHALL be overridden by the following events:<UL>
	 * <LI>Turning OFF and ON the NFC Controller</LI>
	 * <LI>Full power cycle of the handset</LI></UL>
	 * @param cb Callback interface
	 * @exception SecurityException <BR>Indicate that application is not allowed to use this API.<UL>
	 * <LI>When UICC is the "active" SE,
	 * <BR>only applications signed with certificates stored in the UICC are granted to call this API.</LI>
	 * <LI>When eSE is the "active" SE,
	 * <BR>only applications signed with system certificates are granted to call this API.</LI></UL>
	 * @since NFCHST4.1 <I>(REQ_??)</I>
	 * @deprecated <a style="color:#FF0000">When Host Card Emulation (HCE) is supported</a>
	 */
	public void disableCardEmulationMode(NfcController.Callbacks cb) {
	}
	
	
	// Handling Technology, Protocol and AID routes
	
	/**
	 * Create a new "Off-Host" service.
	 * @param description Description of the "Off-Host" service
	 * @param SEName Secure Element name holding the "Off-Host" service
	 * @exception UnsupportedOperationException <BR>Indicate that Host Card Emulation (HCE) is not supported.
	 * @return An instance of an {@link OffHostService} class
	 * @see <a href="http://www.simalliance.org" target="_blank">SIM Alliance Open Mobile APIs</a> for Secure Element name guidelines
	 * @since NFCHST6.0 <I>(REQ_??)</I>
	 */
	public OffHostService defineOffHostService(String description, String SEName) {
		return null;
	}
	
	/**
	 * Delete an existing dynamically created "Off-Host" service.
	 * @param service Instance of an {@link OffHostService} class to be deleted
	 * @since NFCHST6.0 <I>(REQ_??)</I>
	 */
	public void deleteOffHostService(OffHostService service) {
	}
	
	/**
	 * Return a list of "Off-Host" services created dynamically by the calling application.<BR>
	 * <BR><I>Note: In the next release, if it is not breaking "Android CDD",<BR>
	 * it is planned also to support "Off-Host" services registered statically (Manifest)</I> 
	 * @return A list of {@link OffHostService} instances or <code>null</code> if no such instance exists.
	 * @since NFCHST6.0 <I>(REQ_??)</I>
	 */
	public OffHostService[] getOffHostServices() {
		return null;
	}

	/**
	 * Return the "Off-Host" service related to the current selected "Tap&Pay" menu entry.
	 * @return A {@link OffHostService} instance or <code>null</code> if<UL>
	 * <LI>The "Tap&Pay" menu entry has not been created by the calling application</IL>
	 * <LI>The "Tap&Pay" menu entry has not been created dynamically</IL></UL>
	 * @since NFCHST6.0 <I>(REQ_??)</I>
	 */
	public OffHostService getDefaultOffHostService() {
		return null;
	}
	
	
	/**
	 * Set the default route towards a Card Emulation environment for a NFC communication of a given technology.
	 * @param technology NFC Technology as defined below<BR>
	 * {@link NfcController#TECHNOLOGY_NFC_A}, {@link NfcController#TECHNOLOGY_NFC_B}, {@link NfcController#TECHNOLOGY_NFC_F}
	 * @param destination <code>HCE</code> (device host) or Secure Element name
	 * @param batteryState Battery state as defined below<BR> 
	 * {@link NfcController#BATTERY_OPERATIONAL_STATE}, {@link NfcController#BATTERY_ALL_STATES}
	 * @param screenMode Screen mode as defined below<BR>
	 * {@link NfcController#SCREEN_ON_AND_LOCKED_MODE}, {@link NfcController#SCREEN_ALL_MODES}
	 * @exception IllegalArgumentException <BR>Indicate that a method has been passed an illegal or inappropriate argument.
	 * @see <a href="http://www.simalliance.org" target="_blank">SIM Alliance Open Mobile APIs</a> for Secure Element name guidelines
	 * @since NFCHST6.0
	 */
	public void setTechnologyRouting(int technology, String destination, int batteryState, int screenMode) {
	}

	/**
	 * Restore the default routing for the given technology to the default NFC Controller value.
	 * @param technology NFC Technology as defined below<BR>
	 * {@link NfcController#TECHNOLOGY_NFC_A}, {@link NfcController#TECHNOLOGY_NFC_B}, {@link NfcController#TECHNOLOGY_NFC_F}
	 * @exception IllegalArgumentException <BR>Indicate that a method has been passed an illegal or inappropriate argument.
	 * @since NFCHST6.0
	 */	
	public void restoreTechnologyRouting(int technology) {
	}
	
	/**
	 * Set the default route towards a Card Emulation environment for a NFC communication of a given protocol.
	 * @param protocol NFC Protocol as defined below<BR>
	 * {@link NfcController#PROTOCOL_ISO_DEP}
	 * @param destination <code>HCE</code> (device host) or Secure Element name
	 * @param batteryState Battery state as defined below<BR> 
	 * {@link NfcController#BATTERY_OPERATIONAL_STATE}, {@link NfcController#BATTERY_ALL_STATES}
	 * @param screenMode Screen mode as defined below<BR>
	 * {@link NfcController#SCREEN_ON_AND_LOCKED_MODE}, {@link NfcController#SCREEN_ALL_MODES}
	 * @exception IllegalArgumentException <BR>Indicate that a method has been passed an illegal or inappropriate argument.
	 * @see <a href="http://www.simalliance.org" target="_blank">SIM Alliance Open Mobile APIs</a> for Secure Element name guidelines
	 * @since NFCHST6.0
	 */
	public void setProtocolRouting(int protocol, String destination, int batteryState, int screenMode) {
	}
	
	/**
	 * Restore the default routing for the given protocol to the default NFC Controller value.
	 * @param protocol NFC Protocol as defined below<BR>
	 * {@link NfcController#PROTOCOL_ISO_DEP}
	 * @exception IllegalArgumentException <BR>Indicate that a method has been passed an illegal or inappropriate argument.
	 * @since NFCHST6.0
	 */	
	public void restoreProtocolRouting(int protocol) {
	}
	
}
