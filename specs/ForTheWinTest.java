// import static org.junit.Assert.*;
// import org.junit.*;

// import CardGame.*;
// import java.util.*;

// public class ForTheWinTest{

//   Deck deck;
//   SuitType suits;
//   NumberType numbers;
//   ForTheWin forTheWin;
//   Game game;

//   Player player1;
//   Player player2;
//   ArrayList<Player> players;

//   Card card1;
//   Card card2;
//   Card card3;
//   Card card4;
//   Card card5;
//   Card card6;

//   @Before 
//   public void before(){

//     deck = new Deck(suits, numbers);
//     game = new Game();
//     forTheWin = new ForTheWin();
   
//     player1 = new Player("Jerry");
//     player2 = new Player("Margot");
//     players = new ArrayList<Player>();
   
//     game.addPlayer(player1);
//     game.addPlayer(player2);
   
//     card1 = new Card(SuitType.CLUB, NumberType.FIVE);
//     card2 = new Card(SuitType.SPADE, NumberType.NINE);
//     card3 = new Card(SuitType.HEART, NumberType.KING);
//     card4 = new Card(SuitType.CLUB, NumberType.ACE);
//     card5 = new Card(SuitType.HEART, NumberType.SEVEN);
//     card6 = new Card(SuitType.DIAMOND, NumberType.JACK);

//     player1.dealHand(card1);
//     player1.dealHand(card2);
//     player1.dealHand(card3);
//     player2.dealHand(card4);
//     player2.dealHand(card5);
//     player2.dealHand(card6);
// }
    

//     @Test
//     public void weHaveAWinner(){
//       assertEquals(player2, forTheWin.searchForAWinner());
//     }


//   }



