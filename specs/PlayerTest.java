import static org.junit.Assert.*;
import org.junit.*;

import CardGame.*;
import java.util.*;

public class PlayerTest{

  Player player1;
  Card card1;
  Card card2;
  Card card3;
  Game game;
  Deck deck;


  @Before
  public void before(){
    player1 = new Player("Elliot");
    card1 = new Card(SuitType.SPADE, NumberType.ACE);
    card2 = new Card(SuitType.HEART, NumberType.FOUR);
    card3 = new Card(SuitType.DIAMOND, NumberType.KING);
    game = new Game();
  }

  @Test
  public void emptyHand(){
    assertEquals(0, player1.countHand());
  }

  @Test
  public void playerHasCards(){
    player1.dealHand(card1);
    assertEquals(1, player1.countHand());
  }

  @Test
  public void showPlayersCards(){
    player1.dealHand(card1);
    player1.dealHand(card2);
    player1.dealHand(card3);
    // System.out.println("PLAYER TEST - SHOW HAND");
    // System.out.println(player1.showHand());
  }

  @Test
  public void printHand(){
    player1.dealHand(card1);
    player1.dealHand(card2);
    player1.dealHand(card3);
    ArrayList hand = player1.showHand();
    for(Object object : hand){
      // Card original = (Card) object;
      // System.out.println("PLAYER TEST - PRINT HAND");
      // System.out.println(original.getSuit());
      // System.out.println(original.getNumber());
    }
  }

  @Test
  public void calculateTheValueOfPlayer1Hand(){
    player1.dealHand(card1);
    player1.dealHand(card2);
    player1.dealHand(card3);
    assertEquals(25, player1.totalValueOfHand());
  }

}

