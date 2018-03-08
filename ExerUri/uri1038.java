import java.util.Scanner;
public class uri1038{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String[] entrada = input.nextLine().split(" ");
    int a,b;
    double tot;
    a = Integer.parseInt(entrada[0]);
    b = Integer.parseInt(entrada[1]);
    double lista[] = {4.00,4.50,5.00,2.00,1.50};
    tot = b*lista[(a-1)];
    System.out.printf("Total: R$ %.2f\n", tot);
  }
}
