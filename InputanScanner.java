import java.util.*; //import
import java.util.Scanner;
public class InputanScanner {
  static Scanner data = new Scanner (System.in);
  public static void main(String[] abc) {
		int umur;
		double tinggi;
		String nama;
		char jk;
		boolean aktif;
  System.out.print("Masukkan umur anda :");
  umur = data.nextInt(); data.nextLine(); //inputan integer/Angka Bulat
  System.out.print("Masukkan nama anda :");
  nama = data.nextLine(); //inputan String /Kata-Kata
  System.out.print("Masukkan tinggi badan anda (dlm meter) :");
  tinggi = data.nextDouble(); data.nextLine(); //inputan Angka Desimal
  System.out.print("Masukkan Jenis Kelamin (L/P) :");
  jk = data.next(".").charAt(0); data.nextLine(); //inputan char/karakter
  System.out.print("Aktif ? :");
  aktif = data.nextBoolean(); data.nextLine(); //inputan boolean(true/false)
  System.out.println(nama+" mempunyai umur "+umur+" ,tinggi "+tinggi);
  System.out.println("Jenis Kelamin "+jk+" Status Aktif "+aktif);
  }
}