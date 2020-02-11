package com.bnuts;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Cart extends AppCompatActivity {
    TableLayout tl;
    Toolbar toolbar1;
    int i;
    TextView total;
    String json = null;
//    String x = null;
    float totalcost =0;
    String total_cost;
    List<LocalCart> localcart;
    ImageButton[] b;
    LinearLayout cartt;
    EditText extracost;
    int excost = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        toolbar1 = findViewById(R.id.toolbar1);
        extracost = findViewById(R.id.extracost);
        setSupportActionBar(toolbar1);
//        tl = findViewById(R.id.main_table);
        total = findViewById(R.id.totall);
//        tl.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        Gson gson = new Gson();
        json = getIntent().getStringExtra("localcart");
//        x = getIntent().getStringExtra("key");
        Type collectionType = new TypeToken<List<LocalCart>>() {}.getType();
        localcart = gson.fromJson(json, collectionType);
        b = new ImageButton[localcart.size()];
        cartt = findViewById(R.id.cartt);
        cartt.setOrientation(LinearLayout.VERTICAL);
        showcart();
    }

    private void showcart() {
        totalcost = 0;
        cartt.removeAllViews();
        cartt.setOrientation(LinearLayout.VERTICAL);
        for (i = 0; i < localcart.size(); i = i + 1) {
            System.out.println("size" + localcart.size());
            System.out.println("number" + localcart.get(i).getProduct_no());
            System.out.println("image" + localcart.get(i).getProduct_image());
            System.out.println("name" + localcart.get(i).getProduct_name());
            System.out.println("pkg" + localcart.get(i).getProduct_package());
            System.out.println("qty" + localcart.get(i).getProduct_quantity());
            System.out.println("cost" + localcart.get(i).getProduct_cost());
            LinearLayout ll1 = new LinearLayout(getApplicationContext());
            ll1.setOrientation(LinearLayout.HORIZONTAL);
            LinearLayout.LayoutParams lllp1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400);
            ll1.setLayoutParams(lllp1);
            ll1.setBackgroundResource(R.drawable.tablecell);
            ll1.setPadding(2,2,2,2);
            ll1.setWeightSum(10);

            LinearLayout ll2 = new LinearLayout(getApplicationContext());
            ll2.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams lllp2 = new LinearLayout.LayoutParams(0, 400, 4);
            ll2.setLayoutParams(lllp2);

            TextView empty = new TextView(getApplicationContext());
            empty.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 50));
            empty.setBackgroundColor(Color.WHITE);
            ll2.addView(empty);

            ImageView image = new ImageView(getApplicationContext());
            image.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 300));
            image.setImageResource(localcart.get(i).getProduct_image());
//            image.setBackgroundResource(R.drawable.tablecell);
            ll2.addView(image);

            ll1.addView(ll2);

            LinearLayout ll3 = new LinearLayout(getApplicationContext());
            ll3.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams lllp3 = new LinearLayout.LayoutParams(0, 400, 6);
            ll3.setLayoutParams(lllp3);

            LinearLayout ll4 = new LinearLayout(getApplicationContext());
            ll4.setOrientation(LinearLayout.HORIZONTAL);
            LinearLayout.LayoutParams lllp4 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 200);
            ll4.setLayoutParams(lllp4);
            ll4.setWeightSum(5);
//            ll4.setBackgroundResource(R.drawable.tablecell);

//            ImageView delete = new ImageView(getApplicationContext());
//            delete.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    System.out.println("Im called in this"+i);
//                    localcart.remove(i);
//                    showcart();
//                }
//            });
//            delete.setImageResource(R.drawable.delete);



            TextView product = new TextView(getApplicationContext());
            product.setLayoutParams(new LinearLayout.LayoutParams(0, 200, 4));
            product.setTextColor(Color.BLACK);
            product.setTextSize(25);
            product.setGravity(Gravity.BOTTOM);
            product.setPadding(20,0,0,0);
            product.setText(localcart.get(i).getProduct_name());
            ll4.addView(product);

            ImageButton del = new ImageButton(getApplicationContext());
            del.setLayoutParams(new LinearLayout.LayoutParams(0, 100, 1));
            del.setImageResource(R.drawable.remove);
            del.setBackgroundColor(Color.WHITE);
            del.setOnClickListener(handleOnClick(del, i));
            ll4.addView(del);

            LinearLayout ll5 = new LinearLayout(getApplicationContext());
            ll5.setOrientation(LinearLayout.HORIZONTAL);
            LinearLayout.LayoutParams lllp5 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 200);
            ll5.setLayoutParams(lllp5);
            ll5.setWeightSum(5);

            TextView pkg_qty = new TextView(getApplicationContext());
            pkg_qty.setLayoutParams(new LinearLayout.LayoutParams(0, 200, 3));
            pkg_qty.setTextColor(Color.BLACK);
            pkg_qty.setTextSize(18);
            pkg_qty.setGravity(Gravity.CENTER);
            pkg_qty.setText(localcart.get(i).getProduct_quantity() + " x " + localcart.get(i).getProduct_package() + "gms");
            ll5.addView(pkg_qty);

            TextView cost = new TextView(getApplicationContext());
            cost.setLayoutParams(new LinearLayout.LayoutParams(0, 200, 2));
            cost.setTextColor(Color.BLACK);
            cost.setTextSize(18);
            cost.setGravity(Gravity.CENTER);
            cost.setText("Rs" + localcart.get(i).getProduct_cost());
            ll5.addView(cost);



            ll3.addView(ll4);
            ll3.addView(ll5);

            ll1.addView(ll3);

            cartt.addView(ll1);
        }
        for (i = 0; i < localcart.size(); i = i + 1) {
            totalcost = localcart.get(i).getProduct_cost() + totalcost;
        }
        extracost.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if(extracost.getText().toString() == "" || extracost.getText().toString() == null){
//                    excost = 0;
//                }
//                else{
//                    excost = Integer.parseInt(extracost.getText().toString());
//                }
                try{
                    excost = Integer.parseInt(extracost.getText().toString());
                }
                catch (Exception e){
                    excost = 0;
                }
                System.out.println(excost);
//                totalcost = totalcost + excost;
                total_cost = Float.toString((totalcost + excost));
                total.setText(total_cost);
            }

            @Override
            public void afterTextChanged(Editable s) {
//                if(extracost.getText().toString() == "" || extracost.getText().toString() == null){
//                    excost = 0;
//                }
//                else{
//                    excost = Integer.parseInt(extracost.getText().toString());
//                }
                try{
                    excost = Integer.parseInt(extracost.getText().toString());
                }
                catch (Exception e){
                    excost = 0;
                }
                System.out.println(excost);
//                totalcost = totalcost + excost;
                total_cost = Float.toString((totalcost + excost));
                total.setText(total_cost);
            }
        });
//        if(extracost == null){
//            excost = 0;
//        }
//        else {
//            excost = Integer.parseInt(extracost.getText().toString());
//        }
//        System.out.println(excost);
//        totalcost = totalcost + excost;
        total_cost = Float.toString((totalcost + excost));
        total.setText(total_cost);
    }

    private void ashowcart() {
        totalcost = 0;
        tl.removeAllViews();
        TableLayout.LayoutParams tableLayout = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
        TableRow tableRow = new TableRow(getApplicationContext());
//        tableRow.setLayoutParams(tableLayout);
//        tableRow.setWeightSum(21);
//        TableRow.LayoutParams lp1 = new TableRow.LayoutParams(0, 150, 3);
        tableRow.setMinimumHeight(150);

//        TextView srno = new TextView(getApplicationContext());
//        srno.setText("Sr.No.");
//        srno.setHeight(150);
//        srno.setBackgroundResource(R.drawable.tableheadcell);
//        srno.setTextColor(Color.WHITE);
//        srno.setTextSize(16);
//        srno.setGravity(Gravity.CENTER);

//        srno.setLayoutParams(lp1);
//        TableRow.LayoutParams lp2 = new TableRow.LayoutParams(0, 150, 5);
        TextView product = new TextView(getApplicationContext());
        product.setText("Product");
        product.setHeight(150);
        product.setBackgroundResource(R.drawable.tableheadcell);
        product.setTextColor(Color.WHITE);
        product.setTextSize(16);
        product.setGravity(Gravity.CENTER);
//        product.setLayoutParams(lp2);
//        TableRow.LayoutParams lp3 = new TableRow.LayoutParams(0, 150, 4);
        TextView packagee = new TextView(getApplicationContext());
        packagee.setText("Package");
        packagee.setHeight(150);
        packagee.setBackgroundResource(R.drawable.tableheadcell);
        packagee.setTextColor(Color.WHITE);
        packagee.setTextSize(16);
        packagee.setGravity(Gravity.CENTER);
//        packagee.setLayoutParams(lp3);
//        TableRow.LayoutParams lp4 = new TableRow.LayoutParams(0, 150, 4);
        TextView quantity = new TextView(getApplicationContext());
        quantity.setText("Quantity");
        quantity.setHeight(150);
        quantity.setBackgroundResource(R.drawable.tableheadcell);
        quantity.setTextColor(Color.WHITE);
        quantity.setTextSize(16);
        quantity.setGravity(Gravity.CENTER);
//        quantity.setLayoutParams(lp4);
//        TableRow.LayoutParams lp5 = new TableRow.LayoutParams(0, 150, 3);
        TextView cost = new TextView(getApplicationContext());
        cost.setText("Cost");
        cost.setHeight(150);
        cost.setBackgroundResource(R.drawable.tableheadcell);
        cost.setTextColor(Color.WHITE);
        cost.setTextSize(16);
        cost.setGravity(Gravity.CENTER);
//        cost.setLayoutParams(lp5);
//        TableRow.LayoutParams lp6 = new TableRow.LayoutParams(0, 150, 2);
        TextView del = new TextView(getApplicationContext());
//        del.setText("Del");
        del.setBackgroundResource(R.drawable.tableheadcell);
        del.setHeight(150);
        del.setTextColor(Color.WHITE);
        del.setTextSize(16);
        del.setGravity(Gravity.CENTER);
        del.setPadding(10,0,10,0);
//        del.setLayoutParams(lp6);
//        tableRow.addView(srno);
        tableRow.addView(product);
        tableRow.addView(packagee);
        tableRow.addView(quantity);
        tableRow.addView(cost);
        tableRow.addView(del);
        tl.addView(tableRow);
        for (i = 0; i < localcart.size(); i = i + 1) {
            TableRow tr = new TableRow(getApplicationContext());
            tr.setBackgroundColor(Color.parseColor("#ffffff"));
            tr.setMinimumHeight(150);
//            tr.setLayoutParams(tableLayout);
//            tr.setPadding(10, 10, 10, 10);
            tr.setMinimumHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, getResources().getDisplayMetrics()));
//            tr.setWeightSum(21);
//            TableRow.LayoutParams lp7 = new TableRow.LayoutParams(0, 100, 1);

//            TextView tv1 = new TextView(getApplicationContext());
//            tv1.setText(Integer.toString(i+1));
//            tv1.setHeight(150);
//            tv1.setTextSize(18);
//            tv1.setGravity(Gravity.CENTER);
//            tv1.setTextColor(Color.BLACK);
//            tv1.setBackgroundResource(R.drawable.tablecell);

//            tv1.setLayoutParams(lp1);
            TextView tv2 = new TextView(getApplicationContext());
            tv2.setText(localcart.get(i).getProduct_name());
            tv2.setHeight(150);
            tv2.setTextSize(18);
            tv2.setGravity(Gravity.CENTER);
            tv2.setTextColor(Color.BLACK);
            tv2.setBackgroundResource(R.drawable.tablecell);
//            tv2.setLayoutParams(lp2);
            TextView tv3 = new TextView(getApplicationContext());
            tv3.setText(Integer.toString(localcart.get(i).getProduct_package()) + " gms");
            tv3.setHeight(150);
            tv3.setTextSize(18);
            tv3.setGravity(Gravity.CENTER);
            tv3.setTextColor(Color.BLACK);
            tv3.setBackgroundResource(R.drawable.tablecell);
//            tv3.setLayoutParams(lp3);
            TextView tv4 = new TextView(getApplicationContext());
            tv4.setText(Integer.toString(localcart.get(i).getProduct_quantity()));
            tv4.setHeight(150);
            tv4.setTextSize(18);
            tv4.setGravity(Gravity.CENTER);
            tv4.setTextColor(Color.BLACK);
            tv4.setBackgroundResource(R.drawable.tablecell);
//            tv4.setLayoutParams(lp4);
            TextView tv5 = new TextView(getApplicationContext());
            tv5.setText("Rs." + Float.toString(localcart.get(i).getProduct_cost()));
            tv5.setHeight(150);
            tv5.setTextSize(18);
            tv5.setGravity(Gravity.CENTER);
            tv5.setTextColor(Color.BLACK);
            tv5.setBackgroundResource(R.drawable.tablecell);
//            tv5.setLayoutParams(lp5);
            b[i] = new ImageButton(getApplicationContext());
            b[i].setMinimumHeight(150);
//            b[i].setMaxWidth(20);
//            b[i].setMaxHeight(20);
//            b[i].setMinimumWidth(20);
//            b[i].setMinimumHeight(20);
            b[i].setBackgroundResource(R.drawable.tablecell);
//            b[i].setBackgroundColor(Color.WHITE);
            b[i].setImageResource(R.drawable.delete);
            b[i].setOnClickListener(handleOnClick(b[i], i));
            b[i].setPadding(10,0,10,0);
//            b[i].setLayoutParams(lp6);
//            tr.addView(tv1);
            tr.addView(tv2);
            tr.addView(tv3);
            tr.addView(tv4);
            tr.addView(tv5);
            tr.addView(b[i], 50, 150);
            tl.addView(tr);
        }
        for (i = 0; i < localcart.size(); i = i + 1) {
            totalcost = localcart.get(i).getProduct_cost() + totalcost;
        }
        total_cost = Float.toString(totalcost);
        total.setText(total_cost);
    }

    View.OnClickListener handleOnClick(final ImageButton button, final int k) {
        return new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Im called");
                localcart.remove(k);
                showcart();
            }
        };
    }

    @Override
    public void onBackPressed() {
        Intent intentt = new Intent(getApplicationContext(), Categories.class);
        Gson gson = new Gson();
        json = gson.toJson(localcart);
        intentt.putExtra("localcart", json);
        startActivityForResult(intentt, 0);
//        tl.removeAllViews();
    }

    public void placeorder(View view) {
        Intent intent = new Intent(getApplicationContext(), CustomerDetails.class);
        Gson gson = new Gson();
        json = gson.toJson(localcart);
        intent.putExtra("localcart", json);
        intent.putExtra("totalcost", total_cost);
        System.out.println("misc in cart " + excost);
        intent.putExtra("excost", Integer.toString(excost));
        startActivity(intent);
    }
}