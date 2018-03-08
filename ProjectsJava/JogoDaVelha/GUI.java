
import javax.swing.JOptionPane;
public class GUI{
  //Metodos
  public void imprimirTabuleiro(String [][] tabuleiros){
    System.out.println();
    for (String[] tabuleiro:tabuleiros){
      System.out.print("                                                        ");//centralizando o tabuleiro
      for (String imprimir:tabuleiro){
        System.out.print(" "+imprimir);
      }
      System.out.println();
    }
    System.out.println();
  }

  public void mostrarNomePeça(String nome,String peça){
    System.out.printf("Nome do jogador da vez é %s e sua peça é %s \n",nome,peça);
  }
}
