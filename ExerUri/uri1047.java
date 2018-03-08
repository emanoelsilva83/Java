import java.util.Scanner;
public class uri1047{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int horasMinut[] = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    int x=0,y=0;
    if (horasMinut[2] - horasMinut[0] == 1 && horasMinut[1] > horasMinut[3]){
      x = 0;
      y = (horasMinut[3] + 60) - horasMinut[1];
    }else if (horasMinut[0] > horasMinut[2] && horasMinut[1] > horasMinut[3]){
      x = (horasMinut[2] + 24) - horasMinut[0];
      y = (horasMinut[3] + 60) - horasMinut[1];
    }else if (horasMinut[0] > horasMinut[2] && horasMinut[1] < horasMinut[3]){
      x = (horasMinut[2] + 24) - horasMinut[0];
      y = horasMinut[3] - horasMinut[1];
    }else if (horasMinut[0] == horasMinut[2] && horasMinut[1] == horasMinut[3]){
      x = 24;
      y = 0;
    }else if (horasMinut[0] == horasMinut[2] && horasMinut[1] < horasMinut[3]){
      x = 0;
      y = horasMinut[3] - horasMinut[1];
    }else if (horasMinut[0] < horasMinut[2]){
      x = horasMinut[2] - horasMinut[0];
      y = horasMinut[3] - horasMinut[1];
      if (horasMinut[1] > horasMinut[3]){
        y = (horasMinut[3] + 60) - horasMinut[1];
      }
    }
    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",x,y);
  }
}
