import java.lang.Math;
public class MaxMin3Bil{
    public static void main(String[] args) {
        // Deklarasi 
        int angka1, angka2, angka3, maks;
        angka1 = 45;
        angka2 = 20;
        angka3 = 75;
        // Cetak sebelum diproses
        System.out.println("Angka Pertama adalah "+angka1);
        System.out.println("Angka Kedua adalah "+angka2);
        System.out.println("Angka Ketiga adalah "+angka3);
        // Proses
        maks = Math.max(angka1, angka2);
        if (angka3>maks) {
            maks=angka3;
        }
        // Hasil
        System.out.println("Jadi, Angka Maksimalnya adalah "+maks);
    }
}