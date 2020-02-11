package com.bnuts;


import android.app.AlertDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
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


/**
 * A simple {@link Fragment} subclass.
 */
public class DivineFragment extends Fragment {

    View view;
    String pkg[], cst[];
    String product_name;
    int product_package, product_quantity;
    float product_cost;
    ExpandableRelativeLayout quantity1A, quantity2A, quantity3A, quantity4A, quantity5A, quantity6A, quantity7A, quantity8A, quantity9A, quantity10A, quantity11A, quantity12A, quantity13A;
    Spinner spinner1aA, spinner1bA, spinner2aA, spinner2bA, spinner3aA, spinner3bA, spinner4aA, spinner4bA, spinner5aA, spinner5bA, spinner6aA, spinner6bA, spinner7aA, spinner7bA, spinner8aA, spinner8bA, spinner9aA, spinner9bA, spinner10aA, spinner10bA, spinner11aA, spinner11bA, spinner12aA, spinner12bA, spinner13aA, spinner13bA;
    LinearLayout product1A, product2A, product3A, product4A, product5A, product6A, product7A, product8A, product9A, product10A, product11A, product12A, product13A;
    Button atc1A, atc2A, atc3A, atc4A, atc5A, atc6A, atc7A, atc8A, atc9A, atc10A, atc11A, atc12A, atc13A;
    ImageView down1A, down2A, down3A, down4A, down5A, down6A, down7A, down8A, down9A, down10A, down11A, down12A, down13A;
    TextView cost1A, cost2A, cost3A, cost4A, cost5A, cost6A, cost7A, cost8A, cost9A, cost10A, cost11A, cost12A, cost13A;
    public Categories categories;
    EditText pkg1A, pkg2A, pkg3A, pkg4A, pkg5A, pkg6A, pkg7A, pkg8A, pkg9A, pkg10A, pkg11A, pkg12A, pkg13A;
    AlertDialog alertDialog;

    public DivineFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_divine, container, false);
        categories = (Categories)getActivity();

//        spinner1aA = view.findViewById(R.id.spinner1aA);
//        final ArrayAdapter<CharSequence> adapter1aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter1aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner1aA.setAdapter(adapter1aA);

        spinner1bA = view.findViewById(R.id.spinner1bA);
        final ArrayAdapter<CharSequence> adapter1bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter1bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1bA.setAdapter(adapter1bA);

//        spinner2aA = view.findViewById(R.id.spinner2aA);
//        final ArrayAdapter<CharSequence> adapter2aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter2aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner2aA.setAdapter(adapter2aA);

        spinner2bA = view.findViewById(R.id.spinner2bA);
        final ArrayAdapter<CharSequence> adapter2bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter2bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2bA.setAdapter(adapter2bA);

//        spinner3aA = view.findViewById(R.id.spinner3aA);
//        final ArrayAdapter<CharSequence> adapter3aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter3aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner3aA.setAdapter(adapter3aA);

        spinner3bA = view.findViewById(R.id.spinner3bA);
        final ArrayAdapter<CharSequence> adapter3bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter3bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3bA.setAdapter(adapter3bA);

//        spinner4aA = view.findViewById(R.id.spinner4aA);
//        final ArrayAdapter<CharSequence> adapter4aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter4aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner4aA.setAdapter(adapter4aA);

        spinner4bA = view.findViewById(R.id.spinner4bA);
        final ArrayAdapter<CharSequence> adapter4bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter4bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4bA.setAdapter(adapter4bA);

//        spinner5aA = view.findViewById(R.id.spinner5aA);
//        final ArrayAdapter<CharSequence> adapter5aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter5aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner5aA.setAdapter(adapter5aA);

        spinner5bA = view.findViewById(R.id.spinner5bA);
        final ArrayAdapter<CharSequence> adapter5bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter5bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5bA.setAdapter(adapter5bA);

//        spinner6aA = view.findViewById(R.id.spinner6aA);
//        final ArrayAdapter<CharSequence> adapter6aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter6aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner6aA.setAdapter(adapter6aA);

        spinner6bA = view.findViewById(R.id.spinner6bA);
        final ArrayAdapter<CharSequence> adapter6bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter6bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6bA.setAdapter(adapter6bA);

//        spinner7aA = view.findViewById(R.id.spinner7aA);
//        final ArrayAdapter<CharSequence> adapter7aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter7aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner7aA.setAdapter(adapter7aA);

        spinner7bA = view.findViewById(R.id.spinner7bA);
        final ArrayAdapter<CharSequence> adapter7bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter7bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7bA.setAdapter(adapter7bA);

//        spinner8aA = view.findViewById(R.id.spinner8aA);
//        final ArrayAdapter<CharSequence> adapter8aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter8aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner8aA.setAdapter(adapter8aA);

        spinner8bA = view.findViewById(R.id.spinner8bA);
        final ArrayAdapter<CharSequence> adapter8bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter8bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8bA.setAdapter(adapter8bA);

//        spinner9aA = view.findViewById(R.id.spinner9aA);
//        final ArrayAdapter<CharSequence> adapter9aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter9aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner9aA.setAdapter(adapter9aA);

        spinner9bA = view.findViewById(R.id.spinner9bA);
        final ArrayAdapter<CharSequence> adapter9bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter9bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9bA.setAdapter(adapter9bA);

//        spinner10aA = view.findViewById(R.id.spinner10aA);
//        final ArrayAdapter<CharSequence> adapter10aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter10aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner10aA.setAdapter(adapter10aA);

        spinner10bA = view.findViewById(R.id.spinner10bA);
        final ArrayAdapter<CharSequence> adapter10bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter10bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner10bA.setAdapter(adapter10bA);

//        spinner11aA = view.findViewById(R.id.spinner11aA);
//        final ArrayAdapter<CharSequence> adapter11aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter11aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner11aA.setAdapter(adapter11aA);

        spinner11bA = view.findViewById(R.id.spinner11bA);
        final ArrayAdapter<CharSequence> adapter11bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter11bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner11bA.setAdapter(adapter11bA);

//        spinner12aA = view.findViewById(R.id.spinner12aA);
//        final ArrayAdapter<CharSequence> adapter12aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter12aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner12aA.setAdapter(adapter12aA);

        spinner12bA = view.findViewById(R.id.spinner12bA);
        final ArrayAdapter<CharSequence> adapter12bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter12bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner12bA.setAdapter(adapter12bA);

//        spinner13aA = view.findViewById(R.id.spinner13aA);
//        final ArrayAdapter<CharSequence> adapter13aA = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter13aA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner13aA.setAdapter(adapter13aA);

        spinner13bA = view.findViewById(R.id.spinner13bA);
        final ArrayAdapter<CharSequence> adapter13bA = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter13bA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner13bA.setAdapter(adapter13bA);

        pkg1A = view.findViewById(R.id.pkg1A);
        product1A = view.findViewById(R.id.product1A);
        quantity1A = view.findViewById(R.id.quantity1A);
        down1A = view.findViewById(R.id.down1A);
        down1A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost1A = view.findViewById(R.id.cost1A);
        quantity1A.toggle();
        product1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity1A.toggle();
                if(down1A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down1A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down1A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down1A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg1A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg1A.getText().toString()) * (spinner1bA.getSelectedItemPosition() + 1)) / 100;
                    cost1A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost1A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg1A.getText().toString()) * (spinner1bA.getSelectedItemPosition() + 1)) / 100;
                    cost1A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost1A.setText("Rs" + cost);
                }
            }
        });
//        spinner1aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 120 * (position+1) * (spinner1bA.getSelectedItemPosition()+1);
//                cost1A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner1bA.getSelectedItemPosition()) == 0 && spinner1aA.getSelectedItemPosition() == 0){
//                    int cost = 120;
//                    cost1A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 120 * (spinner1aA.getSelectedItemPosition()+1);
//                    cost1A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner1bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 120 * (position+1) * (float)(Integer.parseInt(pkg1A.getText().toString())/100);
                cost1A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 120 * (float)(Integer.parseInt(pkg1A.getText().toString())/100);
                cost1A.setText("Rs" + cost);
            }
        });
        atc1A = view.findViewById(R.id.atc1A);
        atc1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Almond";
//                pkg = spinner1aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg1A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg1A.getText().toString());
                product_quantity = Integer.parseInt(spinner1bA.getSelectedItem().toString());
                cst = cost1A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity1A.toggle();
                down1A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg1A.setText("100");
//                spinner1aA.setAdapter(adapter1aA);
                spinner1bA.setAdapter(adapter1bA);
            }
        });

        pkg2A = view.findViewById(R.id.pkg2A);
        product2A = view.findViewById(R.id.product2A);
        quantity2A = view.findViewById(R.id.quantity2A);
        down2A = view.findViewById(R.id.down2A);
        down2A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost2A = view.findViewById(R.id.cost2A);
        quantity2A.toggle();
        product2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity2A.toggle();
                if(down2A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down2A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down2A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down2A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg2A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg2A.getText().toString()) * (spinner2bA.getSelectedItemPosition() + 1)) / 100;
                    cost2A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost2A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg2A.getText().toString()) * (spinner2bA.getSelectedItemPosition() + 1)) / 100;
                    cost2A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost2A.setText("Rs" + cost);
                }
            }
        });
//        spinner2aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 140 * (position+1) * (spinner2bA.getSelectedItemPosition()+1);
//                cost2A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner2bA.getSelectedItemPosition()) == 0 && spinner2aA.getSelectedItemPosition() == 0){
//                    int cost = 140;
//                    cost2A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 140 * (spinner2aA.getSelectedItemPosition()+1);
//                    cost2A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner2bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 140 * (position+1) * (float)(Integer.parseInt(pkg2A.getText().toString())/100);
                cost2A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 140 * (float)(Integer.parseInt(pkg2A.getText().toString())/100);
                cost2A.setText("Rs" + cost);
            }
        });
        atc2A = view.findViewById(R.id.atc2A);
        atc2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Cashew W240";
//                pkg = spinner2aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg2A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg2A.getText().toString());
                product_quantity = Integer.parseInt(spinner2bA.getSelectedItem().toString());
                cst = cost2A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cherries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity2A.toggle();
                down2A.setImageDrawable(getResources().getDrawable(R.drawable.down));
//                spinner2aA.setAdapter(adapter2aA);
                pkg2A.setText("100");
                spinner2bA.setAdapter(adapter2bA);
            }
        });

        pkg3A = view.findViewById(R.id.pkg3A);
        product3A = view.findViewById(R.id.product3A);
        quantity3A = view.findViewById(R.id.quantity3A);
        down3A = view.findViewById(R.id.down3A);
        down3A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost3A = view.findViewById(R.id.cost3A);
        quantity3A.toggle();
        product3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity3A.toggle();
                if(down3A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down3A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down3A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down3A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg3A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg3A.getText().toString()) * (spinner3bA.getSelectedItemPosition() + 1)) / 100;
                    cost3A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost3A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg3A.getText().toString()) * (spinner3bA.getSelectedItemPosition() + 1)) / 100;
                    cost3A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost3A.setText("Rs" + cost);
                }
            }
        });
//        spinner3aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 120 * (position+1) * (spinner3bA.getSelectedItemPosition()+1);
//                cost3A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner3bA.getSelectedItemPosition()) == 0 && spinner3aA.getSelectedItemPosition() == 0){
//                    int cost = 120;
//                    cost3A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 120 * (spinner3aA.getSelectedItemPosition()+1);
//                    cost3A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner3bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 120 * (position+1) * (float)(Integer.parseInt(pkg3A.getText().toString())/100);
                cost3A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 120 * (float)(Integer.parseInt(pkg3A.getText().toString())/100);
                cost3A.setText("Rs" + cost);
            }
        });
        atc3A = view.findViewById(R.id.atc3A);
        atc3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Cashew W320";
//                pkg = spinner3aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg3A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg3A.getText().toString());
                product_quantity = Integer.parseInt(spinner3bA.getSelectedItem().toString());
                cst = cost3A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.strawberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity3A.toggle();
                down3A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg3A.setText("100");
//                spinner3aA.setAdapter(adapter3aA);
                spinner3bA.setAdapter(adapter3bA);
            }
        });

        pkg4A = view.findViewById(R.id.pkg4A);
        product4A = view.findViewById(R.id.product4A);
        quantity4A = view.findViewById(R.id.quantity4A);
        down4A = view.findViewById(R.id.down4A);
        down4A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost4A = view.findViewById(R.id.cost4A);
        quantity4A.toggle();
        product4A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity4A.toggle();
                if(down4A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down4A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down4A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down4A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg4A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg4A.getText().toString()) * (spinner4bA.getSelectedItemPosition() + 1)) / 100;
                    cost4A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost4A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg4A.getText().toString()) * (spinner4bA.getSelectedItemPosition() + 1)) / 100;
                    cost4A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost4A.setText("Rs" + cost);
                }
            }
        });
//        spinner4aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 160 * (position+1) * (spinner4bA.getSelectedItemPosition()+1);
//                cost4A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner4bA.getSelectedItemPosition()) == 0 && spinner4aA.getSelectedItemPosition() == 0){
//                    int cost = 160;
//                    cost4A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 160 * (spinner4aA.getSelectedItemPosition()+1);
//                    cost4A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner4bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 160 * (position+1) * (float)(Integer.parseInt(pkg4A.getText().toString())/100);
                cost4A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 160 * (float)(Integer.parseInt(pkg4A.getText().toString())/100);
                cost4A.setText("Rs" + cost);
            }
        });
        atc4A = view.findViewById(R.id.atc4A);
        atc4A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Cashew W210";
//                pkg = spinner4aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg4A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg4A.getText().toString());
                product_quantity = Integer.parseInt(spinner4bA.getSelectedItem().toString());
                cst = cost4A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity4A.toggle();
                down4A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg4A.setText("100");
//                spinner4aA.setAdapter(adapter4aA);
                spinner4bA.setAdapter(adapter4bA);
            }
        });

        pkg5A = view.findViewById(R.id.pkg5A);
        product5A = view.findViewById(R.id.product5A);
        quantity5A = view.findViewById(R.id.quantity5A);
        down5A = view.findViewById(R.id.down5A);
        down5A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost5A = view.findViewById(R.id.cost5A);
        quantity5A.toggle();
        product5A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity5A.toggle();
                if(down5A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down5A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down5A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down5A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg5A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg5A.getText().toString()) * (spinner5bA.getSelectedItemPosition() + 1)) / 100;
                    cost5A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost5A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg5A.getText().toString()) * (spinner5bA.getSelectedItemPosition() + 1)) / 100;
                    cost5A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost5A.setText("Rs" + cost);
                }
            }
        });
//        spinner5aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 180 * (position+1) * (spinner5bA.getSelectedItemPosition()+1);
//                cost5A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner5bA.getSelectedItemPosition()) == 0 && spinner5aA.getSelectedItemPosition() == 0){
//                    int cost = 180;
//                    cost5A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 180 * (spinner5aA.getSelectedItemPosition()+1);
//                    cost5A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner5bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 180 * (position+1) * (float)(Integer.parseInt(pkg5A.getText().toString())/100);
                cost5A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 180 * (float)(Integer.parseInt(pkg5A.getText().toString())/100);
                cost5A.setText("Rs" + cost);
            }
        });
        atc5A = view.findViewById(R.id.atc5A);
        atc5A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Cashew W210 R&S";
//                pkg = spinner5aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg5A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg5A.getText().toString());
                product_quantity = Integer.parseInt(spinner5bA.getSelectedItem().toString());
                cst = cost5A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity5A.toggle();
                down5A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg5A.setText("100");
//                spinner5aA.setAdapter(adapter5aA);
                spinner5bA.setAdapter(adapter5bA);
            }
        });

        pkg6A = view.findViewById(R.id.pkg6A);
        product6A = view.findViewById(R.id.product6A);
        quantity6A = view.findViewById(R.id.quantity6A);
        down6A = view.findViewById(R.id.down6A);
        down6A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost6A = view.findViewById(R.id.cost6A);
        quantity6A.toggle();
        product6A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity6A.toggle();
                if(down6A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down6A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down6A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down6A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg6A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg6A.getText().toString()) * (spinner6bA.getSelectedItemPosition() + 1)) / 100;
                    cost6A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost6A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg6A.getText().toString()) * (spinner6bA.getSelectedItemPosition() + 1)) / 100;
                    cost6A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost6A.setText("Rs" + cost);
                }
            }
        });
//        spinner6aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 50 * (position+1) * (spinner6bA.getSelectedItemPosition()+1);
//                cost6A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner6bA.getSelectedItemPosition()) == 0 && spinner6aA.getSelectedItemPosition() == 0){
//                    int cost = 50;
//                    cost6A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 50 * (spinner6aA.getSelectedItemPosition()+1);
//                    cost6A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner6bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 50 * (position+1) * (float)(Integer.parseInt(pkg6A.getText().toString())/100);
                cost6A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 50 * (float)(Integer.parseInt(pkg6A.getText().toString())/100);
                cost6A.setText("Rs" + cost);
            }
        });
        atc6A = view.findViewById(R.id.atc6A);
        atc6A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Raisin Golden";
//                pkg = spinner6aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg6A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg6A.getText().toString());
                product_quantity = Integer.parseInt(spinner6bA.getSelectedItem().toString());
                cst = cost6A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity6A.toggle();
                down6A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg6A.setText("100");
//                spinner6aA.setAdapter(adapter6aA);
                spinner6bA.setAdapter(adapter6bA);
            }
        });

        pkg7A = view.findViewById(R.id.pkg7A);
        product7A = view.findViewById(R.id.product7A);
        quantity7A = view.findViewById(R.id.quantity7A);
        down7A = view.findViewById(R.id.down7A);
        down7A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost7A = view.findViewById(R.id.cost7A);
        quantity7A.toggle();
        product7A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity7A.toggle();
                if(down7A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down7A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down7A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down7A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg7A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg7A.getText().toString()) * (spinner7bA.getSelectedItemPosition() + 1)) / 100;
                    cost7A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost7A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg7A.getText().toString()) * (spinner7bA.getSelectedItemPosition() + 1)) / 100;
                    cost7A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost7A.setText("Rs" + cost);
                }
            }
        });
//        spinner7aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 250 * (position+1) * (spinner7bA.getSelectedItemPosition()+1);
//                cost7A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner7bA.getSelectedItemPosition()) == 0 && spinner7aA.getSelectedItemPosition() == 0){
//                    int cost = 250;
//                    cost7A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 250 * (spinner7aA.getSelectedItemPosition()+1);
//                    cost7A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner7bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 250 * (position+1) * (float)(Integer.parseInt(pkg7A.getText().toString())/100);
                cost7A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 250 * (float)(Integer.parseInt(pkg7A.getText().toString())/100);
                cost7A.setText("Rs" + cost);
            }
        });
        atc7A = view.findViewById(R.id.atc7A);
        atc7A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Figs";
//                pkg = spinner7aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg7A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg7A.getText().toString());
                product_quantity = Integer.parseInt(spinner7bA.getSelectedItem().toString());
                cst = cost7A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity7A.toggle();
                down7A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg7A.setText("100");
//                spinner7aA.setAdapter(adapter7aA);
                spinner7bA.setAdapter(adapter7bA);
            }
        });

        pkg8A = view.findViewById(R.id.pkg8A);
        product8A = view.findViewById(R.id.product8A);
        quantity8A = view.findViewById(R.id.quantity8A);
        down8A = view.findViewById(R.id.down8A);
        down8A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost8A = view.findViewById(R.id.cost8A);
        quantity8A.toggle();
        product8A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity8A.toggle();
                if(down8A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down8A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down8A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down8A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg8A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg8A.getText().toString()) * (spinner8bA.getSelectedItemPosition() + 1)) / 100;
                    cost8A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost8A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg8A.getText().toString()) * (spinner8bA.getSelectedItemPosition() + 1)) / 100;
                    cost8A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost8A.setText("Rs" + cost);
                }
            }
        });
//        spinner8aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 250 * (position+1) * (spinner8bA.getSelectedItemPosition()+1);
//                cost8A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner8bA.getSelectedItemPosition()) == 0 && spinner8aA.getSelectedItemPosition() == 0){
//                    int cost = 250;
//                    cost8A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 250 * (spinner8aA.getSelectedItemPosition()+1);
//                    cost8A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner8bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 250 * (position+1) * (float)(Integer.parseInt(pkg8A.getText().toString())/100);
                cost8A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 250 * (float)(Integer.parseInt(pkg8A.getText().toString())/100);
                cost8A.setText("Rs" + cost);
            }
        });
        atc8A = view.findViewById(R.id.atc8A);
        atc8A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Blueberries";
//                pkg = spinner8aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg8A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg8A.getText().toString());
                product_quantity = Integer.parseInt(spinner8bA.getSelectedItem().toString());
                cst = cost8A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity8A.toggle();
                down8A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg8A.setText("100");
//                spinner8aA.setAdapter(adapter8aA);
                spinner8bA.setAdapter(adapter8bA);
            }
        });

        pkg9A = view.findViewById(R.id.pkg9A);
        product9A = view.findViewById(R.id.product9A);
        quantity9A = view.findViewById(R.id.quantity9A);
        down9A = view.findViewById(R.id.down9A);
        down9A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost9A = view.findViewById(R.id.cost9A);
        quantity9A.toggle();
        product9A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity9A.toggle();
                if(down9A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down9A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down9A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down9A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg9A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg9A.getText().toString()) * (spinner9bA.getSelectedItemPosition() + 1)) / 100;
                    cost9A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost9A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg9A.getText().toString()) * (spinner9bA.getSelectedItemPosition() + 1)) / 100;
                    cost9A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost9A.setText("Rs" + cost);
                }
            }
        });
//        spinner9aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 120 * (position+1) * (spinner9bA.getSelectedItemPosition()+1);
//                cost9A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner9bA.getSelectedItemPosition()) == 0 && spinner9aA.getSelectedItemPosition() == 0){
//                    int cost = 120;
//                    cost9A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 120 * (spinner9aA.getSelectedItemPosition()+1);
//                    cost9A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner9bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 120 * (position+1) * (float)(Integer.parseInt(pkg9A.getText().toString())/100);
                cost9A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 120 * (float)(Integer.parseInt(pkg9A.getText().toString())/100);
                cost9A.setText("Rs" + cost);
            }
        });
        atc9A = view.findViewById(R.id.atc9A);
        atc9A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Cranberries";
//                pkg = spinner9aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg9A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg9A.getText().toString());
                product_quantity = Integer.parseInt(spinner9bA.getSelectedItem().toString());
                cst = cost9A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity9A.toggle();
                down9A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg9A.setText("100");
//                spinner9aA.setAdapter(adapter9aA);
                spinner9bA.setAdapter(adapter9bA);
            }
        });

        pkg10A = view.findViewById(R.id.pkg10A);
        product10A = view.findViewById(R.id.product10A);
        quantity10A = view.findViewById(R.id.quantity10A);
        down10A = view.findViewById(R.id.down10A);
        down10A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost10A = view.findViewById(R.id.cost10A);
        quantity10A.toggle();
        product10A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity10A.toggle();
                if(down10A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down10A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down10A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down10A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg10A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg10A.getText().toString()) * (spinner10bA.getSelectedItemPosition() + 1)) / 100;
                    cost10A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost10A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg10A.getText().toString()) * (spinner10bA.getSelectedItemPosition() + 1)) / 100;
                    cost10A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost10A.setText("Rs" + cost);
                }
            }
        });
//        spinner10aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 200 * (position+1) * (spinner10bA.getSelectedItemPosition()+1);
//                cost10A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner10bA.getSelectedItemPosition()) == 0 && spinner10aA.getSelectedItemPosition() == 0){
//                    int cost = 200;
//                    cost10A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 200 * (spinner10aA.getSelectedItemPosition()+1);
//                    cost10A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner10bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 200 * (position+1) * (float)(Integer.parseInt(pkg10A.getText().toString())/100);
                cost10A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 200 * (float)(Integer.parseInt(pkg10A.getText().toString())/100);
                cost10A.setText("Rs" + cost);
            }
        });
        atc10A = view.findViewById(R.id.atc10A);
        atc10A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Pistachio R&S";
//                pkg = spinner10aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg10A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg10A.getText().toString());
                product_quantity = Integer.parseInt(spinner10bA.getSelectedItem().toString());
                cst = cost10A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity10A.toggle();
                down10A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg10A.setText("100");
//                spinner10aA.setAdapter(adapter10aA);
                spinner10bA.setAdapter(adapter10bA);
            }
        });

        pkg11A = view.findViewById(R.id.pkg11A);
        product11A = view.findViewById(R.id.product11A);
        quantity11A = view.findViewById(R.id.quantity11A);
        down11A = view.findViewById(R.id.down11A);
        down11A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost11A = view.findViewById(R.id.cost11A);
        quantity11A.toggle();
        product11A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity11A.toggle();
                if(down11A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down11A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down11A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down11A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg11A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg11A.getText().toString()) * (spinner11bA.getSelectedItemPosition() + 1)) / 100;
                    cost11A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost11A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg11A.getText().toString()) * (spinner11bA.getSelectedItemPosition() + 1)) / 100;
                    cost11A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost11A.setText("Rs" + cost);
                }
            }
        });
//        spinner11aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 160 * (position+1) * (spinner11bA.getSelectedItemPosition()+1);
//                cost11A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner11bA.getSelectedItemPosition()) == 0 && spinner11aA.getSelectedItemPosition() == 0){
//                    int cost = 160;
//                    cost11A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 160 * (spinner11aA.getSelectedItemPosition()+1);
//                    cost11A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner11bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 160 * (position+1) * (float)(Integer.parseInt(pkg11A.getText().toString())/100);
                cost11A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 160 * (float)(Integer.parseInt(pkg11A.getText().toString())/100);
                cost11A.setText("Rs" + cost);
            }
        });
        atc11A = view.findViewById(R.id.atc11A);
        atc11A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Almond R&S";
//                pkg = spinner11aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg11A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg11A.getText().toString());
                product_quantity = Integer.parseInt(spinner11bA.getSelectedItem().toString());
                cst = cost11A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity11A.toggle();
                down11A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg11A.setText("100");
//                spinner11aA.setAdapter(adapter11aA);
                spinner11bA.setAdapter(adapter11bA);
            }
        });

        pkg12A = view.findViewById(R.id.pkg12A);
        product12A = view.findViewById(R.id.product12A);
        quantity12A = view.findViewById(R.id.quantity12A);
        down12A = view.findViewById(R.id.down12A);
        down12A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost12A = view.findViewById(R.id.cost12A);
        quantity12A.toggle();
        product12A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity12A.toggle();
                if(down12A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down12A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down12A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down12A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg12A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg12A.getText().toString()) * (spinner12bA.getSelectedItemPosition() + 1)) / 100;
                    cost12A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost12A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg12A.getText().toString()) * (spinner12bA.getSelectedItemPosition() + 1)) / 100;
                    cost12A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost12A.setText("Rs" + cost);
                }
            }
        });
//        spinner12aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 175 * (position+1) * (spinner12bA.getSelectedItemPosition()+1);
//                cost12A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner12bA.getSelectedItemPosition()) == 0 && spinner12aA.getSelectedItemPosition() == 0){
//                    int cost = 175;
//                    cost12A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 175 * (spinner12aA.getSelectedItemPosition()+1);
//                    cost12A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner12bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 175 * (position+1) * (float)(Integer.parseInt(pkg12A.getText().toString())/100);
                cost12A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 175 * (float)(Integer.parseInt(pkg12A.getText().toString())/100);
                cost12A.setText("Rs" + cost);
            }
        });
        atc12A = view.findViewById(R.id.atc12A);
        atc12A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Assorted Berries";
//                pkg = spinner12aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg12A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg12A.getText().toString());
                product_quantity = Integer.parseInt(spinner12bA.getSelectedItem().toString());
                cst = cost12A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity12A.toggle();
                down12A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg12A.setText("100");
//                spinner12aA.setAdapter(adapter12aA);
                spinner12bA.setAdapter(adapter12bA);
            }
        });

        pkg13A = view.findViewById(R.id.pkg13A);
        product13A = view.findViewById(R.id.product13A);
        quantity13A = view.findViewById(R.id.quantity13A);
        down13A = view.findViewById(R.id.down13A);
        down13A.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost13A = view.findViewById(R.id.cost13A);
        quantity13A.toggle();
        product13A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity13A.toggle();
                if(down13A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down13A.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down13A.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down13A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg13A.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg13A.getText().toString()) * (spinner13bA.getSelectedItemPosition() + 1)) / 100;
                    cost13A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost13A.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg13A.getText().toString()) * (spinner13bA.getSelectedItemPosition() + 1)) / 100;
                    cost13A.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost13A.setText("Rs" + cost);
                }
            }
        });
//        spinner13aA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 200 * (position+1) * (spinner13bA.getSelectedItemPosition()+1);
//                cost13A.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner13bA.getSelectedItemPosition()) == 0 && spinner13aA.getSelectedItemPosition() == 0){
//                    int cost = 200;
//                    cost13A.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 200 * (spinner13aA.getSelectedItemPosition()+1);
//                    cost13A.setText("Rs" + cost);
//                }
//            }
//        });
        spinner13bA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 200 * (position+1) * (float)(Integer.parseInt(pkg13A.getText().toString())/100);
                cost13A.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 200 * (float)(Integer.parseInt(pkg13A.getText().toString())/100);
                cost13A.setText("Rs" + cost);
            }
        });
        atc13A = view.findViewById(R.id.atc13A);
        atc13A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Assorted Dry Fruits";
//                pkg = spinner13aA.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg13A.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg13A.getText().toString());
                product_quantity = Integer.parseInt(spinner13bA.getSelectedItem().toString());
                cst = cost13A.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity13A.toggle();
                down13A.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg13A.setText("100");
//                spinner13aA.setAdapter(adapter13aA);
                spinner13bA.setAdapter(adapter13bA);
            }
        });

        return view;
    }

}
