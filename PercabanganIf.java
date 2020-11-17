import java.util.Scanner; //Import the Scanner class
public class PercabanganIf {
  public static void main(String[] abc ){
      // Bagian Deklarasi
      Scanner data = new Scanner(System.in); //Create a Scanner object
      int nilai; //Deklarasi saja (tipe data bil desimal)
      String statuslulus, ucapan;
      char konversi; // data char menggunakan petik satu
      // Bagian Input
      System.out.print("Masukkan Nilai :");
      nilai = data.nextInt(); data.nextLine(); // Read user input
      // Bagian Hitung
      /*
      if(nilai>=60)
            { System.out.println("Anda Lulus"); } else
            { System.out.println("Anda Tidak Lulus"); }
      */
      //if tanpa else
      if(nilai<0)
      {System.out.println("Nilai Tidak Valid");}
      //if dengan else
      if(nilai>=60)
            { statuslulus="LULUS"; ucapan="Selamat!!!"; } else
            { statuslulus="TIDAK LULUS"; ucapan="Sekolah yang bener!!!"; }
      //bisa juga dibalik
      /*
      if(nilai<60)
            {statuslulus="TIDAK LULUS"; ucapan="Sekolah yang bener!!!"} else
            {statuslulus="LULUS"; ucapan="Selamat!!!"}
      */
      //if bersarang / nested if
      if(nilai<45)
      {konversi='E';} else
      if(nilai<60)
      {konversi='D';} else
      if(nilai<75)
      {konversi='C';} else
      if(nilai<86)
        {konversi='B';} else
        {konversi='A';}
      // bisa juga dibalik
      /*
      if(nilai>=86)
      {konversi='A';} else
      if(nilai>=75)
      {konversi='B';} else
      if(nilai>=60)
      {konversi='C';} else
      if(nilai>=45)
        {konversi='D';} else
        {konversi='E';}
      */
      //if dengan 2 kondisi dengan operator (logika and/or) jk di dlm range pakai and, jk di luar range pakai or
      String validnilai;
      if((nilai>=0)&(nilai<=100))
      {validnilai="VALID";} else
      {validnilai="TIDAK VALID";}
      //bisa juga dibalik
      /*
      if((nilai<0)|(nilai>100))
      {validnilai="TIDAK VALID";} else
      {validnilai="VALID";}
      */
      // Output
      System.out.println("Nilai adalah : "+nilai);
      System.out.println("Status Kelulusan adalah : "+statuslulus+", "+ucapan);
      System.out.println("Nilai Konversi adalah : "+konversi); 
      System.out.println("Kevalidan Nilai adalah : "+validnilai);    
  
  }
}