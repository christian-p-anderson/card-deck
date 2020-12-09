import java.util.Collections;
import java.util.Stack;

public class DeckOfCards extends Stack<Card> {
    private Stack<Card> deckOfCards;
    public DeckOfCards() {
        refreshDeck();
        this.deckOfCards = shuffleDeck();
    }
    public Stack<Card> getDeck() {
        return deckOfCards;
    }
    Stack<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }
    public Card dealCard() {
        return deckOfCards.pop();
    }
    void refreshDeck() { // this creates the deck of cards
        Stack<Card> newDeck = new Stack<>();
        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                Card temp = new Card(s, r);
                newDeck.push(temp);
            }
        }
        this.deckOfCards = newDeck;
    }
}
