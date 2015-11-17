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
public class Card32 extends BSforCSCard {
   public Card32(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Oral Communication, 32
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getIntegrity() < 5) {
         p.minusQualityPoints(2);
         // code for discard a card
      }
      else if (room != 11 && room != 12 && room != 13 && room != 14 
       && room != 15 && room != 16 && room != 17 && room != 18 && room != 19 
       && room != 20) {
          p.addQualityPoints(4);
          // code dialog chooser for all three chips
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}

