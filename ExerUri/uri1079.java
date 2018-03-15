import java.util.Scanner;
public class uri1079{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int valor = input.nextInt();
    String arrays[][] = new String[valor][valor];
    float listValor[] = new float[valor];//{2,3,5};
    input.nextLine();//esvaziando o buffe
    for(int i = 0;i < arrays.length;i++){
      arrays[i] = input.nextLine().split(" ");
      float soma = (Float.parseFloat(arrays[i][0]) * 2) + (Float.parseFloat(arrays[i][1]) * 3) + (Float.parseFloat(arrays[i][2]) * 5);
      listValor[i] = soma;
    }
    for (int i = 0;i<listValor.length;i++){
      System.out.printf("%.1f\n",(double)((float)listValor[i]/10));
    }
  }
}
