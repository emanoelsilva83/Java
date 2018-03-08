import java.util.Scanner;
public class uri1017{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int t,v;
    double cal;
    t = input.nextInt();
    v = input.nextInt();
    cal = (double)v*t/12;
    System.out.printf("%.3f\n",cal);
  }
}
