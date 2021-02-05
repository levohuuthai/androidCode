package com.example.bai10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText one,two;
    Button add,minus,multiply,divide;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    public void init(){
        one = (EditText)findViewById(R.id.edtOne);
        two = (EditText)findViewById(R.id.edtTwo);
        add = (Button) findViewById(R.id.btnAdd);
        minus = (Button) findViewById(R.id.btnMinus);
        multiply = (Button) findViewById(R.id.btnMultiply);
        divide = (Button) findViewById(R.id.btnDivide);
        result = (TextView)findViewById(R.id.tvResult);
        add.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAdd:
                if(one.getText().toString().length() <= 0 || two.getText().toString().length() <= 0 ){
                    Toast.makeText(MainActivity.this, "Please enter your complete information ", Toast.LENGTH_SHORT).show();
                }
                else{
                    int so1 =  Integer.parseInt(one.getText().toString());
                    int so2 =  Integer.parseInt(two.getText().toString());
                    int tong = so1 + so2;
                    result.setText(String.valueOf(tong));
                }
                break;
            case R.id.btnMinus:
                break;
            case R.id.btnMultiply:
                break;
            case R.id.btnDivide:
                break;



        }
    }
}