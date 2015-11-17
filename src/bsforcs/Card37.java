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
public class Card37 extends BSforCSCard {
   public Card37(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getIntegrity() < 2) {
         p.minusQualityPoints(2);
         // code discard a card
      }
      else if (room == 12 || room == 15) {
         p.addQualityPoints(3);
         token = new TokenChooser(true, true, true, p);
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}
