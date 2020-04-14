import java.util.Scanner;
import javax.swing.JOptionPane;

public class Numbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int escolha = 0;
        for(int k = 0; k < 10; k++){
            System.out.println("Digite um numero: ");
            numbers[k] = input.nextInt();
        }
        System.out.printf("%nAgora, digite um numero de 1 a 10%n");
        escolha = input.nextInt(); 
        String message = String.format("O Número da posição %d é %d!",escolha, numbers[--escolha]);
        JOptionPane.showMessageDialog(null, message);

    }
}