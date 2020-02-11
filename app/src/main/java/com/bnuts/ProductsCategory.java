package com.bnuts;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static android.widget.ArrayAdapter.createFromResource;

public class ProductsCategory extends AppCompatActivity {
    String json = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_products);
        json = getIntent().getStringExtra("localcart");
//        if (json == null) {
//            System.out.println("youre double fucked");
//        }

    }

    public void goToCategoryA(View view) {
        Intent intent = new Intent(getApplicationContext(), Categories.class);
//        intent.putExtra("key","6");
        intent.putExtra("localcart", json);
        startActivity(intent);
    }

    public void goToCategoryB(View view) {
        Intent intent = new Intent(getApplicationContext(), Categories.class);
//        intent.putExtra("key","12");
        intent.putExtra("localcart", json);
        startActivity(intent);
    }

    public void goToCategoryC(View view) {
        Intent intent = new Intent(getApplicationContext(), Categories.class);
//        intent.putExtra("key","5");
        intent.putExtra("localcart", json);
        startActivity(intent);
    }
}
