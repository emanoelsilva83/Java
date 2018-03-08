import java.util.Scanner;
public class uri1180{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.nextLine();//esvaziar o buffy para receber outra resposta
    String entrada[] = input.nextLine().split(" ");
    int vetor[] = new int[n];int menor = 10;int posi = 0;
    for (int i = 0;i < vetor.length;i++){
      vetor[i] = Integer.parseInt(entrada[i]);
      if (vetor[i] <= menor){
        menor = vetor[i];
        posi = i;
      }
    }
    System.out.printf("Menor valor: %d\n",menor);
    System.out.printf("Posicao: %d\n",posi);
    input.close();
  }
}
