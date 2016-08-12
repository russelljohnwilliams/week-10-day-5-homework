package CardGame;
import CardGame.*;
import java.util.*;


public class Game{

  private ArrayList<Player> players = new ArrayList<Player>();
  private static ArrayList<Card> deck = new ArrayList<Card>();

  public void addPlayer(Player player){
    players.add(player);
  }

  public int countPlayers(){
    return this.players.size();
  }

  public void dealCardsToPlayers(){
    for (Player player : players){}
      for(int i = 0; i < 3; i++){
        Object card = deck.get(0);
        //player.hand.add(card); //<<<<<< this thing here
        deck.remove(0);
      }
    }
  }

