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
public class Card33 extends BSforCSCard {
   public Card33(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Professor Hoffman, 33
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getLearning() < 3) {
         p.minusQualityPoints(7);
         p.setCurrentRoom(p.lactationLounge);
      }
      else if (room == 11 || room == 12 || room == 13 || room == 14 
       || room == 15 || room == 16 || room == 17 || room == 18 || room == 19) {
         p.addQualityPoints(5);
         p.draw();
         p.draw();
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}
