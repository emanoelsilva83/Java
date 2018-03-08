import java.util.Scanner;
public class uri1010{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String[] lista = input.nextLine().split(" ");
    String[] lista2 = input.nextLine().split(" ");
    double a = Double.parseDouble(lista[1]);
    double b = Double.parseDouble(lista[2]);
    double c = Double.parseDouble(lista2[1]);
    double d = Double.parseDouble(lista2[2]);
    double md = (a * b + c * d);
    System.out.printf("VALOR A PAGAR: R$ %.2f\n",md);

  }
}
