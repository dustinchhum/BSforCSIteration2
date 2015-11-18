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
public class Card10 extends BSforCSCard {
   public Card10(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Goodbye Professor, 10
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getLearning() < 6 || p.getCraft() < 6 || p.getIntegrity() < 6) {
         p.minusQualityPoints(2);
         if (p.isHuman()) {
            discard = new DiscardChooser(p);
         }
         
      }
      else if (room == 13) {
         p.addQualityPoints(10);
      }
   }
}