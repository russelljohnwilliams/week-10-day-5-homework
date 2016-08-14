import static org.junit.Assert.*;
import org.junit.*;

import CardGame.*;
import java.util.*;

public class PlayerTest{

  Player player1;
  Card card1;
  Card card2;
  Card card3;
  Card card4;
  Card card5;
  Card card6;
  Game game;
  Deck deck;


  @Before
  public void before(){
    player1 = new Player("Elliot");
    card1 = new Card(SuitType.SPADE, NumberType.ACE);
    card2 = new Card(SuitType.HEART, NumberType.FOUR);
    card3 = new Card(SuitType.DIAMOND, NumberType.KING);
    card4 = new Card(SuitType.HEART, NumberType.FIVE);
    card5 = new Card(SuitType.CLUB, NumberType.FOUR);
    card6 = new Card(SuitType.CLUB, NumberType.SIX);
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
    // System.out.println(player1.getHand());
  }

  @Test
  public void printHand(){
    player1.dealHand(card1);
    player1.dealHand(card2);
    player1.dealHand(card3);
    ArrayList hand = player1.getHand();
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

  // @Test
  // public boolean checkForPrial(){
  //   player1.dealHand(card4);
  //   player1.dealHand(card5);
  //   player1.dealHand(card6);
  //   assertEquals(true, player1.checkForPrial());  
  // }

}

