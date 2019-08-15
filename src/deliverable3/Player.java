package Deliverable3;

import java.util.*;

public class Player {
private final String name;
private int numberOfCards;
private ArrayList<Card> deck = new ArrayList<>();
Player(String name)
{
    this.name = name;
}
Player(String name, ArrayList<Card> deck , int numberOfCards)
{
    this.name = name;
    this.numberOfCards=numberOfCards;
    for(Card c:deck)
    {
    this.deck.add(c);
    }
}

public int getNumberOfCards() {
    return numberOfCards;
}

public void setNumberOfCards(int numberOfCards) {
    this.numberOfCards = numberOfCards;
}

public String getName()
{
    return name;
}
public void setToDeck(Card c)
{
    this.deck.add(c);
}
public void setDeck(ArrayList<Card> cards)
{
    for(Card c: cards)
    {
    this.deck.add(c);
    }
}
public ArrayList<Card> getDeck()
{
    return deck;
}
public int getRankFromDeck()
{
    return this.deck.get(numberOfCards-1).getRank();
}
}
