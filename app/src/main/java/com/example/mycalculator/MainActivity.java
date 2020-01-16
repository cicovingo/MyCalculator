package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.editNumber1);
        number2Text = findViewById(R.id.editNumber2);
        resultText = findViewById(R.id.textView);
    }

    public void sum(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Lütfen Sayı Giriniz..!");
        } else {
            result = Double.parseDouble(number1Text.getText().toString()) + Double.parseDouble(number2Text.getText().toString());
            resultText.setText("Sonuç: "+result);
        }
    }

    public void deduct(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Lütfen Sayı Giriniz..!");
        } else {
            result = Double.parseDouble(number1Text.getText().toString()) - Double.parseDouble(number2Text.getText().toString());
            resultText.setText("Sonuç: "+result);
        }
    }

    public void multiply(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Lütfen Sayı Giriniz..!");
        } else {
            result = Double.parseDouble(number1Text.getText().toString()) * Double.parseDouble(number2Text.getText().toString());
            resultText.setText("Sonuç: "+result);
        }
    }

    public void divide(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Lütfen Sayı Giriniz..!");
        } else {
            result = Double.parseDouble(number1Text.getText().toString()) / Double.parseDouble(number2Text.getText().toString());
            resultText.setText("Sonuç: "+result);
        }
    }
}
