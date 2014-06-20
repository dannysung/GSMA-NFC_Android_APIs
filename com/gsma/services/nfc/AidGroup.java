package com.gsma.services.nfc;

/**	
 * This class handles group of AID defined in an "Off-Host" service
 * @since NFCHST6.0 <I>(REQ_??)</I>, <a style="color:#FF0000">Host Card Emulation (HCE) support</a>
 */
public class AidGroup {

	AidGroup() {}
	
	/**
	 * Return the category of the group of AIDs.
	 * @return Category of the group of AIDs:<BR><UL>
	 * <LI><code>android.nfc.cardemulation.CardEmulation.CATEGORY_PAYMENT</code></LI>
	 * <LI><code>android.nfc.cardemulation.CardEmulation.CATEGORY_OTHER</code></IL></UL>
	 * @since NFCHST6.0
	 */
	public String getCategory() {
		return "";
	}
	
	/**
	 * Return the description of the group of AIDs.
	 * @return The description of the group of AIDs
	 * @since NFCHST6.0
	 */
	public String getDescription() {
		return "";
	}
	
	/**
	 * Add a new AID to the current group.
	 * @param Aid Application IDentifier to add to the current group
	 * @exception IllegalArgumentException <BR>Indicate that a method has been passed an illegal or inappropriate argument.
	 * @since NFCHST6.0
	 */
	public void addNewAid(String Aid) {
	}
	
	/**
	 * Remove an AID from the current group.
	 * @param Aid Application IDentifier to remove from the current group
	 * @exception IllegalArgumentException <BR>Indicate that a method has been passed an illegal or inappropriate argument.
	 * @since NFCHST6.0
	 */
	public void removeAid(String Aid) {
	}
	
}
