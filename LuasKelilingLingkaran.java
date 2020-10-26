import java.util.Scanner; //Import the Scanner class
public class LuasKelilingLingkaran {
  public static void main(String[] abc ){
      // Deklarasi
      Scanner data = new Scanner(System.in); //Create a Scanner object
      double jari,keliling,luas; //Deklarasi saja (tipe data bil desimal)
      final double phi=3.14;
      // Inputan
      System.out.print("Masukkan Jari-Jari :");
      jari = data.nextDouble(); data.nextLine();//input Double jari-jari
      // Perhitungan
      keliling=2*phi*jari;
      //luas=phi*jari*jari;
      luas=phi*Math.pow(jari,2); //Math.pow(r,2)=r^2, Math.sqrt(n)=akar pangkat 2 dari n
      // Cetak Hasil
      System.out.println("Luas Lingkaran : "+luas);
      System.out.println("Keliling Lingkaran : "+keliling);
      //cari luas dan keliling segitiga sama kaki yang diketahui alas dan tingginya
  
  }
}