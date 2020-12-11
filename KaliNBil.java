import java.util.Scanner; //Import the Scanner class
public class KaliNBil {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int i, bil, n, kali=1;
      // Bagian Input
      System.out.print("Masukkan Jumlah Bilangan :");
      n= data.nextInt(); data.nextLine(); //Read User Input
      // Bagian Proses
      for (i=1; i<=n; i++) {
      System.out.print("Masukkan Bilangan Ke-"+i+" :");
      bil= data.nextInt(); data.nextLine(); //Read User Input
      kali *=bil;
      }
      // cetak hasil
      System.out.println("\nHasil Perkalian Semua Bilangan :"+kali);
  }
}