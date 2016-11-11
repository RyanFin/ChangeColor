package com.finlayson.ryan.changecolor;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // bar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));



    }

    public void onConfirm(View view){
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        TextView text = (TextView) findViewById(R.id.textView);

        String selected = spin.getSelectedItem().toString();
        text.setText(selected);

       switch (selected){

            case "Black":
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.BLACK));
                break;
            case "Green":
               getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.GREEN));
                break;
            case "Red":
               getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.RED));

            default:
                break;
        }
    }





}
