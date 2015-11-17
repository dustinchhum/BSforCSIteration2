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
public class Card5 extends BSforCSCard{
   public Card5(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Lunch at Bratwurst Hall, 5
   @Override
   public void play(BSforCSPlayer player) {
      int room = player.getCurrentRoom().getRoomNumber();
      if (room == 9) {
         player.addCraft(1);
      }
      else {
         player.minusQualityPoints(2);
      }
   }
}
