public class Variabel {
  public static void main(String[] abc ){
      int x=2; //Deklarasi sekaligus inisialisasi
      int y=3;
      int jumlah,kurang,kali; //Deklarasi saja (tipe data bil bulat)
      double bagi; //Deklarasi saja (tipe data bil desimal)
      String Mapel="Matematika";
      jumlah=x+y; //Inisialisasi jumlah dengan proses hitung
      kurang=x-y;
      kali=x*y;
      bagi=(double)x/y;
  System.out.println("Mata Pelajaran : "+Mapel);
  System.out.println("Hasil Penjumlahan : "+jumlah);
  System.out.println("Hasil Penjumlahan : "+(x+y));
  System.out.println("Hasil Penjumlahan "+x+" + "+y+" = "+jumlah);
  System.out.println("Hasil Pengurangan : "+kurang);
  System.out.println("Hasil Perkalian : "+kali);
  System.out.println("Hasil Pembagian : "+bagi);
  }
}
