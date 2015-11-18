package bsforcs;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Dustin
 */
public class DiscardChooser extends BSforCSPlayer {
   private JFrame frame;
   private final JPanel bigPanel;
   private final JPanel imageContainer;
   private JLabel image;
   private final JTextField text;
   private final JButton discardButton;
   
   private ArrayList<BSforCSCard> handIn;
   private int indexZ;
   
   private BSforCSCard selected;
   private final Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
   
   public DiscardChooser(final BSforCSPlayer player) {
      frame = new JFrame();
      bigPanel = new JPanel();
      imageContainer = new JPanel();
      text = new JTextField();
      discardButton = new JButton("Discard");
      image = new JLabel();
      
      // Frame
      frame.setMinimumSize(new Dimension(200, 300));
      frame.setAlwaysOnTop(true);
      frame.setLocation(dim.width / 2 - frame.getSize().width / 2 , 
      dim.height / 2 - frame.getSize().height / 2);
      //frame.setUndecorated(true);
      
      bigPanel.setLayout(new BoxLayout(bigPanel, BoxLayout.PAGE_AXIS));
      
      // Text Field
      text.setText("Choose A Card to Discard");
      text.setEditable(false);
      text.setVisible(true);
      text.setHorizontalAlignment(JTextField.CENTER);
      bigPanel.add(text);
      
      // Image Scroller
      int size = player.getHand().size();
      selected = player.getHand().get(size - 1);
      setImageToCardUI(selected.getImage());
      indexZ = 0;
      imageContainer.addMouseListener(new MouseAdapter() {
         @Override
         public void mousePressed(MouseEvent e) {
            handIn = player.getHand();
            if (indexZ >= handIn.size()) {
               indexZ = 0;
            }
            selected = handIn.get(indexZ);
            
            setImage(selected.getImage());
            indexZ++;            
         }
      }); 
      bigPanel.add(imageContainer);
      
      // Discard Button
      discardButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            player.discardACard(selected);
            frame.dispose();
         }
      });
      bigPanel.add(discardButton);
      
      
      frame.add(bigPanel);
      frame.pack();
      frame.setVisible(true);
      
   }
   
   public void setImage(Image i) {
      image.setIcon(null);
      imageContainer.add(image);
      imageContainer.invalidate();
      imageContainer.repaint();
      ImageIcon icon = new ImageIcon();
            try {
               icon = new ImageIcon(i);
            }
            catch (Exception e) {
               System.out.println("This thing is null :(");
            }
            image.setIcon(icon);
            image.setVisible(true);
            imageContainer.add(image);
            imageContainer.revalidate();
            imageContainer.repaint();
   }
}
