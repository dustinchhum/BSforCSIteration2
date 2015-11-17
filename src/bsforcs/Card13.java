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
public class Card13 extends BSforCSCard {
   public Card13(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Play anyspace outside of Parking, 13
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (room != 6) {
         p.addCraft(1);
         p.setCurrentRoom(p.lactationLounge);
         p.moveTo(p, p.lactationLounge.getXCoord(), p.lactationLounge.getYCoord());
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}
