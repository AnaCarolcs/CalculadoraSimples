package com.ana.calculadorasimples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private double aux1;
    private double aux2;

    private String operator;

    private TextView tx_result;

    private Button bt_0;
    private Button bt_1;
    private Button bt_2;
    private Button bt_3;
    private Button bt_4;
    private Button bt_5;
    private Button bt_6;
    private Button bt_7;
    private Button bt_8;
    private Button bt_9;

    private Button bt_division;
    private Button bt_multi;
    private Button bt_minus;
    private Button bt_plus;

    private Button bt_dota;
    private Button bt_x;
    private Button bt_clean;
    private Button bt_equals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tx_result = (TextView) findViewById(R.id.tx_result);

        bt_0 = (Button) findViewById(R.id.bt_0);
        bt_1 = (Button) findViewById(R.id.bt_1);
        bt_2 = (Button) findViewById(R.id.bt_2);
        bt_3 = (Button) findViewById(R.id.bt_3);
        bt_4 = (Button) findViewById(R.id.bt_4);
        bt_5 = (Button) findViewById(R.id.bt_5);
        bt_6 = (Button) findViewById(R.id.bt_6);
        bt_7 = (Button) findViewById(R.id.bt_7);
        bt_8 = (Button) findViewById(R.id.bt_8);
        bt_9 = (Button) findViewById(R.id.bt_9);

        bt_division = (Button) findViewById(R.id.bt_division);
        bt_multi = (Button) findViewById(R.id.bt_multi);
        bt_minus = (Button) findViewById(R.id.bt_minus);
        bt_plus = (Button) findViewById(R.id.bt_plus);

        bt_dota = (Button) findViewById(R.id.bt_dota);
        bt_x = (Button) findViewById(R.id.bt_x);
        bt_clean = (Button) findViewById(R.id.bt_clean);
        bt_equals = (Button) findViewById(R.id.bt_equals);




        bt_0.setOnClickListener(this);
        bt_1.setOnClickListener(this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);
        bt_5.setOnClickListener(this);
        bt_6.setOnClickListener(this);
        bt_7.setOnClickListener(this);
        bt_8.setOnClickListener(this);
        bt_9.setOnClickListener(this);

        bt_division.setOnClickListener(this);
        bt_multi.setOnClickListener(this);
        bt_minus.setOnClickListener(this);
        bt_plus.setOnClickListener(this);

        bt_dota.setOnClickListener(this);
        bt_x.setOnClickListener(this);
        bt_clean.setOnClickListener(this);
        bt_equals.setOnClickListener(this);

    }

    public void Number(int number){

        if(tx_result.getText().toString().trim().equals("0.0")){

            ClearResult();
            tx_result.setText(tx_result.getText().toString() + String.valueOf(number));

        }else{

            tx_result.setText(tx_result.getText().toString() + String.valueOf(number));

        }

    }

    public void ClearResult(){

        
    }


    @Override
    public void onClick(View v) {

    }
}
