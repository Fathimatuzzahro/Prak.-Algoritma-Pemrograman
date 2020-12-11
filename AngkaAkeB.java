import java.util.Scanner; //Import the Scanner class
public class AngkaAkeB {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int i, a, b, besar, kecil;
      // Bagian Input
      System.out.print("Masukkan Bilangan Bulat Pertama :");
      a= data.nextInt(); data.nextLine(); //Read User Input
      System.out.print("Masukkan Bilangan Bulat Kedua :");
      b= data.nextInt(); data.nextLine(); //Read User Input
      // Bagian Hitung
      // perintah if menentukan besar dan kecil
      if (a>b) {besar=a; kecil=b;} else
      {besar=b; kecil=a;}
      // perintah for mencetak dari kecil ke besar
      for (i=kecil; i<=besar; i++) {
          System.out.print(i+" ");
      }
    
  }
}