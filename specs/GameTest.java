import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import CardGame.*;
import java.util.*;

public class GameTest{

  Deck deck;
  SuitType suits;
  NumberType numbers;
  Game game;
  Player player1;
  Player player2;

  @Before
  public void before(){
    deck = new Deck(suits, numbers);
    game = new Game();
    player1 = new Player("Jerry");
    player2 = new Player("Margot");
  }

  @Test
  public void canAddPlayers(){
    game.addPlayer(player1);
    game.addPlayer(player2);
    assertEquals(2, game.countPlayers());
  }

  @Test
  public void printArrayList(){
    System.out.println("HERE IT IS");
    System.out.println(game.getCards());
  }

  @Test
  public void checkTheDeck(){
    // deck.getCards();
    game.removeCard();
    assertEquals(51, game.countCards());
  }

  @Test
  public void checkTheDeckforFiftyTwoCards(){
    assertEquals(52, game.countCards());
  }

  @Test
  public void dealsCardsToPlayers(){
    game.addPlayer(player1);
    // game.addPlayer(player2);
    game.getCards();
    game.dealCards();
    assertEquals(49, game.countCards());
    // System.out.println(player1.showHand());
  }

  // @Test
  // public void print(){
  //   System.out.println("HERE IT IS");
  //   System.out.println(game.getDeck());
  //   System.out.println("HERE IT IS");
  // }

  

}




















// @Test
// public void dealsCardsToPlayers(){
//   // game.addPlayer(player1);
//   // game.addPlayer(player2);
//   // game.dealCards();
//   game.removeCard();
//   assertEquals(51, deck.getCards().size());
// }