import java.util.Scanner;  // Needed for the Scanner class

/**
   This class demonstrates the Television class.
*/

//The purpose of this class is to model a television
//Abhrajit Ghosh and 11/6/2019

public class Televisions
{
   public static void main(String[] args)
   {
      // Create a Scanner object to read from the keyboard
      Scanner keyboard = new Scanner (System.in);

      // Declare variables
      class Television {
    	  
    	  int Volume;
    	  int ScreenSize;
    	  Boolean PowerOn;
    	  String Manufacturer;
    	  int Channel;      // The user's channel choice

      // Declare and instantiate a television object
      
    	  Television(String Manufacturer, int ScreenSize)
    	  {
    	  
    	  Channel=20;
    	  Volume = 21;
    	  
    	  PowerOn = false;
    	 
    	  }

	public void power() {
		if (PowerOn==false) {
		    PowerOn = true;
		} 
	   if (PowerOn==true) {
		    PowerOn = false;
		} 
	}
	
	
	public String getManufacturer() {
		return (Manufacturer);
	}

	public int getScreenSize() {
		return (ScreenSize);
	}

	public int getChannel() {
		
		return (Channel);
	}

	public int getVolume() {
		return (Volume);
	}

	public void decreaseVolume() {
		Volume=Volume-1;
	}

	public void increaseVolume() {
		Volume=Volume++;
	}

	public void setChannel(int station) {
		
		Channel=station;
	}


       }
      Television bigScreen = new Television("Toshiba", 55);
      bigScreen.Manufacturer=("Toshiba");
      bigScreen.ScreenSize=55;
      // Turn the power on
       bigScreen.power();

      // Display the state of the television
      System.out.println("A " +
                         bigScreen.getScreenSize() +
                         " inch " +
                         bigScreen.getManufacturer() +
                         " has been turned on.");
      
      // Prompt the user for input and store into station
      int station;
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();

      // Change the channel on the television
      bigScreen.setChannel(station);

      // Increase the volume of the television
      bigScreen.increaseVolume();

      // Display the the current channel and
      System.out.println("Too loud! Lowering the volume.");
      // volume of the television
      System.out.println("Channel: " +
                         bigScreen.getChannel() +
                         " Volume: " +
                         bigScreen.getVolume());
      System.out.println("Too loud! Lowering the volume.");

      // Decrease the volume of the television
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();

      // Display the the current channel and
      // volume of the television
      System.out.println("Channel: " +
                         bigScreen.getChannel() +
                         " Volume: " +
                         bigScreen.getVolume());

      System.out.println();   // For a blank line
       
      // HERE IS WHERE YOU DO TASK #5
      Television Portable = new Television("Sharp", 19);
      Portable.Manufacturer=("Sharp");
      Portable.ScreenSize=19;
      //power on
      Portable.power();
      //Print
      System.out.println("A " +
              Portable.getScreenSize() +
              " inch " +
              Portable.getManufacturer() +
              " has been turned on.");
      //channel
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();
      Portable.setChannel(station);
      //Decrease volume by 2
      Portable.decreaseVolume();
      Portable.decreaseVolume();
      System.out.println("Channel: " +
              Portable.getChannel() +
              " Volume: " +
              Portable.getVolume());
    	}

	   
	   
  }
   
