import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
            assert values.length == rank.leangth: "rank isnt the same";
            assert suits.length != 0 && values.lenght !=0 :"suit is empty";
        cards = new ArrayList<Card>();
        for (int j = 0; j < ranks.length; j++) {
            assert j < values.length : "counter is too large";
            for (String suitString : suits){
                cards.add(new Card(ranks[j], suitString, values[j]));
            }
	}
        assert !cards.isEmpty() : "cards size is 0";
        size=cards.size();
        asser !this.isEmpty() : "this dec is empty";
        }


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
            	if(this.cards.size()==0){
			return true;
		}
		return false;
            }
	

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
                return this.cards.size();
}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	 for( int b = this.size() - 1; b >= 0; b-- ) {
                    assert b cards.size(): "counter B is larger then arraylist";
		    int a = (int)(Math.random() * b);
                    assert a < cards.size(): "randome num is out of bounds";
		    Card temp = cards.get(a);
	            cards.set(a, cards.get(b));
	            cards.set(b, temp);
		 }
            this.size = cards.size();
}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        // IS EMPTY if so return null
        if (this.size <= 0){
            assert this.size == 0: "the deck is not actually empty";
            return null;
        }
        assert this.size > 0 : "the deck is actually empty";
        size--;
        Card c = cards.get(size);
        return c;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
                        assert k < cards.size() : "counter is too larg";
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
            }
       }
   