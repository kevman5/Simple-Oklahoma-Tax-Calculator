package com.example.tax_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnclick(View v) {
        EditText t1;
        TextView tv1;
        double sal1, taxresult, tax1;
        t1 = (EditText) findViewById(R.id.Salary1);
        tv1 = (TextView) findViewById(R.id.tax_result);
        sal1 = Double.parseDouble(t1.getText().toString());

        if (sal1 <= 50000)
        {
            tax1 = 0.05;
            taxresult = tax1 * sal1;
        }
        else if (sal1 > 50000 && sal1 < 80001)
        {
            tax1 = 0.07;
            taxresult = sal1 * tax1;
        }
        else
        {
            tax1 = 0.10;
            taxresult = sal1 * tax1;

        }
        tv1.setText(String.valueOf(taxresult));
    }
}