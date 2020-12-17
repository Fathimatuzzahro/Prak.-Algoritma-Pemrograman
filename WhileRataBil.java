import java.util.Scanner; //Import the Scanner class
public class WhileRataBil {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int bnykbil=0, bil, total=0;
      char ulang='y'; // nilai awal
      double rata; 
      // Perintah while
      while (ulang=='y' || ulang=='Y') // kondisi
      // Bagian Input
      {
      System.out.print("Masukkan Bilangan untuk dicari rata-rata :");
      bil= data.nextInt(); data.nextLine(); //Read User Input
      total=total+bil;
      bnykbil=bnykbil+1; //bnykbil++
      System.out.print("Apakah Anda ingin input bilangan lagi?(y/t) :");
      ulang= data.next().charAt(0); data.nextLine(); //Read User Input
      }
      rata=(double)total/bnykbil;
      System.out.print("Hasil dari rata-rata adalah "+rata);
      /*
      if (bil%2==1) {
          System.out.println("Bilangan "+bil+" termasuk bilangan ganjil");
      } else
      {System.out.println("Bilangan "+bil+" termasuk bilangan genap");}
      */
  }
}