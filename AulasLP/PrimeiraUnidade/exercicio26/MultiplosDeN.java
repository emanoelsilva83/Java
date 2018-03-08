import java.util.Scanner;
public class MultiplosDeN{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for (int i = 0;i<=100;i+=n){
      System.out.println(i);
    }
  }
}
