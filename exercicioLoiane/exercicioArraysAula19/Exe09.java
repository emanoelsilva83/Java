import java.util.Scanner;
public class Exe09{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int[] vetorA = new int[10];
    int[] vetorB = new int[10];
    int[] vetorC = new int[10];
    for(int i = 0;i < vetorA.length;i++){
      System.out.printf("Informe o valor do vetorA [%d] = ",i);
      vetorA[i] = input.nextInt();
      System.out.printf("Informe o valor do vetorB [%d] = ",i);
      vetorB[i] = input.nextInt();
      vetorC[i] = vetorA[i] / vetorB[i];
    }
    System.out.println();

    System.out.print("vetorA = ");
    for(int indece:vetorA){
      System.out.print(indece+" ");
    }
    System.out.println();

    System.out.print("vetorB = ");
    for(int indece:vetorB){
      System.out.print(indece+" ");
    }
    System.out.println();

    System.out.print("vetorC = ");
    for(int indece:vetorC){
      System.out.print(indece+" ");
    }
    System.out.println();
  }
}
