import java.util.Scanner;
public class fibonacci{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int entrada = input.nextInt();
    for (int i = 0;i<entrada;i++){
      System.out.printf("%d ",fib(i));
    }
    System.out.println();
  }

  public static int fib(int n){
    if (n == 0){
      return 0;
    }else if (n == 1){
      return 1;
    }else{
      return fib(n-1)+fib(n-2);
    }
  }
}
