package com.tute.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button button;
    private EditText et1;
    private EditText et2;
    private String num1;
    private String num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = (Button) findViewById(R.id.button);
        et1 = findViewById(R.id.no1);
        et2 = findViewById(R.id.no2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();

                Intent intent1 = new Intent(FirstActivity.this,SecondActivity.class);
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();


                intent1.putExtra("Value",num1);
                intent1.putExtra("Value1",num2);

                startActivity(intent1);
                finish();

            }
        });
    }
    public void openSecondActivity(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
