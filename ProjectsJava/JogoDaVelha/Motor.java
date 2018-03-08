import javax.swing.JOptionPane;
import java.util.Arrays;
public class Motor{
  private String tabuleiro[][] = new String[3][3];
  private String nome[][] = new String[2][2];
  private int linha = 0;
  private int coluna = 0;
  private String linhaMovimentaçao;
  private String colunaMovimenatçao;
  private int listaMovimento[] = new int[2];
  //Metodos

  //Criar tabuleiro
  public String[][] criarTabuleiro(){
    for (int linha = 0;linha < this.tabuleiro.length;linha++){
      for (int coluna = 0;coluna < this.tabuleiro[linha].length;coluna++){
        this.tabuleiro[linha][coluna] = "[ ]";
      }
    }
    return this.getTabuleiro();
  }
  // Escolher nome do jogador
  public String[][] nomeJogador(){
    if (this.linha < 2){
      String nomeJ = JOptionPane.showInputDialog("Informe o nome do jogador numero: "+(this.linha+1));
      if (verificarNome(nomeJ.trim())){
        this.nome[this.linha][this.coluna] = nomeJ;
        this.linha++;
        return nomeJogador();
      }else{
        JOptionPane.showMessageDialog(null,"Erro");
        return nomeJogador();
      }
    }
    this.nome[0][1] = "[O]";
    this.nome[1][1] = "[X]";
    return this.getNome();
  }

  //verificar se a quantidade do nome é menor que 30
  public boolean verificarNome(String nome){
    if (nome.length() <= 30){ //serve tanto para dizer se a variavel e letra ou numero(.matches)  //nome.matches("[a-zA-Z ]*") &&
      return true;
    }else{
      JOptionPane.showMessageDialog(null,"Nome ultrapassa o limite de 30 caracteres");
      return false;
    }
  }

  //Movimento de cada jogador
  public void movimento(){
    this.listaMovimento[0] = escolherLinha();
    this.listaMovimento[1] = escolherColuna();
  }

  public int escolherLinha(){
    this.setLinhaMovimentaçao(JOptionPane.showInputDialog("Escolha a linha: "));
    if (this.getLinhaMovimentaçao().matches("[0-9*]")){
      return Integer.parseInt(this.getLinhaMovimentaçao());
    }else{
      return escolherLinha();
    }
  }

  public int escolherColuna(){
    this.setColunaMovimentaçao(JOptionPane.showInputDialog("Escolha a coluna: "));
    if (this.getColunaMovimentaçao().matches("[0-9*]")){
      return Integer.parseInt(this.getColunaMovimentaçao());
    }else{
      return escolherColuna();
    }
  }

  //public int escolherColuna(){
    //this.setColunaMovimentaçao(Integer.parseInt(JOptionPane.showInputDialog("Escolha a coluna: ")));
  //}





  //metodos get e set
  public String[][] getTabuleiro(){
    return this.tabuleiro;
  }
  public void setTabuleiro(String tabuleiro[][]){
    this.tabuleiro = tabuleiro;
  }

  public String[][] getNome(){
    return this.nome;
  }

  public String getLinhaMovimentaçao(){
    return this.linhaMovimentaçao;
  }

  public void setLinhaMovimentaçao(String linha){
    this.linhaMovimentaçao = linha;
  }

  public String getColunaMovimentaçao(){
    return this.colunaMovimenatçao;
  }

  public void setColunaMovimentaçao(String linha){
    this.colunaMovimenatçao = linha;
  }

  public int getLinha(){
    return this.linha;
  }

  public void setLinha(int linha){
    this.linha = linha;
  }

  public int getColuna(){
    return this.coluna;
  }

  public void setColuna(int coluna){
    this.coluna = coluna;
  }

}
