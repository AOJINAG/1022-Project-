package com.example.eecsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
    }

    public void createAcc(View view) {
        View v1 = findViewById(R.id.UsertextView);
        EditText user = (EditText) v1;
        String username = user.getText().toString();

        View v2 = findViewById(R.id.editTextPassword1);
        EditText pass = (EditText) v2;
        String password = pass.getText().toString();

        View v3 = findViewById(R.id.editTextPassword2);
        EditText repass = (EditText) v3;
        String repassword = repass.getText().toString();

        View v4 = findViewById(R.id.editTextEmailAddress);
        EditText em = (EditText) v4;
        String email = em.getText().toString();

        if ((username.contains("@#$%&*"))){
            TextView output = (TextView)findViewById(R.id.textViewDisplay);
            output.setText("Incorrect username. Username must not contain symbols such as @#$%&*!");

        } else if ((password.length() < 6) && (password.length() > 30)){
            TextView output = (TextView)findViewById(R.id.textViewDisplay);
            output.setText("Incorrect password. Password must be within 6 and 30 characters");

        } else if (username.equals(null) || password.equals(null) || repassword.equals(null) || repassword != password || email.equals(null)){
            TextView output = (TextView)findViewById(R.id.textViewDisplay);
            output.setText("Incorrect password. Password must be within 6 and 30 characters");
        } else {
            Intent intent = new Intent(RegisterScreen.this, themeSelection.class);
            startActivity(intent);
        }
    }
}