package CardGame;
import CardGame.*;
import java.util.*;

public class Game{

  private ArrayList<Player> players;
  private Deck deck;
  private ArrayList<Card> cards;
  private SuitType suits;
  private NumberType numbers;

  public Game(){

    this.players = new ArrayList<Player>();
    this.deck = new Deck(suits, numbers); //<< this allows access to Deck Class.
    this.cards = deck.getCards();  //<< this creates & fills a new ArrayList<Card> from Deck Class.
  }

  public ArrayList<Card> getCards(){
    return this.cards;
  }

  public int countCards(){
    return this.cards.size();
  }

  public void addPlayer(Player player){
    players.add(player);
  }

  public int countPlayers(){
    return this.players.size();
  }

  public void removeCard(){
   cards.remove(0);
 }

 public ArrayList<Player> getPlayers(){
  return this.players;
 }


 public void dealCards(){
  for (Player player : this.players){
    for(int i = 0; i < 3; i++){ 
      player.dealHand(cards.get(i));
      cards.remove(i);
      }
    }
  }

  public Object searchForAWinner(){
    int play1 = players.get(0).totalValueOfHand();
    int play2 = players.get(1).totalValueOfHand();
    if (play1 > play2){
      return players.get(0);
    } else if (play1 == play2){
      return null;
    } else {
      return players.get(1);
    }
  }



}





