import java.util.Scanner; //Import the Scanner class
public class ArrayMhs {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int i, jmlmhs;
      System.out.print("Masukkan Jumlah Mahasiswa :");
      jmlmhs= data.nextInt(); data.nextLine(); //Read User Input
      String [] nim = new String[jmlmhs+1];
      int [] nilaimtk = new int[jmlmhs+1];
      int [] nilaialgo = new int[jmlmhs+1];

      // Bagian Input
      for (i=1; i<=jmlmhs; i++) {
          System.out.print("Masukkan NIM Mahasiswa ke-"+i+":");
          nim[i]= data.nextLine(); //Read User Input
          }
      for (i=1; i<=jmlmhs; i++) {
          System.out.print("Masukkan Nilai Mtk Mahasiswa ke-"+i+":");
          nilaimtk[i]= data.nextInt(); data.nextLine(); //Read User Input
          }
      for (i=1; i<=jmlmhs; i++) {
          System.out.print("Masukkan Nilai Algo Mahasiswa ke-"+i+":");
          nilaialgo[i]= data.nextInt(); data.nextLine(); //Read User Input
          }

      // Bagian Hitung
      double totalnilaimtk=0;
      double ratanilaimtk;
      double totalnilaialgo=0;
      double ratanilaialgo;
      for (i=1; i<=jmlmhs; i++) {
          totalnilaimtk=totalnilaimtk+nilaimtk[i];
          totalnilaialgo=totalnilaialgo+nilaialgo[i];
          }
          ratanilaimtk=totalnilaimtk/jmlmhs;
          ratanilaialgo=totalnilaialgo/jmlmhs;

      // Hitung IP per mahasiswa
      double [] ip = new double[jmlmhs+1];
      for (i=1; i<=jmlmhs; i++) {
          ip[i]=(double)(nilaimtk[i]+nilaialgo[i])/2;
          }
      double totalnilaiip=0;
      double ratanilaiip;
      for (i=1; i<=jmlmhs; i++) {
          totalnilaiip=totalnilaiip+ip[i];
          }
      ratanilaiip=totalnilaiip/jmlmhs;
      
      // Bagian Output (cetak)
      for (i=1; i<=jmlmhs; i++) {
          System.out.println("NIM Mahasiswa ke-"+i+" adalah "+nim[i]); //badan perulangan
          }
      for (i=1; i<=jmlmhs; i++) {
          System.out.println("Nilai Mtk Mahasiswa ke-"+i+" adalah "+nilaimtk[i]); //badan perulangan
          }
      System.out.println("Rata-Rata Nilai Mtk Mahasiswa adalah "+ratanilaimtk);
      for (i=1; i<=jmlmhs; i++) {
          System.out.println("Nilai Algo Mahasiswa ke-"+i+" adalah "+nilaialgo[i]); //badan perulangan
          }
      System.out.println("Rata-Rata Nilai Algo Mahasiswa adalah "+ratanilaialgo);
      for (i=1; i<=jmlmhs; i++) {
          System.out.println("Nilai IP Mahasiswa ke-"+i+" adalah "+ip[i]); //badan perulangan
          }
      System.out.println("Rata-Rata Nilai IP Mahasiswa adalah "+ratanilaiip);
  }
}