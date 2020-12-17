import java.util.Scanner; //Import the Scanner class
public class HitungXPangkatY {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int x, y, h=1, l=0;
      // Bagian Input
      System.out.print("Masukkan Bilangan :");
      x= data.nextInt(); data.nextLine(); //Read User Input
      System.out.print("Masukkan Pangkat Bilangan :");
      y= data.nextInt(); data.nextLine(); //Read User Input
      // Perintah while
      while (l<y) {
          h=h*x;
          System.out.println("Hasilnya adalah "+h); //badan perulangan
          l=l+1;
      }
  }
}