package bsforcs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.*;

import javax.imageio.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class BSforCSFrame extends JFrame
{
	// CONSTANTS
	// VARIABLES
   private int index = 0; 
   
	private ArrayList<BSforCSCard> hand = new ArrayList<>();
   
   public JTextArea actionList;
   public JTextArea view;
   
   private final ImageLabel label = new ImageLabel("");
   
   public JButton drawButton;
   public JButton moveButton;
   public JButton playButton;
   
   private JPanel cardUI;
   private JPanel boardContentPane;
	private JPanel controlPanel;
	
   private JLayeredPane boardPanel;
	
   private JLabel mapLabel;
	private JLabel token1 = new JLabel();
	private JLabel token2 = new JLabel();
	private JLabel token3 = new JLabel();
   
   public JList<String> listRooms;
	
   private final Rectangle frameDimensions;
   private final Dimension frameDim = Toolkit.getDefaultToolkit().getScreenSize();
   
   public String[] listofRooms = new String[10];
   public String[] AIlistofRooms = new String[10];
   //public ArrayList<String> listofRooms = new ArrayList<>();
   //public String[] AI2listofRooms = new String[10];
   public ArrayList<BSforCSRoom> currentRoomList = new ArrayList<>();
   public ArrayList<BSforCSRoom> AIcurrentRoomList = new ArrayList<>();
   
   public BSforCSPlayer currentPlayer;
   public BSforCSRoom currentRoom;
   public BSforCSPlayer player1;
   public BSforCSPlayer player2;
   public BSforCSPlayer player3;
   
   //Intialize Every Room
   public BSforCSRoom georgeAllenField = new BSforCSRoom("George Allen Field", 0, 185, 300);
   public BSforCSRoom japaneseGarden = new BSforCSRoom("Japanese Garden", 1, 600, 130);
   public BSforCSRoom pyramid = new BSforCSRoom("Pyramid", 3, 650, 370);
   public BSforCSRoom studentParking = new BSforCSRoom("Student Parking", 2, 1260, 250);
   public BSforCSRoom recCenter = new BSforCSRoom("Rec Center", 5, 700, 700);
   public BSforCSRoom forbiddenParking = new BSforCSRoom("Forbidden Parking", 6, 1370, 700);
   public BSforCSRoom westWalkway = new BSforCSRoom("West Walkway", 4, 65, 1220);
   public BSforCSRoom eastWalkway = new BSforCSRoom("East Walkway", 10, 1530, 1220);
   public BSforCSRoom northHall = new BSforCSRoom("North Hall", 12, 480, 1220);
   public BSforCSRoom southHall = new BSforCSRoom("South Hall", 15, 1000, 1220);
   public BSforCSRoom computerLab = new BSforCSRoom("Computer Lab", 11, 360, 1000);
   public BSforCSRoom ECS302 = new BSforCSRoom("ECS 302", 14, 800, 1000);
   public BSforCSRoom eatClub = new BSforCSRoom("Eat Club", 18, 1120, 1000);
   public BSforCSRoom CECSConference = new BSforCSRoom("CECS Conference Room", 19, 1330, 1000);
   public BSforCSRoom lactationLounge = new BSforCSRoom("Lactation Lounge", 20, 1300, 1450);
   public BSforCSRoom ECS308 = new BSforCSRoom("ECS 308", 17, 1000, 1500);
   public BSforCSRoom elevators = new BSforCSRoom("Elevators", 16, 690, 1450);
   public BSforCSRoom roomOfRetirement = new BSforCSRoom("Room of Retirement", 13, 350, 1450);
   public BSforCSRoom library = new BSforCSRoom("Library", 7, 195, 1830);
   public BSforCSRoom LA5 = new BSforCSRoom("LA5", 8, 700, 1830);
   public BSforCSRoom BratwurstHall = new BSforCSRoom("Bratwurst Hall", 9, 1330, 1830);
   
   public BSforCSCard selectedCard;
   public BSforCSDeck deck = new BSforCSDeck();
   
	public BSforCSFrame()
	{
     	// Name of the window
		super("CECS BS Challenge Game");
		// Set frame to fullscreen
		super.setExtendedState(JFrame.MAXIMIZED_BOTH);
		super.setMinimumSize(new Dimension(frameDim.width, frameDim.height));
		// Get Dimensions for frame (should return whatever the computer's full
		// screen dimensions are
		frameDimensions = super.getBounds();
      //System.out.print("frameDim: " + frameDim.width+ " " + frameDim.height);
		
		//boardContentPane = super.getboardContentPane();
		//boardContentPane.setLayout(new BorderLayout());
		
		// Add background image pane to frame
		createMainPanel();
      
      // Add All Adjacent Rooms
      georgeAllenField.add(pyramid);
      pyramid.add(georgeAllenField);
      
      pyramid.add(japaneseGarden);
      pyramid.add(studentParking);
      pyramid.add(recCenter);
      
      japaneseGarden.add(pyramid);
      japaneseGarden.add(studentParking);
      
      studentParking.add(pyramid);
      studentParking.add(forbiddenParking);
      studentParking.add(recCenter);
      
      forbiddenParking.add(studentParking);
      forbiddenParking.add(recCenter);
      forbiddenParking.add(eastWalkway);
      
      recCenter.add(forbiddenParking);
      recCenter.add(pyramid);
      recCenter.add(westWalkway);
      
      westWalkway.add(recCenter);
      westWalkway.add(library);
      westWalkway.add(northHall);
      
      northHall.add(computerLab);
      northHall.add(ECS302);
      northHall.add(roomOfRetirement);
      northHall.add(elevators);
      northHall.add(southHall);
      
      southHall.add(eatClub);
      southHall.add(CECSConference);
      southHall.add(lactationLounge);
      southHall.add(ECS308);
      southHall.add(northHall);
      southHall.add(eastWalkway);
      
      
      computerLab.add(northHall);
      ECS302.add(northHall);
      ECS302.add(southHall);
      eatClub.add(southHall);
      CECSConference.add(southHall);
      lactationLounge.add(southHall);
      ECS308.add(southHall);
      
      elevators.add(northHall);
      elevators.add(LA5);
      
      roomOfRetirement.add(northHall);
      
      library.add(westWalkway);
      library.add(LA5);
      
      LA5.add(library);
      LA5.add(elevators);
      LA5.add(BratwurstHall);
      
      BratwurstHall.add(LA5);
      BratwurstHall.add(eastWalkway);	
   }
	// METHOD - UTILITY method for loading images
	public BufferedImage loadImage(String imageURL)
	{
		BufferedImage image = null;
		// Set background image to CSULB map
		try
		{
			// load image from file
			image = ImageIO.read(new File(imageURL));
		}
		catch(IOException e)
		{
			System.out.println("Image not found!?");
		}
		
		return image;
	}
	
   public void tempAIPlay(BSforCSPlayer player) {
      BSforCSRoom current = player.getCurrentRoom();
      AIcurrentRoomList = current.getListOfRooms();
      for (int i = 0; i < AIcurrentRoomList.size(); i++) {
         AIlistofRooms[i] = AIcurrentRoomList.get(i).toString();
      }
      Random rand = new Random();
      int size = AIcurrentRoomList.size();
      int random = 0;
      if (size != 0) {
         random = rand.nextInt(size);
      }
      BSforCSRoom temp = AIcurrentRoomList.get(random);
      int xCoord = temp.getXCoord();
      int yCoord = temp.getYCoord();
      moveToken(player.getNumber(), xCoord, yCoord);
      player.setCurrentRoom(temp);
      AIcurrentRoomList.clear();
   }
   
/*   public void tempAI2Play(BSforCSPlayer player) {
      BSforCSRoom current = player.getCurrentRoom();
      AI2currentRoomList = current.getListOfRooms();
      for (int i = 0; i < AI2currentRoomList.size(); i++) {
         AI2listofRooms[i] = AI2currentRoomList.get(i).toString();
      }
      Random rand = new Random();
      int size = AI2currentRoomList.size();
      int random = 0;
      if (size != 0) {
         random = rand.nextInt(size);
      }
      BSforCSRoom temp = AI2currentRoomList.get(random);
      int xCoord = temp.getXCoord();
      int yCoord = temp.getYCoord();
      moveToken(player.getNumber(), xCoord, yCoord);
      player.setCurrentRoom(temp);
   }
*/   
   public void setPlayer(BSforCSPlayer player) {
      currentPlayer = player;
      if (player.isHuman()) {
         deck.dealToPlayers(currentPlayer); // Deals cards to players
      }
   }
   
   public void getCurrentListOfRooms(BSforCSPlayer player) {
      currentRoom = player.getCurrentRoom();
      currentRoomList = currentRoom.getListOfRooms();
      for (int i = 0; i < currentRoomList.size(); i++)
      {
         listofRooms[i] = currentRoomList.get(i).toString();
         //listofRooms.add(currentRoomList.get(i).toString());
         //System.out.println(listofRooms[i]);
      }
   }
   
	// METHOD - Creates panel to contain the UI elements to control the game
	public void createControlPanel()
	{
      // New panel to contain game controls
		controlPanel = new JPanel();
		controlPanel.setBorder(new TitledBorder(new EtchedBorder(), "Game Controls"));
      controlPanel.setPreferredSize(new Dimension(900, 275));
      controlPanel.setLayout(new BorderLayout());
      
      JPanel leftPanel = new JPanel();
      controlPanel.add(leftPanel, BorderLayout.WEST);
      leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
      
      // Draw a Card Button
      drawButton = new JButton("Draw    ");
      drawButton.setVerticalTextPosition(AbstractButton.BOTTOM);
      drawButton.setHorizontalTextPosition(AbstractButton.CENTER);
      drawButton.setEnabled(true);
      drawCardButton();
      leftPanel.add(drawButton);
       
      // Move Button 
      moveButton = new JButton("Move    ");
      moveButton.setVerticalTextPosition(AbstractButton.BOTTOM);
      moveButton.setHorizontalTextPosition(AbstractButton.CENTER);
      moveButton.setEnabled(true);
      moveButton();
      leftPanel.add(moveButton);
      
      // Play a Card Button
      playButton = new JButton("Play      ");
      playButton.setVerticalTextPosition(AbstractButton.BOTTOM);
      playButton.setHorizontalTextPosition(AbstractButton.CENTER);
      playButton.setEnabled(false);
      hand = new ArrayList<>();
      playCardButton();
      leftPanel.add(playButton);
      
      // List Area
      listRooms = new JList<>(listofRooms); 
      listRooms.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      listRooms.setLayoutOrientation(JList.VERTICAL_WRAP);
      listRooms.setVisibleRowCount(10);
      JScrollPane listScroller = new JScrollPane(listRooms);
      listScroller.setPreferredSize(new Dimension (100, 250));
      leftPanel.add(listScroller);
     
      // Information Panel
      JPanel rightPanel = new JPanel();
      controlPanel.add(rightPanel, BorderLayout.EAST);
      rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
      view = new JTextArea();
      view.setEditable(false);
      view.setLineWrap(true);
      view.setVisible(true);
      view.setPreferredSize(new Dimension(925, 150));
      rightPanel.add(view);
      
      actionList = new JTextArea();
      actionList.setEditable(false);
      actionList.setLineWrap(true);
      actionList.setVisible(true);
      actionList.setPreferredSize(new Dimension(925, 50));
      JScrollPane actionScroll = new JScrollPane(actionList);
      actionScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      
      rightPanel.add(actionScroll);
      
      // Card Panel
      cardUI = new JPanel();
      controlPanel.add(cardUI, BorderLayout.CENTER);
      cardUI.setLayout(new BoxLayout(cardUI, BoxLayout.X_AXIS));
      cardUI.setVisible(true);
      cardUI.setPreferredSize(new Dimension(100, 350));
      
      index = 0;
      
      cardUI.addMouseListener(new MouseAdapter() {
         @Override
         public void mousePressed(MouseEvent e) {
            hand = currentPlayer.getHand();
            if (index >= hand.size()) {
               index = 0;
            }
//            System.out.println("Hand Size: " + hand.size());
//            System.out.println("Index: " + index);
//            System.out.println("Selected Card: " + selectedCard.toString());
            selectedCard = hand.get(index);
            
            setImageToCardUI(selectedCard.getImage());
            index++;            
         }
      });
        
	}
   
   public void setImageToCardUI(Image image) {
      label.setIcon(null);
      cardUI.add(label);
      cardUI.invalidate();
      cardUI.repaint();
      ImageIcon icon = new ImageIcon();
            try {
               icon = new ImageIcon(image);
            }
            catch (Exception e) {
               System.out.println("This thing is null :(");
            }
  
            //label = new ImageLabel("");
            
            //JLabel label = new JLabel("", icon, JLabel.CENTER);
            
            label.setIcon(icon);
            label.setVisible(true);
            cardUI.add(label);
            cardUI.revalidate();
            cardUI.repaint();
   }
   
   public void drawCardButton() {
      drawButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            deck.drawCard(currentPlayer);
            int size = currentPlayer.getHand().size();
            selectedCard = currentPlayer.getHand().get(size - 1);
            setImageToCardUI(selectedCard.getImage());
            drawButton.setEnabled(false);
            currentPlayer.setDrawCard(true);
            playButton.setEnabled(true);
            
            // Set hand to whatever was drawn
            updateInfoPanel(player1, player2, player3);
         }
      });
   }
   
   public void moveButton() {     
      moveButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
           //System.out.println("Moves Left Before Entering: " + currentPlayer.getMovesLeft());
            if (currentPlayer.getMovesLeft() != 0)
           {
                getCurrentListOfRooms(currentPlayer);
                int index = listRooms.getSelectedIndex();
                if (index != -1) { 
                   BSforCSRoom temp = currentRoomList.get(index);
                   int xCoord = temp.getXCoord();
                   int yCoord = temp.getYCoord();
                   moveToken(currentPlayer.getNumber(), xCoord, yCoord);
                   currentPlayer.setCurrentRoom(temp);
                   listRooms.clearSelection();
                   // Flushes the list
                   for (int i = 0; i < listofRooms.length; i++) {
                      listofRooms[i] = null;
                   }
                   getCurrentListOfRooms(currentPlayer);
                }
                // Update Info Panel to show new room
                updateInfoPanel(player1, player2, player3);
                currentPlayer.setMovesLeft(-1);
                System.out.println("Current Player in frame: " + currentPlayer.getName() + ", Moves Left Inside: " + currentPlayer.getMovesLeft());
           }
           if (currentPlayer.getMovesLeft() == 0)
           { 
              actionList.setText("There are no more moves left!");
               System.out.println("Moves Left: " + currentPlayer.getMovesLeft());
               moveButton.setEnabled(false);
           }
         }  
      });
   }
   public BSforCSPlayer getCPlayer() {
      return currentPlayer;
   }
   public void playCardButton() {
      playButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            hand = currentPlayer.getHand();
            selectedCard.play(currentPlayer);
            System.out.println("Card: " + selectedCard.toString());
            hand.remove(selectedCard);
            deck.discardCard(selectedCard);
            label.setIcon(null);
            setImageToCardUI(hand.get(1).getImage());
            
            updateInfoPanel(player1, player2, player3);
            updateCurrentPlayPanel(currentPlayer, selectedCard);
            playButton.setEnabled(false);
            currentPlayer.setPlayCard(true);
         }
      });
   }
	
	// METHOD - Creates panel to contain the CSULB map game board
	private void createBoardPanel()
	{
		// New panel to contain CSULB map board
		boardPanel = new JLayeredPane();
		boardPanel.setPreferredSize(new Dimension(1670, 2000));
		//LayoutManager overlay = new OverlayLayout(boardPanel);
		//boardPanel.setLayout(overlay);
		// Load image into JLabel
		mapLabel = new JLabel(new ImageIcon(loadImage("image/BSforCSMap.png")));
		//mapLabel.setIcon(new ImageIcon(loadImage("image/BSforCSMap.png")));
		mapLabel.setOpaque(true);
		mapLabel.setBounds(0, 0, 1670, 2000);
		boardPanel.add(mapLabel, JLayeredPane.DEFAULT_LAYER);
		// Allows for scroll within the panel
		JScrollPane scrollPane = new JScrollPane(boardPanel);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, frameDim.width, frameDim.height - 330);
		//Make new panel to add scrollPane into
		boardContentPane = new JPanel(null);
		boardContentPane.setPreferredSize(new Dimension(1670, 2000));
		boardContentPane.add(scrollPane);
      
      
	}
	
	// METHOD - Creates main wrapper panel to hold all other panels
	private void createMainPanel()
	{
		// Create new JPanel to contain components of the JFrame
		JPanel mainPanel = new JPanel();
		// Set JPanel layout to BorderLayout
		mainPanel.setLayout(new BorderLayout());
		
		// METHOD CALLS - Creates panels for each button section
		createBoardPanel();
		createControlPanel();
		
		// Add board and game controls to main panel
		mainPanel.add(boardContentPane);
		mainPanel.add(controlPanel, BorderLayout.SOUTH);
		
		// Add panel to the JFrame
		add(mainPanel);		
	}
	
	public JLabel createToken(JLabel newToken)
	{
		JLabel token = newToken;
		token.setFont(token.getFont().deriveFont(Font.BOLD, 15));
		token.setBackground(null);
		token.setOpaque(true);
      token.setMaximumSize(new Dimension(50, 75));
		token.setBounds(1000, 1500, 50, 50);
		
		return token;
	}
	
	public void setTokens(JLabel p1token, JLabel p2token, JLabel p3token)
	{
		token1 = createToken(p1token);
		token2 = createToken(p2token);
		token2.setBounds(1000, 1425, 50, 50); 
		token3 = createToken(p3token);
		token3.setBounds(1000, 1350, 50, 50);
		
		boardPanel.add(token1, JLayeredPane.PALETTE_LAYER);
		boardPanel.add(token2, JLayeredPane.PALETTE_LAYER);
		boardPanel.add(token3, JLayeredPane.PALETTE_LAYER);
	}
	
	// METHOD - Moves token on the map. playerNum = which player's token to move,
   //          x and y = coordinates to move to
	public void moveToken(int playerNum, int x, int y)
	{
		if (playerNum == 1)
		{
			token1.setBounds(x, y, 50, 50);
		}
		else if (playerNum == 2)
		{
			token2.setBounds(x, y - 25, 50 , 50);
		}
		else if (playerNum == 3)
		{
			token3.setBounds(x, y - 50, 50, 50);
		}
		repaint();
	}
   
   public void updateInfoPanel(BSforCSPlayer humPlayer, BSforCSPlayer aiPlayer, BSforCSPlayer aiPlayer2)
        {
            if(currentRoom == null)
            {
                currentRoom = ECS308;
            }
            String output = String.format("%35s%35s%35s%35s\n", "Learning", "Craft", "Integrity", "Quality")
                          + String.format("%-10s%16s%45s%33s%41s\n\n", humPlayer.getName(), humPlayer.getLearning(), humPlayer.getCraft(), humPlayer.getIntegrity(), humPlayer.getQualityPoints())
                          + String.format("%-10s%16s%45s%33s%41s\n\n", aiPlayer.getName(), aiPlayer.getLearning(), aiPlayer.getCraft(), aiPlayer.getIntegrity(), aiPlayer.getQualityPoints())
                          + String.format("%-10s%16s%45s%33s%41s\n\n", aiPlayer2.getName(), aiPlayer2.getLearning(), aiPlayer2.getCraft(), aiPlayer2.getIntegrity(), aiPlayer2.getQualityPoints())
                          + String.format("%s%s%50s%s\n\n", "Cards in deck: ", deck.getPlayableDeck().size(), "Discards out of play: ", deck.getDiscardDeck().size())
                          + String.format("You are " + humPlayer.getName() + " and you are in " + currentRoom.toString());
            view.setText(output);
            
            repaint();
        }
        
        public void updateCurrentPlayPanel(BSforCSPlayer player, BSforCSCard card)
        {
            actionList.setText(player.getName() + " played " + card.mName + " for " + card.mReward + " or " + card.mPunishment + " if failed.");
        }
        
        public void setPlayers(BSforCSPlayer spPlayer1, BSforCSPlayer spPlayer2, BSforCSPlayer spPlayer3)
        {
            player1 = spPlayer1;
            player2 = spPlayer2;
            player3 = spPlayer3;
        }
   
   public void reenableButtons()
   {
      drawButton.setEnabled(true);
      moveButton.setEnabled(true);
   }
   
   public BSforCSPlayer getPlayer() {
      return currentPlayer;
   }
   
   public BSforCSRoom getECS308() {
      return ECS308;
   }
	public int getFrameHeight()
	{
		return frameDimensions.height;
	}
	
	public int getFrameWidth()
	{
		return frameDimensions.height;
	}
}