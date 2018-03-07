package pkgCore;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;



public class DeckTest {

	@Test
	public void TestDeck() {
		
		//DONE : Build a deck(1), make sure there are 52 cards in the deck
		Deck d_1 = new Deck(1);
		assertEquals(d_1.getNumOfCards(), 52);
		int i = 0;
		d_1.Shuffle();
		for (Card c : d_1.getCards()) {
		
			System.out.println(i + " " + c.geteRank().toString() + " " + c.geteSuit().toString());
			i++;
			
		}
		
		System.out.println();
		
		//DONE : Build a deck(6), make sure there are 312 cards in the deck 
		Deck d_2 = new Deck(6);
		assertEquals(d_2.getNumOfCards(), 312);
		int j =0;
		d_2.Shuffle();
		for (Card c : d_2.getCards()) {
			
			System.out.println(j + " " + c.geteRank().toString() + " " + c.geteSuit().toString());
			j++;
			
		}
	}

}
