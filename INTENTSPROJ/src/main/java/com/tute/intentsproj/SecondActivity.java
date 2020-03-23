package com.tute.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private TextView tx1;
    private TextView tx2;
    private TextView txtResult;
    private Button Add;
    private Button Subst;
    private Button Multi;
    private Button Divide;
    private String value1;
    private String value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tx1= findViewById(R.id.textView12);
        tx2= findViewById(R.id.textView13);
        txtResult= findViewById(R.id.textView5);
        Add = findViewById(R.id.button8);
        Subst = findViewById(R.id.button9);
        Multi = findViewById(R.id.button5);
        Divide = findViewById(R.id.button2);


        //additition button function
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tx1.getText().toString().length()==0){

                    tx1.setText("0");

                }
                if(tx2.getText().toString().length()==0){

                    tx2.setText("0");

                }

                int num1 = Integer.parseInt(tx1.getText().toString());
                int num2 = Integer.parseInt(tx2.getText().toString());

                int sum = num1 + num2;

                txtResult.setText(String.valueOf(sum));

            }

        });
        //sub button function
        Subst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tx1.getText().toString().length()==0){

                    tx1.setText("0");

                }
                if(tx2.getText().toString().length()==0){

                    tx2.setText("0");

                }

                int num1 = Integer.parseInt(tx1.getText().toString());
                int num2 = Integer.parseInt(tx2.getText().toString());

                int sum = num1 - num2;

                txtResult.setText(String.valueOf(sum));

            }
        });
        //multipilication button function
        Multi.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            if (tx1.getText().toString().length() == 0) {

                                                tx1.setText("0");

                                            }
                                            if (tx2.getText().toString().length() == 0) {

                                                tx2.setText("0");

                                            }

                                            int num1 = Integer.parseInt(tx1.getText().toString());
                                            int num2 = Integer.parseInt(tx2.getText().toString());

                                            int sum = num1 * num2;
                                            txtResult.setText(String.valueOf(sum));
          }

        });
        //divide button function
        Divide.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             if (tx1.getText().toString().length() == 0) {

                                                 tx1.setText("0");

                                             }
                                             if (tx2.getText().toString().length() == 0) {

                                                 tx2.setText("0");

                                             }

                                             int num1 = Integer.parseInt(tx1.getText().toString());
                                             int num2 = Integer.parseInt(tx2.getText().toString());

                                             int sum = num1 / num2;

                                             txtResult.setText(String.valueOf(sum));

                                         }

                                     });

        value1= getIntent().getExtras().getString("Value");
        value2= getIntent().getExtras().getString("Value1");
        tx1.setText(value1);
        tx2.setText(value2);


    }
}
