import javax.swing.JOptionPane;
import java.util.Arrays;
public class InverterElementosVetor{
  public static void main(String[] args){
    String vetor[] = new String[]{JOptionPane.showInputDialog("informe um dado: ")};
    String inversa[] = {""};
    String mudar[] = {""};
    int fim = vetor[0].length()-1;
    //String copia[] = {""};
    for (int i = 0;i < vetor[0].length();i++){
      inversa[0] += vetor[0].charAt(fim);
      //copia[0] += vetor[0].charAt(i);
      --fim;
    }
    JOptionPane.showMessageDialog(null,Arrays.toString(inversa));
  //JOptionPane.showMessageDialog(null,Arrays.toString(copia));
  }
}
