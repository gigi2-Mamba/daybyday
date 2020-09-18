package doudizhu;

import java.util.*;

/**
 * 扑克牌展示
  3 ... 10  J  Q  K    A   2       小王 大王
  3 ... 10 11 12  13   14  15      16   17
 */
public class gamemain {

    public static void main(String[] args) {
        System.out.println("斗地主开始，loading.........");
        start();
    }
   public static void  start(){
       //牌池的所有牌
       ArrayList<Card> allCards = new ArrayList<>();

       //初始化牌池
       initCards(allCards);
       //初始化玩家
       Player[] players = new Player[3];

       //地主的牌
       ArrayList<Card> dizhu = new ArrayList<>();
       //玩家的牌
       ArrayList<Card> farmer = new ArrayList<>();

       //生成地主的牌
       createCards(allCards, dizhu, 20);
       //生成农民的牌
       createCards(allCards, farmer, 17);

       //处理三个玩家的牌
       //地主
       players[0] = new Player("马云", "地主 ", dizhu);
       players[1] = new Player("鹅厂马化腾", "农民 ", farmer);
       players[2] = new Player("不识妻美强东哥", "农民 ", farmer);
       System.out.println(players[0]);
       System.out.println(players[1]);
       System.out.println(players[2]);

   }
    private static void createCards(ArrayList<Card> allCards, ArrayList<Card> currentPlayerCards, int j) {
        for (int i = 0; i < j; i++) {
            int random = new Random().nextInt(allCards.size());
            currentPlayerCards.add(allCards.get(random));
            //将发出去的牌从牌池去掉
            allCards.remove(random);
        }
    }

    private static void initCards(ArrayList<Card> AllCards) {
        for (int i = 3; i <= 17; i++) {
            if (i <= 10) {
                AllCards.add(new Card(String.valueOf(i), String.valueOf(i), CardStyle.HEI_TAO));
                AllCards.add(new Card(String.valueOf(i), String.valueOf(i), CardStyle.FANG_KUAI));
                AllCards.add(new Card(String.valueOf(i), String.valueOf(i), CardStyle.HONG_TAO));
                AllCards.add(new Card(String.valueOf(i), String.valueOf(i), CardStyle.MEI_HUA));
            } else {
                switch (i) {
                    case 11:
                        AllCards.add(new Card(String.valueOf(i), "J", CardStyle.HEI_TAO));
                        AllCards.add(new Card(String.valueOf(i), "J", CardStyle.FANG_KUAI));
                        AllCards.add(new Card(String.valueOf(i), "J", CardStyle.HONG_TAO));
                        AllCards.add(new Card(String.valueOf(i), "J", CardStyle.MEI_HUA));
                        break;
                    case 12:
                        AllCards.add(new Card(String.valueOf(i), "Q", CardStyle.HEI_TAO));
                        AllCards.add(new Card(String.valueOf(i), "Q", CardStyle.FANG_KUAI));
                        AllCards.add(new Card(String.valueOf(i), "Q", CardStyle.HONG_TAO));
                        AllCards.add(new Card(String.valueOf(i), "Q", CardStyle.MEI_HUA));
                        break;
                    case 13:
                        AllCards.add(new Card(String.valueOf(i), "K", CardStyle.HEI_TAO));
                        AllCards.add(new Card(String.valueOf(i), "K", CardStyle.FANG_KUAI));
                        AllCards.add(new Card(String.valueOf(i), "K", CardStyle.HONG_TAO));
                        AllCards.add(new Card(String.valueOf(i), "K", CardStyle.MEI_HUA));
                        break;
                    case 14:
                        AllCards.add(new Card(String.valueOf(i), "A", CardStyle.HEI_TAO));
                        AllCards.add(new Card(String.valueOf(i), "A", CardStyle.FANG_KUAI));
                        AllCards.add(new Card(String.valueOf(i), "A", CardStyle.HONG_TAO));
                        AllCards.add(new Card(String.valueOf(i), "A", CardStyle.MEI_HUA));
                        break;
                    case 15:
                        AllCards.add(new Card(String.valueOf(i), "2", CardStyle.HEI_TAO));
                        AllCards.add(new Card(String.valueOf(i), "2", CardStyle.FANG_KUAI));
                        AllCards.add(new Card(String.valueOf(i), "2", CardStyle.HONG_TAO));
                        AllCards.add(new Card(String.valueOf(i), "2", CardStyle.MEI_HUA));
                        break;
                    case 16:
                        AllCards.add(new Card(String.valueOf(i), "JOKER", null)); //大王
                        break;
                    case 17:
                        AllCards.add(new Card(String.valueOf(i), "joker", null)); //小王
                        break;
                }
            }
        }
   }

}
