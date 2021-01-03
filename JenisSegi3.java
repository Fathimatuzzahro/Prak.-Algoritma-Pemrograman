import java.util.Scanner; //Import the Scanner class
public class JenisSegi3 {
  public static void main(String[] abc ) {
      Scanner data = new Scanner(System.in); //Create a Scanner object
      int a, b, c;
      System.out.print("Masukkan Sisi Pertama :");
      a=data.nextInt(); data.nextLine(); // Read user Input
      System.out.print("Masukkan Sisi Kedua :");
      b=data.nextInt(); data.nextLine(); // Read user Input
      System.out.print("Masukkan Sisi Ketiga :");
      c=data.nextInt(); data.nextLine(); // Read user Input
      String jenis=Jenis(a,b,c);
      System.out.println("Merupakan "+Jenis(a,b,c));
  }
  public static String Jenis(int a, int b, int c) {
        if (a==b && b!=c && a!=c || b==c && b!=a && a!=c || a==c && b!=a && b!=c) {
            return "Segitiga Sama Kaki";
        } else if (a==b || a==c || a==b) {
            return "Segitiga Sama Sisi"; 
        } else {
            return "Segitiga Sembarang";
        }
  }
}