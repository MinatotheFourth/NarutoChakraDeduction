/*
 * This program gives you Naruto level chakra and is used as a deduction test along with practice for methods.
 * I'll probably add some GUI to it when I learn how to use it properly.
 */

import java.util.Scanner;

public class Main 
{
	
	
	
	public static void main(String[] args) 
	{
		int chakraLvl = 900000000; //This is ninety million. It's just an estimate.
		int choice, refills = 2; //This is the variable used to say how many times the user can set chakraLvl to ninety million.
		
		Scanner c = new Scanner(System.in); //Scanner used for the choice variable. Nothing else!
		
		//All programs need a greeting statement
		System.out.println("You are Naruto Uzumaki, the kid-voice hokage. Experience his chakra levels with this program!."
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n");
		
		//This is the main loop. It will be with the user until they press 7 to end it
		
		do   //begin do-while.
		{
	//Beginning conditions
			
			//This is the if condition statement existing for if the user ignores their limits
			if(chakraLvl <= 0)
			{
				System.out.println("You over-exerted yourself, and you're now dead");
				System.exit(0);
			} //End of 1st condition
			
			
			
			//This begins the 2nd condition for when the user is still in the safe range
			else if(chakraLvl > 51)
			{
				
		System.out.println("You have " + chakraLvl + " chakra points remaining and " + refills + " chakra refills remaining. "
				+ "\n"
				+ "\nChoose a ninjutsu."
				+ "\n"
				+ "\n1. Shadow clone jutsu (This divides you chakra evenly)"
				+ "\n2. Rasengan - 50"
				+ "\n3. Wind Style: Rasenshuriken - 300"
				+ "\n4. Summoning jutsu - 20"
				+ "\n5. Tailed beast bomb - 10000"
				+ "\n6. Refil chakra"
				+ "\n7. I'm done");
			} //End of 2nd condition
			
			
			
			//This 3rd condition is for when the user is NOT in the safe range, BUT they can leave the unsafe zone with their refills
			else if(chakraLvl < 51 && refills > 0)
			{
		System.out.println("You have " + chakraLvl + " chakra points remaining. YOU'RE RUNNING LOW ON CHAKRA. REFILL NOW SO YOU DON'T DIE! "
				+ "\n"
				+ "\nChoose a ninjutsu."
				+ "\n"
				+ "\n1. Shadow clone jutsu (This divides you chakra evenly)"
				+ "\n2. Rasengan - 50"
				+ "\n3. Wind Style: Rasenshuriken - 300"
				+ "\n4. Summoning jutsu - 20"
				+ "\n5. Tailed beast bomb - 10000"
				+ "\n6. Refil chakra"
				+ "\n7. I'm done");
			} //End of 3rd condition
			
			//This 4th condition is for when the user is NOT in the safe range AND they have no refills. The only thing the user can do now is exit or die.
			else if(chakraLvl < 51 && refills == 0)
			{
		System.out.println("You have " + chakraLvl + " chakra points remaining. YOU'RE RUNNING LOW ON CHAKRA, AND YOU HAVE NO REFILLS!"
				+ " CALL IT A DAY, AND GO HOME! "
				+ "\n"
				+ "\nChoose a ninjutsu."
				+ "\n"
				+ "\n1. Shadow clone jutsu (This divides you chakra evenly)"
				+ "\n2. Rasengan - 50"
				+ "\n3. Wind Style: Rasenshuriken - 300"
				+ "\n4. Summoning jutsu - 20"
				+ "\n5. Tailed beast bomb - 10000"
				+ "\n6. Refil chakra"
				+ "\n7. I'm done");
			} //End of 4th condition
			
	//End of conditions
			
		choice = c.nextInt(); //The user makes their choice
	
		
	//This is for if the user thinks they're funny, and they input a number not within range
		
		if(choice < 1 || choice > 7 || (chakraLvl < 21 && choice < 6))
		{
			
			do //Begin next do while. This do-while is here just in case there are repeated instance of ignored directions or if they think they're rambo.
			{
			System.out.println("Invalid entry or you don't have chakra!");
			System.out.println("\nChoose a ninjutsu."
					+ "\n"
				+ "\n1. Shadow clone jutsu (This divides you chakra evenly)"
				+ "\n2. Rasengan - 50"
				+ "\n3. Wind Style: Rasenshuriken - 300"
				+ "\n4. Summoning jutsu - 20"
				+ "\n5. Tailed beast bomb - 10000"
				+ "\n6. Refil chakra"
				+ "\n7. I'm done");
			choice = c.nextInt();
			
			}while(choice < 1 || choice > 7 || (chakraLvl < 21 && refills == 0 && choice < 7)); //End do while.
		
		} //End of condition
		
			
		//This switch begins when the user picks a valid option
		switch(choice) //Begin switch
		{
		case 1:
			chakraLvl = shadowCloneJutsu(chakraLvl);	
			break;
			
		case 2:
			chakraLvl = Rasengan(chakraLvl);
			break;
			
		case 3:
			chakraLvl = Rasenshuriken(chakraLvl);
			break;
			
		case 4:
			chakraLvl = chakraLvl - 20;
			break;
			
		case 5:
			chakraLvl = TBB(chakraLvl);
			break;
			
		case 6:
			
			//Someone is going to try to waste these. Best if I make a condition that prevents it
			if(chakraLvl >= 900000000)
			{
				System.out.println("Don't waste your refills!");
			}
			
			//If not, best I let them know they're out
			else if(refills == 0)
				System.out.println("Out of refills.");
			
			//Otherwise, carry on!
			else if (refills > 0)
			{
			chakraLvl = 900000000; 
			System.out.println("Chakra refilled");
			refills--;
			}
			//End of conditions
		
		break;
			
		case 7:
			System.out.println("Have a good one!");
			System.exit(0);
			break;
			
		} //End of switch statement
		
		
		
		
		}while(choice != 7);  //End Main while
		
	}
	
	//This method is for the shadow clone jutsu!
	public static int shadowCloneJutsu(int chakra)
	{
		int numClones;
		Scanner c = new Scanner(System.in);
		System.out.println("How manu clones are you making?");
		numClones = c.nextInt();

		if (numClones < 0)
			do
			{
				System.out.println("You can't have negative clones! Try again!");
				numClones = c.nextInt();
				
			}while(numClones < 0);
		
		
		
		int result = chakra / (1+ numClones);
		int cl = result;
		if(result < 0)
		{
			System.out.println("You over-exerted yourself, and you're now dead");
			System.exit(0);
			return 0;
		}
		
		else
		return result;
		
	}

	//This method is for the Rasengan
	public static int Rasengan(int chakra)
	{
		Scanner R = new Scanner (System.in);
		int Rasenchakra = 50;
		int NumRasengan;
		System.out.println("How many Rasengans are you using?");
		NumRasengan = R.nextInt();
		
		if (NumRasengan < 0)
			do
			{
				System.out.println("You can't have negative Rasengans! Try again!");
				NumRasengan = R.nextInt();
				
			}while(NumRasengan < 0);
		
		
		int Result = chakra - (Rasenchakra * NumRasengan);

		if(Result < 0)
		{
			System.out.println("You over-exerted yourself, and you're now dead");
			System.exit(0);
			return 0;
		}
		
		else
		
		return Result;
		
	}
	
	//This method is for using the Rasenshuriken
	public static int Rasenshuriken(int chakra)
	{
		Scanner RS = new Scanner (System.in);
		int RShurikenchakra = 300;
		int NumRasenShurikens;
		System.out.println("How many Rasenshurikens are you using?");
		NumRasenShurikens = RS.nextInt();
		
		if (NumRasenShurikens < 0)
			do
			{
				System.out.println("You can't have negative Rasenshurikens! Try again!");
				NumRasenShurikens = RS.nextInt();
				
			}while(NumRasenShurikens < 0);
		
		int Result = chakra - (RShurikenchakra * NumRasenShurikens);
		
		if(Result < 0)
		{
			System.out.println("You over-exerted yourself, and you're now dead");
			System.exit(0);
			return 0;
		}
		
		else
		
		return Result;
	}
	
	//This method is used when the user wants to use a tailed beast bomb
	public static int TBB(int chakra)
	{
		Scanner BB = new Scanner (System.in);
		int BD = 10000;
		int NumBD;
		System.out.println("How many Tailed Beast Bombs are you using?");
		NumBD = BB.nextInt();
		
		if (NumBD < 0)
			do
			{
				System.out.println("You can't have negative Tailed beast bombs! Try again!");
				NumBD = BB.nextInt();
				
			}while(NumBD < 0);
		
		int Result = chakra - (BD * NumBD);
		
		if(Result < 0)
		{
			System.out.println("You over-exerted yourself, and you're now dead");
			System.exit(0);
			return 0;
		}
		
		else
		
		return Result;
	}
	
}
