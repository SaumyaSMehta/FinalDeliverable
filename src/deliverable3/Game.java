package Deliverable3;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Winner win = new Winner();
    private String gameName;
    static ArrayList<Player> players = new ArrayList<>();
    ArrayList<Card> cardsInPile = new ArrayList<>();
    GroupOfCards deckForGame = new GroupOfCards();
    
    String check = "";
    public Game(){}
        public Game(String gameName) {
        this.gameName = gameName;
    }
        
    public void distribute()
    {
        int count=0;
        for(Card c: deckForGame.deckOfCards)
        {
            if(count%2==0)
            players.get(0).setToDeck(c);
            else
            players.get(1).setToDeck(c);
          
            count++;
        }
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Player player) {
        this.players.add(player);
    }
    public void setCardsInPile(Card c)
    {
        this.cardsInPile.add(c);
    }
    
    public void play()
    {
         input();
        while(winnerOutput())
        {
          players.forEach((p) -> {
            p.setNumberOfCards(1);
        });
          if(check.contains("s") || check.contains("S"))
              check="s";
          else if(check.contains("f") || check.contains("F"))
          {
            System.out.println(players.get(1).getName() + " won the game");
            break;
          }
              else
          {
              input();
              print();
          }
          print();
        win.checkWinner();
        RoundOutput();
        System.out.println("-----------------------------------------------------------------");
        }
    }
    
    public void input()
    {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Press \'s\' to get to the end of the game");
        System.out.println("Press \'f\' to get to forfiet game");
        System.out.println("Press \'anything\' to continue");
        System.out.print("Your choice:");
        Scanner in = new Scanner(System.in);
        this.check=in.nextLine();
        System.out.println("-----------------------------------------------------------------");
    }
    public void print()
    {
        players.forEach((p) -> {
            System.out.println(p.getName() + ", Card on stake:"); 
            for(int i=0; i<p.getNumberOfCards();i++)
            {
                System.out.println( p.getDeck().get(i).toString());
            }
        System.out.println("-----------------------------------------------------------------");
        });
    }
    public void RoundOutput()
    {
        if(win.whoWonRound() == 1)
        {
            System.out.println(players.get(1).getName() + " won this round");
        }
        else if(win.whoWonRound() == 0)
        {
            System.out.println(players.get(0).getName() + " won this round");
        }
    }
    public boolean winnerOutput()
    {
        if(win.whoWonGame() == 1)
        {
           System.out.println(players.get(1).getName() + " won the game");
           return false;
        }
        else if(win.whoWonGame() == 2)
        {
           System.out.println(players.get(1).getName() + " won the game");
          return false;
        }
        return true;
    }
}