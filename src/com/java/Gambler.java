package com.java;

import java.util.Random;
import java.util.Scanner;

public class Gambler {
    public static final int BET = 1;
	public static final int Stake_Day = 100 ;
	public static final int WIN = 1;
    public static int stake = 0;

	public static Scanner scanner = new Scanner(System.in);
	public static void Gambler(){
		
		//Scanner scanner = new Scanner(System.in);
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
      
		System.out.println("stake= " +stake);
	}
		public static void CheckResignDay(){
			int totalstake = 0;
			
			while (stake!= 50 && stake != -50)
			{
				wincheck();
			}
		  totalstake = stake + Stake_Day ;
		
			System.out.println(+totalstake);
		
	scanner.close();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Welcome");
	
		CheckResignDay();
	}
	
}


