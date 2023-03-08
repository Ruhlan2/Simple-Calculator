package com.ruhlanusubov.calculator;

import static java.lang.Math.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number1text;
    EditText number2text;
    TextView resulttext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1text=findViewById(R.id.number1text);
        number2text=findViewById(R.id.number2text);
        resulttext=findViewById(R.id.result);



    }
    public void sum(View view) {

        if (number1text.getText().toString().isEmpty() || number2text.getText().toString().isEmpty()) {
            resulttext.setText("Please enter number");
        } else{
            int number1 = Integer.parseInt(number1text.getText().toString());

            int number2 = Integer.parseInt(number2text.getText().toString());


            int result = number2 + number1;
        resulttext.setText("Result: " + result);
    }

    }
    public void deduct(View view){
        if (number1text.getText().toString().isEmpty() || number2text.getText().toString().isEmpty()) {
            resulttext.setText("Please enter number");
        } else{
            int number1 = Integer.parseInt(number1text.getText().toString());

            int number2 = Integer.parseInt(number2text.getText().toString());


            int result = abs(number2 - number1);
            resulttext.setText("Result: " + result);
        }
    }
    public void multiply(View view){
        if (number1text.getText().toString().isEmpty() || number2text.getText().toString().isEmpty()) {
            resulttext.setText("Please enter number");
        } else{
            int number1 = Integer.parseInt(number1text.getText().toString());

            int number2 = Integer.parseInt(number2text.getText().toString());


            int result = number2 * number1;
            resulttext.setText("Result: " + result);
        }

    }
    public void divide(View view){
        if (number1text.getText().toString().isEmpty() || number2text.getText().toString().isEmpty()) {
            resulttext.setText("Please enter number");
        } else{
            int number1 = Integer.parseInt(number1text.getText().toString());

            int number2 = Integer.parseInt(number2text.getText().toString());


            int result = number2 / number1;
            resulttext.setText("Result: " + result);
        }

    }

}