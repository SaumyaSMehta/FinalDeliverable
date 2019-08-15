package Deliverable3;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {
    ArrayList <Card> deckOfCards = new ArrayList<>();
     GroupOfCards()
    {
        addDeck();
        shuffle(deckOfCards);
    }

    public void addDeck()
 {
     for (int i = 0; i < 13; i++) {
    deckOfCards.add(new Card("Hearts", i + 1));
   }
   for (int i = 0; i < 13; i++) {
    deckOfCards.add(new Card("Diamonds", i + 1));
   }
   for (int i = 0; i < 13; i++) {
    deckOfCards.add(new Card("Spades", i + 1));
   }
   for (int i = 0; i < 13; i++) {
    deckOfCards.add(new Card("Clubs", i + 1));
   }
 }
    
  public void shuffle(ArrayList<Card> cards)
  {
      Collections.shuffle(cards);
  }
}
