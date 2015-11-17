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
public class Card30 extends BSforCSCard {
   public Card30(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Soccer Goalie, 30
   @Override
   public void play(BSforCSPlayer p) {
      int room = p.getCurrentRoom().getRoomNumber();
      if (p.getLearning() < 3 || p.getCraft() < 3) {
         p.minusQualityPoints(2);
         p.setCurrentRoom(p.studentParking);
         p.moveTo(p, p.studentParking.getXCoord(), p.studentParking.getYCoord());
      }
      else if (room == 0) {
          p.addQualityPoints(5);
          p.draw();
      }
      else {
         p.minusQualityPoints(2);
      }
   }
}

