import java.util.Arrays;
import java.util.Scanner;
public class uri1042{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int ordenada[] = {input.nextInt(),input.nextInt(),input.nextInt()};
    int original[] = ordenada.clone();
    Arrays.sort(ordenada);
    for (int index:ordenada){
      System.out.println(index);
    }
    System.out.println();
    for (int index:original){
        System.out.println(index);
    }
  }
}
