package com.example.sec.easy_tarot;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public  class MainActivity extends Activity implements View.OnClickListener {
    CARD card = new CARD();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clear = (Button) findViewById(R.id.C_Clear);
        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TypedArray tarot = getResources().obtainTypedArray(R.array.card);
        ImageButton Btn_1 = (ImageButton) findViewById(R.id.Card_One);
        ImageButton Btn_2 = (ImageButton) findViewById(R.id.Card_Two);
        ImageButton Btn_3 = (ImageButton) findViewById(R.id.Card_Three);

        switch (v.getId()){
            case(R.id.Card_One):
                Btn_1.setImageDrawable(tarot.getDrawable(card.getCard1()));
                break;
            case (R.id.Card_Two):
                Btn_2.setImageDrawable(tarot.getDrawable(card.getCard2()));
                break;
            case (R.id.Card_Three):
                Btn_3.setImageDrawable(tarot.getDrawable(card.getCard3()));
                break;
            case (R.id.C_Clear):
                card.cardClear();
                card.putCard();
                card.Select_Side1();
                card.Select_Side2();
                card.Select_Side3();
                Btn_1.setImageDrawable(tarot.getDrawable(43));
                Btn_2.setImageDrawable(tarot.getDrawable(43));
                Btn_3.setImageDrawable(tarot.getDrawable(43));
                Btn_1.setOnClickListener(this);
                Btn_2.setOnClickListener(this);
                Btn_3.setOnClickListener(this);
        }
    }
}