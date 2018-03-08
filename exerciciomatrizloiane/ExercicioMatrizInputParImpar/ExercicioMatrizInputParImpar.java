import java.util.Scanner;
public class ExercicioMatrizInputParImpar{
  public static void main(String[] args){
    int matriz[][] = new int[3][3];int quantidadePar = 0;int quantidadeImpar = 0;
    Scanner input = new Scanner(System.in);
    for (int i = 0;i < matriz[0].length;i++){
      for (int j = 0;j < matriz[1].length;j++){
        System.out.printf("Informe o valor da matriz [%d][%d] ",i+1,j+1);
        matriz[i][j] = input.nextInt();
        if (matriz[i][j] % 2 == 0){
          quantidadePar++;
        }else{
          quantidadeImpar++;
        }
        System.out.println();
      }
    }
    System.out.printf("A quantidade de numeros pares são %d ",quantidadePar);
    System.out.println();
    System.out.printf("A quantidade de numeros Impares são %d",quantidadeImpar);
    System.out.println();
  }
}
