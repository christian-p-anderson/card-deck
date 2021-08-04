public class MainApplication {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        int count = 0;
        for (CardModel card : deckOfCards.getDeck()) {
            System.out.println(card);
            count++;
        }
        System.out.println("Number of cards in the deck -> " + count);
        System.out.println("Dealt card -> " + deckOfCards.dealCard());
    }
}
