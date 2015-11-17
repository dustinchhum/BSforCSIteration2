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
public class Card18 extends BSforCSCard {
   public Card18(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Learning Netbeans, 18
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getLearning() < 3) {
         p.minusQualityPoints(5);
      }
      else if (room == 20) {
         p.addQualityPoints(5);
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}
