import java.util.Scanner; //Import the Scanner class
public class TotGajiGol {
  public static void main(String[] abc ){
      // Bagian Deklarasi
      Scanner data = new Scanner(System.in); //Create a Scanner object
      char pilih;
      double gajipokok, totalgaji;
      // input
      System.out.println("Pilih Golongan Gaji Anda :");
      System.out.println("1. Gol.1");
      System.out.println("2. Gol.2");
      System.out.println("3. Gol.3");
      System.out.print("Masukkan Pilihan Anda :");
      pilih=data.next().charAt(0); data.nextLine(); // Read User Input
      // Proses
      switch (pilih)
      {
          case '1' : 
                        System.out.println("Anda Memilih Golongan 1");
                        gajipokok=1000000;
                        totalgaji=gajipokok;
                        break;
          case '2' :
                        System.out.println("Anda Memilih Golongan 2");
                        gajipokok=2000000;
                        totalgaji=gajipokok;
                        break;
          case '3' :
                        System.out.println("Anda Memilih Golongan 3");
                        gajipokok=3000000;
                        totalgaji=(gajipokok-(0.2*gajipokok));
                        break;
          default : 
                        System.out.println("Inputan yang Anda Masukkan Salah!");
                        gajipokok=0;
                        totalgaji=0;
                        break;
      }
      // Hasil
      System.out.println("Maka dari itu total gajinya adalah : Rp."+totalgaji);
  }
}