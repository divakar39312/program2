package com.Bridgelabz;

import java.util.Scanner;

public class Tictactoe {

private static char[] board = new char[10];
	
	static private char player1;
	
    static Scanner sc=new Scanner(System.in);
    /**
     * UC1 This method is assigning space to board array
     */
    static void startGame() {
    	for(int i = 1;i <= 9;i++) {
    		board[i] = ' ';
    	}		
	}
    
	public static void main(String[] args) {
		System.out.println("welcome to tictactoe simulation");
		startGame();

	}

}
