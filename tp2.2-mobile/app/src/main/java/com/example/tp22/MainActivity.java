package com.example.tp22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Count = 0;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        if(savedInstanceState!=null){
            Boolean isvisible = savedInstanceState.getBoolean("reply_visible");
            if(isvisible){
                text.setText(savedInstanceState
                        .getString("reply_text"));
                text.setVisibility(View.VISIBLE);
            }}
    }
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        if(text.getVisibility() == View.VISIBLE){
            outState.putBoolean("reply_visible",true);
            outState.putString("reply_text",text.getText().toString());
        }
    }

    public void count(View view) {
        Count++;
        if (text != null) {
            text.setText(Integer.toString(Count));
        }
    }
}