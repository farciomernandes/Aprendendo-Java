import java.util.Scanner;

import java.security.SecureRandom;

import javax.swing.JOptionPane;


public class PerfilGamer {
    private SecureRandom randomNumber = new SecureRandom();
    private String mainGame;
    private int balance;
    private String name;
    private Scanner input = new Scanner(System.in);
    private int id = randomNumber.nextInt();
    public void setMainGame(){
        mainGame = JOptionPane.showInputDialog(null, "Type the name of your Main Game: ");
    }

    public String getMainGame(){
        return mainGame;
    }

    public void setBalance(){
        System.out.printf("\n Type the balance to your account: ");
        balance = input.nextInt();
    }

    public int getBalance(){
        return balance;
    }

    public void setName(){
        name = JOptionPane.showInputDialog(null, "\n Type the your name: ");
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

}