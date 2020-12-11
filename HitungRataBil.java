import java.util.Scanner; //Import the Scanner class
public class HitungRataBil {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int i, n, rata, jml, x;
      // Bagian Input
      System.out.print("Banyaknya Data :");
      n= data.nextInt(); data.nextLine(); //Read User Input  
      // Bagian Proses
      jml=0;
      i=1;
      // perintah while mencetak karakter
      while (i<=n) {
          System.out.println(n);
          System.out.print("Data Ke-"+i+": ");
          x= data.nextInt(); data.nextLine(); //Read User Input
          jml+=x;
          i++;
      }
      // Bagian Hitung
      rata=jml/n;
      // cetak hasil
      System.out.println("Hasil Penjumlahan Semua Data :"+jml);
      System.out.println("Rata-Rata Semua Data :"+rata);
      
  }
}