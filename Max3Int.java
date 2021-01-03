import java.util.Scanner; //Import the Scanner class
public class Max3Int {
  public static void main(String[] abc ) {
      Scanner data = new Scanner(System.in); //Create a Scanner object
      int a, b, c;
      System.out.print("Masukkan Bilangan Pertama :");
      a=data.nextInt(); data.nextLine(); // Read user Input
      System.out.print("Masukkan Bilangan Kedua :");
      b=data.nextInt(); data.nextLine(); // Read user Input
      System.out.print("Masukkan Bilangan Ketiga :");
      c=data.nextInt(); data.nextLine(); // Read user Input
      System.out.println("Bilangan Terbesar : "+Maks(a,b,c));
  }
  public static int Maks(int a, int b, int c) {
        int maksimal;
        if (a>b & a>c) {
            maksimal=a;
        } else if (b>a & b>c){
            maksimal=b;
        } else {
            maksimal=c;
        }
        return maksimal;
    }
}