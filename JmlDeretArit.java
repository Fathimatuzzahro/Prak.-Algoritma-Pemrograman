import java.util.Scanner; //Import the Scanner class
public class JmlDeretArit {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int a, b, U, n, i=0, total=0;
      // Bagian Input
      System.out.print("Masukkan Suku Pertama :");
      a= data.nextInt(); data.nextLine(); //Read User Input
      System.out.print("Masukkan Banyaknya Bilangan :");
      n= data.nextInt(); data.nextLine(); //Read User Input
      System.out.print("Masukkan Beda (selisih) :");
      b= data.nextInt(); data.nextLine(); //Read User Input
      // Bagian Proses
      U=a+(n-1)*b;
      System.out.print("Maka Suku Terakhirnya adalah "+U);
      
      for (a=i; a<=U; a+=b)
      total+=n; 
      System.out.println("\nHasil Penjumlahan Semua Bilangan adalah "+total);
      
  }
}