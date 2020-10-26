import java.util.Scanner; //Import the Scanner class
public class VariabelInput {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      int x; //Deklarasi
      int y;
      int jumlah,kurang,kali; //Deklarasi saja (tipe data bil bulat)
      double bagi; //Deklarasi saja (tipe data bil desimal)
      String Mapel="Matematika";
      int sisahasilbagi;
      
  System.out.print("Masukkan Nama Mata Pelajaran :");
  Mapel = data.nextLine(); //inputan String
  System.out.print("Masukkan Nilai x :");
  x = data.nextInt(); data.nextLine();//inputan Integer
  System.out.print("Masukkan Nilai y :");
  y = data.nextInt(); data.nextLine();//inputan Integer

      jumlah=x+y; //Inisialisasi jumlah dengan proses hitung
      kurang=x-y;
      kali=x*y;
      bagi=(double)x/y;
      sisahasilbagi=x%y;
  
  System.out.println("Mata Pelajaran : "+Mapel);
  System.out.println("Hasil Penjumlahan : "+jumlah);
  System.out.println("Hasil Penjumlahan : "+(x+y));
  System.out.println("Hasil Penjumlahan "+x+" + "+y+" = "+jumlah);
  System.out.println("Hasil Pengurangan : "+kurang);
  System.out.println("Hasil Perkalian : "+kali);
  System.out.println("Hasil Pembagian : "+bagi);
  System.out.println("Hasil Sisa Hasil Bagi : "+sisahasilbagi);

  }
}
