import java.util.Scanner;
public class GanjilGenap{
    public static void main(String[] args) {
        Scanner data = new Scanner (System.in);
        // Deklarasi
        int angka;
        
        // Inputan
        System.out.print("Masukkan Sebuah Bilangan :");
        angka = data.nextInt();

        // Proses sekaligus Hasil
        if (angka < 0){
        System.out.print("Bilangan " + angka + " merupakan nilai negatif.");
        } else if (angka % 2 == 0) {
            System.out.print("Bilangan " + angka + " adalah genap.");
        } else {
            System.out.print("Bilangan " + angka + " adalah ganjil.");
    }
  }
}