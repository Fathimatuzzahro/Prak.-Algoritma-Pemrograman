import java.util.Scanner; //Import the Scanner class
public class PerulanganWhile {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int i, jmlulang, U;
      // Bagian Input
      System.out.print("Masukkan Jumlah Perulangan :");
      jmlulang= data.nextInt(); data.nextLine(); //Read User Input
      // Perintah while
      i=1; // NIlai awal
      while (i<=jmlulang) // kondisi 
      {
          U=2*i-1;
          System.out.print(U+" "); //badan perulangan
          i++; //terminasi
      }
      //deret n bilangan ganjil pertama
  }
}