package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    private TextView signUp ;
    private Button signIn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //inisial tombol
        signUp =  findViewById(R.id.et_signup) ;
        signIn =  findViewById(R.id.et_signin) ;
        // function tombol
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPatient = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(iPatient);
            }
        });
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPatient = new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(iPatient);
            }
        });

    }
}
