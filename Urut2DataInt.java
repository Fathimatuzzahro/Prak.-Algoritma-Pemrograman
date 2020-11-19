import java.util.Scanner;
public class Urut2DataInt {
  public static void main(String[] args) {
      //Deklarasi
      int jumlah, bilSementara;
      Scanner scan = new Scanner(System.in);
      // Proses
      System.out.print("Masukan jumlah bilangan yang ingin diurutkan: ");
      jumlah = scan.nextInt();
      int bil[] = new int[jumlah];
        System.out.println("Masukan ke-" + jumlah + " bilangan tersebut (setiap bilangan tekan 'ENTER'):");
        for (int i = 0; i < jumlah; i++) 
        {
            bil[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < jumlah; i++) 
        {
            for (int j = i + 1; j < jumlah; j++) { 
                if (bil[i] > bil[j]) 
                {
                    bilSementara = bil[i];
                    bil[i] = bil[j];
                    bil[j] = bilSementara;
                }
            }
        }
        System.out.print("Hasil pengurutan ke-" + jumlah + " bilangan :");
        for (int i = 0; i < jumlah - 1; i++) 
        {
            System.out.print(bil[i] + ", ");
        }
        System.out.print(bil[jumlah - 1]);
    }
}