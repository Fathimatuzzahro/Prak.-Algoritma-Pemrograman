import java.util.Scanner; //Import the Scanner class
public class LuasPersegiPanjang {
  public static void main(String[] abc ){
      // Deklarasi
      Scanner data = new Scanner(System.in); //Create a Scanner object
      double panjang,lebar,luas; //Deklarasi saja (tipe data bil desimal)
      // Inputan
      System.out.print("Masukkan Panjang :");
      panjang = data.nextDouble(); data.nextLine();//input Double panjang
      System.out.print("Masukkan Lebar :");
      lebar = data.nextDouble(); data.nextLine();//inputan Double lebar
      // Perhitungan
      luas=panjang*lebar;
      // Cetak Hasil
      System.out.println("Luas Persegi Panjang : "+luas);
  
  }
}