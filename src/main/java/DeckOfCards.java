import java.util.Collections;
import java.util.Stack;

public class DeckOfCards extends Stack<CardModel> {
    private Stack<CardModel> deckOfCards;

    public DeckOfCards() { //when this method is called a new deck of cards is generated and shuffled
        refreshDeck();
        this.deckOfCards = shuffleDeck();
    }

    Stack<CardModel> shuffleDeck() { //this method shuffles the deck
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }

    public Stack<CardModel> getDeck() {
        return deckOfCards;
    }

    public CardModel dealCard() {
        return deckOfCards.pop();
    }

    void refreshDeck() { // this creates the deck of cards
        Stack<CardModel> newDeck = new Stack<>();

        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                CardModel temp = new CardModel(s, r);
                newDeck.push(temp);
            }
        }
        this.deckOfCards = newDeck;
    }
}
