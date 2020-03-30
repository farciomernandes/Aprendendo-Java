public class Account{

    private String name; //Variavél de instancia
    public Account(String name){ this.name = name; }
    public void setName(String name){ //Método para definir o nome do objeto
        this.name = name; //Armazena o nome
    }

        public String getName(){ //Método que recupera o nome do objeto
            return name;
        }
}