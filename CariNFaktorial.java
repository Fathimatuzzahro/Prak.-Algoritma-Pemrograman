import java.util.Scanner; //Import the Scanner class
public class CariNFaktorial {
  public static void main(String[] abc ) {
      Scanner data = new Scanner(System.in); //Create a Scanner object
      int a, i=1;
      System.out.print("Masukkan Angka :");
      a=data.nextInt(); data.nextLine(); // Read user Input
      System.out.println(a+"! adalah "+Faktorial(a));
  }
  public static int Faktorial(int a) {
            if (a==1 || a==0) {
            return 1;
            } else
            {return a*Faktorial(a-1);
            }
    }
}