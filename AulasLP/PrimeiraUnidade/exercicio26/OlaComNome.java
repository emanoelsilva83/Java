import javax.swing.JOptionPane;
public class OlaComNome{
  public static void main(String[]args){
    String nome = JOptionPane.showInputDialog("Qual o seu nome?");
    JOptionPane.showMessageDialog(null,"Olá "+nome);
  }
}
