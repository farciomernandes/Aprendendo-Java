public class LojaM{
    private String produto;
    private double preco;
    private int parcelas;

    public void setProduto(String produto){
        this.produto = produto;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setParcelas(int parcelas){
        this.parcelas = parcelas;
    }
    
    public int getParcelas(){
        return parcelas;
    }

    public String getProduto(){
        return produto;
    }

    public double ValTotal(){
        double resultado = this.preco;
        if( this.parcelas > 3 ){
            resultado = this.preco = this.preco + (this.preco * 20) / 100;
        }
        if ( this.parcelas == 1 ){
            resultado = this.preco = this.preco - (this.preco * 10) / 100;
        }
        return resultado;
    }
}