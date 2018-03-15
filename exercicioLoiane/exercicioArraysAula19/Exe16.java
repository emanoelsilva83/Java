import java.util.Scanner;
public class Exe16{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int[] vetorA = new int[10];
    int a = 0;int b = 0;double c = 0;int cont = 0;
    for(int i = 0;i < vetorA.length;i++){
      System.out.printf("Informe o valor do vetorA [%d] = ",i);
      vetorA[i] = input.nextInt();
      System.out.println();
      if (vetorA[i] < 15){
        a += vetorA[i];
      }else if(vetorA[i] > 15){
        c += vetorA[i];
        cont++;
      }else{
        b += vetorA[i];
      }
    }
    c = c/cont;
    System.out.printf("Soma dos elementos menores que 15 %d\nQuantidade de elementos que são iquais a 15 %d\nMédia dos elementos que são superiores a 15 %.2f\n",a,b,c);
  }
}
