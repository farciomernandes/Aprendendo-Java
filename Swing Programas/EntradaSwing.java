import javax.swing.JOptionPane;

public class EntradaSwing{
    public static void main(String[] args){
        //Recebe dados do usuário e armazena na váriavel name
        String name = JOptionPane.showInputDialog("Qual o seu nome? ");
        //Cria a mensagem
        String message = String.format("Bem vindo a Linguagem em Java %s! ",name);
        //Imprime a mensagem
        JOptionPane.showMessageDialog(null, message);

    }
}