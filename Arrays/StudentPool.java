
public class StudentPool{
    public static void main(final String[] args) {
        final int[] responses = { 1, 2, 5, 4, 3, 4, 2, 1, 3, 1, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };

        final int[] frequency = new int[6];

        for (int anwaser = 0; anwaser < responses.length; anwaser++) {

            try { //Execute as instruções entre chaves
                ++frequency[responses[anwaser]]; //Se o valor de response for >6 não armazena e inicia catch
            }
            //Se as intruções entre chave derem algum erro, execute o catch
            catch (final ArrayIndexOutOfBoundsException e) {
                System.out.println(e); //Invoca método toString
                System.out.printf("    responses[%d] = %d%n%n", anwaser, responses[anwaser]);
            }
        }
        System.out.printf("%s%10s%n","Rating","Frequency");
        for(int rating = 1; rating < frequency.length; rating++){
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }

    }
}