/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsforcs;

/**
 *
 * @author Dustin
 */
public class Card1 extends BSforCSCard {
   public Card1(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // CECS 105, 1 
   @Override
   public void play(BSforCSPlayer player) {
      if (player.getCurrentRoom().getRoomNumber() == 14 || player.getCurrentRoom().getRoomNumber() == 17) {
         player.addLearning(1);
      }
      else {
         player.minusQualityPoints(2);
      }
   }
   
}
