//Exemplo com a criação de 2 objetos do tipo CautoPolicy

public class AutoPolicy{
    public static void main(String[] args){

        //Criando 2 objetos de apolice
        CautoPolicy apolice1 = new CautoPolicy();
        CautoPolicy apolice2 = new CautoPolicy();

        //Preenchendo dados das apolices
        System.out.println("Cadastre a primeira apolice! ");
        apolice1.setApolice();
        System.out.println("Cadastre a segunda apolice! ");
        apolice2.setApolice();

        //Exibe se cada apolice esta segurada ou não
        policyInNoFaultState(apolice1);
        policyInNoFaultState(apolice2);

    }
    public static void policyInNoFaultState(CautoPolicy apolice){
        System.out.println("A apolice: ");
        System.out.printf("Número#: %d; Carro: %s; Estado %s%n está com o estado: %s %n%n", apolice.getAccountNumber()
        , apolice.getMakeAndModel(), apolice.getState(), 
        ( apolice.isNoFaultState()? "Com seguro!" : "Sem seguro!" ) );
    }
}