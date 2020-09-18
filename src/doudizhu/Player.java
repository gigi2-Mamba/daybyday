package doudizhu;

import java.util.List;

public class Player {

    private String username;
    //玩家身份
    private String Rpg;
    //玩家的牌
    private List<Card> cards;

    public Player(String username, String Rpg, List<Card> cards) {
        this.username = username;
        //角色
        this.Rpg = Rpg;
        this.cards = cards;
    }

    @Override
    public String toString() {
        return username + ": " + Rpg + cards;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRpg() {
        return Rpg;
    }

    public void setRpg(String rpg) {
        this.Rpg = rpg;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Player() {
        this.username = username;
        this.Rpg = Rpg;
        this.cards = cards;
    }
}
