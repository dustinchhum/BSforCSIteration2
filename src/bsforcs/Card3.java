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
public class Card3 extends BSforCSCard {
      
   public Card3(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Math 122, 3
   @Override
   public void play(BSforCSPlayer player) {
      int room = player.getCurrentRoom().getRoomNumber();
      if (room == 7) {
         if (player.isHuman()) {
            // Learning, Craft, Integrity
            token = new TokenChooser(true, false, true, player);
         }
         else {
            //AI
            player.addLearning(1);
         }
      }
      else {
         player.minusQualityPoints(2);
      }
   }
}
