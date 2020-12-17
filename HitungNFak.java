import java.util.Scanner; //Import the Scanner class
public class HitungNFak {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int i=1, f, hasil=1;
      // Bagian Input
      System.out.print("Masukkan Bilangan Faktorial(n!) :");
      f= data.nextInt(); data.nextLine(); //Read User Input
      // Perintah do-while
      do {
      hasil=hasil*i;
      System.out.println("Jadi, nilai faktorialnya adalah "+hasil); //badan perulangan
      i++;
      } while (i<=f); // kondisi
      /* 
      {
          U=2*i-1;
          System.out.print(U+" "); //badan perulangan
          i++; //terminasi
      }
      //deret n bilangan ganjil pertama
      */
  }
}