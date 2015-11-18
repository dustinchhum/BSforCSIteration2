/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsforcs;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author Dustin
 */
public class BSforCSCard {
   public String mName;
   private int mID;
   private Image img = null;
   public String mReward;
   public String mPunishment;
   public TokenChooser token;
   public DiscardChooser discard;
   public ArrayList<Integer> roomLocations;
   
   public BSforCSCard(String name, int id, String URL, String reward, String punishment) {
      mName = name;
      mID = id;
      mReward = reward;
      mPunishment = punishment;
      roomLocations = new ArrayList<>();
      try {                
         img = ImageIO.read(new File(URL));
      } 
      catch (IOException ex) {
            System.out.println("Image not found ):");
       }
   }
   
   public void play(BSforCSPlayer player) {
      
   }
   
   public Image getImage() {
      return img;
   }
   
   public JLabel displayCard() {
      JLabel picLabel = new JLabel(new ImageIcon(img));
      return picLabel;
   }
   
   @Override
   public String toString() {
      return mName;
   }
   
   public ArrayList<Integer> AIgetListOfRoomsPlayableCard() {
      return roomLocations;
   }
   
   public void setLocationOfCard(int i) {
      roomLocations.add(i);
   }
}
