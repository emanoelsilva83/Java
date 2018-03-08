import java.util.Scanner;
public class uri1008{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int numFuncionario = input.nextInt();
    int horasWork = input.nextInt();
    double valorHora = input.nextDouble();
    double salario = horasWork*valorHora;
    System.out.printf("NUMBER = %d\n",numFuncionario);
    System.out.printf("SALARY = U$ %.2f\n",salario);
  }
}
