
public class Barray{
    public static void main(String[] args){
        //Declarando array e inicializando como objeto array
        int[] array =  new int [10];

        System.out.printf("%s%8s%n", "Index", "Value"); 
        for(int k = 0; k < 10; k++){
            System.out.printf("%5d%8d%n", k, array[k]);
        }
    }
}