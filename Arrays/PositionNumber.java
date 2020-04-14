import java.util.Scanner;


public class PositionNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int choice = 0;
        
        for(int k = 0; k < 10; k++){
            System.out.println("Digite um numero: \n");
            numbers[k] = input.nextInt();
        }
        System.out.printf("%n Type a number to seach the new vetor: ");
        choice = input.nextInt();
        for(int k = 0; k < 10; k ++){
            if(numbers[k] == choice){
                System.out.printf("\n Found in the %d position! \n",k);
            }
        }
    }
}