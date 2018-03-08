import java.util.Scanner;
public class uri1040{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    float nota1,nota2,nota3,nota4,notaExa,media,media2;
    String[] entrada = input.nextLine().split(" ");
    nota1 = Float.parseFloat(entrada[0]);
    nota2 = Float.parseFloat(entrada[1]);
    nota3 = Float.parseFloat(entrada[2]);
    nota4 = Float.parseFloat(entrada[3]);
    media = (nota1*2+nota2*3+nota3*4+nota4*1)/10;
    if (media >= 5.0 && media <= 6.9){
        notaExa = input.nextFloat();
        System.out.printf("Media: %.1f\n",media);
        System.out.println("Aluno em exame.");
        System.out.printf("Nota do exame: %.1f\n",notaExa);
        media2 = (media+notaExa)/2;
        if (media2 >= 5.0){
          System.out.println("Aluno aprovado.");
        }else{
          System.out.println("Aluno reprovado.");
        }
        System.out.printf("Media final: %.1f\n",media2);
    }else{
      System.out.printf("Media: %.1f\n",media);
      if (media >= 7.0){
        System.out.println("Aluno aprovado.");
      }else{
        System.out.println("Aluno reprovado.");
      }
    }
  }
}
