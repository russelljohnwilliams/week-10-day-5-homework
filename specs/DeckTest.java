import static org.junit.Assert.*;
import org.junit.*;

import CardGame.*;
import java.util.*;

public class DeckTest{

  Deck deck;
  SuitType suits;
  NumberType numbers;
  Player player1;
  Player player2;

  @Before
  public void before(){
    deck = new Deck(suits, numbers);
    player1 = new Player("Jerry");
    player2 = new Player("Margot");
  }

  @Test
  public void deckHasCards(){
    deck.getCards();
    assertEquals(52, deck.getDeck().size());
  }


  @Test
  public void checkTheDeck(){
    deck.getCards();
    deck.removeCard();
    assertEquals(51 , deck.getDeck().size());
  }

  // @Test
  // public void printCards(){
  //   ArrayList cards = deck.getCards();
  //   for(Object object : cards){
  //     Card original = (Card) object;
  //     System.out.println(original.getSuit());
  //     System.out.println(original.getNumber());
  //   }
  // }
}





