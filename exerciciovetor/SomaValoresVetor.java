public class SomaValoresVetor{
  public static void main(String []args){
    int vetor[] = {2,5,3,1,7,4};    
    int soma = 0;
    for (int i = 0;i < vetor.length;i++){
      soma += vetor[i] ;
    }
    System.out.printf("a soma dos valores do vetor é %d \n",soma);
  }
}
