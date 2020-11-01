import java.util.Scanner; //Import the Scanner class
public class WaktuJarakBertemu {
  public static void main(String[] abc ){
      // Deklarasi
      Scanner data = new Scanner(System.in); //Create a Scanner object
      double waktuAB, jarakAX, jarakBX;
      double jarakAB = 500;
      double kecepatanA = 20;
      double kecepatanB = 25;
      // Input
      System.out.print("Masukkan Jarak Mobil A dan B (dalam km) :");
      jarakAB = data.nextDouble(); data.nextLine();
      System.out.print("Masukkan Kecepatan Mobil A (dalam km/jam) :");
      kecepatanA = data.nextDouble(); data.nextLine();
      System.out.print("Masukkan Kecepatan Mobil B (dalam km/jam) :");
      kecepatanB = data.nextDouble(); data.nextLine();
      // Proses
      waktuAB = jarakAB/(kecepatanA + kecepatanB);
      jarakAX = kecepatanA*waktuAB;
      jarakBX = kecepatanB*waktuAB;
      // Output
      System.out.println("Waktu Yang Diperlukan Mobil A dan B Bertemu : "+waktuAB+" jam");
      System.out.println("Jarak A Terhadap Titik Temu : "+jarakAX+" kilometer");
      System.out.println("Jarak B Terhadap Titik Temu : "+jarakBX+" kilometer");
      
  
  }
}