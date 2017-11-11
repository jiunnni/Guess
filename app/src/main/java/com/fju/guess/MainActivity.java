package com.fju.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void guess(View view){
        EditText edNumber=(EditText)findViewById(R.id.ed_number);
        int a = Integer.parseInt(edNumber.getText().toString());
        int Number;
        Number=(int)(Math.random()*10)+1;
        if (a<Number) {
            Toast.makeText(this, "大一點", Toast.LENGTH_LONG).show();
        }else if(a>Number) {
            Toast.makeText(this, "小一點", Toast.LENGTH_LONG).show();
        }else{
            new AlertDialog.Builder(this).setMessage("答對了").setPositiveButton("ok",null).show();

        }



    }
}
