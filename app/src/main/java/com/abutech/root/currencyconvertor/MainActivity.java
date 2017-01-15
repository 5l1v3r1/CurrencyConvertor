package com.abutech.root.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText e1=(EditText)findViewById(R.id.editText);
        Double dollar=Double.parseDouble(e1.getText().toString());
        Double rupee=dollar*67.85;
        Toast.makeText(getApplicationContext(),"₹"+rupee,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
