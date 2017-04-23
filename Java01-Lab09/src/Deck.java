import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author KateYeEumLee
 * @version 1.9
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
		//remove Card which has the same suit as the parameter.
		theDeck.removeBySuit("Hearts");
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
	 * Method to remove the Card by Suit
	 */
	public void removeBySuit(String suit){
		Iterator <Card>iter = deck.iterator();
		while(iter.hasNext()){
			Card iterCard = new Card();
			iterCard = iter.next();
			if(iterCard.getSuit() == suit){
				iter.remove();
			}
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
