import java.util.Scanner; //Import the Scanner class
public class LuasKelilingSegitiga {
  public static void main(String[] abc ){
      // Deklarasi
      Scanner data = new Scanner(System.in); //Create a Scanner object
      double alas,tinggi,luas,keliling,s1,s2; //Deklarasi saja (tipe data bil desimal)
      // Inputan
      System.out.print("Masukkan Alas :");
      alas = data.nextDouble(); data.nextLine();//input Double alas
      System.out.print("Masukkan Tinggi :");
      tinggi = data.nextDouble(); data.nextLine();//inputan Double tinggi
      // Perhitungan
      luas=1/2*alas*tinggi;
      s1=Math.sqrt((alas*alas)+(tinggi*tinggi));
      s2=Math.sqrt((alas*alas)+(tinggi*tinggi));
      keliling=alas+s1+s2;
      // Cetak Hasil
      System.out.println("Luas Segitiga : "+luas);
      System.out.println("Panjang S1 : "+s1);
      System.out.println("Panjang S2 : "+s2);
      System.out.println("Keliling Segitiga : "+keliling);
  
  }
}