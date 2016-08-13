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
    this.deck = new Deck(suits, numbers); //<< this allows access to Deck Class!!!
    this.cards = deck.getCards();  //<< this creates fills a new ArrayList<Card> from Deck Class!!! 
  }

public ArrayList<Card> getCards(){
  return cards;
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


  // public void dealCards(){
    // for (Player player : players){
    //   for(int i = 0; i < 3; i++){ 
    //     player.dealHand(cards.get(i));
        // cards.remove(0);
 
      // }
  //   }
  // }
}
