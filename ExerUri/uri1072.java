import java.util.Scanner;
public class uri1072{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int quantidade = input.nextInt();int contC = 0;int contI = 0;
    for (int i = 0;i < quantidade;i++){
      int valor = input.nextInt();
      if (valor >= 10 && valor <= 20){
        contI++;
      }else{
        contC++;
      }
    }
    System.out.printf("%d in\n%d out\n",contI,contC);
  }
}
