package com.example.bai9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Name,Year;
    Button Click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        Name = (EditText)findViewById(R.id.edtName);
        Year = (EditText)findViewById(R.id.edtYear);
        Click = (Button) findViewById(R.id.btnClick);

        Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Name.getText().toString().trim().length() <= 0){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập họ tên", Toast.LENGTH_SHORT).show();
                }
                else if(Year.getText().toString().trim().length() <= 0){
                    Toast.makeText(MainActivity.this, "Vui long nhap nam sinh", Toast.LENGTH_SHORT).show();
                }
                else{
                    String hoten = Name.getText().toString();
                    String namsinh = Year.getText().toString();
                    int tuoi = 2020 - Integer.parseInt(namsinh);
                    Toast.makeText(MainActivity.this, "Ten: " + hoten + "\n Nam sinh: " + namsinh + "\nTuoi: " + tuoi, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}