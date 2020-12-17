import java.util.Scanner; //Import the Scanner class
public class WhileGenapGanjil {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int i, bil;
      char ulang='y';
      // Perintah while
      while (ulang=='y' || ulang=='Y') // kondisi
      // Bagian Input
      {
      System.out.print("Masukkan Bilangan untuk dicek (genap/ganjil):");
      bil= data.nextInt(); data.nextLine(); //Read User Input
      if (bil%2==1) {
          System.out.println("Bilangan "+bil+" termasuk bilangan ganjil");
      } else
      {System.out.println("Bilangan "+bil+" termasuk bilangan genap");}
      System.out.print("Apakah Anda ingin input bilangan lagi?(y/t) :");
      ulang= data.next().charAt(0); data.nextLine(); //Read User Input
      }
  }
}