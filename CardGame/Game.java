package CardGame;
import CardGame.*;
import java.util.*;


public class Game{

  private ArrayList<Player> players;
  private Deck deck;
  private SuitType suits;
  private NumberType numbers;

  public Game(){
    this.players = new ArrayList<Player>();
    this.deck = new Deck(suits, numbers);
  } 
  
  public Object getDeck(){
    return deck;
  }

  public void addPlayer(Player player){
    players.add(player);
  }

  public int countPlayers(){
    return this.players.size();
  }

  // public void removeCard(){
  //    deck.remove(0);
  // }

 public void dealCards(){ 
       // this.deck.remove(0);
   }


  // public void dealCards(){
    // for (Player player : players){
    //   for(int i = 0; i < 3; i++){ 
    //     player.dealHand(deck.get(i));
        // deck.remove(0);
        // deck.remove(1);
        // deck.remove(2);
    //   }
    // }
  // }
}
