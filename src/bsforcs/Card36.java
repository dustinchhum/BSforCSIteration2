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
public class Card36 extends BSforCSCard {
   public Card36(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getCraft() < 2 || p.getIntegrity() < 3) {
         p.minusQualityPoints(3);
      }
      else if (room == 11) {
         p.addQualityPoints(3);
         token = new TokenChooser(true, true, true, p);
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}
