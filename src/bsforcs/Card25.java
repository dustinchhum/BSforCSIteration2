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
public class Card25 extends BSforCSCard {
   public Card25(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Meet the Dean, 25
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getLearning() < 3 || p.getCraft() < 3 || p.getIntegrity()< 3) {
         p.minusQualityPoints(2);
         // code discard a game card
      }
      else if (room == 12 || room == 15) {
          p.addQualityPoints(5);
          p.draw();
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}
