import java.util.Scanner; //Import the Scanner class
public class HitungGajiBersih {
  public static void main(String[] abc ){
      // Deklarasi
      Scanner data = new Scanner(System.in); //Create a Scanner object
      double gajipokok, tunjangan, gajikotor, pajak, gajibersih;
      // Input
      System.out.print("Masukkan Gaji Pokok :");
      gajipokok = data.nextDouble(); data.nextLine();
      // Proses
      tunjangan=0.10*gajipokok; //atau tunjangan=(double)10/100*gajipokok
      gajikotor=gajipokok+tunjangan;
      pajak=0.05*gajikotor;
      gajibersih=gajikotor-pajak;
      // Output
      System.out.println("Tunjangan : "+tunjangan);
      System.out.println("Gaji Kotor : "+gajikotor);
      System.out.println("Pajak : "+pajak);
      System.out.println("Gaji Bersih : "+gajibersih);
      
  
  }
}