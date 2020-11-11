package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText num1,num2;
    Button btnPlus, btnMinus;
    Button btnMulti, btnDivide;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minicalc);

        num1 = findViewById(R.id.First_inp);
        num2 = findViewById(R.id.Sec_inp);

        btnPlus = findViewById(R.id.Btn_plus);
        btnMinus = findViewById(R.id.Btn_minus);
        btnMulti = findViewById(R.id.Btn_mult);
        btnDivide = findViewById(R.id.Btn_div);

        tvResult = findViewById(R.id.Tx_Output);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDivide.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        int res = 0;

        if (view.getId() == R.id.Btn_plus){

            res = Integer.parseInt(num1.getText().toString()) +
                    Integer.parseInt(num2.getText().toString());

        }else if(view.getId() == R.id.Btn_minus){

            res = Integer.parseInt(num1.getText().toString()) -
                    Integer.parseInt(num2.getText().toString());

        }else if(view.getId() == R.id.Btn_mult){

            res = Integer.parseInt(num1.getText().toString()) *
                    Integer.parseInt(num2.getText().toString());

        }else if(view.getId() == R.id.Btn_mult){

            res = Integer.parseInt(num1.getText().toString()) /
                    Integer.parseInt(num2.getText().toString());
        }
        tvResult.setText("Result: " + res);
    }
    public void btnPlusClicked(View view){
        int res = Integer.parseInt(num1.getText().toString()) +
                Integer.parseInt(num2.getText().toString());
        tvResult.setText("Result:" + res);
    }
    public void btnMinusClicked(View view){
        int res = Integer.parseInt(num1.getText().toString()) +
                Integer.parseInt(num2.getText().toString());
        tvResult.setText("Result:" + res);
    }
    public void btnMultiClicked(View view){
        int res = Integer.parseInt(num1.getText().toString()) +
                Integer.parseInt(num2.getText().toString());
        tvResult.setText("Result:" + res);
    }
    public void btnDivideClicked(View view){
        int res = Integer.parseInt(num1.getText().toString()) +
                Integer.parseInt(num2.getText().toString());
        tvResult.setText("Result:" + res);
    }
}