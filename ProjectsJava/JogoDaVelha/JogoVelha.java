import java.util.Arrays;
import javax.swing.JOptionPane;
public class JogoVelha{
  public static void main(String[]args){
    //classes
    Motor motor = new Motor();
    GUI gui = new GUI();
    boolean ganhador = false;
    String tabuleiro[][] = motor.criarTabuleiro();
    gui.imprimirTabuleiro(tabuleiro);
    String nomeJ[][] = motor.nomeJogador();
    //do{
      //for (int posiçao = 0;posiçao<motor.getNome().length;posiçao++)
        //gui.mostrarNomePeça(nomeJ[posiçao][0],nomeJ[posiçao][1]);

  //}while(ganhador==false);
  //motor.movimento();
  motor.movimento();
  }
}
