package Pekan7;

import java.util.Scanner;

public class Pemilu2024 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("nama: ");
		String nama=in.nextLine ();
		System.out.print("umur: ");
		int umur = in.nextInt ();
		System.out.print("inputkan pilihan anda (1-3) : ");
		int n = in.nextInt ();
		System.out.println();
		System.out.println("nama: " + nama );
		System.out.println("umur: " + umur);
		System.out.println("pilihan: " +n);
		switch (n) {
		case 1:
			System.out.println("anda memilih anies");
			break;
		case 2:
			System.out.println("anda memilih prabowo");
			break;
		case 3:
			System.out.println("anda memilih ganjar");
			break;
		default:
			System.out.println("pilihan anda bukan nomor 1 sampai 3");
		}
		System.out.println("terima kasih sudah memilih");
	}

}
