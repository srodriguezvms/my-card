import processing.core.PApplet;

public class Card {
    private String name;
    private String suit;
    private int value;


    public Card(){
        //System.out.println("New Card");
    }

    public Card(String myName, String mySuit, int myValue){
        name = myName;
        suit = mySuit;
        value = myValue;

        System.out.println("Card: "+name+" of "+suit+" with a value of "+ value);
    }

    //Accessor Method

    public String getName(){
        return name;
    }
    public String getSuit(){
        return suit;
    }
    public int getValue(){
        return value;
    }


    //Mutator

    public void setName(String newName){
        name = newName;
    }
    public void setSuit(String newSuit){
        suit = newSuit;
    }
    public void setValue(int newValue){
        value = newValue;
    }

    public String toString(){
        return "Name: "+ name + " Suit: " + suit + "Value:" + value;
    }


    public static void drawCard(PApplet screen, int x, int y, String name, String suit, int value){
        final int WIDTH = 62;
        final int LENGTH = 88;

        screen.fill(255);
        screen.rect(x,y,WIDTH,LENGTH);

        screen.fill(0);
        screen.text(name, x+21, y+24 );
        screen.text(suit, x+11, y+44 );
        screen.text(value, x+21, y+64 );
    }
}
