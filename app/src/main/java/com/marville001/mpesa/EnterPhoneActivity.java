package com.marville001.mpesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterPhoneActivity extends AppCompatActivity {

    Button btn_ok;
    EditText et_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_phone);

        btn_ok = findViewById(R.id.btn_ok);
        et_phone = findViewById(R.id.et_phone);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = et_phone.getText().toString().trim();

                if(phone.isEmpty()){
                    et_phone.setError("Enter Phone number");
                    et_phone.requestFocus();
                    return;
                }

                Intent i = new Intent(getApplicationContext(), EnterAmountActivity.class);
                i.putExtra("phone",phone);
                startActivity(i);
                finish();


            }
        });

    }
}