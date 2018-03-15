import java.util.Scanner;
public class Exe14{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int[] vetorA = new int[10];
    int soma = 0;int contImpares = 0;double media;
    for (int i = 0;i < vetorA.length;i++){
      System.out.printf("Informe o valor do vetorA de [%d] = ",i);
      vetorA[i] = input.nextInt();
      System.out.println();
    }

    for (int j = 0;j < vetorA.length;j++){
      if(vetorA[j] % 2 != 0){
        soma += vetorA[j];
        contImpares++;
      }
    }
    media = (double)(soma/contImpares);
    System.out.println("A média dos elementos impares são "+media);
  }
}
