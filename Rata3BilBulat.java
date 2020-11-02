import java.util.Scanner; //Import the Scanner class
public class Rata3BilBulat {
  public static void main(String[] abc ){
      // Deklarasi
      Scanner data = new Scanner(System.in); //Create a Scanner object
      int a,b,c,jumlah; //Deklarasi saja (tipe data bil desimal)
      double rata;
      // Input
      System.out.print("Masukkan Bil Bulat 1 :");
      a = data.nextInt(); data.nextLine();
      System.out.print("Masukkan Bil Bulat 2 :");
      b = data.nextInt(); data.nextLine();
      System.out.print("Masukkan Bil Bulat 3 :");
      c = data.nextInt(); data.nextLine();
      // Proses
      jumlah=a+b+c;
      rata=(double)jumlah/3;
      // Output
      System.out.println("Rata-Rata dari Tiga Data : "+rata);
      
  
  }
}