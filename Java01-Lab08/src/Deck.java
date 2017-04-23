import java.util.ArrayList;

/**
 * @author KateYeEumLee
 * @version 1.8
 */
public class Deck {
	public static final String[] SUITS = {"Hearts", "Diamonds", "Spades",
	"Clubs"};
	public static final String[] DESCRIPTIONS = {"Ace", "Two", "Three",
	"Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
	"Queen", "King"};
	public ArrayList<Card>deck;
	
	public Deck() {
		deck = new ArrayList<Card>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deck theDeck = new Deck();
		theDeck.loadDeck();
		//remove 1st position of arrayList.
		theDeck.removeCard(0);
		theDeck.printDeck();
	}

	/**
	 * Method to load the deck using nested for loops.
	 */
	public void loadDeck(){
		for(int i = 0; i < SUITS.length; i++){
			for(int j = 0; j < DESCRIPTIONS.length; j++){
				Card theCard = new Card(DESCRIPTIONS[j],SUITS[i]);
				deck.add(theCard);
			} //  for 2
		} // for 1
	} // loadDeck()

	/**
	 * Method to remove card taking int parameter.
	 */
	public void removeCard(int index){
		if(index >= 0 && index <= deck.size()){
			 deck.remove(index);
		}
	}
	
	/**
	 * Method to print the deck ArrayList using for-each loop.
	 */
	public void printDeck(){
		for(Card c : deck){
			System.out.println(c.getDescription() + " of " + c.getSuit());
		}
	}
	
}
