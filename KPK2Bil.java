import java.util.Scanner; //Import the Scanner class
public class KPK2Bil {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int kpk=0, i=1, x, y;
      // Bagian Input
      System.out.print("Masukkan Bilangan Pertama :");
      x= data.nextInt(); data.nextLine(); //Read User Input
      System.out.print("Masukkan Bilangan Kedua :");
      y= data.nextInt(); data.nextLine(); //Read User Input
      // Perintah while
      while (i<=y) {
          kpk=kpk+x;
          i=i+1;
      }
          System.out.println("KPK = "+kpk); //badan perulangan
  }
}