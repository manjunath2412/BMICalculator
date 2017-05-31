package com.dice.ms1.bmicalculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculatebutton = (Button) findViewById(R.id.calculate_button);
        final EditText massvalue = (EditText) findViewById(R.id.mass_text);
        final EditText heightvalue = (EditText) findViewById(R.id.height_text);

        calculatebutton.setOnClickListener(new View.OnClickListener()
          {
            @Override
               public void onClick(View v) {

                  double mass = Double.parseDouble(massvalue.getText().toString());
                  double height = Double.parseDouble(heightvalue.getText().toString());
                  double bmi = mass/height;
                  String weightresult = "";
                  if(bmi > 25)
                  {
                      weightresult = "You are Overweight!!!";
                  }
                  else if((bmi > 18.5) && (bmi <= 25))
                  {
                      weightresult = "You have Normal weight :)";
                  }
                  else if(bmi < 18)
                  {
                      weightresult = "You are Underweight :(";
                  }
                 Toast.makeText(MainActivity.this, "BMI value is : "+bmi+" and "+weightresult, Toast.LENGTH_SHORT).show();
                 }
           }
        );


    }
}
