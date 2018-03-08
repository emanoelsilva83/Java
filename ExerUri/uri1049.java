import java.util.Scanner;
public class uri1049{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String animal1,animal2,animal3,resposta = "";
    animal1 = input.nextLine().toLowerCase();
    animal2 = input.nextLine().toLowerCase();
    animal3 = input.nextLine().toLowerCase();
    if ("vertebrado".equals(animal1) && "ave".equals(animal2) && "carnivoro".equals(animal3)){
      System.out.println("aguia");
    }else if ("vertebrado".equals(animal1) && "ave".equals(animal2) && "onivoro".equals(animal3)){
      System.out.println("pomba");
    }else if ("vertebrado".equals(animal1) && "mamifero".equals(animal2) && "onivoro".equals(animal3)){
      System.out.println("homem");
    }else if ("vertebrado".equals(animal1) && "mamifero".equals(animal2) && "herbivoro".equals(animal3)){
      System.out.println("vaca");
    }

    if ("invertebrado".equals(animal1) && "inseto".equals(animal2) && "hematofago".equals(animal3)){
      System.out.println("pulga");
    }else if ("invertebrado".equals(animal1) && "inseto".equals(animal2) && "herbivoro".equals(animal3)){
      System.out.println("lagarta");
    }else if ("invertebrado".equals(animal1) && "anelideo".equals(animal2) && "hematofago".equals(animal3)){
      System.out.println("sanguessuga");
    }else if ("invertebrado".equals(animal1) && "anelideo".equals(animal2) && "onivoro".equals(animal3)){
      System.out.println("minhoca");
    }
  }
}
