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
public class Card7 extends BSforCSCard {
   public Card7(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Excersing Mind and Body, 7
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (room == 5) {
         p.addIntegrity(1);
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}
