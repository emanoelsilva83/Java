import java.util.Scanner;
public class uri1061{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int h,m,s,dia,dia2,h2,m2,s2,dias,horas = 24,minut = 1,segund = 0;
    String d,d2;
    System.out.print("Dia ");
    d = input.nextLine();
    String[] entrada = input.nextLine().split(" : ");
    System.out.print("Dia ");
    d2 = input.nextLine();
    String[] entrada2 = input.nextLine().split(" : ");


    h = Integer.parseInt(entrada[0]);m = Integer.parseInt(entrada[1]);s = Integer.parseInt(entrada[2]);
    h2 = Integer.parseInt(entrada2[0]);m2 = Integer.parseInt(entrada2[1]);s2 = Integer.parseInt(entrada2[2]);
    dia2 = Integer.parseInt(d2);
    dia = Integer.parseInt(d);
    dias = dia2 - dia;
    if (h > h2){
      horas = h2 + 24 - h;
    }else if (h < h2){
      horas = h2 - h;
    }
    if (m > m2){
      minut = m2 + 60 - m;
    }else if (m < m2){
      minut = m2 - m;
    }
    if (s > s2){
      segund = s2 + 60 - s;
    }else if (s < s2){
      segund = s2 - s;
    }

    System.out.printf("%d dia(s)\n",dias);
    System.out.printf("%d hora(s)\n",horas);
    System.out.printf("%d minuto(s)\n",minut);
    System.out.printf("%d segundo(s)\n",segund);
  }
}
