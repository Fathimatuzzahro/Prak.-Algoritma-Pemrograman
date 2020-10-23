import java.util.*; //import
import java.util.Scanner;
public class Tugas4_V3420032 {
  static Scanner data = new Scanner (System.in);
  public static void main(String args[]) {
		String Data_Mahasiswa;
		String NIM;
		String Nama_Lengkap;
		int Umur;
		double Tinggi_Badan;
		char Jenis_Kelamin;
		boolean Aktif;
  System.out.println("Data Mahasiswa");
  System.out.print("Masukkan NIM anda :");
  NIM = data.nextLine(); //inputan String /Kata-Kata
  System.out.print("Masukkan nama lengkap anda :");
  Nama_Lengkap = data.nextLine(); //inputan String /Kata-Kata
  System.out.print("Masukkan umur anda :");
  Umur = data.nextInt(); data.nextLine(); //inputan integer /Angka Bulat
  System.out.print("Masukkan tinggi badan anda (dlm meter) :");
  Tinggi_Badan = data.nextDouble(); data.nextLine(); //inputan Angka Desimal
  System.out.print("Masukkan Jenis Kelamin (L/P) :");
  Jenis_Kelamin = data.next(".").charAt(0); data.nextLine(); //inputan char/karakter
  System.out.print("Aktif ? :");
  Aktif = data.nextBoolean(); data.nextLine(); //inputan boolean(true/false)
  System.out.println(Nama_Lengkap+" mempunyai umur "+Umur+" tahun,tinggi "+Tinggi_Badan+" meter");
  System.out.println("Jenis Kelamin "+Jenis_Kelamin+" Status Aktif "+Aktif);
  }
}