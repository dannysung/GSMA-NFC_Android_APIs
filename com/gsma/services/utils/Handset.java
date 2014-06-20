package com.gsma.services.utils;

/**	
 * This class handles the handset configuration & properties
 * @since NFCHST6.0
 */
public class Handset {

	/** Device property [Contactless Frontend]*/
	public static final int HCI_SWP=0x00;
	/** Device property [Contactless Frontend]*/
	public static final int MULTIPLE_ACTIVE_CEE=0x01;
	
	/** Device property [NFC Technologies]*/
	public static final int FELICA=0x20;
	/** Device property [NFC Technologies]*/
	public static final int MIFARE_CLASSIC=0x21;
	/** Device property [NFC Technologies]*/
	public static final int MIFARE_DESFIRE=0x22;
	/** Device property [NFC Technologies]*/
	public static final int NFC_FORUM_TYPE3=0x23;
	
	/** Device property [Framework components]*/
	public static final int OMAPI=0x50;
	
	/** Device property [Battery Levels]*/
	public static final int BATTERY_LOW_MODE=0x90;
	/** Device property [Battery levels]*/
	public static final int BATTERY_POWER_OFF_MODE=0x91;

	/** Device property [Remote Access]*/
	public static final int BIP=0x92;
	/** Device property [Remote Access]*/
	public static final int CAT_TP=0x93;

	/**
	 * Return the version of device requirements supported.
	 * @since NFCHST6.0 <I>(REQ_??)</I>
	 */
	public int getVersion() {
		return 0;
	}
	
	/**
	 * Return handset status for the following supported features:<BR><UL>
	 * <LI>{@link Handset#BATTERY_LOW_MODE}, {@link Handset#BATTERY_POWER_OFF_MODE}</LI>
	 * <LI>{@link Handset#FELICA}, {@link Handset#MIFARE_CLASSIC}, {@link Handset#MIFARE_DESFIRE},
	 *     {@link Handset#NFC_FORUM_TYPE3}</LI>
	 * <LI>{@link Handset#MULTIPLE_ACTIVE_CEE}</LI></UL>
	 * @return <code>true</code> if the feature is supported; <code>false</code> otherwise
	 * @exception IllegalArgumentException <BR>Indicate that a method has been passed an illegal or inappropriate argument.
	 * @since NFCHST6.0 <I>(REQ_??)</I>
	 */
	public boolean getProperty(int feature) {
		return false;
	}
	
	/**
	 * Asks the system to inform "transaction events" to any authorized/registered components via <code>BroadcastReceiver</code>.<BR> 
	 * Change SHALL not imply a power cycle and SHALL be valid until next handset reboot.<BR><BR>
	 * <I>Applications SHALL register to <code>com.gsma.services.nfc.TRANSACTION_EVENT</code> for receiving related events.</I>
	 * @exception SecurityException <BR>Indicate that application is not allowed to use this API.<UL>
	 * <LI>When UICC is the "active" SE,
	 * <BR>only applications signed with certificates stored in the UICC are granted to call this API.</LI>
	 * <LI>When eSE is the "active" SE,
	 * <BR>only applications signed with system certificates are granted to call this API.</LI></UL>
	 * @since NFCHST6.0 <I>(REQ_??)</I>
	 */
	public void enableMultiEvt_transactionReception() {
	}
	
}
