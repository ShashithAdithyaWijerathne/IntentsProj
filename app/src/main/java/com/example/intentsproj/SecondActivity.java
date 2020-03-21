package com.example.intentsproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intentsproj.FirstActivity;
import com.example.intentsproj.R;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Get the Intent that started this activity and extract the string
        Intent intent=getIntent();
        String message= intent.getStringExtra(FirstActivity.EXTRA_MESSAGE);

        String message2= intent.getStringExtra(FirstActivity.EXTRA_MESSAGE2);

        //For number 1
        TextView firstNumber=(TextView)findViewById(R.id.firstNumber);
        firstNumber.setText(message);

        //For number 2
        TextView secondNumber=(TextView)findViewById(R.id.secondNumber);
        secondNumber.setText(message2);

    }

    //For add 2 numbers
    public void add(View view){
        //get the edit text
        EditText t1=(EditText)findViewById(R.id.firstNumber);
        EditText t2=(EditText)findViewById(R.id.secondNumber);

        //convert value into int
        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());

        //sum these two numbers
        int z=x+y;

        //display this text to TextView
        TextView answer=(TextView)findViewById(R.id.answer);
        answer.setText( x + "  +\t" + y + " = \t" + z);

    }

    //For subtraction 2 numbers
    public void sub(View view){
        //get the edit text
        EditText t1=(EditText)findViewById(R.id.firstNumber);
        EditText t2=(EditText)findViewById(R.id.secondNumber);

        //convert value into int
        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());

        //sub these two numbers
        int z=x-y;

        //display this text to TextView
        TextView answer=(TextView)findViewById(R.id.answer);
        answer.setText( x + "  -\t" + y + " = \t" + z);

    }


    //For multiply 2 numbers
    public void Mul(View view){
        //get the edit text
        EditText t1=(EditText)findViewById(R.id.firstNumber);
        EditText t2=(EditText)findViewById(R.id.secondNumber);

        //convert value into int
        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());

        //mul these two numbers
        int z=x*y;

        //display this text to TextView
        TextView answer=(TextView)findViewById(R.id.answer);
        answer.setText( x + "  *\t" + y + " = \t" + z);

    }

    //For division 2 numbers
    public void div(View view){
        //get the edit text
        EditText t1=(EditText)findViewById(R.id.firstNumber);
        EditText t2=(EditText)findViewById(R.id.secondNumber);

        //convert value into int
        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());

        //div these two numbers
        int z=x/y;

        //display this text to TextView
        TextView answer=(TextView)findViewById(R.id.answer);
        answer.setText( x + "  /\t" + y + " = \t" + z);

    }
}
