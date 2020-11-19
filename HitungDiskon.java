import java.util.Scanner; //Import the Scanner class
public class HitungDiskon {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      double totalbelanja, diskon, totaldiskon, bayarsetelahdiskon;
      // Bagian Input
      System.out.print("Masukkan Total Belanja Anda :");
      totalbelanja = data.nextDouble(); data.nextLine(); //Read User Input
      // Bagian Hitung
      if(totalbelanja>=100000) {diskon=10;} else
      if(totalbelanja>=50000) {diskon=5;} else
      {diskon=0;}
      totaldiskon=diskon/100*totalbelanja;
      bayarsetelahdiskon=totalbelanja-totaldiskon;
      // Bagian Hasil
      System.out.println("Anda Mendapat Diskon :"+diskon+" % ");
      System.out.println("Total Diskon Anda : Rp."+totaldiskon);
      System.out.println("Bayar Setelah Diskon : Rp."+bayarsetelahdiskon);
  }
}
