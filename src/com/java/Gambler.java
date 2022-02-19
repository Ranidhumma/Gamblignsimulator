package com.java;

import java.util.Random;
import java.util.Scanner;

public class Gambler {
	public static final int BET = 1;
	public static final int Initial_steke_PER_Day = 100 ;
	public static final int WIN = 1;
	public static final int stake =1;
	
	public static void Gambler(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a stake value");
		int stake = scanner.nextInt();
		System.out.println("Enter a bet Value");
		int bet = scanner.nextInt();
	}
	
	public static void wincheck() {
		Random random = new Random();
		int bet = random.nextInt(2);
		int win; 
		if (bet == win) {
			stake ++;
		}
		else {
			stake -- ;
		}
	
	scanner.close();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Welcome");
	}
	
}
