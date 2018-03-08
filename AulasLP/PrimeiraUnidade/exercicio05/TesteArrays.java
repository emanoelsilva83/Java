import javax.swing.JOptionPane;
public class TesteArrays{
  public static void main(String[]args){
    int quantNomes = 3;
    String [] nomes = new String[3];
    for (int k = 0;k<quantNomes;k++){
      nomes[k] = JOptionPane.showInputDialog("Digite um nome: ");
    }
    JOptionPane.showMessageDialog(null,"O primeiro nome foi: "+nomes[0]);
    JOptionPane.showMessageDialog(null,"O último nome foi: "+nomes[nomes.length-1]);
  }
}
