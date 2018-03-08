import java.util.Scanner;
public class uri1066{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int contPa = 0;int contI = 0;int contP = 0;int contN = 0;
    for (int i = 0;i < 5;i++){
      int valor = input.nextInt();
      if (valor % 2 == 0){
        contPa++;
      }else{
        contI++;
      }
      if (valor > 0){
        contP++;
      }else if (valor < 0){
        contN++;
      }
    }
    System.out.printf("%d valor(es) par(es)\n",contPa);
    System.out.printf("%d valor(es) impar(es)\n",contI);
    System.out.printf("%d valor(es) positivo(s)\n",contP);
    System.out.printf("%d valor(es) negativo(s)\n",contN);
  }
}
