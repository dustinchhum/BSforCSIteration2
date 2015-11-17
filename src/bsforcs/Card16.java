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
public class Card16 extends BSforCSCard {
   public Card16(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Learning Rules of Soccer, 16
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (room == 0 && p.getIntegrity() >= 5) {
          p.addQualityPoints(5);
      }
      else {
         p.minusQualityPoints(2);
         p.setCurrentRoom(p.roomOfRetirement);
      }
   }
}