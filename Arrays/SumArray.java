public class SumArray{
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //Criando array com valores nos elementos
        int total = 0; //Criando o valor que vai armazenar a soma dos valores do array
        for(int counter = 0; counter < array.length; counter++){
            total+= array[counter]; //Somando todos os valores do array
        }
        System.out.printf("The sum of the numbers from 1 to 9 is: %d", total);
        
    }
}