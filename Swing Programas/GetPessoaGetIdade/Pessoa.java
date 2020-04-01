public class Pessoa{

    private String nome;
    public void setNome(String nome) { this.nome = nome; }
    public String getNome(){ return nome; }

    private int idade;
    public void setIdade(int idade){ this.idade = idade; }

    public int getIdade(){ return idade; }
    
    public String faseDvida(){
        String valor = null;
        if(idade > 60)
            valor = "terceira idade";
        if(idade > 17 && idade < 60)
            valor =  "adulto";
        if(idade > 14 && idade < 18)
            valor = "adolescente";
        if(idade < 14 )
            valor =  "criança";

         return valor;
    }

}