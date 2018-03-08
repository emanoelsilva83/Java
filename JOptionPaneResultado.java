
import javax.swing.JOptionPane;
public class JOptionPaneResultado{
  public static void main(String[] args){
    int totalValores = 0;int totalPares = 0;int totalImpares = 0;int acimaCem = 0;int mediaValores = 0;int media;int soma = 0;
    int valores;
    do{
      valores = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um valor: "));
      if (valores % 2 == 0 && valores != 0){        
        totalPares += 1;
      }else if(valores % 2 != 0){
        totalImpares += 1;
      }
      if (valores > 100){
        acimaCem += 1;
      }
      totalValores += 1;
      soma += valores;
    }while(valores != 0);
    media = soma / totalValores;
    JOptionPane.showMessageDialog(null,"<html>Resultado<hr>"+"<br>Total de Valores "+ --totalValores+"<br>Total de Pares "+totalPares+
    "<br>Total de Impares "+totalImpares+"<br>Acima de cem "+acimaCem+"<br>Média dos valores "+media);
  }
}
