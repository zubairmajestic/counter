package com.example.ctadmin.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView showvalue;

    EditText txtCount;
    Button btnCount;

    int counter=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    txtCount = (EditText)findViewById(R.id.textView1);
    txtCount.setText(String.valueOf(count));
    btnCount =(Button)findViewById(R.id.button1);

    btnCount.setOnClickListener(new OnClickListener() {
        public void onClick(View arg0) {
            count++;
            txtCount.setText(String.valueOf(count));
        }


