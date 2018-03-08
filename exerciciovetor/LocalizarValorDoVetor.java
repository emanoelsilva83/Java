import java.util.Scanner;
import java.util.Arrays;
public class LocalizarValorDoVetor{
  public static void main(String[]args){
    boolean cont = false;
    int vetor[] = new int[]{3,2,5,6,7,8};
    System.out.print("Informe qual o numero que deseja localizar: ");
    int numero = new Scanner(System.in).nextInt();
    for (int i = 0;i < vetor.length;i++){
      if (numero == vetor[i]){
        System.out.printf("numero %d encontrado na posiçao %d \n",numero,i+1);
        cont = true;
        break;
      }
    }
    if (cont == false){
        System.out.printf("numero %d não encontrado\n",numero);
    }
    //de outro modo
    /*int encontrado = Arrays.binarySearch(vetor,numero);
    if (encontrado >= 0){
      System.out.println("numero encontrado");
    }else{
      System.out.println("numero nao encontrado");
  }*/
}
}
