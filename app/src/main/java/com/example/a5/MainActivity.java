package com.example.a5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int ran;
    public void randgen()
    {
        Random r = new Random();
        ran =r.nextInt(20) + 1;

    }
    public void click(View view)
    {
        EditText editTextNumber=(EditText) findViewById(R.id.editTextNumber);
        Log.i("buttton","button pressed");
        Log.i("value", editTextNumber.getText().toString());
        Log.i("random",Integer.toString(ran));
        int ev=Integer.parseInt(editTextNumber.getText().toString());
         String message;
        if(ran>ev)
        {
            message="higher"  ;
        }
        else if(ran<ev)
        {
            message="lower"  ;
        }
        else
        {
           message="equal"    ;
            randgen();
        }
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randgen();

    }
}