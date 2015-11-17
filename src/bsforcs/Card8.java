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
public class Card8 extends BSforCSCard {
   public Card8(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Parking Violation, 8
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (room == 6) {
         p.addLearning(1);
         // Code discard and add one more learning
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}
