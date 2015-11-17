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
public class Card31 extends BSforCSCard {
   public Card31(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Elective Class
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getLearning() < 2) {
         p.minusQualityPoints(4);
      }
      else if (room == 7) {
          p.addLearning(1);
          p.draw();
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}

