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
public class Card26 extends BSforCSCard {
   public Card26(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Loud Buzzing, 26
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getCraft() < 3) {
         p.minusQualityPoints(4);
      }
      else if (room == 18) {
         if (p.isHuman()) {
            // Learning, Craft, Integrity
            token = new TokenChooser(true, true, true, p);
         }
         else {
            //AI
            p.addLearning(1);
         }
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}