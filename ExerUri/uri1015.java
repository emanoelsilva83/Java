import java.util.Scanner;
public class uri1015{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String lista[],lista2[];
    lista = input.nextLine().split(" ");
    lista2 = input.nextLine().split(" ");
    double x,y,x2,y2,dist;
    x = Double.parseDouble(lista[0]);
    y = Double.parseDouble(lista[1]);
    x2 = Double.parseDouble(lista2[0]);
    y2 = Double.parseDouble(lista2[1]);
    dist = Math.sqrt((Math.pow(x2-x,2)+(Math.pow(y2-y,2))));
    System.out.printf("%.4f\n",dist);
  }
}
