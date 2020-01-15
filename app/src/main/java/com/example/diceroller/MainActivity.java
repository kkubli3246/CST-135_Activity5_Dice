package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button Rollbtn;
    TextView ResultTextView;
    ImageView DiceImgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rollbtn = (Button) findViewById(R.id.Rollbtn);
        ResultTextView = (TextView) findViewById(R.id.ResultTextView);
        DiceImgView = (ImageView) findViewById(R.id.DiceImgView);

        Rollbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();

                //Creates Random Number Between 1-6
                int rollNum = rand.nextInt(6) + 1;

                ResultTextView.setText("You Rolled a " + rollNum);

                switch(rollNum){
                    case 1:{
                        DiceImgView.setImageResource(R.drawable.dice_1);
                        break;
                    }
                    case 2:{
                        DiceImgView.setImageResource(R.drawable.dice_2);
                        break;
                    }
                    case 3:{
                        DiceImgView.setImageResource(R.drawable.dice_3);
                        break;
                    }
                    case 4:{
                        DiceImgView.setImageResource(R.drawable.dice_4);
                        break;
                    }
                    case 5:{
                        DiceImgView.setImageResource(R.drawable.dice_5);
                        break;
                    }
                    case 6:{
                        DiceImgView.setImageResource(R.drawable.dice_6);
                        break;
                    }
                }
            }
        });

    }
}
