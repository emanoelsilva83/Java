import java.util.Scanner;
public class Media{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite um inteiro n");
    int n = input.nextInt();
    double soma = 0,media,nota;
    for (int i = 0;i<n;i++){
      System.out.printf("Informe a nota %d\n",i+1);
      nota = input.nextDouble();
      soma += nota;
    }
    media = soma/n;
    System.out.printf("Meida %.2f\n",media);
    input.close();//encerra o metodo Scanner
  }
}
