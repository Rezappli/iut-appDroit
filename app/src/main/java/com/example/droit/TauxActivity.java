package com.example.droit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TauxActivity extends AppCompatActivity {

    private Button moreThan0_8g;
    private Button lessThan0_8g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taux);


        moreThan0_8g = (Button)findViewById(R.id.taux_more_0_8g_button);
        lessThan0_8g = (Button)findViewById(R.id.taux_less_0_8g_button);
        Intent recidive_page = new Intent(this, RecidiveActivity.class);
        Intent result_page = new Intent(this, ResultatActivity.class);

        moreThan0_8g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(recidive_page);
            }
        });

        lessThan0_8g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle allInforesult = new Bundle();
                allInforesult.putString("info1","Retrait de 6 points donc suspension du permis");
                allInforesult.putString("info2","Amende de 750€ maximum");
                allInforesult.putString("info3","Immobilisation du véhicule");
                allInforesult.putString("info4","none");
                allInforesult.putString("info5","none");

                result_page.putExtra("infoResult",allInforesult);
                startActivity(result_page);
            }
        });
    }
}