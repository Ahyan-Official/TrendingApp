package com.trendingapp.app.az;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PromotionalActivity extends AppCompatActivity {



    ImageView imageView;
    RelativeLayout skipit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotional);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


//        int secondsDelayed = 1;
//        new Handler().postDelayed(new Runnable() {
//            public void run() {
//
//            }
//        }, secondsDelayed * 5000);

        TextView tvNumber = findViewById(R.id.tvNumber);
        imageView = findViewById(R.id.im);
        skipit = findViewById(R.id.skipit);

        skipit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent( PromotionalActivity.this,     SplashActivity.class));
                finish();
                overridePendingTransition(0, 0);
            }
        });

        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
                tvNumber.setText("" + millisUntilFinished / 1000);
                long aa =millisUntilFinished / 1000;
                if(aa ==2){
                    imageView.setImageResource(R.drawable.sale_2);

                }
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
               // mTextField.setText("done!");

                startActivity(new Intent( PromotionalActivity.this,     SplashActivity.class));
                finish();
                overridePendingTransition(0, 0);
            }

        }.start();
    }

}