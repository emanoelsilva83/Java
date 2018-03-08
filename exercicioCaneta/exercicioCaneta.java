import java.util.Scanner;
public class exercicioCaneta{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Caneta can = new Caneta();
    System.out.print("Informe o modelo da caneta: ");
    can.setModelo(input.next());
    System.out.print("Informe a cor da caneta: ");
    can.setCor(input.next());
    System.out.print("Informe a ponta: ");
    can.setPonta(input.nextFloat());
    System.out.print("Informe a quantidade da carga: ");
    can.setCarga(input.nextInt());
    System.out.print("A caneta está tampada? ");
    String tampa = input.next();
    if ("true".equals(tampa)){
      can.tampada();
    }else if ("false".equals(tampa)){
      can.destampada();
    }else{
      System.out.println("ERRO");
    }
    System.out.println("");
    can.rabiscada();
    can.status();
  }
}
