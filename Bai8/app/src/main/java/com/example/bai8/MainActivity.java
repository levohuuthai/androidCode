package com.example.bai8;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button snack,callback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init(){
        snack = (Button)findViewById(R.id.btnSnackbar);
        callback = (Button)findViewById(R.id.btnCallBack);

        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v,"ThaiLe",Snackbar.LENGTH_LONG);
                snackbar.setAction("Action",null);
                snackbar.setActionTextColor(Color.RED);
                snackbar.show();
            }
        });

        callback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar =Snackbar.make(v,"DHCN",Snackbar.LENGTH_SHORT);
                snackbar.show();
                snackbar.setAction("Sinhvien", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(v,"ThaiLe",7).show();
                    }
                });
            }
        });
    }
}