import processing.core.PApplet;

public class App extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("App");

    }

    public void settings()
    {
        size(800,600);
        Card card0 = new Card("King", "Spades",10);
        Card card1 = new Card("Queen","Diamonds",6);

        /*card0.setName("Ace");
        card0.setSuit("Spades");
        card0.setValue(1);*/

        Deck deck0 = new Deck();
        deck0.addCard(card0);
        deck0.addCard(card1);

        Card dealCard = deck0.dealCard();

        System.out.println(dealCard.getName());
        System.out.println(dealCard.getSuit());
        System.out.println(dealCard.getValue());

        dealCard = deck0.dealCard();

        System.out.println(dealCard.getName());
        System.out.println(dealCard.getSuit());
        System.out.println(dealCard.getValue());

        dealCard = deck0.dealCard();

        System.out.println(dealCard.getName());
        System.out.println(dealCard.getSuit());
        System.out.println(dealCard.getValue());

        deck0.addCard(card0);
        deck0.addCard(card1);
        deck0.addCard(card0);
        deck0.addCard(card1);

        deck0.shuffleDeck();








    }

    public void draw(){
        /*Card card0 = new Card("King", "Spades",10);
        Card card1 = new Card("Queen","Diamonds",6);
        Card.drawCard(this,100,100, "Ace", "Spades", 0);
        Card.drawCard(this,200,100, card0.getName(), card0.getSuit(),card0.getValue());
        Card.drawCard(this,300,100, card1.getName(), card1.getSuit(),card1.getValue());
         */
    }

}