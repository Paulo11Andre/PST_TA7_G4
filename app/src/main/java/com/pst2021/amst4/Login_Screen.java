package com.pst2021.amst4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__screen);
        getSupportActionBar().hide();
        
    }

    public void login(View view){
        EditText et1 = (EditText) findViewById(R.id.userNameID);
        EditText et2 = (EditText) findViewById(R.id.passwordID);
        for (User us: LectorDeDatos.usuarios) {
            if (us.getUsername().equals(et1) && us.getPassword().equals(et2)) {
                Intent i = new Intent(this, Books_Screen.class);
                startActivity(i);
            }
        }

    }
}