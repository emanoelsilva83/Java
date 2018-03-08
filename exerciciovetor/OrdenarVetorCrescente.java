import java.util.Arrays;
public class OrdenarVetorCrescente{
  public static void main(String[] args){
    int vetor[] = {2,4,1,6,5,8,7,12};
    int aux;

    /*1 forma: Arrays.sort(vetor);
    System.out.print(Arrays.toString(vetor));*/

    //Ordem crescente
    //2 forma:
    for (int i = 0;i < vetor.length;i++){
      for (int j = 0;j < vetor.length;j++){
        if (vetor[i] < vetor[j]){
          aux = vetor[i];
          vetor[i] = vetor[j];
          vetor[j] = aux;
        }
      }
    }
    System.out.println(Arrays.toString(vetor));//Usando o metodo Arrays toString()
  }
}
