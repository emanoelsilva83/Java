import javax.swing.*;
public class VerificarVetorCharPalindromo{
  public static void main(String[]args){
    char vetor[] = new char[]{'o','s','o'};
    int fim = vetor.length-1;
    boolean verificar = true;
    for (int i = 0;i <= vetor.length/2;i++){
      if (vetor[i] != vetor[fim]){
        JOptionPane.showMessageDialog(null,"nao é palindromo");
        verificar = false;
        break;
      }
    fim--;
    }
    if (verificar){
      JOptionPane.showMessageDialog(null,"é palindromo");
    }
  }
}
