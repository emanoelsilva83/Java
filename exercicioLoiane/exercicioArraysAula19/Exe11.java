import java.util.Scanner;
public class Exe11{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int[] vetorA = new int[10];
    int pares = 0;

    for(int i = 0;i < vetorA.length;i++){
      System.out.printf("Informe o valor do vetorA [%d] = ",i);
      vetorA[i] = input.nextInt();
      if (vetorA[i] % 2 == 0){
        pares += 1;
      }
    }
    System.out.println();

    System.out.print("vetorA = ");
    for(int indece:vetorA){
      System.out.print(indece+" ");
    }
    System.out.println();

    System.out.println("quantidade de elementos pares "+pares);
  }
}
