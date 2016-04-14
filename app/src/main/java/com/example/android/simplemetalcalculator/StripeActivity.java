package com.example.android.simplemetalcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StripeActivity extends AppCompatActivity {

    EditText aDimension;
    EditText bDimension;
    EditText length;
    TextView weightResult;
    Button calculate;
    Button clear;
    double a = 0;
    double b = 0;
    double lengthVar = 0;
    double squareMm = 0;
    double VolumeCm = 0;
    double WeightKg = 0;
    String weightResultString;
    static final double DENSITY = 7.87;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stripe);

        aDimension = (EditText) findViewById(R.id.et_A_dimension);
        bDimension = (EditText) findViewById(R.id.et_B_dimension);

        length = (EditText) findViewById(R.id.et_length);

        weightResult = (TextView) findViewById(R.id.tv_weight_result);

        calculate = (Button) findViewById(R.id.btn_calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    a = Double.parseDouble(aDimension.getText().toString());
                    b = Double.parseDouble(bDimension.getText().toString());

                    lengthVar = Double.parseDouble(length.getText().toString());
                } catch (Exception e) {
                    Toast.makeText(StripeActivity.this, "Enter number value!", Toast.LENGTH_SHORT).show();
                }
                showResult(v);

            }
        });

        clear = (Button)findViewById(R.id.btn_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 0;
                b = 0;
                lengthVar = 0;
                aDimension.setText("");
                bDimension.setText("");
                length.setText("");
                weightResult.setText("");
            }
        });
    }

    public void showResult(View v) {

        if (a == 0 || lengthVar == 0 || b == 0 ) {
            Toast.makeText(this, "Enter value above zero!", Toast.LENGTH_SHORT).show();
        } else {

            weightResultString = String.format("%.2f", countWeight(a, b, lengthVar));
            weightResult.setText(weightResultString + "kg");

        }
    }

    public double countWeight (double a, double b, double length){

        squareMm = a * b;
        VolumeCm = (squareMm * (length*1000))/1000;
        WeightKg = (VolumeCm * DENSITY)/1000;
        return  WeightKg;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_item_info:
                Intent intent = new Intent(StripeActivity.this, InfoActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}