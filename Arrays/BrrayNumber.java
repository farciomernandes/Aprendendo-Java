public class BrrayNumber{
    public static void main(String[] args){
        //Criando array e declarando valores iniciais para cada elemento.
        int[] array = {87, 92, 53, 44, 11, 31, 50};
        System.out.printf("%s%8s%n", "Index", "Value");

        for(int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}