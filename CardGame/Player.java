package CardGame;
import CardGame.*;
import java.util.*;

public class Player{

  private ArrayList<Card> hand;
  private String name;
  private Card card;
  private SuitType suits;
  private NumberType numbers;

  public Player(String name){
    this.name = name;
    this.hand = new ArrayList<Card>();
    this.card = new Card(suits, numbers);
  }

  public String getName(){
    return this.name;
  }

  public void dealHand(Card card1){
    this.hand.add(card1);
  }

  public int countHand(){
    return hand.size();
  }

  public ArrayList<Card> getHand(){
    return this.hand;
  }

//calculates total value of hand based upon the .ordinal of the enum 
//(see Card Class getNumbersNumber())

  public int totalValueOfHand(){
    int total = 0;
    for (Card card : this.hand){
      total += card.getNumbersNumber();
    }
    return total;
  }

  public boolean checkForPrial(){
    int card1 = hand.get(0).getNumbersNumber(); 
    int card2 = hand.get(1).getNumbersNumber(); 
    int card3 = hand.get(2).getNumbersNumber(); 
      if (((card2 == card1 + 1) || (card2 == card1 - 1)) && ((card3 == card1 + 1) || (card3 == card1 - 1))){
        return true;
      } else {
        return false;
      }
    }
  

}



