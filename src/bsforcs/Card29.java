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
public class Card29 extends BSforCSCard {
   public Card29(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Press the Right Floor
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getLearning() < 4) {
         p.minusQualityPoints(4);
      }
      else if (room == 16) {
         p.addCraft(2);
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}

