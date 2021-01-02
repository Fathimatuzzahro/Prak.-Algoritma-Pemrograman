import java.util.Scanner; //Import the Scanner class
public class Method {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      String nama;
      int umur;
      System.out.print("Masukkan Nama Anda :");
      nama=data.nextLine(); // Read user Input
      System.out.print("Masukkan Umur Anda :");
      umur=data.nextInt(); data.nextLine(); // Read user Input
      cetakID (nama, umur);
      System.out.println("Anda Pensiun Setelah "+hitungPensiun(umur)+" tahun");
      // atau bisa juga dengan cara kedua
      int menujupensiun=hitungPensiun(umur);
      System.out.println("Anda Pensiun Setelah "+menujupensiun+" tahun");
      hitungPensiun2 (umur);
  } // end main
  public static int hitungPensiun (int usia) { // method dengan parameter dan return int
      int pensiun=67-usia;
      return pensiun;
  } // ada 2 cara juga ini
  public static void hitungPensiun2 (int usia) { // method dengan parameter dan void (tanpa return)
      int pensiun=67-usia;
      System.out.println("Anda Pensiun Setelah "+pensiun+" tahun");
  }
  public static void cetakID (String nama, int usia) { // method dengan parameter dan void (tanpa return)
      garis (); // memanggil method di dalam method
      System.out.println("Nama Anda :"+nama);
      System.out.println("Umur Anda :"+usia);
      garis ();
  }
  public static void garis () { //method tanpa parameter dan void (tanpa return)
      System.out.println("----------***----------");
  } // end method garis
} // end class