import java.util.Scanner; //Import the Scanner class
public class KonvNilaiLulus {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian deklarasi
      int nilai; //Deklarasi saja (tipe data bil desimal)
      String statuslulus = "TIDAK LULUS";
      String validnilai;
      String kriteria = "TIDAK DIKETAHUI";
      // bagian input nilai mahasiswa
      System.out.print("Masukkan Nilai :");
      nilai = data.nextInt(); data.nextLine(); // Read user input
      // bagian hitung dan konversi
      if((nilai>=0)&(nilai<=100))
      {
        validnilai="VALID"; 
        {
            if(nilai>=60)
               {
                   statuslulus="LULUS";
                   if(nilai<70)
                   {kriteria="CUKUP";}  else
                   if(nilai<80)
                   {kriteria="BAIK";} else
                   {kriteria="SANGAT BAIK";}
               }

            else if(nilai<60)
               {
                   statuslulus="TIDAK LULUS";
               }
               
            
        }
      }
      else
      {validnilai="TIDAK VALID";}      
      // bagian hasil
      System.out.println("Kevalidan Nilai : "+validnilai);
      System.out.println("Status Kelulusan : "+statuslulus);
      System.out.println("Kriteria Nilai  : "+kriteria);
  }
}