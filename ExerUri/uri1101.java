import java.util.Scanner;
import java.util.Arrays;
public class uri1101{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int soma;int m;int n;
    int arraysValor[][];String arrays[];
    int inde = 0;int quant = 0;
    while(true){
      arrays = input.nextLine().split(" ");
      m = Integer.parseInt(arrays[0]);
      n = Integer.parseInt(arrays[1]);
      if (n <= 0){
        break;
      }else{
        soma = 0;
        for (int i = n;i <= m;i++){
          soma += i;
        }
      }
      inde++;
      quant = arrays.length;
      arraysValor[inde] = new int[quant];
      arraysValor[inde][0] = arrays[0];
      arraysValor[inde][1] = arrays[1];
      arraysValor[inde][2] = soma;
    }
    //arraysValor= new int[quant][3];
    for (int i = 0;i < ArraysValor.length;i++){
      for (int j = arraysValor[i][1];j <= arraysValor[i][0];j++){
          System.out.printf("%d ",j);
      }
      System.out.printf("Sum=%d\n",arraysValor[i][2]);
    }
  }
}
