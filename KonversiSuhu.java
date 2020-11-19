import java.util.Scanner; //Import the Scanner class
public class KonversiSuhu {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      char pilih;
      double suhucelcius, suhuhasil;
      String suhupilihan;
      // Bagian Input
      System.out.print("Masukkan Suhu Celcius Anda :");
      suhucelcius = data.nextDouble(); data.nextLine(); //Read User Input
      System.out.println("Konversi Suhu dari Celcius ke :");
      System.out.println("1. Reamur");
      System.out.println("2. Fahrenheit");
      System.out.println("3. Kelvin");
      System.out.print("Masukkan Pilihan Anda :");
      pilih=data.next().charAt(0); data.nextLine(); // Read User Input
      
      switch (pilih)
      {
          case '1' : 
                        System.out.println("Anda Memilih Reamur");
                        suhuhasil=(double)4/5*suhucelcius;
                        suhupilihan="Reamur";
                        break;
          case '2' :
                        System.out.println("Anda Memilih Fahrenheit");
                        suhuhasil=(double)9/5*suhucelcius+32;
                        suhupilihan="Fahrenheit";
                        break;
          case '3' :
                        System.out.println("Anda Memilih Kelvin");
                        suhuhasil=suhucelcius+273;
                        suhupilihan="Kelvin";
                        break;
          default : 
                        System.out.println("Tidak memilih");
                        suhuhasil=suhucelcius;
                        suhupilihan="Celcius";
                        break;
      }
      // Bagian Hasil
      System.out.println("Jadi Konversi "+suhucelcius+" Celcius adalah "+suhuhasil+" "+suhupilihan);
  }
}