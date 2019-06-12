package com.example.threescreen;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        //String user = "ЖЫвотное";
        //String gift = "дырку от бублика";

        //user = getIntent().getExtras().getString("username");
        String user = getIntent().getStringExtra("username");
        //gift = getIntent().getExtras().getString("gift");
        String gift = getIntent().getStringExtra("gift");

        TextView infoTextView = findViewById(R.id.textView_Birthday);
        infoTextView.setText(user + ", вам передали " + gift);
    }
}
