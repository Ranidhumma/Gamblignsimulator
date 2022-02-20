package com.java;

import java.util.Scanner;

public class Gambler {
	    public static final int BET = 1;
		public static final int Stake_Day = 100 ;
		public static final int WIN = 1;
	    public static int stake = 0; //initial gambler bets with 1
	    static int daysWonCount = 0;
	    static int daysLostCount = 0;
	    public static Scanner scanner = new Scanner(System.in);
		
	    public static void Gambler(){	
			System.out.println("Enter a stake value");
			int stake = scanner.nextInt();
			System.out.println("Enter a bet Value");
			int bet = scanner.nextInt();
		}
		
		public static void wincheck() {
			//Random random = new Random();
			//int bet = random.nextInt(2);
		    double bet= Math.floor(Math.random() * 10)% 2;
			if (bet == WIN) 
			{
				stake++ ; 
			}
			else {
				stake--; 
				}
		}

		 public static void monthlyWinOrLossCheck() {
				int day;
				for (day = 1; day <= 20; day++) {
				    System.out.printf("day %d\n", day);
				    CheckResignDay(); 
				    if (stake == 50) {
						daysWonCount++;
					    } 
				    else if (stake == -50) {
						daysLostCount++;
				    }  
				}	
				System.out.printf("days won for a month = %d\ndays lost for a month = %d\n", daysWonCount, daysLostCount);
				if (daysWonCount > daysLostCount) {
				System.out.printf("I will Continue Playing Next Month");
				}
				else {
					System.out.printf("Stop Gambling");
				}
			}
		public static void CheckResignDay(){
				int totalstake = 0;
				stake = 0;
				while (stake != 50 && stake != -50)
				{
					wincheck();
				}
			  totalstake = stake + Stake_Day ;
			   System.out.println("total Stake for resign for a day is " + totalstake);  //total stake for a day 
			
 scanner.close();
	}

		public static void main(String[] args) {
		System.out.println("Welcome");
     	monthlyWinOrLossCheck();
		}
		
	}
