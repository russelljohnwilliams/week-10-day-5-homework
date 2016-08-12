package CardGame;
import CardGame.*;
import java.util.*;

public class Player{

  private ArrayList<Card> hand;
  private String name;

  public Player(String name){
    
    this.name = name;
    this.hand = new ArrayList<Card>();
  }

  public String getName(){
    return this.name;
  }

  public int countHand(){
    return hand.size();
  }

}