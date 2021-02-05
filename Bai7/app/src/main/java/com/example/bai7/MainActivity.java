package com.example.bai7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnlog, btnshort, btnlong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init() {
        btnlog = (Button) findViewById(R.id.btnLog);
        btnshort = (Button) findViewById(R.id.btnShort);
        btnlong = (Button) findViewById(R.id.btnLong);

        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ThaiLe", "Khoa hoc lap trinh");
                System.out.println("Le Vo Huu Thai");
            }
        });

        btnshort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ThaiLe", Toast.LENGTH_SHORT).show();
            }
        });

        btnlong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "ThaiLe",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            }
        });
    }
}
