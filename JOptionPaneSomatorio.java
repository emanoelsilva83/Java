import javax.swing.JOptionPane;
public class JOptionPaneSomatorio{
  public static void main(String[] args){
    int soma = 0;
    int s = 0;
    do{
      soma = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Infome um numéro: <br><em>(valor 0 para encerrar)</em></html>"));
      s += soma;
    }while(soma != 0);
    JOptionPane.showMessageDialog(null,"<html>Resultado final <br><hr>"+
    "<br>Somatório vale "+s+"</html>");
  }
}
