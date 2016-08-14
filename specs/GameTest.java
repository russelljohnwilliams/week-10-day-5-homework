import static org.junit.Assert.*;
import org.junit.*;

import CardGame.*;
import java.util.*;

public class GameTest{

  Deck deck;
  SuitType suits;
  NumberType numbers;
  Game game;
  Player player1;
  Player player2;
  ArrayList<Player> players;

    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Card card5;
    Card card6;

  @Before
  public void before(){
    deck = new Deck(suits, numbers);
    game = new Game();
    player1 = new Player("Jerry");
    player2 = new Player("Margot");
    players = new ArrayList<Player>();
    game.addPlayer(player1);
    game.addPlayer(player2);

        card1 = new Card(SuitType.CLUB, NumberType.FIVE);
        card2 = new Card(SuitType.SPADE, NumberType.NINE);
        card3 = new Card(SuitType.HEART, NumberType.KING);
        card4 = new Card(SuitType.CLUB, NumberType.ACE);
        card5 = new Card(SuitType.HEART, NumberType.SEVEN);
        card6 = new Card(SuitType.DIAMOND, NumberType.JACK);
  }

  @Test
  public void canAddPlayers(){
    assertEquals(2, game.countPlayers());
  }

  @Test
  public void canGetPlayers(){
    assertEquals(2, game.getPlayers().size());
  }

  @Test
  public void printArrayList(){
    // System.out.println("GAME TEST - GET CARDS");
    // System.out.println(game.getCards());
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
    // deck.shuffleDeck();
    game.getCards();
    game.dealCards();
    assertEquals(46, game.countCards());
    // System.out.println("GAME TEST, SHOW - HAND");
    // System.out.println(player1.showHand());
    // System.out.println(player2.showHand());
  }

   @Test
    public void printCards(){
      game.getCards();
      game.dealCards();
      ArrayList cards = player1.showHand();
      for(Object object : cards){
        Card original = (Card) object;
        System.out.println("GAME TEST - PRINT PLAYER1 HAND");
        System.out.println(original.getSuit());
        System.out.println(original.getNumber());
        System.out.println(original.getNumbersNumber());
      };
      ArrayList cardy = player2.showHand();
      for(Object object : cardy){
        Card original = (Card) object;
        System.out.println("GAME TEST - PRINT PLAYER2 HAND");
        System.out.println(original.getSuit());
        System.out.println(original.getNumber());
        System.out.println(original.getNumbersNumber());
      }
    }

   @Test
   public void weHaveAWinner(){
     player1.dealHand(card1);
     player1.dealHand(card2);
     player1.dealHand(card3);
     player2.dealHand(card4);
     player2.dealHand(card5);
     player2.dealHand(card6);
     System.out.println(player1.totalValueOfHand());
     System.out.println(player2.totalValueOfHand());
     assertEquals(player2, game.searchForAWinner());
     assertEquals(player2, game.searchForAWinner());
   }

}







