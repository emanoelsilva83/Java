import java.util.Scanner;
import java.util.Arrays;
public class uri1045{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double []lista = {input.nextDouble(),input.nextDouble(),input.nextDouble()};
    Arrays.sort(lista);
    if (lista[2] >= (lista[1]+lista[0])){
      System.out.println("NAO FORMA TRIANGULO");
    }else{
      if (Math.pow(lista[2],2) == (Math.pow(lista[1],2)+Math.pow(lista[0],2))){
        System.out.println("TRIANGULO RETANGULO");
      }if (Math.pow(lista[2],2) > (Math.pow(lista[1],2)+Math.pow(lista[0],2))){
        System.out.println("TRIANGULO OBTUSANGULO");
      }if (Math.pow(lista[2],2) < (Math.pow(lista[1],2)+Math.pow(lista[0],2))){
        System.out.println("TRIANGULO ACUTANGULO");
      }if (lista[2] == lista[1] && lista[1] == lista[0] && lista[0] == lista[2]){
        System.out.println("TRIANGULO EQUILATERO");
      }else if (lista[0] == lista[1] || lista[1] == lista[2] || lista[2] == lista[0]){
        System.out.println("TRIANGULO ISOSCELES");
      }
    }
  }
}
