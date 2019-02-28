package com.example.tgroiss16.cashflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toolbar;

import java.io.InputStream;
import java.util.List;

public class Cashflow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashflow);
        TextView err = (TextView)findViewById(R.id.eurobetrag);
        //End of Main
        //Spinner 1
        String[] ausgabenarr = new String[] {
                "Ausgabe", "Einnahme"
        };
        Spinner s1 = (Spinner) findViewById(R.id.ausgaben);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, ausgabenarr);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter1);
        //Spinner 1 END
        //Spinner 2
        String[] kategorienarr = new String[] {
                "Überleben", "Freizeit", "Arbeit", "Sonstiges"
        };
        Spinner s2 = (Spinner) findViewById(R.id.kategorien);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, kategorienarr);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter2);
        //Spinner 2 END
        //CSVKatRead
        InputStream inputStream = getResources().openRawResource(R.raw.newkats);
        CSVFile csvFile = new CSVFile(inputStream);
        List scoreList = csvFile.read();
        //CSVKatRead END
    }

    public void testing(View view){

    }
}
