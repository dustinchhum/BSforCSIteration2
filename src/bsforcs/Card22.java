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
public class Card22 extends BSforCSCard {
   public Card22(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Pass Soccer Class
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getLearning() < 3) {
         p.setCurrentRoom(p.lactationLounge);
         p.moveTo(p, p.lactationLounge.getXCoord(), p.lactationLounge.getYCoord());
      }
      else if (room == 1) {
         p.addIntegrity(1);
         p.addCraft(1);
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}
