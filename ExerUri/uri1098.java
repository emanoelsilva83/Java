public class uri1098{
  public static void main(String[]args){
    double i = 0;double j = 1;double k = 0;
    while(i <= 2){
      while(j < 4){
        System.out.printf("I=%.1f J=%.1f\n",i,j);
        j+=1.2;
        k = j;
      }
      j = k;
      i+=0.2;
    }
  }
}
