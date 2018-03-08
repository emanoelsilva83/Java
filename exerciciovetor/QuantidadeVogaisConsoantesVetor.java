public class QuantidadeVogaisConsoantesVetor{
  public static void main(String[] args){
    char [ ] vogais = {'a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'};
	  char [ ] consoantes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n',
		                      'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
		                       'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N',
		                        'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    char vogConso[] = {'a','b','d','o','!','1','p'};
    int contV = 0;int contC = 0;int j;int x;boolean encontrado;
    for (int i = 0;i < vogConso.length;i++){
      encontrado = false;
      j = 0;
      x = 0;
      while(encontrado == false && j < vogais.length){
        if (vogConso[i] == vogais[j]){
          contV += 1;
          encontrado = true;
      }
      j++;
      }
      if (encontrado == false){
        while (encontrado == false && x < consoantes.length){
          if (vogConso[i] == consoantes[x]){
            contC += 1;
            encontrado = true;
          }
          x++;
        }
      }
    }
    System.out.println("Quantidade de Vogais: "+contV);
    System.out.println("Quantidade de Consoantes: "+contC);
}
}
