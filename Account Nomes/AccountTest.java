import java.util.Scanner; 

public class AccountTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account(null); //Cria um objeto Account. Sempre deve-se dar um valor a variável.

        //Exibe o nome inicial = null
        System.out.printf("O nome inicial é: %s%n%n", myAccount.getName());

        System.out.printf("Digite o seu nome: ");
        String theName = input.nextLine(); //Lê uma linha de texto
        myAccount.setName(theName); //Insere theName para myAccount método setName
        System.out.println(); //Gera uma saída de uma linha em branco
        //Exibe o nome armazenado no objeto;
        System.out.printf("O nome do objeto myAccount é: %n%s%n ",
        myAccount.getName());
    }
}