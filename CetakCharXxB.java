import java.util.Scanner; //Import the Scanner class
public class CetakCharXxB {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      char karakter;
      // Bagian Proses  
      // perintah do-while mencetak karakter
      do {
          System.out.print("Masukkan Karakter Anda :");
          karakter= data.next().charAt(0); data.nextLine(); //Read User Input
          System.out.println(karakter);
      } while (karakter!='x' & karakter!='X');
    
  }
}