package com.example.carla;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);

        setContentView(R.layout.login);

        Button btn = findViewById(R.id.login_btn);

        btn.setOnClickListener( e-> {
            Intent it = new Intent(this, LogadoActivity.class);
            startActivity(it);
        });
    }

}
