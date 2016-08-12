package CardGame;
import CardGame.*;
import java.util.*;

public class Deck{

  private ArrayList<Card> deck;
  private SuitType suits;
  private NumberType numbers;


  public Deck(SuitType suits, NumberType numbers){
    this.deck = new ArrayList<Card>();
    this.suits = suits;
    this.numbers = numbers;
  }

  public ArrayList getCards(){
    for (SuitType suit : SuitType.values()){
      for (NumberType number : NumberType.values()){
        Card card = new Card(suit, number);
        this.deck.add(card);
      }
    }
    shuffleDeck();
    return this.deck;
  }

  public void shuffleDeck(){
    Collections.shuffle(deck);
  }

  // public ArrayList<Card> getDeck(){
  //   return this.deck;
  // }



}





