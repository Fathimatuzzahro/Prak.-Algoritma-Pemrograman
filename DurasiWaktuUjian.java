import java.util.Scanner; //Import the Scanner class
public class DurasiWaktuUjian {
  public static void main(String[] abc ){
      // Deklarasi
      Scanner data = new Scanner(System.in); //Create a Scanner object
      int jamA, menitA, detikA, jamB, menitB, detikB, konvJam, konvMenit, konvDetik, totalA, totalB, selisih, sisa1, sisa2;
      // Input
      System.out.print("Masukkan Jam A :");
      jamA = data.nextInt(); data.nextLine();
      System.out.print("Masukkan Menit A :");
      menitA = data.nextInt(); data.nextLine();
      System.out.print("Masukkan Detik A :");
      detikA = data.nextInt(); data.nextLine();
      System.out.print("Masukkan Jam B :");
      jamB = data.nextInt(); data.nextLine();
      System.out.print("Masukkan Menit B :");
      menitB = data.nextInt(); data.nextLine();
      System.out.print("Masukkan Detik B :");
      detikB = data.nextInt(); data.nextLine();
      // Proses
      totalA=jamA*3600+menitA*60+detikA;
      totalB=jamB*3600+menitB*60+detikB;
      selisih=totalB-totalA;
      sisa1=selisih%3600;
      konvJam=(selisih-sisa1)/3600;
      sisa2=sisa1%60;
      konvMenit=(selisih-sisa1)/60;
      konvDetik=sisa2;
      // Output
      System.out.println("Durasi Waktu Ujian : "+konvJam+" jam, " +konvMenit+" menit, " +konvDetik+" detik");
      
      
  }
}