import java.util.Scanner; //Import the Scanner class
public class FPB2Bil {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int fpb=0, x, y;
      // Bagian Input
      System.out.print("Masukkan Bilangan Pertama :");
      x= data.nextInt(); data.nextLine(); //Read User Input
      System.out.print("Masukkan Bilangan Kedua :");
      y= data.nextInt(); data.nextLine(); //Read User Input
      // Perintah while
      while (fpb != 0) {
         x = y;
         y = fpb;
         fpb = x % y;
      }
      System.out.println("FPB = "+y); //badan perulangan
  }
}