package com.example.devniki.relogio;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler atualizador = new Handler();
        final TextView relogio = (TextView) findViewById(R.id.TextView1);

        atualizador.post(new Runnable() {
            @Override
            public void run() {
                atualizaHora(relogio);
                atualizador.postDelayed(this, 100);
            }
        });
    }

    public void atualizaHora(TextView relogio){
        GregorianCalendar calendario = new GregorianCalendar();
        int h = calendario.get(GregorianCalendar.HOUR_OF_DAY);
        int m = calendario.get(GregorianCalendar.MINUTE);
        int s = calendario.get(GregorianCalendar.SECOND);
        relogio.setText(h+":"+m+":"+s);
    }





}
