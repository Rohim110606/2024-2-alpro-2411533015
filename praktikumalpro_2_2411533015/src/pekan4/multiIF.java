package pekan4;

import java.util.Scanner;

public class multiIF {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner a= new Scanner (System.in);
		System.out.print("input umur anda: ");
		umur = a.nextInt();
		System.out.print("apakah anda sudah punya sim c: ");
		sim = a.next().charAt(0);
		a.close();
		
		if (umur >=17 && sim == 'y') {
			System.out.println("anda sudah dewasa dan boleh bawa motor");
		}
		
		if (umur >=17 && sim != 'y') {
			System.out.println("anda sudah dewasa tetapi tidak boleh bawa motor");
		}
		
		if (umur < 17 && sim == 'y') {
			System.out.println("anda belum cukup umur bawa motor");
		}
		
		if (umur < 17 && sim != 'y') {
			System.out.println("anda belum cukup umur punya sim ");
		}

	}

}
