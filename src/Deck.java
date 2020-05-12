
public class Deck {

    private Card deck[] = new Card[52];
    private int cardNum = 0;

    public Deck(){
        System.out.println("You have created a new deck. Add 52 cards or less");

    }

    public void addCard(Card newCard){
        cardNum = cardNum + 1;
        deck[cardNum] = newCard;
        System.out.println("New Card Added at: deck["+cardNum+"] in this deck instance");
        System.out.println("    Name: " + newCard.getName());
        System.out.println("    Suit: " + newCard.getSuit());
        System.out.println("    Value: " + newCard.getValue());
        System.out.println("Remaining spaces in this deck: "+(52-cardNum));
    }

    public Card dealCard(){
        if(cardNum == 0){
            System.out.println("Current deck is empty");
            return new Card();
        }
        Card temp = deck[cardNum];
        deck[cardNum] = new Card();
        System.out.println("Card dealt at "+cardNum+" deck capacity");
        cardNum --;
        return temp;
    }

    public void shuffleDeck(){
        // work in progress

    }
}
