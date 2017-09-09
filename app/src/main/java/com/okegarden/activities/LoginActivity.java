package com.okegarden.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.okegarden.R;
import com.okegarden.ui.BundtypeButton;
import com.okegarden.ui.BundtypeEditText;
import com.okegarden.ui.BundtypeTextview;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        BundtypeButton btnLogin = (BundtypeButton) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, MenuActivity.class));
                finish();
            }
        });
        BundtypeTextview btnDaftar = (BundtypeTextview)findViewById(R.id.edt_daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, DaftarActivity.class));
            }
        });
    }
}
