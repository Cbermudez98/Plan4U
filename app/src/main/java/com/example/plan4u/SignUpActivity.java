package com.example.plan4u;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class SignUpActivity extends AppCompatActivity {
    //Variable de layout
    EditText username = (EditText) findViewById(R.id.username);
    EditText name = (EditText) findViewById(R.id.name);
    EditText lastName = (EditText) findViewById(R.id.lastName);
    EditText email = (EditText) findViewById(R.id.email);
    EditText password = (EditText) findViewById(R.id.password);
    EditText passwordConfimmation = (EditText) findViewById(R.id.confirmPassword);
    Button SignUp = (Button) findViewById(R.id.SignUp);
    public boolean validator;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);
        getActionBar().hide();

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validator = validarSignUp(username.getText().toString(),name.getText().toString(),lastName.getText().toString(),email.getText().toString(), password.getText().toString(), passwordConfimmation.getText().toString());
                if(validator == true){
                    Toast.makeText(getApplicationContext(),"Faltan campos por llenar",Toast.LENGTH_SHORT);
                    return;
                }
            }
        });
    }

    public static boolean validarSignUp(String usernane, String name, String lastName, String email, String password, String passwordValidator){
        if(!usernane.equals("") && !usernane.equals(null) && !name.equals("") && !name.equals(null) && !lastName.equals("") && !lastName.equals(null) && !email.equals("") && !email.equals(null)){
            if(!password.equals(passwordValidator)){
               return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
