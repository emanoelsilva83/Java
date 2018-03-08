import java.util.Scanner;
public class uri1012{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String lista[] = input.nextLine().split(" ");
    double a,b,c,circu,t,pi,trape,quad,retan;
    pi = 3.14159;
    a = Double.parseDouble(lista[0]);
    b = Double.parseDouble(lista[1]);
    c = Double.parseDouble(lista[2]);
    t = a*c/2;
    circu = pi*Math.pow(c,2);
    trape = ((a+b)*c)/2;
    quad = Math.pow(b,2);
    retan = a*b;
    System.out.printf("TRIANGULO: %.3f\n",t);
    System.out.printf("CIRCULO: %.3f\n",circu);
    System.out.printf("TRAPEZIO: %.3f\n",trape);
    System.out.printf("QUADRADO: %.3f\n",quad);
    System.out.printf("RETANGULO: %.3f\n",retan);
  }
}
