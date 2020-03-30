public class AccountTest2{
    public static void main(String[] args){
        Account account1 = new Account("Jane Green"); //Cria um objeto Account passando Jane Green
        Account account2 = new Account("John Blue"); //Cria um objeto Account passando John Blue
  
     
        System.out.printf("Account1 tem o nome de : %s%n ", account1.getName());
        System.out.printf("Account2 tem o nome de: %s%d ", account2.getName());
    }
}