import java.util.Scanner;
public class uri1064{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int cont = 0;double soma = 0;double valor = 0;double media;
    for (int i = 0;i < 6;i++){
      valor = input.nextDouble();
      if (valor > 0){
        cont++;
        soma += valor;
      }
    }
    media = soma/cont;
    System.out.printf("%d valores positivos\n",cont);
    System.out.printf("%.1f\n",media);
  }
}
