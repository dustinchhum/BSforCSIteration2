/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsforcs;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author Dustin
 */
public class TokenChooser extends JDialog {
   JFrame frame = new JFrame();
   JPanel buttonPanel = new JPanel();
   JTextArea text = new JTextArea();
   JButton learning, craft, integrity;
   Image image;
   // Learning, Craft, Integrity 
   public TokenChooser(boolean l, boolean c, boolean i, final BSforCSPlayer player) {
      
      buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
      text.setText("Choose a Skill Chip");
      buttonPanel.setSize(new Dimension(920, 240));
      learning = new JButton("Learning");
      craft = new JButton("Craft");
      integrity = new JButton("Integrity");
      
      learning.setVerticalTextPosition(AbstractButton.BOTTOM);
      learning.setHorizontalTextPosition(AbstractButton.CENTER);
      craft.setVerticalTextPosition(AbstractButton.BOTTOM);
      craft.setHorizontalTextPosition(AbstractButton.CENTER);
      integrity.setVerticalTextPosition(AbstractButton.BOTTOM);
      integrity.setHorizontalTextPosition(AbstractButton.CENTER);
      
      buttonPanel.add(learning);
      buttonPanel.add(craft);
      buttonPanel.add(integrity);
      
      frame.add(buttonPanel);
      frame.setMinimumSize(new Dimension(300, 200));
      
      if (!l) {
         this.learning.setEnabled(false);
      }
      if (!c) {
         this.craft.setEnabled(false);
      }
      if (!i) {
         this.craft.setEnabled(false);
      }
      
      pack();
      setVisible(true); 
      
      learning.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            player.addLearning(1);
            dispose();
         }
      });
      
      craft.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            player.addCraft(1);
            dispose();
         }
      });
      
      integrity.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            player.addIntegrity(1);
            dispose();
         }
      });  
   }
}
