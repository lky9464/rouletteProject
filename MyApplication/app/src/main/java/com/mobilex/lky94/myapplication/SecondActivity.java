package com.mobilex.lky94.myapplication;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    ImageView firstNum, secondNum, thirdNum;
    Button gameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        firstNum = findViewById(R.id.num1);
        secondNum = findViewById(R.id.num2);
        thirdNum = findViewById(R.id.num3);
        gameButton = findViewById(R.id.gameButton);

        gameButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int ran1 = (int)(Math.random()*10 + 0);
                int ran2 = (int)(Math.random()*10 + 0);
                int ran3 = (int)(Math.random()*10 + 0);

                switch(ran1){
                    case 0: firstNum.setImageResource(R.drawable.zero); break;
                    case 1: firstNum.setImageResource(R.drawable.one); break;
                    case 2: firstNum.setImageResource(R.drawable.two); break;
                    case 3: firstNum.setImageResource(R.drawable.three); break;
                    case 4: firstNum.setImageResource(R.drawable.four); break;
                    case 5: firstNum.setImageResource(R.drawable.five); break;
                    case 6: firstNum.setImageResource(R.drawable.six);break;
                    case 7: firstNum.setImageResource(R.drawable.seven); break;
                    case 8: firstNum.setImageResource(R.drawable.eight); break;
                    case 9: firstNum.setImageResource(R.drawable.nine); break;
                    default:firstNum.setImageResource(R.drawable.ic_launcher_background);
                }
                switch(ran2){
                    case 0: secondNum.setImageResource(R.drawable.zero); break;
                    case 1: secondNum.setImageResource(R.drawable.one); break;
                    case 2: secondNum.setImageResource(R.drawable.two); break;
                    case 3: secondNum.setImageResource(R.drawable.three); break;
                    case 4: secondNum.setImageResource(R.drawable.four); break;
                    case 5: secondNum.setImageResource(R.drawable.five); break;
                    case 6: secondNum.setImageResource(R.drawable.six); break;
                    case 7: secondNum.setImageResource(R.drawable.seven); break;
                    case 8: secondNum.setImageResource(R.drawable.eight); break;
                    case 9: secondNum.setImageResource(R.drawable.nine); break;
                    default:firstNum.setImageResource(R.drawable.ic_launcher_background);
                }
                switch(ran3){
                    case 0: thirdNum.setImageResource(R.drawable.zero); break;
                    case 1: thirdNum.setImageResource(R.drawable.one); break;
                    case 2: thirdNum.setImageResource(R.drawable.two); break;
                    case 3: thirdNum.setImageResource(R.drawable.three); break;
                    case 4: thirdNum.setImageResource(R.drawable.four); break;
                    case 5: thirdNum.setImageResource(R.drawable.five); break;
                    case 6: thirdNum.setImageResource(R.drawable.six); break;
                    case 7: thirdNum.setImageResource(R.drawable.seven); break;
                    case 8: thirdNum.setImageResource(R.drawable.eight); break;
                    case 9: thirdNum.setImageResource(R.drawable.nine); break;
                    default:firstNum.setImageResource(R.drawable.ic_launcher_background);
                }

            }
        });
    }
}
