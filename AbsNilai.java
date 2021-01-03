import java.util.Scanner; //Import the Scanner class
public class AbsNilai {
  public static void main(String[] abc ) {
      Scanner data = new Scanner(System.in); //Create a Scanner object
      int bil;
      System.out.print("Masukkan Bilangan Bulat :");
      bil=data.nextInt(); data.nextLine(); // Read user Input
      System.out.println("Bilangan Tersebut Memiliki Nilai Absolut : "+Abs(bil));
  }
  public static int Abs(int bil) {
        int nilai;
        nilai = Math.abs(bil);
        return nilai;
    }
}