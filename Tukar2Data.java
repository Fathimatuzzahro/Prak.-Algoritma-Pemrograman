import java.util.Scanner; //Import the Scanner class
public class Tukar2Data {
  public static void main(String[] abc ){
      // Deklarasi
      Scanner data = new Scanner(System.in); //Create a Scanner object
      int a,b,temp;
      // Input
      System.out.print("Masukkan Data A :");
      a = data.nextInt(); data.nextLine();
      System.out.print("Masukkan Data B :");
      b = data.nextInt(); data.nextLine();
      // Proses
      temp=a;
      a=b;
      b=temp;
      // Output
      System.out.println("Nilai Data A : "+a);
      System.out.println("Nilai Data B : "+b);
      
  }
}