package com.example.project_randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num_ans();
    }
    //返回上一頁
    public void back_to_A(View v){
        finish();
    }
    private void num_ans(){
        int number;

        Random num = new Random();
        int ans = num.nextInt((10)+1);
        Bundle bundle = this.getIntent().getExtras();

        if (bundle != null){

            number = Integer.parseInt(bundle.getString("NUM"));
            TextView TF = (TextView)findViewById(R.id.true_or_false);
            TextView big_or_small = (TextView)findViewById(R.id.big_or_small);

            if (number == ans){
                big_or_small.setText("答對了");
                big_or_small.setTextColor(Color.RED);
                TF.setText("○");
                TF.setTextColor(Color.RED);

            }
            else if (number > ans){
                big_or_small.setText("猜小點");
                big_or_small.setTextColor(Color.YELLOW);
                TF.setText("X");

            }
            else if (number < ans){
                big_or_small.setText("猜大點");
                big_or_small.setTextColor(Color.YELLOW);
                TF.setText("X");
            }
        }
    }
}
