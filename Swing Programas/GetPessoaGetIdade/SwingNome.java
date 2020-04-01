import javax.swing.JOptionPane;
public class SwingNome{
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        pessoa1.setNome(JOptionPane.showInputDialog(null, "Digite seu nome "));
        pessoa1.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade: ")));

        pessoa2.setNome(JOptionPane.showInputDialog(null,"Digite seu nome: "));
        pessoa2.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade: ")));

        String message1 = String.format("Olá %s, você tem %d anos e é %s !%n", pessoa1.getNome(), 
        pessoa1.getIdade(), pessoa1.faseDvida());

        String message2 = String.format("Olá %s, você tem %d anos e é %s !%n", pessoa2.getNome(), 
        pessoa2.getIdade(), pessoa2.faseDvida());

        JOptionPane.showMessageDialog(null, message1);
        JOptionPane.showMessageDialog(null,message2);
    }
}
