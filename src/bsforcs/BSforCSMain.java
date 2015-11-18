package bsforcs;

import javax.imageio.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.awt.image.*;
import java.util.Random;

public class BSforCSMain
{
   public static void main(String[] args)
	{
		// Create 3 new players
		BSforCSPlayer player1 = new BSforCSPlayer("Emily", 2, 2, 2);
		BSforCSPlayer player2 = new BSforCSPlayer("Dustin", 3, 1, 2);
		BSforCSPlayer player3 = new BSforCSPlayer("Mary", 0, 3, 3);
      
      BSforCSPlayer human = new BSforCSPlayer();
      BSforCSPlayer AI1 = new BSforCSPlayer();
      BSforCSPlayer AI2 = new BSforCSPlayer();
      
		
		// Display game board
		BSforCSFrame board = new BSforCSFrame();
		
      
      
		// Set tokens to default position
		board.setTokens(player1.getToken(), player2.getToken(), player3.getToken());
      
      // Determine Human & AI Players
      Random rand = new Random();
      int humanPlayer = rand.nextInt(3) + 1;
      System.out.println(humanPlayer);
      int AIone = 0;
      int AItwo = 0;
      if (humanPlayer == 1) {
         human = player1;
         human.setHuman(true);
         human.setNumber(1);
         AI1 = player2;
         AI2 = player3;
         AI1.setNumber(2);
         AI2.setNumber(3);
      }
      else if (humanPlayer == 2) {
         human = player2;
         human.setHuman(true);
         human.setNumber(2);
         AI1 = player1;
         AI2 = player3;
         AI1.setNumber(1);
         AI2.setNumber(3);
      }
      else if (humanPlayer == 3) {
         human = player3;
         human.setHuman(true);
         human.setNumber(3);
         AI1 = player1;
         AI2 = player2;
         AI1.setNumber(1);
         AI2.setNumber(2);
      } 
            // Set Players in Board
      board.setPlayers(human, AI1, AI2);
      // Display Current Info
      board.updateInfoPanel(human, AI1, AI2);
      
      board.pack();
		// Set frame to exit on close
	   board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
		// Sets frame to be visible
		board.setVisible(true);
      
      board.actionList.setText("Human Player is " + human.getName());
      System.out.println("AI 1 is " + AI1.getName());
      System.out.println("AI 2 is " + AI2.getName());
      
      // SEQUENCING TURNS: Human - AI1 - AI2
      // LOGIC: Still needs fixin'
      // 1) Draw a Card
      // 2) Move Three Spaces
      // 3) Play a Card
      // 4) Repeat
      int counter = humanPlayer;
      board.setPlayer(human);
      board.getCurrentListOfRooms(human);
      //human.setMoves(3);
      System.out.println("Current Player: " + board.getPlayer().getName());
      //board.moveButton();
      TokenChooser t = new TokenChooser(true, false, true, human);
      //System.out.println("Player in Current Player: " + board.currentPlayer.getName());  
      while(board.deck.getPlayableDeck().size() > 0)
      {
         //System.out.println("Player in Current Player: " + board.currentPlayer.getName());  
         //System.out.println("Moves Left in Main: " + board.currentPlayer.getMovesLeft());   
         boolean checkTurn = board.getCPlayer().getPlayCard();
         if(checkTurn)
            {
               System.out.println("Hello?");
               board.reenableButtons();
               board.getCPlayer().resetTurn();
            }

      }
      
	}	
}
