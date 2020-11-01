import java.util.Scanner; //Import the Scanner class
public class HitungTotalBayar {
  public static void main(String[] abc ){
      // Deklarasi
      Scanner data = new Scanner(System.in); //Create a Scanner object
      double diskonA, diskonB, totalbayar;
      double hargaA = 1000;
      double hargaB = 2000;
      // Input
      System.out.print("Masukkan Harga Barang A :");
      hargaA = data.nextDouble(); data.nextLine();
      System.out.print("Masukkan Harga Barang B :");
      hargaB = data.nextDouble(); data.nextLine();
      // Proses
      diskonA = (double) 10/100*hargaA;
      diskonB = (double) 5/100*hargaB;
      totalbayar = (hargaA-diskonA)+(hargaB-diskonB);
      // Output
      System.out.println("Diskon Barang A : "+diskonA);
      System.out.println("Diskon Barang B : "+diskonB);
      System.out.println("Total Bayar : "+totalbayar);
      
  
  }
}