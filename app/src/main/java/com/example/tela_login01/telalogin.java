package com.example.tela_login01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class telalogin extends AppCompatActivity {

    EditText login;
    EditText senha;
    Button logbutton;
    Button signbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telalogin);

        login = (EditText) findViewById(R.id.login);

        senha = (EditText) findViewById(R.id.senha);

        logbutton = (Button) findViewById(R.id.logbutton);

        signbutton = (Button) findViewById(R.id.signbutton);

        logbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!logbutton.getText().toString().isEmpty() && !senha.getText().toString().isEmpty()) {
                    Toast.makeText(telalogin.this, R.string.sucess_label, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(telalogin.this, R.string.error_label, Toast.LENGTH_SHORT).show();
                }
            }
        });
        }
    }


