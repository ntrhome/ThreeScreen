package com.example.threescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonAbout_onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void buttonSD_onClick(View view) {
        EditText userEditText = findViewById(R.id.editText_SD_Who);
        EditText giftEditText = findViewById(R.id.editText_SD_When);

        Intent intent = new Intent(MainActivity.this, BirthdayActivity.class);
        intent.putExtra("username", userEditText.getText().toString());
        intent.putExtra("gift", giftEditText.getText().toString());
        startActivity(intent);

    }
}
