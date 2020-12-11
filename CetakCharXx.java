import java.util.Scanner; //Import the Scanner class
public class CetakCharXx {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      char karakter;
      // Bagian Input
      System.out.print("Masukkan Karakter Anda :");
      karakter= data.next().charAt(0); data.nextLine(); //Read User Input
      // Bagian Proses
      // perintah while mencetak karakter
      while (karakter!='x' & karakter!='X') {
          System.out.println(karakter);
          System.out.print("Masukkan Karakter Anda :");
          karakter= data.next().charAt(0); data.nextLine(); //Read User Input
      }
    
  }
}