import javax.swing.JOptionPane;

public class RegisterGamer {
    public static void main(String[] args){
        PerfilGamer player1 = new PerfilGamer();

       player1.setMainGame();
       player1.setName();
       player1.setBalance();
       String message = String.format("Congratulations, your register succssesfully done!\n Your name is: %s \n Your ID: %d \n Your main game is: %s \n Your balance this: %d",player1.getName(), player1.getID(), player1.getMainGame(), player1.getBalance());
       JOptionPane.showMessageDialog(null, message);
    
    }
}