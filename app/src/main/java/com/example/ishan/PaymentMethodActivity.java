package com.example.ishan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentMethodActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton btnCash;
    private RadioButton btnCard;
    private Button btnMake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);

        Intent intent = getIntent();

        final RadioButton Cash = (RadioButton) findViewById(R.id.btnCash);
        final RadioButton Card = (RadioButton) findViewById(R.id.btnCard);
        final Button MakeOrder = (Button) findViewById(R.id.btnCash);

        MakeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Cash.isChecked()) {
                    Intent Intents = new Intent(PaymentMethodActivity.this, CashActivity.class); // <----- START "Cash" ACTIVITY
                    startActivity(Intents);

                    setContentView(R.layout.activity_cash);

                } else if (Card.isChecked()) {
                    Intent Intentm = new Intent(getApplicationContext(), CardActivity.class); // <----- START "Card" ACTIVITY
                    startActivity(Intentm);
                    setContentView(R.layout.activity_card);


                    startActivityForResult(Intentm, 0);
                }

            }









        });
    }

    public void Purchase(View view){
        Intent intent1 = new Intent(this,CardActivity.class);
        startActivity(intent1);
    }
}




//import android.content.Intent;
//    import android.os.Bundle;
//   import android.app.Activity;
//  import android.os.Bundle;
// import android.view.View;
// import android.view.View.OnClickListener;
// import android.widget.Button;
// import android.widget.RadioButton;
// import android.widget.RadioGroup;
// import android.widget.Toast;


//public class MainActivity extends AppCompatActivity {











