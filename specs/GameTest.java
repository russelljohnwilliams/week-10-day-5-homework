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
  public void checkTheDeck(){
    assertEquals(52, deck.getCards());
  }



  // @Test
  // public void dealsCardsToPlayers(){
  //   game.addPlayer(player1);
  //   game.addPlayer(player2);
  //   game.dealCards();
  //   assertEquals(49, deck.getCards().size());
  // }

}