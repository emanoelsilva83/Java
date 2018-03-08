import java.util.Scanner;
public class uri1006{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double A,B,C,media;
    A = input.nextDouble();
    B = input.nextDouble();
    C = input.nextDouble();
    media = (A * 2 + B * 3 + C * 5)/ 10;
    System.out.printf("MEDIA = %.1f\n",media);

  }
}
