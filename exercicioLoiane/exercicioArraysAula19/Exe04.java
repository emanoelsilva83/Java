import java.util.Scanner;
public class Exe04{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int[] vetorA = new int[15];
    double[] vetorB = new double[15];

    for(int i = 0;i < vetorA.length;i++){
      System.out.printf("Informe o valor do vetorA [%d] = ",i);
      vetorA[i] = input.nextInt();
      vetorB[i] = Math.sqrt(vetorA[i]);
    }
    System.out.println();

    System.out.print("vetorA = ");
    for(int indece:vetorA){
      System.out.print(indece+" ");
    }
    System.out.println();

    System.out.print("vetorB = ");
    for(double indece:vetorB){
      System.out.printf("%.1f ",indece);
    }
    System.out.println();
  }
}
