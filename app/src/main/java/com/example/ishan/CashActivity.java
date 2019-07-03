package com.example.ishan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash);
    }

    public void goToAddress(View view){
        Intent intent = new Intent(this,AddressActivity.class);
        startActivity(intent);

    }

}
