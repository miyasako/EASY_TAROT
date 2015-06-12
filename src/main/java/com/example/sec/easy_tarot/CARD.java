package com.example.sec.easy_tarot;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sec on 2015/05/27.
 */
public class CARD {
    ArrayList<Integer> DCard_List = new ArrayList<Integer>();
    Random random = new Random();
    int send_card1, send_card2, send_card3;

    public void cardClear() {
        DCard_List.clear();
        send_card1 = 0;
        send_card2 = 0;
        send_card3 = 0;
    }

    public void putCard() {
        DCard_List.add(random.nextInt(21));
        int cardOne = DCard_List.get(0);
        final int i = 0;

        while (i == 0) {
            DCard_List.add(random.nextInt(21));
            int cardTwo = DCard_List.get(1);
            if (cardOne == cardTwo) {
                DCard_List.remove(1);
            } else {
                break;
            }
        }
        while (i == 0) {
            DCard_List.add(random.nextInt(21));
            int cardTwo = DCard_List.get(1);
            int cardTree = DCard_List.get(2);

            if (cardTree == cardTwo) {
                DCard_List.remove(2);
            } else {
                if (cardTree == cardOne) {
                    DCard_List.remove(2);
                } else {
                    break;
                }
            }
        }
    }

    protected void Select_Side1() {
        int a = random.nextInt(2);

        if (a == 0) {
            send_card1 = DCard_List.get(0);
        } else {
            send_card1 = DCard_List.get(0) + 21;
        }
    }

    protected void Select_Side2() {  //カードの正位置かどうかの判定2
        int a = random.nextInt(2);

        if (a == 0) {
            send_card2 = DCard_List.get(1);
        } else {
            send_card2 = DCard_List.get(1) + 21;
        }
    }

    protected void Select_Side3() {
        int a = random.nextInt(2);

        if (a == 0) {
            send_card3 = DCard_List.get(2);
        } else {
            send_card3 = DCard_List.get(2) + 21;
        }
    }

    public int getCard1() {
        return send_card1;
    }

    public int getCard2() {
        return send_card2;
    }

    public int getCard3() {
        return send_card3;
    }
}


