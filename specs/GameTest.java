import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import CardGame.*;
import java.util.*;

public class GameTest{

  Game game;
  Player player1;
  Player player2;

  @Before
  public void before(){
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
}