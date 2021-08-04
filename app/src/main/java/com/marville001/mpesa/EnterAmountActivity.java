package com.marville001.mpesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterAmountActivity extends AppCompatActivity {

    Button btn_ok;
    EditText et_amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_amount);

        Intent passedIntent = getIntent();

        String phone = passedIntent.getStringExtra("phone");

        btn_ok = findViewById(R.id.btn_ok);
        et_amount = findViewById(R.id.et_amount);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = et_amount.getText().toString().trim();

                if(amount.isEmpty()){
                    et_amount.setError("Enter amount");
                    et_amount.requestFocus();
                    return;
                }

                Intent i = new Intent(getApplicationContext(), FinalActivity.class);
                i.putExtra("phone",phone);
                i.putExtra("amount",amount);
                startActivity(i);
                finish();

            }
        });

    }
}