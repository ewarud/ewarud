package com.example.szkolenie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Switch przelacznik;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button klamstwaioszczerstwa= findViewById(R.id.button);
    przelacznik=findViewById(R.id.switch1);
zmienNazwe(klamstwaioszczerstwa,"tekst");

klamstwaioszczerstwa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (przelacznik.isChecked()) {
                    Intent komunikat=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(komunikat);
                } else {
                    Toast chmurka=Toast.makeText(MainActivity.this,"Przełącznik jest wciśnięty",Toast.LENGTH_LONG);
                    chmurka.show();
                }


            }
        });
            Button button2=findViewById(R.id.button2);
            zmienNazwe(button2,"tekstt2");
            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent komunikat3=new Intent(MainActivity.this,snieg.class);
                    startActivity(komunikat3);

                }
            });

    }
    protected  void  zmienNazwe(Button guzik,CharSequence klamstwaioszczerstwa) {guzik.setText(klamstwaioszczerstwa);
    }
}
