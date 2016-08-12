import static org.junit.Assert.*;
import org.junit.*;

import CardGame.*;
import java.util.*;

public class DeckTest{

  Deck deck;
  SuitType suits;
  NumberType numbers;

  @Before
  public void before(){
    deck = new Deck(suits, numbers);
  }

  @Test
  public void deckHasCards(){
    assertEquals(52, deck.getCards().size());
  }

  // @Test
  // public void checkTheDeck(){
  //   assertEquals(52, deck.getDeck().size());
  // }

  // @Test
  // public void printCards(){
  //   ArrayList cards = deck.getCards();
  //   for(Object object : cards){
  //     Card original = (Card) object;
  //     System.out.println(original.getSuit());
  //     System.out.println(original.getNumber());
  //   }
  // }

  // @Test
  // public void dealsCardsToPlayers(){
  //   assertEquals()
  // }



}





