import java.util.Scanner; 
import java.util.Locale;

public class MinhaLoja{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        LojaM compra1 = new LojaM();
        //LojaM compra2 = new LojaM();
        System.out.print("Digite o nome do produto que deseja adquiri: ");
        String produto = input.next();
        System.out.print("Digite o valor do produto que você vai adquirir: ");
        double valor = input.nextDouble();
        System.out.print("Digite a quantidade de parcelas que deseja pagar o produto: ");
        int parcelas = input.nextInt();
        compra1.setParcelas(parcelas);
        compra1.setProduto(produto);
        compra1.setPreco(valor);
        System.out.printf("Compra realizada com sucesso!!%n" + 
        "Você acaba de adquirir : %s%n pelo valor de %.2f%n pagando em %d vezes! ", compra1.getProduto(), compra1.ValTotal(), compra1.getParcelas());
    }
}