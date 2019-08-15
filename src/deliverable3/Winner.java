package Deliverable3;

import java.util.ArrayList;

public class Winner {

    int round = 0;
    ArrayList<Card> cardChange = new ArrayList<>();

    Winner() {
    }

    public void checkWinner() {

        int rankPlayer = Game.players.get(0).getDeck().get(0).getRank();
        int rankPlayer2 = Game.players.get(1).getDeck().get(0).getRank();
        if (rankPlayer > rankPlayer2) {
            loserDeck(Game.players.get(1));
            winnerDeck(Game.players.get(0));
            round = 0;
        } else if (rankPlayer < rankPlayer2) {
            loserDeck(Game.players.get(0));
            winnerDeck(Game.players.get(1));
            round = 1;
        }
        if (rankPlayer == rankPlayer2) {
            War war = new War();
            war.play();
        }
    }

    public void checkWarWinner() {
        Game.players.forEach((p) -> {
            p.setNumberOfCards(p.getNumberOfCards() - 1);
        });
        for (int i = 0; i < 2; i++) {
            Game.players.forEach((p) -> {
                p.setNumberOfCards(p.getNumberOfCards() + 1);
            });
            if (Game.players.get(0).getRankFromDeck() > Game.players.get(1).getRankFromDeck()) {
                round = 0;
                break;
            } else if (Game.players.get(1).getRankFromDeck() > Game.players.get(0).getRankFromDeck()) {
                round = 1;
                break;
            } else {
                if (i == 1) {
                    continue;
                }
                if (i == 2) {
                    round = -1;
                }
            }
        }
        if (round == 0) {
            loserDeck(Game.players.get(1));
            winnerDeck(Game.players.get(0));
        } else if (round == 1) {
            loserDeck(Game.players.get(0));
            winnerDeck(Game.players.get(1));
        } else {
            round = 0;
            War war = new War();
            war.play();
        }
    }

    public void winnerDeck(Player player) {
        ArrayList<Card> temp = new ArrayList<>();
        for (Card c : player.getDeck()) {
            temp.add(c);
        }

        temp.add(cardChange.get(0));
        player.getDeck().clear();
        player.setDeck(temp);
    }

    public void loserDeck(Player player) {
        ArrayList<Card> temp = new ArrayList<>();
        for (Card c : player.getDeck()) {
            temp.add(c);
        }

        cardChange.add(temp.get(0));
        temp.remove(0);
        player.getDeck().clear();
        player.setDeck(temp);
    }

    public int whoWonGame() {
        if (Game.players.get(0).getDeck().size() == 0) {
            return 1;
        }
        if (Game.players.get(1).getDeck().size() == 0) {
            return 2;
        }
        return 3;
    }

    public int whoWonRound() {
        return round;
    }
}
