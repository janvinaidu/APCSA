/*
This class is a practice of a card game. To design the game, we can go through the logics.
This is an open game, could be various.
step 1. what is the class name?
step 2. create instance variable: suite, rank, pointValue.  Create private variables.
brainstorming the process to figure out what variables include in the card.
step 2. Construct the class: what attributes/states could we have in a card game?
Card(String theRank, String theSuit, int pv)
step 3. accessor methods. getCard(), calValue(), matches(Card c), toString(), getSuit(), getRank(), getPointValue()
 */

public class Card {
    private ;
    private ;
    private ;

    public Card(String theRank, String theSuit, int pv) // inside the parenthesis, instance variables not parameter
    {
        suit = theSuit; // will be the same in the situation: String rank ---> rank = this.rank . the way is only right when it is not static method.
                        // this refers to the object itself in the class. the same as 'self' in python.
        rank = theRank;
        pointValue = pv;
    }
    //accessor methods -- many of them one line return the attribute
    public String getSuit()
    {
        return suit;
    }

    public String getRank()
    {
        return rank
    }

    public int getPointValue()
    {
        return pointValue
    }

    public boolean matches(Card c) //compare two cards
    {
        return rank.equals(c.rank) && suit.equals(c.suit);
    }

    // toString method
    public String toString()
    {

        return rank + " of" + " suit " + suit + " point value " + pointValue;
    }
}
