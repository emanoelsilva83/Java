import java.util.Scanner;
public class uri1020{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int anoEmDias = input.nextInt();
    int ano,mes,dias;
    ano = anoEmDias/365;
    anoEmDias = anoEmDias%365;
    mes = anoEmDias/30;
    dias = anoEmDias%30;
    System.out.printf("%d ano(s)\n",ano);
    System.out.printf("%d mes(es)\n",mes);
    System.out.printf("%d dia(s)\n",dias);
  }
}
