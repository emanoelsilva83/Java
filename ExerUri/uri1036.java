import java.util.Scanner;
public class uri1036{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String[] entrada = input.nextLine().split(" ");
    double a,b,c,r1,r2,d,e;
    a = Double.parseDouble(entrada[0]);
    b = Double.parseDouble(entrada[1]);
    c = Double.parseDouble(entrada[2]);
    d = Math.pow(b,2)-(4*a*c);
    e = Math.sqrt(d);
    if (d < 0 || a == 0){
      System.out.println("Impossivel calcular");
    }else{
      r1 = (-b + e)/(2*a);
      r2 = (-b - e)/(2*a);
      System.out.printf("R1 = %.5f\n",r1);
      System.out.printf("R2 = %.5f\n",r2);
    }
  }
}
