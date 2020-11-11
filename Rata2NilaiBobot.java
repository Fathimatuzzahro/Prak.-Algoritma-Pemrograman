import java.util.Scanner; //Import the Scanner class
public class Rata2NilaiBobot {
  public static void main(String[] abc ){
      // Deklarasi
      Scanner data = new Scanner(System.in); //Create a Scanner object
      double nilaimath,nilaialgo,rata;
      final int sksmath=2;
      final int sksalgo=3;
      // Input
      System.out.print("Masukkan Nilai Matematika :");
      nilaimath = data.nextDouble(); data.nextLine();
      System.out.print("Masukkan Nilai Algoritma :");
      nilaialgo = data.nextDouble(); data.nextLine();
      // Proses
      rata=(nilaimath*sksmath+nilaialgo*sksalgo)/(sksmath+sksalgo);
      // Output
      System.out.println("Rata - Rata Nilai : "+rata);
      
  }
}