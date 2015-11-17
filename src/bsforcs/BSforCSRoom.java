package bsforcs;

import java.util.ArrayList;

class BSforCSRoom {
   private final String mName;
   private final int mRoomNumber;
   private ArrayList<BSforCSRoom> mListOfRooms = new ArrayList<BSforCSRoom>();
   private final int xCoord;
   private final int yCoord;
   
   public BSforCSRoom(String name, int roomNumber, int x, int y) {
      mName = name;
      mRoomNumber = roomNumber;
      //mListOfRooms = listOfRooms;
      xCoord = x;
      yCoord = y;
   }
  
   @Override
   public String toString() {
      return mName;
   }
  
   public int getXCoord() {
      return xCoord;
   }
   
   public int getYCoord() {
      return yCoord;
   }
   public ArrayList<BSforCSRoom> getListOfRooms() {
      return mListOfRooms;
   }
   
   public int getRoomNumber() {
      return mRoomNumber;
   }
   
   public void add(BSforCSRoom room) {
      mListOfRooms.add(room);
   }
   
   
}
