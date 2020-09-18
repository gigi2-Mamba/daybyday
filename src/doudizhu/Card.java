package doudizhu;

public class Card {
    //显示牌的值
    private String poker;
    private String pokernum;
    private CardStyle style;

    @Override
    public String toString() {
        return (style == null ? "" : style) + pokernum;
    }

    public Card(String poker, String pokernum, CardStyle style) {
        this.poker = poker;
        this.pokernum = pokernum;
        this.style = style;
    }
    public String getPoker() {
        return poker;
    }

    public void setPoker(String poker) {
        this.poker = poker;
    }

    public String getPokernum() {
        return pokernum;
    }

    public void setPokernum(String pokernum) {
        this.pokernum = pokernum;
    }

    public CardStyle getStyle() {
        return style;
    }

    public void setStyle(CardStyle style) {
        this.style = style;
    }
}
