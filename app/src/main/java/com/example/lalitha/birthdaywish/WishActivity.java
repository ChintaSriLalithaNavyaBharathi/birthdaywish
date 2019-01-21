package com.example.lalitha.birthdaywish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WishActivity extends AppCompatActivity {
TextView textView,textView1;
String dg,bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish);
        textView=findViewById(R.id.tv);
        textView1=findViewById(R.id.tv1);
        dg=getIntent().getStringExtra("name");
        bg=getIntent().getStringExtra("self");
        textView.setText(dg);
        textView1.setText("From"+"\n"+bg);
    }
}
