import javax.swing.JOptionPane; 

public class MediaSwing{
    public static void main(String[] args){
        int n1 =Integer.parseInt(JOptionPane.showInputDialog(null, 
        "Digite a primeira nota do aluno")); //Integer.parseInt() faz com que possa receber inteiro do swing!
        int n2 =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a segunda nota do aluno"));
        int n3 =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a segunda nota do aluno"));
        
        double media = (n1 + n2 + n3) /  3;
        
        String message = String.format("A média do aluno foi: %.2f ", media);

        JOptionPane.showMessageDialog(null, message);
    }
}