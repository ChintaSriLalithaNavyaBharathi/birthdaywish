package com.example.lalitha.birthdaywish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText,editText1;
Button button;
String text,data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.ed);
        button=findViewById(R.id.btn);
        editText1=findViewById(R.id.ed1);
    }

    public void wish(View view) {
        text=editText.getText().toString().trim();
        data=editText1.getText().toString().trim();
        Intent i= new Intent(this,WishActivity.class);
        i.putExtra("name",text);
        i.putExtra("self",data);
        startActivity(i);
    }
}
