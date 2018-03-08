public class AlgunsMetodosString{
  public static void main(String[] args){
    String nome = "Emanoel da Silva Medeiros";
    System.out.printf("String %s\n",nome);
    System.out.printf("o tamanho da String %s\n",nome.length());
    System.out.printf("posição 2 da String %s\n",nome.charAt(2));
    System.out.printf("String toda maiusculas %s\n",nome.toUpperCase());
    System.out.printf("String tosa minusculas %s\n",nome.toLowerCase());
    System.out.printf("mostrar a String do indice 3 a 9 %s\n",nome.subSequence(3,9));
    System.out.printf("Tirando espaços antes e depois da String %s\n",nome.trim());
    System.out.printf("Substituir nome de uma String %s\n",nome.replace("Medeiros","Silva"));
  }

}
