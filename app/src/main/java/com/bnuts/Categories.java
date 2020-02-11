package com.bnuts;

import android.content.Intent;
import android.os.Bundle;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class Categories extends AppCompatActivity {

//    LinearLayout show, lv6, lv7, lv8, lv9, lv10, lv11, lv12;
//    ExpandableRelativeLayout qt1, qt2, qt3, qt4, qt5, qt6, qt7, qt8, qt9, qt10, qt11, qt12, showww;
//    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12;
//    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10, iv11, iv12;
    Toolbar toolbar;
    public int j = 1;
    Gson gson = new Gson();
    public List<LocalCart> localcart = new ArrayList<>();
    String json = null;
//    String x = null;
//    Spinner spinner1a, spinner1b, spinner2a, spinner2b, spinner3a, spinner3b, spinner4a, spinner4b, spinner5a, spinner5b, spinner6a, spinner6b, spinner7a, spinner7b, spinner8a, spinner8b, spinner9a, spinner9b, spinner10a, spinner10b, spinner11a, spinner11b, spinner12a, spinner12b;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.viewpager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        tabLayout = findViewById(R.id.tabs);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


//        spinner1a = findViewById(R.id.spinner1a);
//        ArrayAdapter<CharSequence> adapter1a = ArrayAdapter.createFromResource(this, R.array.grams, android.R.layout.simple_spinner_item);
//        adapter1a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner1a.setAdapter(adapter1a);
//        spinner1a.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner1b = findViewById(R.id.spinner1b);
//        ArrayAdapter<CharSequence> adapter1b = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
//        adapter1b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner1b.setAdapter(adapter1b);
//        spinner1b.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner2a = findViewById(R.id.spinner2a);
//        ArrayAdapter<CharSequence> adapter2a = ArrayAdapter.createFromResource(this, R.array.grams, android.R.layout.simple_spinner_item);
//        adapter2a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner2a.setAdapter(adapter2a);
//        spinner2a.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner2b = findViewById(R.id.spinner2b);
//        ArrayAdapter<CharSequence> adapter2b = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
//        adapter2b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner2b.setAdapter(adapter2b);
//        spinner2b.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner3a = findViewById(R.id.spinner3a);
//        ArrayAdapter<CharSequence> adapter3a = ArrayAdapter.createFromResource(this, R.array.grams, android.R.layout.simple_spinner_item);
//        adapter3a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner3a.setAdapter(adapter3a);
//        spinner3a.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner3b = findViewById(R.id.spinner3b);
//        ArrayAdapter<CharSequence> adapter3b = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
//        adapter3b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner3b.setAdapter(adapter3b);
//        spinner3b.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner4a = findViewById(R.id.spinner4a);
//        ArrayAdapter<CharSequence> adapter4a = ArrayAdapter.createFromResource(this, R.array.grams, android.R.layout.simple_spinner_item);
//        adapter4a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner4a.setAdapter(adapter4a);
//        spinner4a.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner4b = findViewById(R.id.spinner4b);
//        ArrayAdapter<CharSequence> adapter4b = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
//        adapter4b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner4b.setAdapter(adapter4b);
//        spinner4b.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner5a = findViewById(R.id.spinner5a);
//        ArrayAdapter<CharSequence> adapter5a = ArrayAdapter.createFromResource(this, R.array.grams, android.R.layout.simple_spinner_item);
//        adapter5a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner5a.setAdapter(adapter5a);
//        spinner5a.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner5b = findViewById(R.id.spinner5b);
//        ArrayAdapter<CharSequence> adapter5b = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
//        adapter5b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner5b.setAdapter(adapter5b);
//        spinner5b.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner6a = findViewById(R.id.spinner6a);
//        ArrayAdapter<CharSequence> adapter6a = ArrayAdapter.createFromResource(this, R.array.grams, android.R.layout.simple_spinner_item);
//        adapter6a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner6a.setAdapter(adapter6a);
//        spinner6a.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner6b = findViewById(R.id.spinner6b);
//        ArrayAdapter<CharSequence> adapter6b = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
//        adapter6b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner6b.setAdapter(adapter6b);
//        spinner6b.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner7a = findViewById(R.id.spinner7a);
//        ArrayAdapter<CharSequence> adapter7a = ArrayAdapter.createFromResource(this, R.array.grams, android.R.layout.simple_spinner_item);
//        adapter7a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner7a.setAdapter(adapter7a);
//        spinner7a.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner7b = findViewById(R.id.spinner7b);
//        ArrayAdapter<CharSequence> adapter7b = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
//        adapter7b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner7b.setAdapter(adapter7b);
//        spinner7b.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner8a = findViewById(R.id.spinner8a);
//        ArrayAdapter<CharSequence> adapter8a = ArrayAdapter.createFromResource(this, R.array.grams, android.R.layout.simple_spinner_item);
//        adapter8a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner8a.setAdapter(adapter8a);
//        spinner8a.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner8b = findViewById(R.id.spinner8b);
//        ArrayAdapter<CharSequence> adapter8b = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
//        adapter8b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner8b.setAdapter(adapter8b);
//        spinner8b.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner9a = findViewById(R.id.spinner9a);
//        ArrayAdapter<CharSequence> adapter9a = ArrayAdapter.createFromResource(this, R.array.grams, android.R.layout.simple_spinner_item);
//        adapter9a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner9a.setAdapter(adapter9a);
//        spinner9a.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner9b = findViewById(R.id.spinner9b);
//        ArrayAdapter<CharSequence> adapter9b = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
//        adapter9b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner9b.setAdapter(adapter9b);
//        spinner9b.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner10a = findViewById(R.id.spinner10a);
//        ArrayAdapter<CharSequence> adapter10a = ArrayAdapter.createFromResource(this, R.array.grams, android.R.layout.simple_spinner_item);
//        adapter10a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner10a.setAdapter(adapter10a);
//        spinner10a.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner10b = findViewById(R.id.spinner10b);
//        ArrayAdapter<CharSequence> adapter10b = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
//        adapter10b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner10b.setAdapter(adapter10b);
//        spinner10b.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner11a = findViewById(R.id.spinner11a);
//        ArrayAdapter<CharSequence> adapter11a = ArrayAdapter.createFromResource(this, R.array.grams, android.R.layout.simple_spinner_item);
//        adapter11a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner11a.setAdapter(adapter11a);
//        spinner11a.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner11b = findViewById(R.id.spinner11b);
//        ArrayAdapter<CharSequence> adapter11b = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
//        adapter11b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner11b.setAdapter(adapter11b);
//        spinner11b.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner12a = findViewById(R.id.spinner12a);
//        ArrayAdapter<CharSequence> adapter12a = ArrayAdapter.createFromResource(this, R.array.grams, android.R.layout.simple_spinner_item);
//        adapter12a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner12a.setAdapter(adapter12a);
//        spinner12a.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
//
//        spinner12b = findViewById(R.id.spinner12b);
//        ArrayAdapter<CharSequence> adapter12b = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
//        adapter12b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner12b.setAdapter(adapter12b);
//        spinner12b.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);

//        x = getIntent().getStringExtra("key");
        json = getIntent().getStringExtra("localcart");
        if (json != null) {
            Type collectionType = new TypeToken<List<LocalCart>>() {}.getType();
            localcart = gson.fromJson(json, collectionType);
        }
        else{
            System.out.println("youre fucked");
        }

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        show = findViewById(R.id.show);
//        lv6 = findViewById(R.id.product6);
//        lv7 = findViewById(R.id.product7);
//        lv8 = findViewById(R.id.product8);
//        lv9 = findViewById(R.id.product9);
//        lv10 = findViewById(R.id.product10);
//        lv11 = findViewById(R.id.product11);
//        lv12 = findViewById(R.id.product12);
//
//        if(x.equals("6") || x.equals("5"))
//        {
//            if(x.equals("5"))
//            {
//                lv6.setVisibility(View.INVISIBLE);
//            }
//            lv7.setVisibility(View.INVISIBLE);
//            lv8.setVisibility(View.INVISIBLE);
//            lv9.setVisibility(View.INVISIBLE);
//            lv10.setVisibility(View.INVISIBLE);
//            lv11.setVisibility(View.INVISIBLE);
//            lv12.setVisibility(View.INVISIBLE);
//        }
//        qt1 = findViewById(R.id.quantity1);
//        qt1.toggle();
//        qt2 = findViewById(R.id.quantity2);
//        qt2.toggle();
//        qt3 = findViewById(R.id.quantity3);
//        qt3.toggle();
//        qt4 = findViewById(R.id.quantity4);
//        qt4.toggle();
//        qt5 = findViewById(R.id.quantity5);
//        qt5.toggle();
//        qt6 = findViewById(R.id.quantity6);
//        qt6.toggle();
//        qt7 = findViewById(R.id.quantity7);
//        qt7.toggle();
//        qt8 = findViewById(R.id.quantity8);
//        qt8.toggle();
//        qt9 = findViewById(R.id.quantity9);
//        qt9.toggle();
//        qt10 = findViewById(R.id.quantity10);
//        qt10.toggle();
//        qt11 = findViewById(R.id.quantity11);
//        qt11.toggle();
//        qt12 = findViewById(R.id.quantity12);
//        qt12.toggle();
//
//        tv1 = findViewById(R.id.text1);
//        tv2 = findViewById(R.id.text2);
//        tv3 = findViewById(R.id.text3);
//        tv4 = findViewById(R.id.text4);
//        tv5 = findViewById(R.id.text5);
//        tv6 = findViewById(R.id.text6);
//        tv7 = findViewById(R.id.text7);
//        tv8 = findViewById(R.id.text8);
//        tv9 = findViewById(R.id.text9);
//        tv10 = findViewById(R.id.text10);
//        tv11 = findViewById(R.id.text11);
//        tv12 = findViewById(R.id.text12);
//
//        iv1 = findViewById(R.id.image1);
//        iv2 = findViewById(R.id.image2);
//        iv3 = findViewById(R.id.image3);
//        iv4 = findViewById(R.id.image4);
//        iv5 = findViewById(R.id.image5);
//        iv6 = findViewById(R.id.image6);
//        iv7 = findViewById(R.id.image7);
//        iv8 = findViewById(R.id.image8);
//        iv9 = findViewById(R.id.image9);
//        iv10 = findViewById(R.id.image10);
//        iv11 = findViewById(R.id.image11);
//        iv12 = findViewById(R.id.image12);

//        if(x.equals("6"))
//        {
//            tv1.setText("Cranberries");
//            tv2.setText("Cherries");
//            tv3.setText("Strawberries");
//            tv4.setText("Stuff Almonds");
//            tv5.setText("Stuff Walnuts");
//            tv6.setText("Assorted Berries");
//            iv1.setBackgroundResource(R.drawable.cranberries);
//            iv2.setBackgroundResource(R.drawable.cherries);
//            iv3.setBackgroundResource(R.drawable.strawberries);
//            iv4.setBackgroundResource(R.drawable.cranberries);
//            iv5.setBackgroundResource(R.drawable.cranberries);
//            iv6.setBackgroundResource(R.drawable.cranberries);
//        }
//        else if(x.equals("12"))
//        {
//            tv1.setText("Saffron");
//            tv2.setText("Blue Berries");
//            tv3.setText("Brazil Nuts");
//            tv4.setText("Hazel Nuts");
//            tv5.setText("Prunes");
//            tv6.setText("Cashews");
//            tv7.setText("Pecan Nuts");
//            tv8.setText("Macadamia");
//            tv9.setText("Apricots");
//            tv10.setText("Walnuts");
//            tv11.setText("Roasted Almonds");
//            tv12.setText("Roasted Cashews");
//            iv1.setBackgroundResource(R.drawable.cranberries);
//            iv2.setBackgroundResource(R.drawable.cranberries);
//            iv3.setBackgroundResource(R.drawable.cranberries);
//            iv4.setBackgroundResource(R.drawable.cranberries);
//            iv5.setBackgroundResource(R.drawable.cranberries);
//            iv6.setBackgroundResource(R.drawable.cranberries);
//            iv7.setBackgroundResource(R.drawable.cranberries);
//            iv8.setBackgroundResource(R.drawable.cranberries);
//            iv9.setBackgroundResource(R.drawable.cranberries);
//            iv10.setBackgroundResource(R.drawable.cranberries);
//            iv11.setBackgroundResource(R.drawable.cranberries);
//            iv12.setBackgroundResource(R.drawable.cranberries);
//        }
//        else if(x.equals("5"))
//        {
//            tv1.setText("Honey Nuts");
//            tv2.setText("Almonds");
//            tv3.setText("Pistachio Nuts");
//            tv4.setText("Figs");
//            tv5.setText("Chocolate Dates");
//            iv1.setBackgroundResource(R.drawable.cranberries);
//            iv2.setBackgroundResource(R.drawable.cranberries);
//            iv3.setBackgroundResource(R.drawable.cranberries);
//            iv4.setBackgroundResource(R.drawable.cranberries);
//            iv5.setBackgroundResource(R.drawable.cranberries);
//        }
    }

//    public void showquantity1(View view) {
//        qt1.toggle();
//    }
//
//    public void showquantity2(View view) {
//        qt2.toggle();
//    }
//
//    public void showquantity3(View view) {
//        qt3.toggle();
//    }
//
//    public void showquantity4(View view) {
//        qt4.toggle();
//    }
//
//    public void showquantity5(View view) {
//        qt5.toggle();
//    }
//
//    public void showquantity6(View view) {
//        qt6.toggle();
//    }
//
//    public void showquantity7(View view) {
//        qt7.toggle();
//    }
//
//    public void showquantity8(View view) {
//        qt8.toggle();
//    }
//
//    public void showquantity9(View view) {
//        qt9.toggle();
//    }
//
//    public void showquantity10(View view) {
//        qt10.toggle();
//    }
//
//    public void showquantity11(View view) {
//        qt11.toggle();
//    }
//
//    public void showquantity12(View view) {
//        qt12.toggle();
//    }
//
//    public void atc1(View view) {
//        String product_name = (String) tv1.getText();
//        abc = spinner1a.getSelectedItem().toString().split("gms");
//        int product_quantity = Integer.parseInt(abc[0]);
//        int product_cost = Integer.parseInt(spinner1b.getSelectedItem().toString());
//        localcart.add(new LocalCart(j, product_name, j, product_quantity, product_cost));
//        j++;
//        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
//        qt1.toggle();
//    }
//
//    public void atc2(View view) {
//        String product_name = (String) tv2.getText();
//        abc = spinner2a.getSelectedItem().toString().split("gms");
//        int product_quantity = Integer.parseInt(abc[0]);
//        int product_cost = Integer.parseInt(spinner2b.getSelectedItem().toString());
//        localcart.add(new LocalCart(j, product_name, j, product_quantity, product_cost));
//        j++;
//        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
//        qt2.toggle();
//    }
//
//    public void atc3(View view) {
//        String product_name = (String) tv3.getText();
//        abc = spinner3a.getSelectedItem().toString().split("gms");
//        int product_quantity = Integer.parseInt(abc[0]);
//        int product_cost = Integer.parseInt(spinner3b.getSelectedItem().toString());
//        localcart.add(new LocalCart(j, product_name, j, product_quantity, product_cost));
//        j++;
//        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
//        qt3.toggle();
//    }
//
//    public void atc4(View view) {
//        String product_name = (String) tv4.getText();
//        abc = spinner4a.getSelectedItem().toString().split("gms");
//        int product_quantity = Integer.parseInt(abc[0]);
//        int product_cost = Integer.parseInt(spinner4b.getSelectedItem().toString());
//        localcart.add(new LocalCart(j, product_name, j, product_quantity, product_cost));
//        j++;
//        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
//        qt4.toggle();
//    }
//
//    public void atc5(View view) {
//        String product_name = (String) tv5.getText();
//        abc = spinner5a.getSelectedItem().toString().split("gms");
//        int product_quantity = Integer.parseInt(abc[0]);
//        int product_cost = Integer.parseInt(spinner5b.getSelectedItem().toString());
//        localcart.add(new LocalCart(j, product_name, j, product_quantity, product_cost));
//        j++;
//        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
//        qt5.toggle();
//    }
//
//    public void atc6(View view) {
//        String product_name = (String) tv6.getText();
//        abc = spinner6a.getSelectedItem().toString().split("gms");
//        int product_quantity = Integer.parseInt(abc[0]);
//        int product_cost = Integer.parseInt(spinner6b.getSelectedItem().toString());
//        localcart.add(new LocalCart(j, product_name, j, product_quantity, product_cost));
//        j++;
//        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
//        qt6.toggle();
//    }
//
//    public void atc7(View view) {
//        String product_name = (String) tv7.getText();
//        abc = spinner7a.getSelectedItem().toString().split("gms");
//        int product_quantity = Integer.parseInt(abc[0]);
//        int product_cost = Integer.parseInt(spinner7b.getSelectedItem().toString());
//        localcart.add(new LocalCart(j, product_name, j, product_quantity, product_cost));
//        j++;
//        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
//        qt7.toggle();
//    }
//
//    public void atc8(View view) {
//        String product_name = (String) tv8.getText();
//        abc = spinner8a.getSelectedItem().toString().split("gms");
//        int product_quantity = Integer.parseInt(abc[0]);
//        int product_cost = Integer.parseInt(spinner8b.getSelectedItem().toString());
//        localcart.add(new LocalCart(j, product_name, j, product_quantity, product_cost));
//        j++;
//        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
//        qt8.toggle();
//    }
//
//    public void atc9(View view) {
//        String product_name = (String) tv9.getText();
//        abc = spinner9a.getSelectedItem().toString().split("gms");
//        int product_quantity = Integer.parseInt(abc[0]);
//        int product_cost = Integer.parseInt(spinner9b.getSelectedItem().toString());
//        localcart.add(new LocalCart(j, product_name, j, product_quantity, product_cost));
//        j++;
//        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
//        qt9.toggle();
//    }
//
//    public void atc10(View view) {
//        String product_name = (String) tv10.getText();
//        abc = spinner10a.getSelectedItem().toString().split("gms");
//        int product_quantity = Integer.parseInt(abc[0]);
//        int product_cost = Integer.parseInt(spinner10b.getSelectedItem().toString());
//        localcart.add(new LocalCart(j, product_name, j, product_quantity, product_cost));
//        j++;
//        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
//        qt10.toggle();
//    }
//
//    public void atc11(View view) {
//        String product_name = (String) tv11.getText();
//        abc = spinner11a.getSelectedItem().toString().split("gms");
//        int product_quantity = Integer.parseInt(abc[0]);
//        int product_cost = Integer.parseInt(spinner11b.getSelectedItem().toString());
//        localcart.add(new LocalCart(j, product_name, j, product_quantity, product_cost));
//        j++;
//        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
//        qt11.toggle();
//    }
//
//    public void atc12(View view) {
//        String product_name = (String) tv12.getText();
//        abc = spinner12a.getSelectedItem().toString().split("gms");
//        int product_quantity = Integer.parseInt(abc[0]);
//        int product_cost = Integer.parseInt(spinner12b.getSelectedItem().toString());
//        localcart.add(new LocalCart(j, product_name, j, product_quantity, product_cost));
//        j++;
//        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();
//        qt12.toggle();
//    }

    public void cart(View view) {
        Intent intent = new Intent(getApplicationContext(), Cart.class);
        String jsonnn = gson.toJson(localcart);
        for(int i = 0 ; i < localcart.size(); i++){
            System.out.println(localcart.get(i).getProduct_no());
            System.out.println(localcart.get(i).getProduct_name());
            System.out.println(localcart.get(i).getProduct_quantity());
            System.out.println(localcart.get(i).getProduct_package());
            System.out.println(localcart.get(i).getProduct_cost());
        }
        intent.putExtra("localcart", jsonnn);
        startActivity(intent);
    }

//    @Override
//    public void onBackPressed() {
//        Intent intentt = new Intent(getApplicationContext(), ProductsCategory.class);
//        String jsonn = gson.toJson(localcart);
//        intentt.putExtra("localcart", jsonn);
//        startActivity(intentt);
//        finish();
//    }

//    public void goToCategoryA(View view) {
//        Intent intent = new Intent(getApplicationContext(), Categories.class);
//        intent.putExtra("key","6");
//        intent.putExtra("localcart", json);
//        startActivity(intent);
//        finish();
//    }
//
//    public void goToCategoryB(View view) {
//        Intent intent = new Intent(getApplicationContext(), Categories.class);
//        intent.putExtra("key","12");
//        intent.putExtra("localcart", json);
//        startActivity(intent);
//        finish();
//    }
//
//    public void goToCategoryC(View view) {
//        Intent intent = new Intent(getApplicationContext(), Categories.class);
//        intent.putExtra("key","5");
//        intent.putExtra("localcart", json);
//        startActivity(intent);
//        finish();
//    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i){
                case 0 :
                    DivineFragment divineFragment = new DivineFragment();
                    return divineFragment;
                case 1 :
                    ClassicsFragment classicsFragment = new ClassicsFragment();
                    return classicsFragment;
                case 2 :
                    DelightFragment delightFragment = new DelightFragment();
                    return delightFragment;
                default :
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}