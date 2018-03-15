import java.util.Scanner;
public class Exe15{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int[] vetorA = new int[10];
    int contPares = 0;int contImpares = 0;double percImpares;double percPares;
    for (int i = 0;i < vetorA.length;i++){
      System.out.printf("Informe o valor do vetorA de [%d] = ",i);
      vetorA[i] = input.nextInt();
      System.out.println();
    }

    for (int j = 0;j < vetorA.length;j++){
      if(vetorA[j] % 2 != 0){
        contImpares++;
      }else{
        contPares++;
      }
    }
    percImpares = ((double)contImpares/vetorA.length);
    percPares = ((double)contPares/vetorA.length);
    System.out.printf("Percentual de Impares %.2f %%",percImpares);
    System.out.println();
    System.out.printf("Percentual de Pares %.2f %%",percPares);
    System.out.println();
  }
}
