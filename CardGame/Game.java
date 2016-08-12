package CardGame;
import CardGame.*;
import java.util.*;


public class Game{

  private ArrayList<Player> players = new ArrayList<Player>();
  private ArrayList<Card> deck;

  public void addPlayer(Player player){
    players.add(player);
  }

  public int countPlayers(){
    return this.players.size();
  }


 // public void dealCards(){
 //   for (Player player : players){
 //       player.dealHand(deck.get(1));
 //       deck.remove(0);
 //   }
 // }

  public void dealCards(){
    // for (Player player : players){
    //   for(int i = 0; i < 3; i++){ 
    //     player.dealHand(deck.get(i));
        deck.remove(0);
        deck.remove(1);
        deck.remove(2);
    //   }
    // }
  }
}
