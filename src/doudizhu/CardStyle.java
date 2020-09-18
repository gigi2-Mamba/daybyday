package doudizhu;

public enum CardStyle {

    HEI_TAO("♤"),
    HONG_TAO("♥"),
    FANG_KUAI("♢"),
    MEI_HUA("♣");
    private String showstyle;

    CardStyle(String showstyle) {
        this.showstyle = showstyle;
    }

    @Override
    public String toString() {
        return showstyle;
    }
}
