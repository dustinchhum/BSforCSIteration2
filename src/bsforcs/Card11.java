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
public class Card11 extends BSforCSCard {
   public Card11(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Enjoying the Peace, 11
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (room == 1) {
         if (p.isHuman()) {
            // Learning, Craft, Integrity
            token = new TokenChooser(true, false, true, p);
         }
         else {
            // AI 
            p.addLearning(1);
         }
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}