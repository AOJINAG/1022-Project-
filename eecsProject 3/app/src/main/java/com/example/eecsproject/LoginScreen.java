package com.example.eecsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }

    public void signIn(View view) {
        View v1 = findViewById(R.id.UsertextView);
        EditText user = (EditText) v1;
        String username = user.getText().toString();
        View v2 = findViewById(R.id.editTextPassword);
        EditText pass = (EditText) v2;
        String password = pass.getText().toString();

        if (username.equals("Admin") && password.equals("Admin")){
            Intent intent = new Intent(LoginScreen.this, themeSelection.class);
            startActivity(intent);
        }
    }
}