import static org.junit.Assert.*;
import org.junit.*;

import CardGame.*;
import java.util.*;

public class CardTest{
  
  Card card;

  @Before
  public void before(){
    card = new Card(SuitType.SPADE, NumberType.ACE);
  } 

  @Test
  public void cardHasANumber(){
    assertEquals(NumberType.ACE, card.getNumber());
  }

  @Test
  public void cardHasASuit(){
    assertEquals(SuitType.SPADE, card.getSuit());
  }

  

}