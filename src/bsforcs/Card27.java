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
public class Card27 extends BSforCSCard {
   public Card27(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Program Crashes, 27
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getLearning() < 2) {
         p.minusQualityPoints(2);
         // code discard a game card
      }
      else if (room == 20) {
          p.addQualityPoints(5);
          token = new TokenChooser(true, true, true, p);
      }
      else {
         p.minusQualityPoints(2);      
      }
   }
}
