public class ExercicioMatrizMaiorNumero{
  public static void main(String[] args){
    int matriz[][] = new int[4][4];
    int aleatorio;int maior = 0;int linha = 0;int coluna = 0;
    for (int i = 0;i < matriz[0].length;i++){
      for (int j = 0;j < matriz[1].length;j++){
          aleatorio = (int) (0 + Math.random() * (9-1));
          matriz[i][j] = aleatorio;
          System.out.print(matriz[i][j]);
      }
      System.out.println();
    }
    for (int i = 0;i<matriz[0].length;i++){
      for (int j = 0;j<matriz[1].length;j++){
        if (matriz[i][j] >= maior){
          maior = matriz[i][j];
          linha = i;
          coluna = j;
        }
      }      
    }
    System.out.printf("o maior valor da matriz é %d e sua linha %d e coluna %d\n",maior,linha,coluna);
  }
}
