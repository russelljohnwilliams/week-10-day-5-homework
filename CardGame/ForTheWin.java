package CardGame;
import CardGame.*;
import java.util.*;

public class ForTheWin{

  private ArrayList<Player> players;
  private Deck deck;
  private ArrayList<Card> cards;
  private SuitType suits;
  private NumberType numbers;
  private Game game;

  public ForTheWin(){

    
    this.deck = new Deck(suits, numbers);
    this.game = new Game();
    this.cards = deck.getCards();
    this.players = game.getPlayers();
  }

// takes each player from arraylist (.get(i)) and calculates the score of the hand using .totalValueOfHand() from the Player Class

  public Object searchForAWinner(){
    int player1 = players.get(0).totalValueOfHand();
    int player2 = players.get(1).totalValueOfHand();
    if (player1 > player2){
      return players.get(0);
    } else if (player1 == player2){
      return null;
    } else {
      return players.get(1);
    }
  }

}
