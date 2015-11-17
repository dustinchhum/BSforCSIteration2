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
public class Card4 extends BSforCSCard{
   public Card4(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Player in ECS 302, 4
   @Override
   public void play(BSforCSPlayer player) {
      int room = player.getCurrentRoom().getRoomNumber();
      if (room == 14) {
         player.addLearning(1);
      }
      else {
         player.minusQualityPoints(2);
      }
   }
}
