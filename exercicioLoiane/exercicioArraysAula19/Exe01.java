import java.util.Scanner;
public class Exe01{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int[] vetorA = new int[5];
    int[] vetorB = new int[5];
    for (int i = 0;i < vetorA.length;i++){
      System.out.println("Informe o valor do vetorA ["+i+"]");
      vetorA[i] = input.nextInt();
      vetorB[i] = vetorA[i];
    }
    System.out.print("Vetor A = ");
    for(int indece:vetorA){
      System.out.print(indece+" ");
    }
    System.out.println();

    System.out.print("Vetor B = ");
    for(int indece:vetorB){
      System.out.print(indece+" ");
    }
    System.out.println();
}
}
