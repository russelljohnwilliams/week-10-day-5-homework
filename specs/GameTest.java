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
    System.out.println("GAME TEST - GET CARDS");
    System.out.println(game.getCards());
  }

  @Test
  public void checkTheDeck(){
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
    game.addPlayer(player2);
    // deck.shuffleDeck();
    game.getCards();
    game.dealCards();
    assertEquals(46, game.countCards());
    System.out.println("GAME TEST, SHOW - HAND");
    System.out.println(player1.showHand());
    System.out.println(player2.showHand());
  }

   @Test
    public void printCards(){
      game.addPlayer(player1);
      game.addPlayer(player2);
      game.getCards();
      game.dealCards();
      ArrayList cards = player1.showHand();
      for(Object object : cards){
        Card original = (Card) object;
        System.out.println("GAME TEST - PRINT PLAYER1 HAND");
        System.out.println(original.getSuit());
        System.out.println(original.getNumber());
      };
      ArrayList cardy = player2.showHand();
      for(Object object : cardy){
        Card original = (Card) object;
        System.out.println("GAME TEST - PRINT PLAYER2 HAND");
        System.out.println(original.getSuit());
        System.out.println(original.getNumber());
      }
    }

}
