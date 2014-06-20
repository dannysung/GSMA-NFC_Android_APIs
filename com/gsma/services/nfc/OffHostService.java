package com.gsma.services.nfc;

import android.graphics.drawable.Drawable;

/**	
 * This class handles "Off-Host" services
 * @since NFCHST6.0 <I>(REQ_??)</I>, <a style="color:#FF0000">Host Card Emulation (HCE) support</a>
 */
public class OffHostService {
	
	OffHostService() {}

	/**
	 * Return the Secure Element name which holds the "Off-Host" service.
	 * @return Secure Element name holding the "Off-Host" service
	 * @see <a href="http://www.simalliance.org" target="_blank">SIM Alliance Open Mobile APIs</a> for Secure Element name guidelines
	 * @since NFCHST6.0
	 */
	public String getLocation() {
		return "";
	}
	
	/**
	 * Return the description of the "Off-Host" service.
	 * @return The Description of the "Off-Host" service
	 * @since NFCHST6.0
	 */
	public String getDescription() {
	return "";
	}
	
	/**
	 * Set a banner for the "Off-Host" service.
	 * @param banner A {@link Drawable} object representing the banner
	 * @since NFCHST6.0
	 */
	public void setBanner(Drawable banner) {
	}
	
	/**
	 * Return the banner linked to the "Off-Host" service.
	 * @return {@link Drawable} object representing the banner or <code>null</code> if no banner has been set
	 * @since NFCHST6.0
	 */
	public Drawable getBanner() {
		return null;
	}
	
	/**
	 * Create a new empty group of AIDs for the "Off-Host" service.
	 * @param description Description of the group of AIDs
	 * @param category Category the "Off-Host" service belongs to:<BR><UL>
	 * <LI><code>android.nfc.cardemulation.CardEmulation.CATEGORY_PAYMENT</code></IL>
	 * <LI><code>android.nfc.cardemulation.CardEmulation.CATEGORY_OTHER</code></IL></UL>
	 * @return An instance of an {@link AidGroup} class
	 * @since NFCHST6.0
	 */
	public AidGroup defineAidGroup(String description, String category) {
		return null;
	}
	
	/**
	 * Delete an existing AID group from the "Off-Host" service.
	 * @param group Instance of an {@link AidGroup} class to be deleted
	 * @since NFCHST6.0
	 */
	public void deleteAidGroup(AidGroup group) {
	}
	
	/**
	 * Return a list of the AID groups linked to the "Off-Host" service.
	 * @return A list of {@link AidGroup} instances or <code>null</code> if no such instance exists. 
	 * @since NFCHST6.0
	 */
	public AidGroup[] getAidGroups() {
		return null;
	}
	
	/**
	 * Update the Android Framework with all pending updates.
	 * @exception InsufficientResourcesException <BR>Indicate that insufficient resources are available in the routing table.
	 * @since NFCHST6.0
	 */
	public void commit() {
	}
	
}
