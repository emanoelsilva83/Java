import java.util.Scanner;
public class uri1079{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int valor = input.nextInt();
    String arrays[][] = new String[valor][valor];
    int listValor[] = {2,3,5};
    input.nextLine();//esvaziando o buffe
    for(int i = 0;i < arrays.length;i++){
      arrays[i] = input.nextLine().split(" ");
    }
    for (int i = 0;i < arrays.length;i++){
      float soma = 0;
      for (int j = 0;j < 3;j++){
        soma += (Float.parseFloat(arrays[i][j]) * listValor[j]);
      }
      System.out.printf("%.1f \n",(double)((float)soma/10));
    }
  }
}
