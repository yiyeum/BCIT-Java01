/**
 * @author KateYeEumLee
 * @version 1.8
 */
public class Card {
	private String suit;
	private String description;
	
	public Card(){}
	public Card(String description, String suit) {
		setDescription(description);
		setSuit(suit);
	}

	/**
	 * Method to get the suit.
	 * @return the suit as a String.
	 */
	public String getSuit() {
		return suit;
	}

	/**
	 * Method to set the suit.
	 * @param suit the suit to set
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}

	/**
	 * Method to get the description.
	 * @return the description as a String.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Method to set the description.
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
