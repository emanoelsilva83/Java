import java.util.Scanner;
public class Exe03{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int[] vetorA = new int[15];
    int[] vetorB = new int[15];

    for(int i = 0;i < vetorA.length;i++){
      System.out.printf("Informe o valor do vetorA [%d] = ",i);
      vetorA[i] = input.nextInt();
      vetorB[i] = (int)(Math.pow(vetorA[i],2));
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
  }
}
