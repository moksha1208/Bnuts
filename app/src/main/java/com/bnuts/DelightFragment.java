package com.bnuts;


import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
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


/**
 * A simple {@link Fragment} subclass.
 */
public class DelightFragment extends Fragment {

    View view;
    String pkg[], cst[];
    String product_name;
    int product_package, product_quantity;
    float product_cost;
    ExpandableRelativeLayout quantity1C, quantity2C, quantity3C, quantity4C, quantity5C, quantity6C, quantity7C, quantity8C, quantity9C, quantity10C, quantity11C, quantity12C, quantity13C;
    Spinner spinner1aC, spinner1bC, spinner2aC, spinner2bC, spinner3aC, spinner3bC, spinner4aC, spinner4bC, spinner5aC, spinner5bC, spinner6aC, spinner6bC, spinner7aC, spinner7bC, spinner8aC, spinner8bC, spinner9aC, spinner9bC, spinner10aC, spinner10bC, spinner11aC, spinner11bC, spinner12aC, spinner12bC, spinner13aC, spinner13bC;
    LinearLayout product1C, product2C, product3C, product4C, product5C, product6C, product7C, product8C, product9C, product10C, product11C, product12C, product13C;
    Button atc1C, atc2C, atc3C, atc4C, atc5C, atc6C, atc7C, atc8C, atc9C, atc10C, atc11C, atc12C, atc13C;
    ImageView down1C, down2C, down3C, down4C, down5C, down6C, down7C, down8C, down9C, down10C, down11C, down12C, down13C;
    TextView cost1C, cost2C, cost3C, cost4C, cost5C, cost6C, cost7C, cost8C, cost9C, cost10C, cost11C, cost12C, cost13C;
    public Categories categories;
    EditText pkg1C, pkg2C, pkg3C, pkg4C, pkg5C, pkg6C, pkg7C, pkg8C, pkg9C, pkg10C, pkg11C, pkg12C, pkg13C;
    AlertDialog alertDialog;


    public DelightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_delight, container, false);
        categories = (Categories)getActivity();

//        spinner1aC = view.findViewById(R.id.spinner1aC);
//        final ArrayAdapter<CharSequence> adapter1aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter1aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner1aC.setAdapter(adapter1aC);

        spinner1bC = view.findViewById(R.id.spinner1bC);
        final ArrayAdapter<CharSequence> adapter1bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter1bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1bC.setAdapter(adapter1bC);

//        spinner2aC = view.findViewById(R.id.spinner2aC);
//        final ArrayAdapter<CharSequence> adapter2aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter2aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner2aC.setAdapter(adapter2aC);

        spinner2bC = view.findViewById(R.id.spinner2bC);
        final ArrayAdapter<CharSequence> adapter2bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter2bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2bC.setAdapter(adapter2bC);

//        spinner3aC = view.findViewById(R.id.spinner3aC);
//        final ArrayAdapter<CharSequence> adapter3aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter3aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner3aC.setAdapter(adapter3aC);

        spinner3bC = view.findViewById(R.id.spinner3bC);
        final ArrayAdapter<CharSequence> adapter3bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter3bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3bC.setAdapter(adapter3bC);

//        spinner4aC = view.findViewById(R.id.spinner4aC);
//        final ArrayAdapter<CharSequence> adapter4aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter4aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner4aC.setAdapter(adapter4aC);

        spinner4bC = view.findViewById(R.id.spinner4bC);
        final ArrayAdapter<CharSequence> adapter4bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter4bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4bC.setAdapter(adapter4bC);

//        spinner5aC = view.findViewById(R.id.spinner5aC);
//        final ArrayAdapter<CharSequence> adapter5aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter5aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner5aC.setAdapter(adapter5aC);

        spinner5bC = view.findViewById(R.id.spinner5bC);
        final ArrayAdapter<CharSequence> adapter5bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter5bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5bC.setAdapter(adapter5bC);

//        spinner6aC = view.findViewById(R.id.spinner6aC);
//        final ArrayAdapter<CharSequence> adapter6aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter6aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner6aC.setAdapter(adapter6aC);

        spinner6bC = view.findViewById(R.id.spinner6bC);
        final ArrayAdapter<CharSequence> adapter6bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter6bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6bC.setAdapter(adapter6bC);

//        spinner7aC = view.findViewById(R.id.spinner7aC);
//        final ArrayAdapter<CharSequence> adapter7aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter7aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner7aC.setAdapter(adapter7aC);

        spinner7bC = view.findViewById(R.id.spinner7bC);
        final ArrayAdapter<CharSequence> adapter7bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter7bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7bC.setAdapter(adapter7bC);

//        spinner8aC = view.findViewById(R.id.spinner8aC);
//        final ArrayAdapter<CharSequence> adapter8aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter8aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner8aC.setAdapter(adapter8aC);

        spinner8bC = view.findViewById(R.id.spinner8bC);
        final ArrayAdapter<CharSequence> adapter8bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter8bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8bC.setAdapter(adapter8bC);

//        spinner9aC = view.findViewById(R.id.spinner9aC);
//        final ArrayAdapter<CharSequence> adapter9aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter9aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner9aC.setAdapter(adapter9aC);

        spinner9bC = view.findViewById(R.id.spinner9bC);
        final ArrayAdapter<CharSequence> adapter9bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter9bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9bC.setAdapter(adapter9bC);

//        spinner10aC = view.findViewById(R.id.spinner10aC);
//        final ArrayAdapter<CharSequence> adapter10aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter10aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner10aC.setAdapter(adapter10aC);

        spinner10bC = view.findViewById(R.id.spinner10bC);
        final ArrayAdapter<CharSequence> adapter10bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter10bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner10bC.setAdapter(adapter10bC);

//        spinner11aC = view.findViewById(R.id.spinner11aC);
//        final ArrayAdapter<CharSequence> adapter11aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter11aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner11aC.setAdapter(adapter11aC);

        spinner11bC = view.findViewById(R.id.spinner11bC);
        final ArrayAdapter<CharSequence> adapter11bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter11bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner11bC.setAdapter(adapter11bC);

//        spinner12aC = view.findViewById(R.id.spinner12aC);
//        final ArrayAdapter<CharSequence> adapter12aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter12aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner12aC.setAdapter(adapter12aC);

        spinner12bC = view.findViewById(R.id.spinner12bC);
        final ArrayAdapter<CharSequence> adapter12bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter12bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner12bC.setAdapter(adapter12bC);

//        spinner13aC = view.findViewById(R.id.spinner13aC);
//        final ArrayAdapter<CharSequence> adapter13aC = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter13aC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner13aC.setAdapter(adapter13aC);

        spinner13bC = view.findViewById(R.id.spinner13bC);
        final ArrayAdapter<CharSequence> adapter13bC = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter13bC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner13bC.setAdapter(adapter13bC);

        pkg1C = view.findViewById(R.id.pkg1C);
        product1C = view.findViewById(R.id.product1C);
        quantity1C = view.findViewById(R.id.quantity1C);
        down1C = view.findViewById(R.id.down1C);
        down1C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost1C = view.findViewById(R.id.cost1C);
        quantity1C.toggle();
        product1C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity1C.toggle();
                if(down1C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down1C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down1C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down1C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg1C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg1C.getText().toString()) * (spinner1bC.getSelectedItemPosition() + 1)) / 100;
                    cost1C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost1C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg1C.getText().toString()) * (spinner1bC.getSelectedItemPosition() + 1)) / 100;
                    cost1C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost1C.setText("Rs" + cost);
                }
            }
        });
//        spinner1aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 400 * (position+1) * (spinner1bC.getSelectedItemPosition()+1);
//                cost1C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner1bC.getSelectedItemPosition()) == 0 && spinner1aC.getSelectedItemPosition() == 0){
//                    int cost = 400;
//                    cost1C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 400 * (spinner1aC.getSelectedItemPosition()+1);
//                    cost1C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner1bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 120 * (position+1) * (float)(Integer.parseInt(pkg1C.getText().toString())/100);
                cost1C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 120 * (float)(Integer.parseInt(pkg1C.getText().toString())/100);
                cost1C.setText("Rs" + cost);
            }
        });
        atc1C = view.findViewById(R.id.atc1C);
        atc1C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Dehydrated Products";
//                pkg = spinner1aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg1C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg1C.getText().toString());
                product_quantity = Integer.parseInt(spinner1bC.getSelectedItem().toString());
                cst = cost1C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity1C.toggle();
                down1C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg1C.setText("100");
//                spinner1aC.setAdapter(adapter1aC);
                spinner1bC.setAdapter(adapter1bC);
            }
        });

        pkg2C = view.findViewById(R.id.pkg2C);
        product2C = view.findViewById(R.id.product2C);
        quantity2C = view.findViewById(R.id.quantity2C);
        down2C = view.findViewById(R.id.down2C);
        down2C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost2C = view.findViewById(R.id.cost2C);
        quantity2C.toggle();
        product2C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity2C.toggle();
                if(down2C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down2C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down2C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down2C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg2C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg2C.getText().toString()) * (spinner2bC.getSelectedItemPosition() + 1)) / 100;
                    cost2C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost2C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg2C.getText().toString()) * (spinner2bC.getSelectedItemPosition() + 1)) / 100;
                    cost2C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost2C.setText("Rs" + cost);
                }
            }
        });
//        spinner2aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 450 * (position+1) * (spinner2bC.getSelectedItemPosition()+1);
//                cost2C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner2bC.getSelectedItemPosition()) == 0 && spinner2aC.getSelectedItemPosition() == 0){
//                    int cost = 450;
//                    cost2C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 450 * (spinner2aC.getSelectedItemPosition()+1);
//                    cost2C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner2bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 140 * (position+1) * (float)(Integer.parseInt(pkg2C.getText().toString())/100);
                cost2C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 140 * (float)(Integer.parseInt(pkg2C.getText().toString())/100);
                cost2C.setText("Rs" + cost);
            }
        });
        atc2C = view.findViewById(R.id.atc2C);
        atc2C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Dehydrated Jamun";
//                pkg = spinner2aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg2C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg2C.getText().toString());
                product_quantity = Integer.parseInt(spinner2bC.getSelectedItem().toString());
                cst = cost2C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity2C.toggle();
                down2C.setImageDrawable(getResources().getDrawable(R.drawable.down));
//                spinner2aC.setAdapter(adapter2aC);
                pkg2C.setText("100");
                spinner2bC.setAdapter(adapter2bC);
            }
        });

        pkg3C = view.findViewById(R.id.pkg3C);
        product3C = view.findViewById(R.id.product3C);
        quantity3C = view.findViewById(R.id.quantity3C);
        down3C = view.findViewById(R.id.down3C);
        down3C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost3C = view.findViewById(R.id.cost3C);
        quantity3C.toggle();
        product3C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity3C.toggle();
                if(down3C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down3C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down3C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down3C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg3C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg3C.getText().toString()) * (spinner3bC.getSelectedItemPosition() + 1)) / 100;
                    cost3C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost3C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg3C.getText().toString()) * (spinner3bC.getSelectedItemPosition() + 1)) / 100;
                    cost3C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost3C.setText("Rs" + cost);
                }
            }
        });
//        spinner3aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 275 * (position+1) * (spinner3bC.getSelectedItemPosition()+1);
//                cost3C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner3bC.getSelectedItemPosition()) == 0 && spinner3aC.getSelectedItemPosition() == 0){
//                    int cost = 275;
//                    cost3C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 275 * (spinner3aC.getSelectedItemPosition()+1);
//                    cost3C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner3bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 120 * (position+1) * (float)(Integer.parseInt(pkg3C.getText().toString())/100);
                cost3C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 120 * (float)(Integer.parseInt(pkg3C.getText().toString())/100);
                cost3C.setText("Rs" + cost);
            }
        });
        atc3C = view.findViewById(R.id.atc3C);
        atc3C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Chocolate Dates";
//                pkg = spinner3aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg3C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg3C.getText().toString());
                product_quantity = Integer.parseInt(spinner3bC.getSelectedItem().toString());
                cst = cost3C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity3C.toggle();
                down3C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg3C.setText("100");
//                spinner3aC.setAdapter(adapter3aC);
                spinner3bC.setAdapter(adapter3bC);
            }
        });

        pkg4C = view.findViewById(R.id.pkg4C);
        product4C= view.findViewById(R.id.product4C);
        quantity4C = view.findViewById(R.id.quantity4C);
        down4C = view.findViewById(R.id.down4C);
        down4C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost4C = view.findViewById(R.id.cost4C);
        quantity4C.toggle();
        product4C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity4C.toggle();
                if(down4C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down4C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down4C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down4C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg4C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg4C.getText().toString()) * (spinner4bC.getSelectedItemPosition() + 1)) / 100;
                    cost4C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost4C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg4C.getText().toString()) * (spinner4bC.getSelectedItemPosition() + 1)) / 100;
                    cost4C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost4C.setText("Rs" + cost);
                }
            }
        });
//        spinner4aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 125 * (position+1) * (spinner4bC.getSelectedItemPosition()+1);
//                cost4C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner4bC.getSelectedItemPosition()) == 0 && spinner4aC.getSelectedItemPosition() == 0){
//                    int cost = 125;
//                    cost4C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 125 * (spinner4aC.getSelectedItemPosition()+1);
//                    cost4C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner4bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 160 * (position+1) * (float)(Integer.parseInt(pkg4C.getText().toString())/100);
                cost4C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 160 * (float)(Integer.parseInt(pkg4C.getText().toString())/100);
                cost4C.setText("Rs" + cost);
            }
        });
        atc4C = view.findViewById(R.id.atc4C);
        atc4C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Pumpkin Seeds R&S";
//                pkg = spinner4aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg4C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg4C.getText().toString());
                product_quantity = Integer.parseInt(spinner4bC.getSelectedItem().toString());
                cst = cost4C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity4C.toggle();
                down4C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg4C.setText("100");
//                spinner4aC.setAdapter(adapter4aC);
                spinner4bC.setAdapter(adapter4bC);
            }
        });

        pkg5C = view.findViewById(R.id.pkg5C);
        product5C = view.findViewById(R.id.product5C);
        quantity5C = view.findViewById(R.id.quantity5C);
        down5C = view.findViewById(R.id.down5C);
        down5C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost5C = view.findViewById(R.id.cost5C);
        quantity5C.toggle();
        product5C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity5C.toggle();
                if(down5C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down5C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down5C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down5C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg5C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg5C.getText().toString()) * (spinner5bC.getSelectedItemPosition() + 1)) / 100;
                    cost5C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost5C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg5C.getText().toString()) * (spinner5bC.getSelectedItemPosition() + 1)) / 100;
                    cost5C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost5C.setText("Rs" + cost);
                }
            }
        });
//        spinner5aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 125 * (position+1) * (spinner5bC.getSelectedItemPosition()+1);
//                cost5C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner5bC.getSelectedItemPosition()) == 0 && spinner5aC.getSelectedItemPosition() == 0){
//                    int cost = 125;
//                    cost5C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 125 * (spinner5aC.getSelectedItemPosition()+1);
//                    cost5C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner5bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 180 * (position+1) * (float)(Integer.parseInt(pkg5C.getText().toString())/100);
                cost5C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 180 * (float)(Integer.parseInt(pkg5C.getText().toString())/100);
                cost5C.setText("Rs" + cost);
            }
        });
        atc5C = view.findViewById(R.id.atc5C);
        atc5C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Sunflower R&S";
//                pkg = spinner5aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg5C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg5C.getText().toString());
                product_quantity = Integer.parseInt(spinner5bC.getSelectedItem().toString());
                cst = cost5C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity5C.toggle();
                down5C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg5C.setText("100");
//                spinner5aC.setAdapter(adapter5aC);
                spinner5bC.setAdapter(adapter5bC);
            }
        });

        pkg6C = view.findViewById(R.id.pkg6C);
        product6C = view.findViewById(R.id.product6C);
        quantity6C = view.findViewById(R.id.quantity6C);
        down6C = view.findViewById(R.id.down6C);
        down6C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost6C = view.findViewById(R.id.cost6C);
        quantity6C.toggle();
        product6C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity6C.toggle();
                if(down6C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down6C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down6C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down6C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg6C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg6C.getText().toString()) * (spinner6bC.getSelectedItemPosition() + 1)) / 100;
                    cost6C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost6C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg6C.getText().toString()) * (spinner6bC.getSelectedItemPosition() + 1)) / 100;
                    cost6C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost6C.setText("Rs" + cost);
                }
            }
        });
//        spinner6aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 125 * (position+1) * (spinner6bC.getSelectedItemPosition()+1);
//                cost6C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner6bC.getSelectedItemPosition()) == 0 && spinner6aC.getSelectedItemPosition() == 0){
//                    int cost = 125;
//                    cost6C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 125 * (spinner6aC.getSelectedItemPosition()+1);
//                    cost6C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner6bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 50 * (position+1) * (float)(Integer.parseInt(pkg6C.getText().toString())/100);
                cost6C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 50 * (float)(Integer.parseInt(pkg6C.getText().toString())/100);
                cost6C.setText("Rs" + cost);
            }
        });
        atc6C = view.findViewById(R.id.atc6C);
        atc6C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Apricot Turkey";
//                pkg = spinner6aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg6C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg6C.getText().toString());
                product_quantity = Integer.parseInt(spinner6bC.getSelectedItem().toString());
                cst = cost6C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity6C.toggle();
                down6C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg6C.setText("100");
//                spinner6aC.setAdapter(adapter6aC);
                spinner6bC.setAdapter(adapter6bC);
            }
        });

        pkg7C = view.findViewById(R.id.pkg7C);
        product7C = view.findViewById(R.id.product7C);
        quantity7C = view.findViewById(R.id.quantity7C);
        down7C = view.findViewById(R.id.down7C);
        down7C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost7C = view.findViewById(R.id.cost7C);
        quantity7C.toggle();
        product7C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity7C.toggle();
                if(down7C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down7C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down7C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down7C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg7C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg7C.getText().toString()) * (spinner7bC.getSelectedItemPosition() + 1)) / 100;
                    cost7C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost7C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg7C.getText().toString()) * (spinner7bC.getSelectedItemPosition() + 1)) / 100;
                    cost7C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost7C.setText("Rs" + cost);
                }
            }
        });
//        spinner7aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 100 * (position+1) * (spinner7bC.getSelectedItemPosition()+1);
//                cost7C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner7bC.getSelectedItemPosition()) == 0 && spinner7aC.getSelectedItemPosition() == 0){
//                    int cost = 100;
//                    cost7C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 100 * (spinner7aC.getSelectedItemPosition()+1);
//                    cost7C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner7bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 250 * (position+1) * (float)(Integer.parseInt(pkg7C.getText().toString())/100);
                cost7C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 250 * (float)(Integer.parseInt(pkg7C.getText().toString())/100);
                cost7C.setText("Rs" + cost);
            }
        });
        atc7C = view.findViewById(R.id.atc7C);
        atc7C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Raisin Black";
//                pkg = spinner7aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg7C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg7C.getText().toString());
                product_quantity = Integer.parseInt(spinner7bC.getSelectedItem().toString());
                cst = cost7C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity7C.toggle();
                down7C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg7C.setText("100");
//                spinner7aC.setAdapter(adapter7aC);
                spinner7bC.setAdapter(adapter7bC);
            }
        });

        pkg8C = view.findViewById(R.id.pkg8C);
        product8C = view.findViewById(R.id.product8C);
        quantity8C = view.findViewById(R.id.quantity8C);
        down8C = view.findViewById(R.id.down8C);
        down8C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost8C = view.findViewById(R.id.cost8C);
        quantity8C.toggle();
        product8C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity8C.toggle();
                if(down8C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down8C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down8C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down8C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg8C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg8C.getText().toString()) * (spinner8bC.getSelectedItemPosition() + 1)) / 100;
                    cost8C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost8C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg8C.getText().toString()) * (spinner8bC.getSelectedItemPosition() + 1)) / 100;
                    cost8C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost8C.setText("Rs" + cost);
                }
            }
        });
//        spinner8aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 130 * (position+1) * (spinner8bC.getSelectedItemPosition()+1);
//                cost8C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner8bC.getSelectedItemPosition()) == 0 && spinner8aC.getSelectedItemPosition() == 0){
//                    int cost = 130;
//                    cost8C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 130 * (spinner8aC.getSelectedItemPosition()+1);
//                    cost8C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner8bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 250 * (position+1) * (float)(Integer.parseInt(pkg8C.getText().toString())/100);
                cost8C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 250 * (float)(Integer.parseInt(pkg8C.getText().toString())/100);
                cost8C.setText("Rs" + cost);
            }
        });
        atc8C = view.findViewById(R.id.atc8C);
        atc8C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Raisin Munakka";
//                pkg = spinner8aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg8C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg8C.getText().toString());
                product_quantity = Integer.parseInt(spinner8bC.getSelectedItem().toString());
                cst = cost8C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity8C.toggle();
                down8C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg8C.setText("100");
//                spinner8aC.setAdapter(adapter8aC);
                spinner8bC.setAdapter(adapter8bC);
            }
        });

        pkg9C = view.findViewById(R.id.pkg9C);
        product9C = view.findViewById(R.id.product9C);
        quantity9C = view.findViewById(R.id.quantity9C);
        down9C = view.findViewById(R.id.down9C);
        down9C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost9C = view.findViewById(R.id.cost9C);
        quantity9C.toggle();
        product9C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity9C.toggle();
                if(down9C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down9C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down9C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down9C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg9C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg9C.getText().toString()) * (spinner9bC.getSelectedItemPosition() + 1)) / 100;
                    cost9C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost9C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg9C.getText().toString()) * (spinner9bC.getSelectedItemPosition() + 1)) / 100;
                    cost9C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost9C.setText("Rs" + cost);
                }
            }
        });
//        spinner9aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 65 * (position+1) * (spinner9bC.getSelectedItemPosition()+1);
//                cost9C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner9bC.getSelectedItemPosition()) == 0 && spinner9aC.getSelectedItemPosition() == 0){
//                    int cost = 65;
//                    cost9C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 65 * (spinner9aC.getSelectedItemPosition()+1);
//                    cost9C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner9bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 120 * (position+1) * (float)(Integer.parseInt(pkg9C.getText().toString())/100);
                cost9C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 120 * (float)(Integer.parseInt(pkg9C.getText().toString())/100);
                cost9C.setText("Rs" + cost);
            }
        });
        atc9C = view.findViewById(R.id.atc9C);
        atc9C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Branches";
//                pkg = spinner9aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg9C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg9C.getText().toString());
                product_quantity = Integer.parseInt(spinner9bC.getSelectedItem().toString());
                cst = cost9C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity9C.toggle();
                down9C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg9C.setText("100");
//                spinner9aC.setAdapter(adapter9aC);
                spinner9bC.setAdapter(adapter9bC);
            }
        });

        pkg10C = view.findViewById(R.id.pkg10C);
        product10C = view.findViewById(R.id.product10C);
        quantity10C = view.findViewById(R.id.quantity10C);
        down10C = view.findViewById(R.id.down10C);
        down10C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost10C = view.findViewById(R.id.cost10C);
        quantity10C.toggle();
        product10C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity10C.toggle();
                if(down10C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down10C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down10C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down10C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg10C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg10C.getText().toString()) * (spinner10bC.getSelectedItemPosition() + 1)) / 100;
                    cost10C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost10C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg10C.getText().toString()) * (spinner10bC.getSelectedItemPosition() + 1)) / 100;
                    cost10C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost10C.setText("Rs" + cost);
                }
            }
        });
//        spinner10aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 180 * (position+1) * (spinner10bC.getSelectedItemPosition()+1);
//                cost10C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner10bC.getSelectedItemPosition()) == 0 && spinner10aC.getSelectedItemPosition() == 0){
//                    int cost = 180;
//                    cost10C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 180 * (spinner10aC.getSelectedItemPosition()+1);
//                    cost10C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner10bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 200 * (position+1) * (float)(Integer.parseInt(pkg10C.getText().toString())/100);
                cost10C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 200 * (float)(Integer.parseInt(pkg10C.getText().toString())/100);
                cost10C.setText("Rs" + cost);
            }
        });
        atc10C = view.findViewById(R.id.atc10C);
        atc10C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Medjool";
//                pkg = spinner10aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg10C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg10C.getText().toString());
                product_quantity = Integer.parseInt(spinner10bC.getSelectedItem().toString());
                cst = cost10C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity10C.toggle();
                down10C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg10C.setText("100");
//                spinner10aC.setAdapter(adapter10aC);
                spinner10bC.setAdapter(adapter10bC);
            }
        });

        pkg11C = view.findViewById(R.id.pkg11C);
        product11C = view.findViewById(R.id.product11C);
        quantity11C = view.findViewById(R.id.quantity11C);
        down11C = view.findViewById(R.id.down11C);
        down11C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost11C = view.findViewById(R.id.cost11C);
        quantity11C.toggle();
        product11C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity11C.toggle();
                if(down11C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down11C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down11C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down11C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg11C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg11C.getText().toString()) * (spinner11bC.getSelectedItemPosition() + 1)) / 100;
                    cost11C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost11C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg11C.getText().toString()) * (spinner11bC.getSelectedItemPosition() + 1)) / 100;
                    cost11C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost11C.setText("Rs" + cost);
                }
            }
        });
//        spinner11aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 225 * (position+1) * (spinner11bC.getSelectedItemPosition()+1);
//                cost11C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner11bC.getSelectedItemPosition()) == 0 && spinner11aC.getSelectedItemPosition() == 0){
//                    int cost = 225;
//                    cost11C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 225 * (spinner11aC.getSelectedItemPosition()+1);
//                    cost11C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner11bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 160 * (position+1) * (float)(Integer.parseInt(pkg11C.getText().toString())/100);
                cost11C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 160 * (float)(Integer.parseInt(pkg11C.getText().toString())/100);
                cost11C.setText("Rs" + cost);
            }
        });
        atc11C = view.findViewById(R.id.atc11C);
        atc11C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Ajwa";
//                pkg = spinner11aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg11C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg11C.getText().toString());
                product_quantity = Integer.parseInt(spinner11bC.getSelectedItem().toString());
                cst = cost11C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity11C.toggle();
                down11C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg11C.setText("100");
//                spinner11aC.setAdapter(adapter11aC);
                spinner11bC.setAdapter(adapter11bC);
            }
        });

        pkg12C = view.findViewById(R.id.pkg12C);
        product12C = view.findViewById(R.id.product12C);
        quantity12C = view.findViewById(R.id.quantity12C);
        down12C = view.findViewById(R.id.down12C);
        down12C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost12C = view.findViewById(R.id.cost12C);
        quantity12C.toggle();
        product12C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity12C.toggle();
                if(down12C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down12C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down12C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down12C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg12C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg12C.getText().toString()) * (spinner12bC.getSelectedItemPosition() + 1)) / 100;
                    cost12C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost12C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg12C.getText().toString()) * (spinner12bC.getSelectedItemPosition() + 1)) / 100;
                    cost12C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost12C.setText("Rs" + cost);
                }
            }
        });
//        spinner12aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 120 * (position+1) * (spinner12bC.getSelectedItemPosition()+1);
//                cost12C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner12bC.getSelectedItemPosition()) == 0 && spinner12aC.getSelectedItemPosition() == 0){
//                    int cost = 120;
//                    cost12C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 120 * (spinner12aC.getSelectedItemPosition()+1);
//                    cost12C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner12bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 175 * (position+1) * (float)(Integer.parseInt(pkg12C.getText().toString())/100);
                cost12C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 175 * (float)(Integer.parseInt(pkg12C.getText().toString())/100);
                cost12C.setText("Rs" + cost);
            }
        });
        atc12C = view.findViewById(R.id.atc12C);
        atc12C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Mabroom";
//                pkg = spinner12aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg12C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg12C.getText().toString());
                product_quantity = Integer.parseInt(spinner12bC.getSelectedItem().toString());
                cst = cost12C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity12C.toggle();
                down12C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg12C.setText("100");
//                spinner12aC.setAdapter(adapter12aC);
                spinner12bC.setAdapter(adapter12bC);
            }
        });

        pkg13C = view.findViewById(R.id.pkg13C);
        product13C = view.findViewById(R.id.product13C);
        quantity13C = view.findViewById(R.id.quantity13C);
        down13C = view.findViewById(R.id.down13C);
        down13C.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost13C = view.findViewById(R.id.cost13C);
        quantity13C.toggle();
        product13C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity13C.toggle();
                if(down13C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down13C.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down13C.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down13C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg13C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg13C.getText().toString()) * (spinner13bC.getSelectedItemPosition() + 1)) / 100;
                    cost13C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost13C.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg13C.getText().toString()) * (spinner13bC.getSelectedItemPosition() + 1)) / 100;
                    cost13C.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost13C.setText("Rs" + cost);
                }
            }
        });
//        spinner13aC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 100 * (position+1) * (spinner13bC.getSelectedItemPosition()+1);
//                cost13C.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner13bC.getSelectedItemPosition()) == 0 && spinner13aC.getSelectedItemPosition() == 0){
//                    int cost = 100;
//                    cost13C.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 100 * (spinner13aC.getSelectedItemPosition()+1);
//                    cost13C.setText("Rs" + cost);
//                }
//            }
//        });
        spinner13bC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 200 * (position+1) * (float)(Integer.parseInt(pkg13C.getText().toString())/100);
                cost13C.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 200 * (float)(Integer.parseInt(pkg13C.getText().toString())/100);
                cost13C.setText("Rs" + cost);
            }
        });
        atc13C = view.findViewById(R.id.atc13C);
        atc13C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Kalmi";
//                pkg = spinner13aC.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg13C.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg13C.getText().toString());
                product_quantity = Integer.parseInt(spinner13bC.getSelectedItem().toString());
                cst = cost13C.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity13C.toggle();
                down13C.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg13C.setText("100");
//                spinner13aC.setAdapter(adapter13aC);
                spinner13bC.setAdapter(adapter13bC);
            }
        });

        return view;
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_delight, container, false);
    }

}
