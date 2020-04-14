import java.util.Scanner;
/*App que gera apolices para carros, a apolice sendo valida nos estados de:
Nova Jersey - NJ        / Maiami = MA                    / Nova York = NY    / Pensilvania = PA
*/

public class CautoPolicy{
    private int accountNumber; // Numéro da conta da apólice
    private String makeAndModel; //Carro ao qual a apólice é aplicada
    private String state; //Abreviatura do estado com duas letras
    private Scanner input = new Scanner(System.in);

   

    public void setApolice(){
        System.out.println("Digite o numero da apolice: ");
        accountNumber = input.nextInt();
        System.out.println("Digite o modelo do seu carro: ");
        makeAndModel = input.next();
        input.nextLine(); // "Limpando Buffer"
        System.out.println("Digite o estado que você deseja segurar seu carro: ");
        state = input.next();
        input.nextLine(); // "Limpando Buffer"
    }

    public int getAccountNumber(){
        return accountNumber;
    }


    public String getMakeAndModel(){
        return makeAndModel;
    }


    public String getState(){
        return state;
    }

    //Método que é retornado se o carro não tem apolice para aquele estado!
    public boolean isNoFaultState(){
        boolean noFaultState;

        switch(getState()){
            case "MA": 
            case "NJ": 
            case "NY":
            case "PA":
                noFaultState = true; break;
            default:
                noFaultState = false; break;
        }
        return noFaultState;
    }

}