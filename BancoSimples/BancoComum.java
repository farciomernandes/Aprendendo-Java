public class BancoComum{
    private double balance;
    private String nome;
public BancoComum(String nome, double balance){ //Constructor
    this.nome = nome;

    if( balance > 0.0 ){ //Verifica se o saldo é valido
        this.balance = balance;
    }else{
        this.balance = 0.0;
    }
  } //Fim do construtor

  public void deposit( double depositAmount ){ //Método que realiza um deposito na conta
        if( depositAmount > 0.0 ){ //Verifica se o deposito é valido
            balance = balance + depositAmount;
        }
  }

  public double getBalance(){ //Método que retorna um double com saldo da conta
      return balance;
  }

  public void setNome(String nome){
      this.nome = nome;
  }

  public String getNome(){ //Retorna o nome
      return nome;
  }
}