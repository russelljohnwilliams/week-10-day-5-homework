package CardGame;
import CardGame.*;
public class Card{

  SuitType suit;
  NumberType number;

  public Card(SuitType suit, NumberType number) {
    this.suit = suit;
    this.number = number;
  }

  public SuitType getSuit(){
    return this.suit;
  }

//gets the position of the enum and uses it as points scored from cards played.
  public int getNumbersNumber(){
    return this.number.ordinal();
  }

  public NumberType getNumber(){
    return this.number;
  }
  

}