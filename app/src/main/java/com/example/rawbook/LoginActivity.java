package com.example.rawbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {

    Button btnSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        btnSignUp =  (Button) findViewById(R.id.btnSignUp);
        btnSignUp.setText(getString(R.string.underlined_dynamic_text_and_bold, "SignUp"));
    }

    public void signUpAct(View v){
        Intent intent = new Intent(LoginActivity.this,SignUpActivity.class);
        startActivity(intent);
    }
}

