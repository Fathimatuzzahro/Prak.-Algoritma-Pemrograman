public class TipeDataVariabel {
  public static void main (String[] abc ){
  String nama; //deklarasi variabel
  nama = "Paijo bin Bejo"; //inisialisasi var(beri nilai)
  int umur, tahun lahir; //2 deklarasi langsung
  tahunlahir=1999; //inisialisasi var(beri nilai)
  umur = 2019-tahunlahir; //perhitungan dengan operator -
  double ipk =3.5; //deklarasi sekaligus inisialisasi
  char kelas ='C';
  boolean mhsaktif=true;
  System.out.println("Nama saya "+nama); //cetak var
  System.out.println("Tahun lahir "+tahunlahir);
  System.out.println("Umur saya "+umur+" tahun")
  System.out,println("IPK :"+ipk);
  System.out.println("Kelas :"+kelas);
  System.out.println("Status keaktifan :"+mhsaktif);
  System.out.println("Dua tahun lagi umur saya "+(umur+2)+" tahun");
  int tiga_th_lalu;
  tiga_th_lalu=umur-3;
  System.out.println("tiga th yg lalu umur saya "+tiga_th_lalu+" tahun");
  } //end main
} // end class