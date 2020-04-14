import java.util.Scanner; 
import java.util.Locale; 
public class Exame10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        int aprovados = 0, desaprovados = 0;
        int valor;
        int cont1, cont2;
        int alunos;

        for(alunos = 0; alunos < 10; alunos++){
            System.out.print("Inserir resultado do aluno: ");
            valor = input.nextInt();
            if( valor == 1){
                aprovados++;
            }else{
                desaprovados++;
            }
        }
        System.out.printf("O numero de alunos aprovados foi: %d!%n%nO numero de alunos desaprovados foi %d!%n", aprovados, desaprovados);
        if( aprovados >= 8 ){
            System.out.printf("%n%nBônus para o instrutor!");
        }

    }
}