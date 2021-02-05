package com.example.bai6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText hoten;
    Button click;
    EditText ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init(){
        hoten = (EditText)findViewById(R.id.edtName);
        click = (Button)findViewById(R.id.btnClick);
        ketqua = (EditText)findViewById(R.id.edtKetqua);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = hoten.getText().toString();
                ketqua.setText(name);
            }
        });
    }
}