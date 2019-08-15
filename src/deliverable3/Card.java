package Deliverable3;

public class Card {
  private String suit;
  private int rank; //1 means Ace, .. 11 means J, 12 means Q, 13 means K 
 
  public Card(){}
 public Card(String suit, int rank){
  this.suit = suit; 
  this.rank = rank;
 }
 
 public int getRank()
 {
     return this.rank;
 }
 public String getSuit()
 {
     return this.suit;
 }
 @Override
 public String toString(){
    if (rank == 1){
   return "Ace of " + suit;
  }
   if (rank == 11){
   return "Jack of " + suit;
  }
  if (rank == 12){
   return "Queen of " + suit;
  }
  if (rank == 13)
   return "King of " + suit;
  
  return rank + " of " + suit;
 }
}
