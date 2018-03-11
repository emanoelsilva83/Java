import java.util.Scanner;
import java.util.Arrays;
public class uri1099{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int valor;int arraysValor[];int soma;
    valor = input.nextInt();
    arraysValor = new int[valor];
    for (int i = 0;i < valor;i++){
      soma = 0;
      int arrays[] = {input.nextInt(),input.nextInt()};
      Arrays.sort(arrays);
      for (int j = ++arrays[0];j < arrays[1];j++){
        if (j % 2 != 0){
          soma += j;
        }
      }
      arraysValor[i] = soma;
    }
    for (int indece:arraysValor){
      System.out.println(indece);
    }
  }
}
