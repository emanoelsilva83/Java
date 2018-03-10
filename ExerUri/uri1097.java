public class uri1097{
  public static void main(String[]args){
    int i = 1;int j = 7;int jf = 5;
    while(i <= 10){
      while(jf<=j){
        System.out.printf("I=%d J=%d\n",i,j);
        j--;
      }
      j+=5;
      jf = j-2;
      i+=2;
    }
  }
}
