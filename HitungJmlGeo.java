import java.util.Scanner; //Import the Scanner class
public class HitungJmlGeo {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // Bagian Deklarasi
      int a=1, batas, total=0;
      // Bagian Input
      System.out.print("Masukkan Batas :");
      batas= data.nextInt(); data.nextLine(); //Read User Input
      // Perintah for
      for(int i = 1; i<=batas; i++){
		System.out.print(a);
		total = a + total;
		a = a * 2;
		if (i<batas){
			System.out.print(" + ");
		}else{
			System.out.print(" = "+total);
		}
	}
  }
}