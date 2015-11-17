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
public class Card15 extends BSforCSCard {
   public Card15(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // The Big Game, 15
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (room == 3) {
         p.addCraft(1);
         p.setCurrentRoom(p.lactationLounge);
         p.moveTo(p, p.lactationLounge.getXCoord(), p.lactationLounge.getYCoord());
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}
