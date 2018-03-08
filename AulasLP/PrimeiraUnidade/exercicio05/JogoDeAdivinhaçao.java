import java.util.Scanner;
public class JogoDeAdivinhaçao{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Numero a ser adivinhado: ");
    int jogador1 = input.nextInt();
    int pontos = 100;int cont = 0;
    boolean adivinhou = false;
    while(adivinhou == false){
      int jogador2 = input.nextInt();
      if (jogador1 == jogador2){
        System.out.printf("Adivinhou numero %d\n",jogador2);
        adivinhou = true;
      }else if (jogador1 > jogador2){
        System.out.println("menor");
        pontos -= 20;
      }else if(jogador2 > jogador1){
        System.out.println("maior");
        pontos -= 20;
      }
      if (pontos == 0){
        System.out.println("Voce perdeu o jogo");
        adivinhou = true;
      }
    }
    System.out.printf("pontos: %d\n",pontos);
    input.close();
  }
}
