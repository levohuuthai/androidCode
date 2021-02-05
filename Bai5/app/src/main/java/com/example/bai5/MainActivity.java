package com.example.bai5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView hoten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        hoten.setText("Khoa hoc lap trinh \n ThaiLe");
    }

    public void init(){
        hoten = (TextView)findViewById(R.id.tvHoten);
    }

}