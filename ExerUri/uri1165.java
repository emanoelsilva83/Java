import java.util.Scanner;
public class uri1165{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int n,numero,cont;
    n = input.nextInt();
    for (int i = 0;i<n;i++){
      cont = 0;
      numero = input.nextInt();
      for (int x = 1;x<=numero;x++){
        if (numero % x == 0){
          cont++;
        }
      }
      if (cont == 2){
        System.out.printf("%d eh primo\n",numero);
      }else{
        System.out.printf("%d nao eh primo\n",numero);
      }
    }
    input.close();
  }
}
