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
public class Card14 extends BSforCSCard {
   public Card14(String name, int id, String URL, String reward, String punishment) {
      super(name, id, URL, reward, punishment);
   }
   // Prereq: 3 Craft
   @Override
   public void play(BSforCSPlayer p) {
      if (p.getCraft() < 3) {
         p.minusQualityPoints(5);
      }
      else {
         p.addQualityPoints(5);
      }
   }
}