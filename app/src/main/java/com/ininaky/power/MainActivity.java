package com.ininaky.power;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    LinearLayout main;
    int blue = Color.rgb(0, 140, 255);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setPadding(22, 35, 22, 20);
        main.setBackgroundColor(Color.rgb(5, 13, 30));

        ScrollView scroll = new ScrollView(this);
        scroll.addView(main);
        setContentView(scroll);

        TextView title = new TextView(this);
        title.setText("POWER BY INI NAKY");
        title.setTextColor(blue);
        title.setTextSize(26);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        main.addView(title);

        addText("PREMIUM GAME SIMULATOR");

        addGame("LOBY SLOT");
        addGame("MAHJONG 1");
        addGame("MAHJONG 5 DRAGON");
        addGame("DUOFU DUOCAI");
        addGame("FAFA");
    }

    void addText(String text) {
        TextView t = new TextView(this);
        t.setText(text);
        t.setTextColor(Color.WHITE);
        t.setGravity(Gravity.CENTER);
        t.setPadding(10, 25, 10, 25);
        main.addView(t);
    }

    void addGame(String name) {
        Button b = new Button(this);
        b.setText(name);
        b.setTextColor(Color.WHITE);
        b.setBackgroundTintList(
            android.content.res.ColorStateList.valueOf(blue)
        );
        LinearLayout.LayoutParams p =
            new LinearLayout.LayoutParams(
                -1, 120
            );
        p.setMargins(0, 12, 0, 12);
        main.addView(b, p);

        b.setOnClickListener(v -> {
            Toast.makeText(
                this,
                name + " - GAME SIMULASI",
                Toast.LENGTH_SHORT
            ).show();
        });
    }
  }
