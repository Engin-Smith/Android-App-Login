package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private Button move;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);


        MaterialButton login_btn =(MaterialButton) findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    //correct
//                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFULL",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this,Home.class));


                }else {
                    //Incorrect
                    Toast.makeText(MainActivity.this, "LOGIN FAiLED", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}