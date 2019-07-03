package com.example.ishan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

//import android.support.v7.app.AppCompactActivity;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        Intent intent = getIntent();

    }

    public void goToMap(View view){
        Intent intent1 = new Intent(this,GoogleMapActivity.class);
        startActivity(intent1);
    }
}
