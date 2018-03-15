import java.util.Scanner;
public class Exe13{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int[] vetorA = new int[10];
    int soma = 0;

    for(int i = 0;i < vetorA.length;i++){
      System.out.printf("Informe o valor do vetorA [%d] = ",i);
      vetorA[i] = input.nextInt();
      if (vetorA[i] % 5 == 0){
          soma += vetorA[i];
      }
    }
    System.out.println();

    System.out.print("vetorA = ");
    for(int indece:vetorA){
      System.out.print(indece+" ");
    }
    System.out.println();

    System.out.println("Soma dos multiplos de 5 = "+soma);
  }
}
