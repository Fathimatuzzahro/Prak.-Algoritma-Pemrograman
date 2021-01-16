/*
*Nama  : Fathimatuzzahro
*NIM   : V3420032
*Kelas : TI B 2020
*/
import java.util.Scanner; //Import the Scanner class
public class UASMethodArray {
  public static void main(String[] args ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      String nama;
      int i, jumlahitem;
      int diskon=0;
      int totalBayar=0;
      System.out.println("Masukkan Nama Admin : ");
      nama = data.nextLine();
      System.out.println("================*****================");
      System.out.println("===Yookoso Okoshi Kudasai Mashita!===");
      System.out.println("================*****================");
      System.out.print("\nMasukkan Jumlah Item yang Dibeli :");
      jumlahitem= data.nextInt(); data.nextLine();
      String [] namabarang = new String [jumlahitem+1];
      int [] hargabarang = new int [jumlahitem+1];
      int [] jumlahbarang = new int [jumlahitem+1];
      int [] totalharga = new int [jumlahitem]; 

      for (i=1; i<=jumlahitem; i++) {
          System.out.print("Masukkan Nama Barang ke-"+i+":");
          namabarang[i]= data.nextLine();
          }
      for (i=1; i<=jumlahitem; i++) {
          System.out.print("Masukkan Harga Barang ke-"+i+":");
          hargabarang[i]= data.nextInt(); data.nextLine();
          }
      for (i=1; i<=jumlahitem; i++) {
          System.out.print("Masukkan Jumlah Barang ke-"+i+":");
          jumlahbarang[i]= data.nextInt(); data.nextLine();
          }
      for (i=1; i<=jumlahitem; i++) {
          totalBayar = totalBayar+jumlahbarang[i]*hargabarang[i];
          }
          System.out.println("\n");
          System.out.println("Anda Harus Membayar Sebesar "+totalBayar);
          System.out.println("\n");
          System.out.println("-------------TERIMA KASIH-------------");
  }
  public static void garis () {
      garis(); 
  }
}
 