package pekan3;

import java.util.Scanner;

public class operatorAritmatika {

	public static void main(String[] args) {
		int A1;
		int A2;
		int hasil;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Input angka-1 : ");
		A1 = keyboard.nextInt();
		System.out.println("input angka-2: ");
		A2 = keyboard.nextInt() ;
		keyboard.close() ;
		System.out.println("operator penjumlahan");
		hasil = A1 + A2;  // penjumlahan
		System.out.println("Hasil =" + hasil);
		System.out.println("operator pengurangan");
		hasil = A1 - A2; // Pengurangan
		System.out.println("Hasil = " + hasil);
		
		System.out.println("operator perkalian");
		hasil = A1 * A2;//Perkalian
		System.out.println("Hasil = " + hasil);
		System.out.println("operator hasil bagi");
		hasil = A1 / A2;//pembagian
		System.out.println("Hasil = " + hasil);
		System.out.println("operator sisa bagi");
		hasil = A1 % A2;//sisa bagi
		System.out.println("Hasil = " + hasil);
		
		}

}
