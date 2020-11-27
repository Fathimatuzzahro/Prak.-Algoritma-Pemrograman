import java.util.Scanner; //Import the Scanner class
public class AkarPersKuad {
  public static void main(String[] abc ){
      Scanner data = new Scanner(System.in); //Create a Scanner object
      // bagian deklarasi
      int a,b,c,d;
      double x1;
      double x2;
      // bagian inputan
      System.out.print("Masukkan Nilai a :");
      a = data.nextInt(); data.nextLine(); // Read user input
      System.out.print("Masukkan Nilai b :");
      b = data.nextInt(); data.nextLine(); // Read user input
      System.out.print("Masukkan Nilai c :");
      c = data.nextInt(); data.nextLine(); // Read user input
      
      // bagian hitung sekaligus output
      d=b*b-4*a*c;
      System.out.println("Nilai D adalah "+d);
      if(d==0)
      System.out.println("Persamaan di atas memiliki akar-akar yang sama");
      if(d>0)
      System.out.println("Persamaan di atas memiliki akar-akar yang nyata");
      if(d<0)
      System.out.println("Persamaan di atas memiliki akar-akar khayal");

      if(d>=0)
        {
          x1=(-b+Math.sqrt(d))/(2*a);
          x2=(-b-Math.sqrt(d))/(2*a);
          System.out.println("Akarnya adalah " +x1+ " dan " +x2);
        } else
      if(d<0)
          System.out.println("Persamaan di atas memiliki akar-akar khayal");

          if(a==0)
            {System.out.println("Bukan merupakan persamaan kuadrat");} else
          if(a<0)
            {System.out.println("Persamaan di atas merupakan definit negatif");} else
            {System.out.println("Persamaan di atas merupakan definit positif");}

  }
}