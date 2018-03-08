/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetojava;
/**
 *
 * @author emanoel
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Agenda {
    //Metodos
    public void mostrarMatriz(String matrizes[][][],javax.swing.DefaultListModel lista){
    //matrizes[11] = new String[33] "mes" [10]"dias"; //mes
    lista.removeAllElements();
    matrizes[1] = new String[28][8];
    matrizes[3] = new String[30][8];
    matrizes[4] = new String[30][8];
    matrizes[8] = new String[30][8];
    matrizes[10] = new String[30][8];
    for (int m = 0;m < matrizes.length;m++){
      lista.addElement("########################## Mes "+(m+1)+" ##########################");
      for (int d = 0;d < matrizes[m].length;d++){
        lista.addElement("dia :"+(d+1));        
        for (int h = 0;h < matrizes[m][d].length;h++){
            lista.addElement("Horas = "+h+":00 compromisso "+matrizes[m][d][h]+" ");            
        }
        lista.addElement("\n");
      }
      lista.addElement("\n");
    }
    }

    public void adicionarCompromisso(String matrizes[][][],int mes,int dia,int horas,String mensagem,javax.swing.DefaultListModel lista){
    if ((mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 31) && (horas >= 1 && horas <= 8)){
        matrizes[mes-1][dia-1][horas-1] = mensagem; 
        mostrarMatriz(matrizes,lista);
    }else{
      JOptionPane.showMessageDialog(null,"ERRO! data nao corresponde ao tamanho da agenda");  
    }
    }

    public void obtarCompromisso(int mes,int dia,int horas,String matrizes[][][],javax.swing.DefaultListModel lista){
      if ((mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 31) && (horas >= 1 && horas <= 8)){
            lista.removeAllElements();
            lista.addElement("Horas = "+horas+":00 compromisso "+matrizes[mes-1][dia-1][horas-1]+" ");                        
        }else{
          JOptionPane.showMessageDialog(null,"ERRO! data nao corresponde ao tamanho da agenda");  
        }
    }
    
    public void removerCompromisso(int mes, int dia,int horas,String matrizes[][][],javax.swing.DefaultListModel lista){
        //lista.removeAllElements();
        matrizes[mes-1][dia-1][horas-1] = "null";
        mostrarMatriz(matrizes,lista);
    }
}
