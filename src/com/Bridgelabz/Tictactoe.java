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
    /**
     * UC2 Taking playing symbol from user as X or O
     */
    static void playerInput() {
		System.out.println("player 1 please select the symbbol(x/o):");
		player1=sc.next().charAt(0);
		if(player1 =='X' || player1=='O') {
			System.out.println("player 1 symbol :" + player1);
		}else {
			System.out.println("invalid symbol please enter x or o");
			playerInput();
		}
	}
    
	public static void main(String[] args) {
		System.out.println("welcome to tictactoe simulation");
		startGame();

		playerInput();
	}

}
