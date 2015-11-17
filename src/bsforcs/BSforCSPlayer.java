package bsforcs;

import java.util.ArrayList;
import javax.swing.*;

public class BSforCSPlayer extends BSforCSFrame
{
	private String name;
   private boolean isHuman = false;
   private int number;
   private int qualityPoints;
   private int learning;
   private int integrity;
   private int craft;
	private JLabel token;
   private BSforCSRoom currentRoom;
   private ArrayList<BSforCSCard> hand;
   private int movesLeft = 3;
   private boolean drawCard = false;
   private boolean playCard = false;
	
	public BSforCSPlayer(String playerName, int l, int i, int c)
	{
		name = playerName;
		token = new JLabel(name);
      currentRoom = ECS308;
      learning = l;
      integrity = i;
      craft = c;
      hand = new ArrayList<>();
	}
   
   public BSforCSPlayer() {
      
   }
	public void setHuman(boolean b) {
      isHuman = b;
   }
   
   public boolean isHuman() {
      return isHuman;
   }
	public String getName()
	{
		return name;
	}
	
	public JLabel getToken()
	{
		return token;
	}
   
   public BSforCSRoom getCurrentRoom() {
      return currentRoom;
   }
   
   public void setCurrentRoom(BSforCSRoom room) {
      currentRoom = room;
   }
   
   public void setNumber(int num) {
      number = num;
   }
   
   public int getNumber() {
      return number;
   }
   
   public void setMoves(int i) {
      movesLeft = i;
   }
   /**
    * @return the qualityPoints
    */
   public int getQualityPoints() {
      return qualityPoints;
   }

   /**
    * @param qualityPoints the qualityPoints to set
    */
   public void addQualityPoints(int qualityPoints) {
      this.qualityPoints += qualityPoints;
   }
   
   public void minusQualityPoints(int qualityPoints) {
      int temp = this.qualityPoints;
      int end = temp -= qualityPoints;
      if (end < 0) { // if the quanity reaches zero, do not allow to go below 0
         this.qualityPoints = 0;
      }
      this.qualityPoints -= qualityPoints;
   }
   
   public void draw() {
      deck.drawCard(this);
   }
   /**
    * @return the learning
    */
   public int getLearning() {
      return learning;
   }

   /**
    * @param learning the learning to set
    */
   public void addLearning(int learning) {
      this.learning += learning;
   }

   /**
    * @return the integrity
    */
   public int getIntegrity() {
      return integrity;
   }

   /**
    * @param integrity the integrity to set
    */
   public void addIntegrity(int integrity) {
      this.integrity += integrity;
   }

   /**
    * @return the craft
    */
   public int getCraft() {
      return craft;
   }

   /**
    * @param craft the craft to set
    */
   public void addCraft(int craft) {
      this.craft += craft;
   }
   
   public ArrayList<BSforCSCard> getHand() {
      return hand;
   }
   public void setMovesLeft(int num)
   {
       movesLeft += num;
   }
   
   public int getMovesLeft()
   {
        return movesLeft;
   }
   
   public void setDrawCard(boolean b)
   {
       drawCard = b;
   }
   
   public boolean getDrawCard()
   {
       return drawCard;
   }
   
   public void setPlayCard(boolean b)
   {
       playCard = b;
       //System.out.println("Duh" + playCard);
   }
   
   public boolean getPlayCard()
   {
       return playCard;
   }   
   
   public void resetTurn()
   {
        movesLeft = 3;
        drawCard = false;
        playCard = false; 
   }
   
   // TRUE = Turn is FINISHED, FALSE = Possible movement / play is possible
   public boolean checkTurn()
   {
      if(movesLeft == 0 && drawCard == true && playCard == true)
      {
        return true;
      }
      else
      {
        return false;
      }
   }
   
   public void moveTo(BSforCSPlayer player, int x, int y) {
      moveToken(player.getNumber(), x, y);
   }
}
