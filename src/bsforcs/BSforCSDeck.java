/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsforcs;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dustin
 */
public class BSforCSDeck {
   
   public ArrayList<BSforCSCard> playable;
   public ArrayList<BSforCSCard> discard;
   
   public final int FIELD = 0;
   public final int GARDEN = 1;
   public final int STUDENT_PARKING = 2;
   public final int PYRAMID = 3;
   public final int WESTWALK = 4;
   public final int REC_CENTER = 5;
   public final int FORBIDDEN = 6;
   public final int LIBRARY = 5;
   public final int LA5 = 8;
   public final int BRATWURST_HALL = 9;
   public final int EASTWALK = 10;
   public final int COMP_LAB = 11;
   public final int NORTH_HALL = 12;
   public final int ROOM_OF_RETIREMENT = 13;
   public final int ECS302 = 14;
   public final int SOUTH_HALL = 15;
   public final int ELEVATORS = 16;
   public final int ECS308 = 17;
   public final int EAT = 18;
   public final int CONFERENCE = 19;
   public final int LACTATION = 20;
   
   public Card1 Card1 = new Card1("CECS 105", 1, "image/Card1.png", "1 Learning Chip", "-2 Quality Points");
   public Card2 Card2= new Card2("Research Compilers", 2, "image/Card2.png", "1 Learning Chip", "-2 Quality Points");
   public Card3 Card3 = new Card3("Math 122", 3, "image/Card3.png", "Get 1 Integrity Chip or 1 Learning Chip", "-2 Quality Points");
   public Card4 Card4 = new Card4("Professor Murgolo's CECS 174 Class", 4, "image/Card4.png", "1 Learning Chip", "-2 Quality Points");
   public Card5 Card5 = new Card5("Lunch at Bratwurst Hall", 5, "image/Card5.png", "1 Craft Chip", "-2 Quality Points");
   public Card6 Card6 = new Card6("CECS 100", 6, "image/Card6.png", "1 Craft Chip", "-2 Quality Points");
   public Card7 Card7 = new Card7("Exercising Mind and Body", 7, "image/Card7.png", "1 Integrity Chip", "-2 Quality Points");
   public Card8 Card8 = new Card8("Parking Violation", 8, "image/Card8.png", "1 Learning Chip + 1 More for 1 Discard", "-2 Quality Points");
   public Card9 Card9 = new Card9("Finding the Lab", 9, "image/Card9.png", "1 Integrity Chip", "-2 Quality Points");
   public Card10 Card10 = new Card10("Goodbye, Professor", 10, "image/Card10.png", "10 Quality Points", "Discard 1 Card and Leave this card in RoR");
   public Card11 Card11 = new Card11("Enjoying the Peace", 11, "image/Card11.png", "1 Learning Chip or 1 Integrity Chip", "-2 Quality Points");
   public Card12 Card12 = new Card12("Buddy Up", 12, "image/Card12.png", "1 Learning Chip or 1 Craft Chip", "-2 Quality Points");
   public Card13 Card13 = new Card13("Late for Class", 13, "image/Card13.png", "1 Craft Chip", "-2 Quality Points");
   public Card14 Card14 = new Card14("Prerequistes: 3 Craft", 14, "image/Card14.png", "5 Quality Points", "-3 Quality Points");
   public Card15 Card15 = new Card15("The Big Game", 15, "image/Card15.png", "1 Craft Chip", "-2 Quality Points");
   public Card16 Card16 = new Card16("KIN 253", 16, "image/Card16.png", "2 Craft Chips", "Go to Room of Retirement");
   public Card17 Card17 = new Card17("Math 123", 17, "image/Card17.png", "5 Quality Points", "-3 Quality Points and Discard 1 Game Card");
   public Card18 Card18 = new Card18("Learning Netbeans", 18, "image/Card18.png", "5 Quality Points", "-3 Quality Points");
   public Card19 Card19 = new Card19("Choosing a Major", 19, "image/Card19.png", "5 Quality Points", "-3 Quality Points");
   public Card20 Card20 = new Card20("Pass Socce Class", 20, "image/Card20.png", "5 Quality Points", "-3 Quality Points");
   public Card21 Card21 = new Card21("Score a Goal!", 21, "image/Card21.png", "5 Quality Points and 1 Integrity Chip", "Go to Student Parking");
   public Card22 Card22 = new Card22("Fall in the Pond", 22, "image/Card22.png", "1 Integrity Chip and 1 Craft Chip", "Go to Lactation Lounge");
   public Card23 Card23 = new Card23("Make the Dean's List", 23, "image/Card23.png", "5 Quality Points", "Go to Student Parking");
   public Card24 Card24 = new Card24("A New Laptop", 24, "image/Card24.png", "3 Quality Points and 1 Chip of your choice", "Discard 1 Game Card");
   public Card25 Card25 = new Card25("Meet the Dean", 25, "image/Card25.png", "5 Quality Points and 1 Game Card", "Discard 1 Game Card");
   public Card26 Card26 = new Card26("Loud Buzzing", 26, "image/Card26.png", "1 Chip of Choice", "-2 Quality Points");
   public Card27 Card27 = new Card27("Program Crashes", 27, "image/Card27.png", "5 Quality Points and 1 Chip of Choice", "Discard 1 Game Card");
   public Card28 Card28 = new Card28("Professor Englert", 28, "image/Card28.png", "1 Chip of Choice", "-2 Quality Points");
   public Card29 Card29 = new Card29("Press the Right Floor", 29, "image/Card29.png", "2 Craft Chips", "-2 Quality Points");
   public Card30 Card30 = new Card30("Soccer Goalie", 30, "image/Card30.png", "5 Quality Points and 1 Game Card", "Go to Student Parking");
   public Card31 Card31 = new Card31("Elective Class", 31, "image/Card31.png", "1 Learning Chip and 1 Game Card", "-2 Quality Chips");
   public Card32 Card32 = new Card32("Oral Communications", 32, "image/Card32.png", "4 Quality Chips and 1 Chip of Choice", "Discard 1 Game Card");
   public Card33 Card33 = new Card33("Professor Hoffman", 33, "image/Card33.png", "5 Quality Points and 2 Game Cards", "-5 Quality Points and Go to Lactation Lounge");
   public Card34 Card34 = new Card34("CHEM 111", 34, "image/Card34.png", "5 Quality Points", "Go to Student Parking");
   public Card35 Card35 = new Card35("The Outpost", 35, "image/Card35.png", "1 Chip of Choice", "-2 Quality Points");
   public Card36 Card36 = new Card36("Learning Linux", 36, "image/Card36.png", "Quality Points and 1 Chip of Choice", "-1 Quality Point");
   public Card37 Card37 = new Card37("Make a Friend", 37, "image/Card37.png", "3 Quality Points and 1 Chip of Choice", "Discard 1 Game Card");
   public Card38 Card38 = new Card38("Enjoying Nature", 38, "image/Card38.png", "1 Craft Chip and Teleport to Lactation Lounge", "-2 Quality Points");
   public Card39 Card39 = new Card39("Student Parking", 39, "image/Card39.png", "1 Craft Chip and Lactation Lounge", "-2 Quality Points");
   
   public BSforCSDeck() {
      playable = new ArrayList<>();
      discard = new ArrayList<>();
      
      addCardsToDeck();
      setAllLocations();
      
      Collections.shuffle(playable);  
   }

   public void shuffle(ArrayList<BSforCSCard> array) {
      Collections.shuffle(array);
   }
   
   public void dealToPlayers(BSforCSPlayer player) {
      Collections.shuffle(playable);
      for (int i = 0; i < 5; i++) {
         //int index = playable.size() - 1;
         BSforCSCard card = playable.get(i);
         player.getHand().add(card);
         playable.remove(i);
      }
   }
   
   public void drawCard(BSforCSPlayer player) {
      if (playable.isEmpty()) {
         for (int i = 0; i < discard.size(); i++) {
            playable.add(discard.get(i));
            discard.remove(discard.get(i));
         }
      }
      Collections.shuffle(playable);
      player.getHand().add(playable.get(0));
      playable.remove(playable.get(0));
   }
   
   public void addToDiscardDeck(BSforCSCard card) {
      discard.add(card);
      // Code dialog chooser to discard a card
   }
   
   public ArrayList<BSforCSCard> getPlayableDeck() {
      return playable;
   }
   
   public ArrayList<BSforCSCard> getDiscardDeck() {
      return discard;
   }
   
    
   private void addCardsToDeck() {
      playable.add(Card1);
      playable.add(Card2);
      playable.add(Card3);
      playable.add(Card4);
      playable.add(Card5);
      playable.add(Card6);
      playable.add(Card7);
      playable.add(Card8);
      playable.add(Card9);
      playable.add(Card10);
      playable.add(Card11);
      playable.add(Card12);
      playable.add(Card13);
      playable.add(Card14);
      playable.add(Card15);
      playable.add(Card16);
      playable.add(Card17);
      playable.add(Card18);
      playable.add(Card19);
      playable.add(Card20);
      playable.add(Card21);
      playable.add(Card22);
      playable.add(Card23);
      playable.add(Card24);
      playable.add(Card25);
      playable.add(Card26);
      playable.add(Card27);
      playable.add(Card28);
      playable.add(Card29);
      playable.add(Card30);
      playable.add(Card31);
      playable.add(Card32);
      playable.add(Card33);
      playable.add(Card34);
      playable.add(Card35);
      playable.add(Card36);
      playable.add(Card37);
      playable.add(Card38);
      playable.add(Card39);
   }
   
    
   private void setAllLocations() {
      Card1.AddLocationOfCard(ECS302);
      Card1.AddLocationOfCard(ECS308);
      
      Card2.AddLocationOfCard(LIBRARY);
      Card3.AddLocationOfCard(LIBRARY);
      Card4.AddLocationOfCard(ECS302);
      Card5.AddLocationOfCard(BRATWURST_HALL);
      Card6.AddLocationOfCard(ECS308);
      Card7.AddLocationOfCard(REC_CENTER);
      
      Card8.AddLocationOfCard(FORBIDDEN);
      Card8.AddLocationOfCard(FIELD);
      
      Card13.AddLocationOfCard(FIELD);
      Card13.AddLocationOfCard(GARDEN);
      Card13.AddLocationOfCard(STUDENT_PARKING);
      Card13.AddLocationOfCard(PYRAMID);
      Card13.AddLocationOfCard(WESTWALK);
      Card13.AddLocationOfCard(LIBRARY);
      Card13.AddLocationOfCard(LA5);
      Card13.AddLocationOfCard(BRATWURST_HALL);
      Card13.AddLocationOfCard(EASTWALK);
      Card13.AddLocationOfCard(COMP_LAB);
      Card13.AddLocationOfCard(NORTH_HALL);
      Card13.AddLocationOfCard(ROOM_OF_RETIREMENT);
      Card13.AddLocationOfCard(ECS302);
      Card13.AddLocationOfCard(SOUTH_HALL);
      Card13.AddLocationOfCard(ELEVATORS);
      Card13.AddLocationOfCard(ECS308);
      Card13.AddLocationOfCard(EAT);
      Card13.AddLocationOfCard(CONFERENCE);
      Card13.AddLocationOfCard(LACTATION);
      
      Card9.AddLocationOfCard(ELEVATORS);
      Card10.AddLocationOfCard(ROOM_OF_RETIREMENT);
      Card11.AddLocationOfCard(GARDEN);
      Card15.AddLocationOfCard(PYRAMID);
      Card16.AddLocationOfCard(FIELD);
      
      Card17.AddLocationOfCard(ECS302);
      Card17.AddLocationOfCard(ECS308);
      
      Card18.AddLocationOfCard(LACTATION);
      Card19.AddLocationOfCard(CONFERENCE);
      Card22.AddLocationOfCard(GARDEN);
      Card23.AddLocationOfCard(NORTH_HALL);
      Card23.AddLocationOfCard(SOUTH_HALL);
      Card24.AddLocationOfCard(COMP_LAB);
      
      Card25.AddLocationOfCard(SOUTH_HALL);
      Card25.AddLocationOfCard(NORTH_HALL);
      
      Card26.AddLocationOfCard(EAT);
      Card27.AddLocationOfCard(LACTATION);
      Card28.AddLocationOfCard(CONFERENCE);
      Card29.AddLocationOfCard(ELEVATORS);
      Card30.AddLocationOfCard(FIELD);
      Card31.AddLocationOfCard(LIBRARY);
      
      Card32.AddLocationOfCard(FIELD);
      Card32.AddLocationOfCard(GARDEN);
      Card32.AddLocationOfCard(STUDENT_PARKING);
      Card32.AddLocationOfCard(PYRAMID);
      Card32.AddLocationOfCard(WESTWALK);
      Card32.AddLocationOfCard(FORBIDDEN);
      Card32.AddLocationOfCard(LIBRARY);
      Card32.AddLocationOfCard(BRATWURST_HALL);
      Card32.AddLocationOfCard(EASTWALK);
      
      Card33.AddLocationOfCard(COMP_LAB);
      Card33.AddLocationOfCard(NORTH_HALL);
      Card33.AddLocationOfCard(ROOM_OF_RETIREMENT);
      Card33.AddLocationOfCard(ECS302);
      Card33.AddLocationOfCard(SOUTH_HALL);
      Card33.AddLocationOfCard(ELEVATORS);
      Card33.AddLocationOfCard(ECS308);
      Card33.AddLocationOfCard(EAT);
      Card33.AddLocationOfCard(CONFERENCE);
      Card33.AddLocationOfCard(LACTATION);
      
      Card34.AddLocationOfCard(FIELD);
      Card34.AddLocationOfCard(GARDEN);
      Card34.AddLocationOfCard(STUDENT_PARKING);
      Card34.AddLocationOfCard(PYRAMID);
      Card34.AddLocationOfCard(WESTWALK);
      Card34.AddLocationOfCard(FORBIDDEN);
      Card34.AddLocationOfCard(LIBRARY);
      Card34.AddLocationOfCard(BRATWURST_HALL);
      Card34.AddLocationOfCard(EASTWALK);
      
      Card35.AddLocationOfCard(FIELD);
      Card35.AddLocationOfCard(GARDEN);
      Card35.AddLocationOfCard(STUDENT_PARKING);
      Card35.AddLocationOfCard(PYRAMID);
      Card35.AddLocationOfCard(WESTWALK);
      Card35.AddLocationOfCard(LIBRARY);
      Card35.AddLocationOfCard(BRATWURST_HALL);
      Card35.AddLocationOfCard(EASTWALK);
      
      Card36.AddLocationOfCard(COMP_LAB);
      Card37.AddLocationOfCard(NORTH_HALL);
      Card38.AddLocationOfCard(SOUTH_HALL);
      
      Card38.AddLocationOfCard(FIELD);
      Card38.AddLocationOfCard(GARDEN);
      Card38.AddLocationOfCard(STUDENT_PARKING);
      Card38.AddLocationOfCard(PYRAMID);
      Card38.AddLocationOfCard(WESTWALK);
      Card38.AddLocationOfCard(FORBIDDEN);
      Card38.AddLocationOfCard(LIBRARY);
      Card38.AddLocationOfCard(BRATWURST_HALL);
      Card38.AddLocationOfCard(EASTWALK);
      
      Card39.AddLocationOfCard(STUDENT_PARKING);
   }
}
