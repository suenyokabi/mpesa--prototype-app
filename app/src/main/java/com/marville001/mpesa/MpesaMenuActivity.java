package com.marville001.mpesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MpesaMenuActivity extends AppCompatActivity {

    ListView listview;
    //data source
    String[] mpesamenu = {"Send Money", "Withdraw Cash", "Buy Airtime", "Loans and Savings", "Lipa na MPESA", "My Account"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpesa_menu);

        listview=findViewById(R.id.listView);

        //create an adapter
        ArrayAdapter adapter= new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                mpesamenu
        );

        //load the listview
        listview.setAdapter(adapter);

        //Handle click events
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent i = new Intent(getApplicationContext(), SendMoneyMenuActivity.class);
                    startActivity(i);
                }
                if(position == 1){
                    Toast.makeText(getApplicationContext(),"You clicked Withdraw Cash",Toast.LENGTH_SHORT).show();
                }
                if(position == 2){
                    Toast.makeText(getApplicationContext(),"You clicked Buy Airtime",Toast.LENGTH_SHORT).show();
                }
                if(position == 3){
                    Toast.makeText(getApplicationContext(),"You clicked Loans and Savings",Toast.LENGTH_SHORT).show();
                }
                if(position == 4){
                    Toast.makeText(getApplicationContext(),"You clicked Lipa na MPESA",Toast.LENGTH_SHORT).show();
                }
                if(position == 5){
                    Toast.makeText(getApplicationContext(),"You clicked My Account",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
