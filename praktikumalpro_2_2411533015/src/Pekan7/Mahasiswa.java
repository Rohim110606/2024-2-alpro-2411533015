package Pekan7;

public class Mahasiswa {
	//variabel global
	private int Nim;
	private String Nama,Nim2;
	//membuat mutator (setter)
	public void setNim (int nim) {
		this.Nim=nim;
	}
	public void setnim2 (String Nim2) {
		this.Nim2=Nim2;
	}
	public void setnama (String Nama) {
		this.Nama=Nama;
	}
	//membuat acessor (getter)
	public int getNim() {
		return Nim;
	}
	public String getNim2 () {
		return Nim2;
	}
	public String getNama () {
		return Nama;
	}
	//metode lain
	public void cetak () {
		System.out.println("Nim : "+Nim);
		System.out.println("Nama : "+Nama);
	}
	public void cetak2 () {
		System.out.println("Nim : " + Nim2);
		System.out.println("Nama : " +Nama );
	}
}
