import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import CardGame.*;
import java.util.*;

public class PlayerTest{

  Player player1;
  Card card1;
  Card card2;
  Card card3;
  Game game;

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
    // game.dealCards();
    player1.dealHand(card1);
    assertEquals(1, player1.countHand());
  }

}

