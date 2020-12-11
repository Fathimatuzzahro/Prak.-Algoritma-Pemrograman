import java.util.Scanner; //Import the Scanner class
public class PerulanganFor {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int i, jmlulang, U;
      // Bagian Input
      System.out.print("Masukkan Jumlah Perulangan :");
      jmlulang= data.nextInt(); data.nextLine(); //Read User Input
      // Perintah For
      for (i=1; i<=jmlulang; i++) // i=i+1, harus ada nilai awal, kondisi, terminasi. jika terminasi ditulis i--, akan terjadi infinite loop
      {
          System.out.println("Ohayou, Onii-chan!!!"); // badan perulangan
      }
      // hitung maju (i=i+1)
      for (i=1; i<=jmlulang; i++) {
          System.out.println("Cetak Kata Ke-"+i);
      }
      // hitung mundur (i=i-1)
      for (i=jmlulang; i>=1; i--) {
          System.out.println("Cetak Kata Ke-"+i);
      }
      // lompat 2 angka (i+=2)
      for (i=1; i<=jmlulang; i=i+2) {
          System.out.println("Cetak Kata Ke-"+i);
      }
      // cetak bil ganjil antara 1-n (n diinput)
      for (i=1; i<=jmlulang; i++) {
          if (i%2==1) // kalau genap, angka 1 nya diganti 0
          {System.out.println(i);}
      }
      for (i=1; i<=jmlulang; i+=2) {
          {System.out.println(i);}
      }
      // cetak bil genap antara 1-n (n diinput)
      for (i=1; i<=jmlulang; i++) {
          if (i%2==0)
          {System.out.println(i);}
      }
      // cetak n bilangan asli genap pertama 
      for (i=1; i<=jmlulang; i++) {
          U=2*i; // Un = 2n
          {System.out.println(U);}
      }
      // cetak n bilangan asli ganjil pertama
      for (i=1; i<=jmlulang; i++) {
          U=2*i-1; // Un = 2n-1, yang dikalikan i bukan jumlah ulang, karena jumlah ulang bernilai tetap
          {System.out.println(U);}
      }
  }
}