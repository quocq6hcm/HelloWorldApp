package com.example.quocq.helloworldapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnHome;
    TextView txtHello;
    TextView txtCount;
    int count;
    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        count = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHome = (Button) findViewById(R.id.btn_home);
        txtHello = (TextView) findViewById(R.id.txtHelloWorld);
        txtCount =  (TextView) findViewById(R.id.txtClickMe);
        (findViewById(R.id.btn_font20)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                txtHello.setTextSize(20);
            }
        });

        (findViewById(R.id.btn_font40)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                txtHello.setTextSize(40);
            }
        });

        (findViewById(R.id.btnClickMe)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                count++;
                txtCount.setText("Đã click: " + count + " lần!");
            }
        });



        btnToast = (Button)findViewById(R.id.buttonToast);

        btnToast.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "Main Activity is now visible ( start --> visible --> end)", Toast.LENGTH_LONG).show();

            }
        });

        return;
    }


    public void doTest(View v)
    {

        btnHome.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                txtHello.setText("Hutech");

            }
        });
        return;
    }





    public void setBgYellow(View view) {
        txtHello.setTextColor(Color.parseColor("#FFFF00"));
        return;
    }

    public void setBgBlue(View view) {
        txtHello.setTextColor(Color.parseColor("#0000FF"));

        return;
    }

    public void setBgRed(View view) {
        txtHello.setTextColor(Color.parseColor("#FF0000"));
        return;
    }



}
