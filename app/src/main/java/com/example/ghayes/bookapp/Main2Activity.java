package com.example.ghayes.bookapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Main2Activity extends AppCompatActivity {
    public Button Buyer;
    public Button Seller;
    FirebaseAuth auth;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();

        Buyer = findViewById(R.id.button6);
        Seller = findViewById(R.id.button7);

        Buyer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openActivityBuyer();
            }
        });

        Seller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitySeller();
            }
        });
    }

    public void openActivityBuyer() {
        Intent startNewBuyerActivity = new Intent(this, BookInfo.class);
        startActivity(startNewBuyerActivity);
    }

    public void openActivitySeller() {
        Intent startNewSellerActivity = new Intent(this, BookInfo.class);
        startActivity(startNewSellerActivity);
    }
}
