import java.util.Scanner;
import java.util.Locale; //Importando ferramenta para que o scanner reconheça pontos

public class BancoMarcio{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH); //Fazendo com que o scanner reconheça pontos ' . '

        BancoComum cliente1 = new BancoComum("Jane Green", 50.00);
        BancoComum cliente2 = new BancoComum("John Blue", -7.99);

        //Exibe o saldo atual de ambos os funcionários
        System.out.printf("O saldo inicial de %s é %.2f !%n ", cliente1.getNome(), cliente1.getBalance());
        System.out.printf("O saldo inicial de %s é %.2f ! %n%n", cliente2.getNome(), cliente2.getBalance());
        
        System.out.print("Digite o valor que deseja depositar para o cliente 1: ");
        double deposito = input.nextDouble();

        System.out.printf("Adicionando %.2f na conta do cliente 1 %n%n ",
        deposito);
        cliente1.deposit(deposito);//Atualizando a conta do cliente 1 com o metodo deposit

        System.out.printf("%s saldo: %.2f%n%n ",cliente1.getNome(), cliente1.getBalance());
        System.out.printf("%s saldo: %.2f%n%n", cliente2.getNome(), cliente2.getBalance());

        System.out.print("Digite o valor que deseja depositar para o cliente 2: ");
        deposito = input.nextDouble();
        System.out.printf("Adicionado %.2f na conta do cliente 2 %n%n ",deposito);
        cliente2.deposit(deposito);//Atualizando conta do cliente 2 com o metodo deposit

        System.out.printf("%n%s saldo: %.2f%n",cliente1.getNome(), cliente1.getBalance());
        System.out.printf("%n%s saldo: %.2f%n",cliente2.getNome(), cliente2.getBalance());
    }
}