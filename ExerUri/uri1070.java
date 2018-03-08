import java.util.Scanner;
public class uri1070{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int valor = input.nextInt();
    int cont = 0;
    while(cont < 6){
      if (valor % 2 != 0){
        System.out.println(valor);
        cont++;
      }
      valor++;
    }
  }
}
