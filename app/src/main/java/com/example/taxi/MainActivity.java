package com.example.taxi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText rate,discount,distance;
    private Button acc,clear;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rate = (EditText)findViewById(R.id.rate);
        discount = (EditText)findViewById(R.id.discount);
        distance = (EditText)findViewById(R.id.distance);
        total = (TextView)findViewById(R.id.total);
        acc = (Button)findViewById(R.id.acc);
        clear = (Button)findViewById(R.id.clear);
    }

    public void count(View view) {
        int dis1 = Integer.parseInt(discount.getEditableText().toString());
        int dis2 = Integer.parseInt(distance.getEditableText().toString());
        int rat = Integer.parseInt(rate.getEditableText().toString());
        int tot;
        if((dis2%dis1)!=0){
            dis2 = ((dis2/dis1)+1)*dis1;
        }
        tot = rat + (dis2/dis1);
        total.setText(Integer.toString(tot)+"元");
    }

    public void Clear(View view) {
        rate.setText("");
        discount.setText("");
        distance.setText("");
    }
}