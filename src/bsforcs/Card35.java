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
public class Card35 extends BSforCSCard {
   public Card35(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (room != 11 && room != 12 && room != 13 && room != 14 
       && room != 15 && room != 16 && room != 17 && room != 18 && room != 19 
       && room != 20) {
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
