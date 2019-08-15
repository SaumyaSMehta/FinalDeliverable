package Deliverable3;

import java.util.Scanner;

public class main {
    public static void main(String [] args)
    {
        Game game = new Game();
        
        Scanner in = new Scanner(System.in);
        for(int i=1; i<=2;i++){
        System.out.print("Player "+ i + ":");
        game.setPlayers(new Player(in.nextLine()));
        System.out.println();
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Distributing Cards");
        game.distribute();
        game.play();
        }
    }
