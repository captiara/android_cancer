package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //deklarasi tombol
    private Button patientBtn, dokterBtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisial tombol
        patientBtn = (Button)findViewById(R.id.et_patient) ;
        dokterBtn = (Button)findViewById(R.id.et_dokter) ;
        // function tombol
        patientBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent iPatient = new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(iPatient);
            }
        });

        dokterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iDokter = new Intent(getApplicationContext(),LoginpatientActivity.class);
                startActivity(iDokter);
            }
        });
    }
}
