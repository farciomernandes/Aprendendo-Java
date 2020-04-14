import java.util.Scanner;  
import java.util.Locale; 

public class Notas10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        double total = 0;
        int contNotas = 0;
        System.out.println("Digite uma nota ou -1 para encerrar o programa: ");
        double nota = input.nextDouble();

        while( nota != -1 ){
            total = total + nota;
            contNotas++;
            System.out.println("Digite outra nota ou -1 para encerrar o programa: ");
            nota = input.nextDouble();
        }

        if( contNotas != 0 ){
           System.out.printf("O total das notas foi %.2f !%n", total);
           System.out.printf("A média das notas é: %.2f !",(total / contNotas )); 
        }else{
            System.out.print("Nenhuma nota foi adicionada!");
        }
    }
}