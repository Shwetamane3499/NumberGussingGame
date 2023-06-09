package com.NumberGussing;

import java.util.Random;
import java.util.Scanner;

public class NumberGussingGame 
{
	public static void main(String[] args) 
	{
		boolean playAgain=true;
		int totalScore=0;
		
		
		System.out.println("\n\n * Welcome To Number Gussing Game * \n\n");
		
		
		Scanner sc=new Scanner(System.in);
		
		while(playAgain)
		{
			
			//random number generated by computer between 1 to 100
			Random random=new Random();
			int systemGuess = random.nextInt(100);
			int turns=0;
			int roundScore=0;
			
			
			//Display the rues of the game.
			System.out.println("NOTE: ");
			System.out.println("\n 1. Please Guess Number Between 1 - 100 \n");
			System.out.println(" 2.You have only 10 Turns\n");
			System.out.println("Best of Luck!!!\n");
			System.out.println("---------------------------------------\n");
			
			//requesting to enter the number
			System.out.println("Enter your Number: \n");
			

			int userguess = 0;
			int i=0;
			boolean win=false;
			while(win==false)
			{
				userguess=sc.nextInt();
				turns++;
				
				//if the system generated number and user guessed number is equals then you can win the game
				if(userguess==systemGuess)
				{
					win=true;
				}
				//if you not guess number within 10 turn then you loss the game
				else if(i>10)
				{
					System.out.println("\n SORRY YOU LOSE. BEST LUCK NEXT TIME ");
					
					System.out.println("\n Right answer was:"+systemGuess);
					
					System.out.println("\n Play again ? (Y/N) ");
					
					
					//if you want to play again then choose y or you don't want to play then choose n
					String PlayAgainChoice=sc.next().toUpperCase().toLowerCase();
					if(PlayAgainChoice.equals("N")|| PlayAgainChoice.equals("n"))
					{
						playAgain=false;
					}
					
					break;
				}
				else if(userguess < systemGuess)
				{
					i++;
					
					System.out.println("Oops Your Number is smaller ! \n");
				}
				else if(userguess > systemGuess)
				{
					System.out.println("Oops Your Number is Greater ! \n");
				}
				
			}
			
			if(win)
			{
				int score=(100-turns);
			
				roundScore=score;
				totalScore += score;
				System.out.println("\n OOhhoo !....Congratulations You Win This Game ! ");
				System.out.println("\nThe number was :: "+systemGuess);
				System.out.println("\n Turn Used "+turns);
				System.out.println("\n Your Score is : "+ score +" out of 100");
				
				System.out.println("\n Play again ? (Y/N) ");
				
				String PlayAgainChoice=sc.next().toUpperCase().toLowerCase();
				if(PlayAgainChoice.equals("N")|| PlayAgainChoice.equals("n"))
				{
					playAgain=false;
				}
				
			}
		}
		
		System.out.println(" \n =======  Game Over ======= \n ");
	}
}
