import java.util.Scanner; //Import the Scanner class
public class JmlBilAsli {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int i, bil, jumlah=0;
      // Bagian Input
      System.out.print("Masukkan Bilangan Asli :");
      bil= data.nextInt(); data.nextLine(); //Read User Input  
      // perintah for mencari jumlah n bilangan asli dari 1-n
      for (i=1; i<=bil; i++)
      {jumlah=jumlah+i;}
      // cetak hasil
      System.out.println("Hasil Penjumlahan Semua Bilangan Asli :"+jumlah);
    
  }
}