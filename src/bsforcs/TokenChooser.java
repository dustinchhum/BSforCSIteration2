/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsforcs;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
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
   JFrame frame;
   JPanel buttonPanel;
   JPanel bigPanel;
   JTextField text;
   JButton learning, craft, integrity;
   
   private final Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
   // Learning, Craft, Integrity 
   public TokenChooser(boolean l, boolean c, boolean i, final BSforCSPlayer player) {
      
      frame = new JFrame("Token Chooser");
      buttonPanel = new JPanel();
      text = new JTextField();
      bigPanel = new JPanel();
      
      
      frame.setMinimumSize(new Dimension(225, 150));
      frame.setAlwaysOnTop(true);
      frame.setLocation(dim.width / 2 - frame.getSize().width / 2 , 
       dim.height / 2 - frame.getSize().height / 2);
      frame.setUndecorated(true);
      //frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
      
      bigPanel.setLayout(new BoxLayout(bigPanel, BoxLayout.PAGE_AXIS));
      
 
      //buttonPanel.setPreferredSize(new Dimension(300, 150));
      buttonPanel.setLayout(new BorderLayout());
      
      buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
      buttonPanel.setVisible(true);
      //buttonPanel.setSize(new Dimension(350, 150));
      
      text.setText("Choose a Skill Chip!");
      text.setEditable(false);
      text.setVisible(true);
      text.setHorizontalAlignment(JTextField.CENTER);
      //text.setMinimumSize(new Dimension(225, 50));
      bigPanel.add(text);
      
     
      learning = new JButton("Learning");
      craft = new JButton("Craft");
      integrity = new JButton("Integrity");
      
      learning.setVerticalTextPosition(AbstractButton.BOTTOM);
      learning.setHorizontalTextPosition(AbstractButton.CENTER);
      craft.setVerticalTextPosition(AbstractButton.BOTTOM);
      craft.setHorizontalTextPosition(AbstractButton.CENTER);
      integrity.setVerticalTextPosition(AbstractButton.BOTTOM);
      integrity.setHorizontalTextPosition(AbstractButton.CENTER);
      
      
      buttonPanel.add(learning, BorderLayout.WEST);
      buttonPanel.add(craft, BorderLayout.CENTER);
      buttonPanel.add(integrity, BorderLayout.EAST);

      if (!l) {
         this.learning.setEnabled(false);
      }
      if (!c) {
         this.craft.setEnabled(false);
      }
      if (!i) {
         this.craft.setEnabled(false);
      }
      bigPanel.add(buttonPanel);
      
      frame.add(bigPanel);
      frame.pack();
      //frame.setLocation(null);
      frame.setVisible(true);
      
      learning.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            player.addLearning(1);
            frame.dispose();
         }
      });
      
      craft.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            player.addCraft(1);
            frame.dispose();
         }
      });
      
      integrity.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            player.addIntegrity(1);
            frame.dispose();
         }
      });  
   }
}
