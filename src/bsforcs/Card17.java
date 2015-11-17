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
public class Card17 extends BSforCSCard {
   public Card17(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Math 123, 17
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getLearning() < 5) {
         p.minusQualityPoints(5);
         // code discard a card
      }
      else if (room == 14 || room == 17) {
         p.addQualityPoints(5);
      }
      else {
         p.minusQualityPoints(5);
      }
   }
}