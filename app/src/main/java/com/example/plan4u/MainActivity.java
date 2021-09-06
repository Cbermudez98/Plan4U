package com.example.plan4u;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user = (EditText) findViewById(R.id.user);
    EditText password = (EditText) findViewById(R.id.password);
    Button LogIn = (Button) findViewById(R.id.LogIn);
    TextView SignUp = findViewById(R.id.SignUp);
    public static boolean var = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().hide();

        LogIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!user.getText().equals("")){
                    Toast.makeText(getApplicationContext(),"Error, Usuario vacio",Toast.LENGTH_SHORT).show();
                    var = true;

                }

                if(!password.getText().equals("")){
                    Toast.makeText(getApplicationContext(),"Error, Contraseña vacia",Toast.LENGTH_SHORT).show();
                    var = true;
                }

                if(var == false){
                    //Aqui se abre la otra actividad
                    //Validar si las credenciales concuerdan con la base de datos
                }
            }
        });

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}