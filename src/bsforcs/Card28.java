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
public class Card28 extends BSforCSCard {
   public Card28(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Professor Englert, 28
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getIntegrity() < 3) {
         p.minusQualityPoints(2);
         // code discard a card
      }
      else if (room == 19) {
         token = new TokenChooser(true, true, true, p);
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}
