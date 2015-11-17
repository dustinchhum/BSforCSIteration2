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
public class Card20 extends BSforCSCard {
   public Card20(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Pass Soccer Class
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getCraft() < 5) {
         p.minusQualityPoints(5);
      }
      else if (room == 0) {
          p.addQualityPoints(5);
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}