package com.mydomain.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText num1,num2;
    Double number1,number2;
    Double resultValue;
    Button add,subtract,multiply,divide,equal;
    String myResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.Number1);
        num2=(EditText)findViewById(R.id.Number2);
        result=(TextView)findViewById(R.id.result) ;

        add=(Button)findViewById(R.id.Add);
        subtract=(Button)findViewById(R.id.Subtract);
        multiply=(Button)findViewById(R.id.Multiply);
        divide=(Button)findViewById(R.id.Divide);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 =Double.parseDouble(num1.getText().toString());
                number2 =Double.parseDouble(num2.getText().toString());
                resultValue=number1+number2;
                myResultText=Double.toString(resultValue);
                result.setText(myResultText);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 =Double.parseDouble(num1.getText().toString());
                number2 =Double.parseDouble(num2.getText().toString());
                resultValue=number1-number2;
                myResultText=Double.toString(resultValue);
                result.setText(myResultText);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 =Double.parseDouble(num1.getText().toString());
                number2 =Double.parseDouble(num2.getText().toString());
                resultValue=number1*number2;
                myResultText=Double.toString(resultValue);
                result.setText(myResultText);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 =Double.parseDouble(num1.getText().toString());
                number2 =Double.parseDouble(num2.getText().toString());
                resultValue=number1/number2;
                myResultText=Double.toString(resultValue);
                result.setText(myResultText);
            }
        });


    }

}
