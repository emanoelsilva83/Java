import java.util.Scanner;
public class uri1019{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int valor = input.nextInt();
    int h,m,s;
    h = (valor)/3600;
    valor = (valor)%3600;
    m = (valor)/60;
    s = valor%60;
    System.out.printf("%d:%d:%d\n",h,m,s);
  }
}
