import java.util.Scanner;
public class InitArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final int TAM = 10; //Declara constante
        int[] array = new int[TAM]; //Criando array
        System.out.println("Write 10 numbers to store in an array:");
        for(int counter = 0; counter < array.length; counter++){
            System.out.printf("%nWrite a number: %n");
            array[counter] = input.nextInt(); //Preenchendo array na posição atual do laço
        }
        for(int counter = 0; counter < array.length; counter++){
            System.out.printf("Position = %d   ", counter); //Imprimindo posição do laço
            System.out.printf("Value = %d      %n", array[counter]); //Imprimindo valor na posição atual
        }

    }
}