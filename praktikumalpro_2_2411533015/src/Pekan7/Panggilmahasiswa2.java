package Pekan7;

import java.util.Scanner;

public class Panggilmahasiswa2 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Nim: ");
		String x= input.nextLine();
		System.out.println("nama:");
		String y=input.nextLine();
		Mahasiswa a=new Mahasiswa();
		a.setnim2(x);
		a.setnama(y);
		System.out.println(a.getNim2());
		System.out.println(a.getNama());
		a.cetak2();
		input.close();

	}

}