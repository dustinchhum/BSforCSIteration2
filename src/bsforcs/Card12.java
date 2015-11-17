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
public class Card12 extends BSforCSCard {
   public Card12(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Buddy Up, 12
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (room == 0 || room == 18) {
         token = new TokenChooser(true, true, false, p);
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}
