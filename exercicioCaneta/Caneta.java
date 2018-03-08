import javax.swing.JOptionPane;
public class Caneta{

  private String modelo;
  private String cor;
  private float ponta;
  private int carga;
  private boolean tampada;

// metodos
  public void status(){
    System.out.println("Modelo é "+this.modelo);
    System.out.println("Uma caneta "+this.cor);
    System.out.println("Ponta: "+this.ponta);
    System.out.println("Carga: "+this.carga);
    System.out.println("Está tampada? "+this.tampada);
  }
  public void rabiscada(){
    if (this.tampada){
      JOptionPane.showMessageDialog(null,"ESTOU RABISCONDO");
    }else{
      JOptionPane.showMessageDialog(null,"ERRO! Não posso rabiscar");
    }
  }

  public void tampada(){
    this.tampada = true;
  }

  public void destampada(){
    this.tampada = false;
  }
//Estanciamento
  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public String getModelo(){
    return modelo;
  }

  public void setCor(String cor){
    this.cor = cor;
  }

  public String getCor(){
    return cor;
  }

  public void setPonta(float ponta){
    this.ponta = ponta;
  }

  public float getPonta(){
    return ponta;
  }

  public void setCarga(int carga){
    this.carga = carga;
  }

  public int getCarga(){
    return carga;
  }

  public void setTampada(boolean tampada){
    this.tampada = tampada;
  }

  public boolean getTampada(){
    return tampada;
  }
}
