package Deliverable3;

public class War extends Game
{
    @Override
    public void play()
    {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("War initiates");
        super.getPlayers().forEach((p) -> {
            p.setNumberOfCards(p.getNumberOfCards()+1);
        });
        super.win.checkWarWinner();
    }
}