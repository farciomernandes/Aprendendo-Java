import java.util.Scanner;
import java.security.SecureRandom; 

public class JdArrocha{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumber = new SecureRandom();
        int numero = randomNumber.nextInt(100);
        int verifica = 0;
        int max = 100;
        int min = 0;
        boolean vencedor = false;
        System.out.println("Bem vindo ao jogo do Arrocha, vamos começar?" + "\n");
        while( vencedor != true ){
        System.out.printf("\nDigite um numero entre %d e %d:\n", min, max);
        verifica = input.nextInt();
        if( verifica == numero ){
            System.out.printf("Você perdeu, o numero escolhido era %d! ", verifica);
            vencedor = true;
        }
        if( verifica < numero){
            min = verifica;
        }
        if( verifica > numero){
            max = verifica;
        }

        if( (max -1 ) == (min - 1)){
            System.out.printf("%n ------------------PARABÉNS VOCÊ VENCEU--------------------");
            System.out.printf("%n O numero arrochado era %d ", numero);
            vencedor = true;
        }

        }

        System.out.printf("\nOBRIGADO POR JOGAR! \n\n");

    }
}