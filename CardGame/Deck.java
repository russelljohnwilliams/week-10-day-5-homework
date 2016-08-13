package CardGame;
import CardGame.*;
import java.util.*;

public class Deck{

  public ArrayList<Card> deck;
  private SuitType suits;
  private NumberType numbers;


  public Deck(SuitType suits, NumberType numbers){
    this.deck = new ArrayList<Card>();
    this.suits = suits;
    this.numbers = numbers;
  }

  public ArrayList<Card> getCards(){
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

  public void removeCard(){
    deck.remove(0);
  }

  public ArrayList<Card> getDeck(){
    return this.deck;
  }



}





