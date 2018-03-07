package pkgCore;

import pkgEnum.eRank;
import pkgEnum.eSuit;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	//	DONE: Add 'cards' attribute that is an ArrayList of Card
	private ArrayList<Card> cards  = new ArrayList<Card>();
	
	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public int getNumOfCards() {
		return cards.size();
	}
	//	DONE: Add a contructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc

	//			Deck(2) will create an array of 104 cards.
    public Deck(int numOfDeck) {   	

 
        for (int i = 0; i < numOfDeck; i++) {
  
            for (eSuit suit : eSuit.values()) {
            	
                for (eRank rank: eRank.values()) {

                    cards.add(new Card(suit, rank));
                }
            }
        }
    }
    
    public void Shuffle() {
    		// shuffle
    		Collections.shuffle(this.cards);
    	
    }
	
	//	DONE: Add a draw() method that will take a card from the deck and
	//			return it to the caller
    public Card draw() {
        return cards.remove(0);
    }

}
