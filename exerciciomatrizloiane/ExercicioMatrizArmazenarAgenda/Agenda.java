import java.util.Scanner;
public class Agenda{
  private int mes = 12;
  private int dia = 31;
  private int horas = 8;
  private String matrizes[][][] = new String[mes][dia][horas];

  //Metodos
  public void mostrarMatriz(){
    //matrizes[11] = new String[33] "mes" [10]"dias"; //mes
    matrizes[1] = new String[28][8];
    matrizes[3] = new String[30][8];
    matrizes[4] = new String[30][8];
    matrizes[8] = new String[30][8];
    matrizes[10] = new String[30][8];
    /*for (int m = 0;m < matrizes.length;m++){
      System.out.print("######################################## Mes "+m+" ########################################");
      System.out.println();
      for (int d = 0;d < matrizes[m].length;d++){
        System.out.println("dia :"+d);
        for (int h = 0;h < matrizes[m][d].length;h++){
            System.out.print("Horas = "+h+":00 compromisso ");
            System.out.print(matrizes[m][d][h]+" ");
            System.out.println();
        }
        System.out.println();
      }
      System.out.println();
    } OU*/
    int i = 0;
    for (String[][] matrizs:matrizes){
      System.out.println("######################################## Mes "+(++i)+" ########################################");
      System.out.println();
      int d = 0;
      for (String matriz[]:matrizs){
        System.out.println("dia :"+(++d));
        int h = 0;
        for (String m:matriz){
          System.out.print("Horas = "+(++h)+":00 compromisso "+m);
          System.out.println();
      }
      System.out.println();
    }
    System.out.println();
}
}

  public void adicionarCompromisso(){
    System.out.print("Digite o mes do compromisso: ");
    int qMes = new Scanner(System.in).nextInt();
    System.out.println();
    System.out.print("Digite o dia do compromisso: ");
    int qDia = new Scanner(System.in).nextInt();
    System.out.println();
    System.out.print("Digite a hora do compromisso: ");
    int qHoras = new Scanner(System.in).nextInt();
    System.out.println();
    System.out.print("Informe o compromisso: ");
    matrizes[qMes][qDia][qHoras] = new Scanner(System.in).next();
    //return matriz;
  }

  public void obtarCompromisso(){
    System.out.print("Digite o mes do compromisso: ");
    int qMes = new Scanner(System.in).nextInt();
    System.out.println();
    System.out.print("Digite o dia do compromisso: ");
    int qDia = new Scanner(System.in).nextInt();
    System.out.println();
    System.out.print("Digite a hora do compromisso: ");
    int qHoras = new Scanner(System.in).nextInt();
    System.out.println();
    System.out.printf("O compromisso armazenado é %s",matrizes[qMes][qDia][qHoras]);
    System.out.println();
  }




  //instaciamento
  private void getDia(int dia){
    this.dia = dia;
  }

  private int setDia(){
    return dia;

  }

  private void getHoras(int horas){
    this.horas = horas;
  }

  private int setHoras(){
    return horas;
  }
}
