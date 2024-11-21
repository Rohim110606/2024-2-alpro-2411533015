package Pekan6;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		String phrase;
		do {
			System.out.print("input password: ");
			phrase = console.next ();
			
		}while (!phrase.equals("abcd"));

	}

}
