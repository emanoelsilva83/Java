import java.util.Random;
public class ExercicioMatrizMaiorMenorNumeroLinha5MaiorMenorNumeroColuna7{
  public static void main(String[]args){
    int matriz[][] = new int[10][10];
    int maior5 = 0;int menor5 = 10;
    int maior7 = 0;int menor7 = 10;
    Random aleatorio = new Random(); //usando classe random
    for (int i = 0;i < matriz.length;i++){
      for (int j = 0;j< matriz[i].length;j++){
        matriz[i][j] = aleatorio.nextInt(10);
        System.out.printf("[%d][%d] = "+matriz[i][j]+" ",i,j);
      }
      System.out.println();
    }

    for (int i = 0;i<matriz[0].length;i++){
      for (int j = 0;j<matriz[1].length;j++){
        if (matriz[5][j] > maior5){
          maior5 = matriz[5][j];
        }
        if(matriz[5][j] < menor5){
          menor5 = matriz[5][j];
        }
        if (matriz[i][7] > maior7){
          maior7 = matriz[i][7];
        }
        if (matriz[i][7] < menor7) {
          menor7 = matriz[i][7];
        }
      }
    }
    System.out.printf("Maior %d e o menor %d valor da linha 5\n",maior5,menor5);
    System.out.printf("Maior %d e o menor %d valor da coluna 7\n",maior7,menor7);
  }
}
