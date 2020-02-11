package com.bnuts;


import android.app.AlertDialog;
import android.graphics.PorterDuff;
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
public class ClassicsFragment extends Fragment {

    View view;
    String pkg[], cst[];
    String product_name;
    int product_package, product_quantity;
    float product_cost;
    ExpandableRelativeLayout quantity1B, quantity2B, quantity3B, quantity4B, quantity5B, quantity6B, quantity7B, quantity8B, quantity9B, quantity10B, quantity11B, quantity12B, quantity13B;
    Spinner spinner1aB, spinner1bB, spinner2aB, spinner2bB, spinner3aB, spinner3bB, spinner4aB, spinner4bB, spinner5aB, spinner5bB, spinner6aB, spinner6bB, spinner7aB, spinner7bB, spinner8aB, spinner8bB, spinner9aB, spinner9bB, spinner10aB, spinner10bB, spinner11aB, spinner11bB, spinner12aB, spinner12bB, spinner13aB, spinner13bB;
    LinearLayout product1B, product2B, product3B, product4B, product5B, product6B, product7B, product8B, product9B, product10B, product11B, product12B, product13B;
    Button atc1B, atc2B, atc3B, atc4B, atc5B, atc6B, atc7B, atc8B, atc9B, atc10B, atc11B, atc12B, atc13B;
    ImageView down1B, down2B, down3B, down4B, down5B, down6B, down7B, down8B, down9B, down10B, down11B, down12B,down13B;
    TextView cost1B, cost2B, cost3B, cost4B, cost5B, cost6B, cost7B, cost8B, cost9B, cost10B, cost11B, cost12B,  cost13B;
    public Categories categories;
    EditText pkg1B, pkg2B, pkg3B, pkg4B, pkg5B, pkg6B, pkg7B, pkg8B, pkg9B, pkg10B, pkg11B, pkg12B, pkg13B;
    AlertDialog alertDialog;

    public ClassicsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_classics, container, false);
        categories = (Categories)getActivity();

//        spinner1aB = view.findViewById(R.id.spinner1aB);
//        final ArrayAdapter<CharSequence> adapter1aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter1aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner1aB.setAdapter(adapter1aB);

        spinner1bB = view.findViewById(R.id.spinner1bB);
        final ArrayAdapter<CharSequence> adapter1bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter1bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1bB.setAdapter(adapter1bB);

//        spinner2aB = view.findViewById(R.id.spinner2aB);
//        final ArrayAdapter<CharSequence> adapter2aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter2aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner2aB.setAdapter(adapter2aB);

        spinner2bB = view.findViewById(R.id.spinner2bB);
        final ArrayAdapter<CharSequence> adapter2bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter2bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2bB.setAdapter(adapter2bB);

//        spinner3aB = view.findViewById(R.id.spinner3aB);
//        final ArrayAdapter<CharSequence> adapter3aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter3aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner3aB.setAdapter(adapter3aB);

        spinner3bB = view.findViewById(R.id.spinner3bB);
        final ArrayAdapter<CharSequence> adapter3bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter3bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3bB.setAdapter(adapter3bB);

//        spinner4aB = view.findViewById(R.id.spinner4aB);
//        final ArrayAdapter<CharSequence> adapter4aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter4aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner4aB.setAdapter(adapter4aB);

        spinner4bB = view.findViewById(R.id.spinner4bB);
        final ArrayAdapter<CharSequence> adapter4bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter4bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4bB.setAdapter(adapter4bB);

//        spinner5aB = view.findViewById(R.id.spinner5aB);
//        final ArrayAdapter<CharSequence> adapter5aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter5aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner5aB.setAdapter(adapter5aB);

        spinner5bB = view.findViewById(R.id.spinner5bB);
        final ArrayAdapter<CharSequence> adapter5bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter5bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5bB.setAdapter(adapter5bB);

//        spinner6aB = view.findViewById(R.id.spinner6aB);
//        final ArrayAdapter<CharSequence> adapter6aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter6aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner6aB.setAdapter(adapter6aB);

        spinner6bB = view.findViewById(R.id.spinner6bB);
        final ArrayAdapter<CharSequence> adapter6bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter6bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6bB.setAdapter(adapter6bB);

//        spinner7aB = view.findViewById(R.id.spinner7aB);
//        final ArrayAdapter<CharSequence> adapter7aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter7aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner7aB.setAdapter(adapter7aB);

        spinner7bB = view.findViewById(R.id.spinner7bB);
        final ArrayAdapter<CharSequence> adapter7bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter7bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7bB.setAdapter(adapter7bB);

//        spinner8aB = view.findViewById(R.id.spinner8aB);
//        final ArrayAdapter<CharSequence> adapter8aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter8aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner8aB.setAdapter(adapter8aB);

        spinner8bB = view.findViewById(R.id.spinner8bB);
        final ArrayAdapter<CharSequence> adapter8bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter8bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8bB.setAdapter(adapter8bB);

//        spinner9aB = view.findViewById(R.id.spinner9aB);
//        final ArrayAdapter<CharSequence> adapter9aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter9aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner9aB.setAdapter(adapter9aB);

        spinner9bB = view.findViewById(R.id.spinner9bB);
        final ArrayAdapter<CharSequence> adapter9bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter9bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9bB.setAdapter(adapter9bB);

//        spinner10aB = view.findViewById(R.id.spinner10aB);
//        final ArrayAdapter<CharSequence> adapter10aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter10aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner10aB.setAdapter(adapter10aB);

        spinner10bB = view.findViewById(R.id.spinner10bB);
        final ArrayAdapter<CharSequence> adapter10bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter10bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner10bB.setAdapter(adapter10bB);

//        spinner11aB = view.findViewById(R.id.spinner11aB);
//        final ArrayAdapter<CharSequence> adapter11aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter11aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner11aB.setAdapter(adapter11aB);

        spinner11bB = view.findViewById(R.id.spinner11bB);
        final ArrayAdapter<CharSequence> adapter11bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter11bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner11bB.setAdapter(adapter11bB);

//        spinner12aB = view.findViewById(R.id.spinner12aB);
//        final ArrayAdapter<CharSequence> adapter12aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter12aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner12aB.setAdapter(adapter12aB);

        spinner12bB = view.findViewById(R.id.spinner12bB);
        final ArrayAdapter<CharSequence> adapter12bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter12bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner12bB.setAdapter(adapter12bB);

//        spinner13aB = view.findViewById(R.id.spinner13aB);
//        final ArrayAdapter<CharSequence> adapter13aB = ArrayAdapter.createFromResource(getContext(), R.array.grams, android.R.layout.simple_spinner_item);
//        adapter13aB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner13aB.setAdapter(adapter13aB);

        spinner13bB = view.findViewById(R.id.spinner13bB);
        final ArrayAdapter<CharSequence> adapter13bB = ArrayAdapter.createFromResource(getContext(), R.array.quantity, android.R.layout.simple_spinner_item);
        adapter13bB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner13bB.setAdapter(adapter13bB);

        pkg1B = view.findViewById(R.id.pkg1B);
        product1B = view.findViewById(R.id.product1B);
        quantity1B = view.findViewById(R.id.quantity1B);
        down1B = view.findViewById(R.id.down1B);
        down1B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost1B = view.findViewById(R.id.cost1B);
        quantity1B.toggle();
        product1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity1B.toggle();
                if(down1B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down1B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down1B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down1B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg1B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg1B.getText().toString()) * (spinner1bB.getSelectedItemPosition() + 1)) / 100;
                    cost1B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost1B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg1B.getText().toString()) * (spinner1bB.getSelectedItemPosition() + 1)) / 100;
                    cost1B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost1B.setText("Rs" + cost);
                }
            }
        });
//        spinner1aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 200 * (position+1) * (spinner1bB.getSelectedItemPosition()+1);
//                cost1B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner1bB.getSelectedItemPosition()) == 0 && spinner1aB.getSelectedItemPosition() == 0){
//                    int cost = 200;
//                    cost1B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 200 * (spinner1aB.getSelectedItemPosition()+1);
//                    cost1B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner1bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 120 * (position+1) * (float)(Integer.parseInt(pkg1B.getText().toString())/100);
                cost1B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 120 * (float)(Integer.parseInt(pkg1B.getText().toString())/100);
                cost1B.setText("Rs" + cost);
            }
        });
        atc1B = view.findViewById(R.id.atc1B);
        atc1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Walnut Stuffed Dates";
//                pkg = spinner1aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg1B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg1B.getText().toString());
                product_quantity = Integer.parseInt(spinner1bB.getSelectedItem().toString());
                cst = cost1B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity1B.toggle();
                down1B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg1B.setText("100");
//                spinner1aB.setAdapter(adapter1aB);
                spinner1bB.setAdapter(adapter1bB);
            }
        });

        pkg2B = view.findViewById(R.id.pkg2B);
        product2B = view.findViewById(R.id.product2B);
        quantity2B = view.findViewById(R.id.quantity2B);
        down2B = view.findViewById(R.id.down2B);
        down2B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost2B = view.findViewById(R.id.cost2B);
        quantity2B.toggle();
        product2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity2B.toggle();
                if(down2B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down2B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down2B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down2B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg2B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg2B.getText().toString()) * (spinner2bB.getSelectedItemPosition() + 1)) / 100;
                    cost2B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost2B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg2B.getText().toString()) * (spinner2bB.getSelectedItemPosition() + 1)) / 100;
                    cost2B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost2B.setText("Rs" + cost);
                }
            }
        });
//        spinner2aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 220 * (position+1) * (spinner2bB.getSelectedItemPosition()+1);
//                cost2B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner2bB.getSelectedItemPosition()) == 0 && spinner2aB.getSelectedItemPosition() == 0){
//                    int cost = 220;
//                    cost2B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 220 * (spinner2aB.getSelectedItemPosition()+1);
//                    cost2B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner2bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 140 * (position+1) * (float)(Integer.parseInt(pkg2B.getText().toString())/100);
                cost2B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 140 * (float)(Integer.parseInt(pkg2B.getText().toString())/100);
                cost2B.setText("Rs" + cost);
            }
        });
        atc2B = view.findViewById(R.id.atc2B);
        atc2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Stuffed Honey Almond Dates";
//                pkg = spinner2aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg2B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg2B.getText().toString());
                product_quantity = Integer.parseInt(spinner2bB.getSelectedItem().toString());
                cst = cost2B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity2B.toggle();
                down2B.setImageDrawable(getResources().getDrawable(R.drawable.down));
//                spinner2aB.setAdapter(adapter2aB);
                pkg2B.setText("100");
                spinner2bB.setAdapter(adapter2bB);
            }
        });

        pkg3B = view.findViewById(R.id.pkg3B);
        product3B = view.findViewById(R.id.product3B);
        quantity3B = view.findViewById(R.id.quantity3B);
        down3B = view.findViewById(R.id.down3B);
        down3B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost3B = view.findViewById(R.id.cost3B);
        quantity3B.toggle();
        product3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity3B.toggle();
                if(down3B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down3B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down3B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down3B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg3B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg3B.getText().toString()) * (spinner3bB.getSelectedItemPosition() + 1)) / 100;
                    cost3B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost3B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg3B.getText().toString()) * (spinner3bB.getSelectedItemPosition() + 1)) / 100;
                    cost3B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost3B.setText("Rs" + cost);
                }
            }
        });
//        spinner3aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 180 * (position+1) * (spinner3bB.getSelectedItemPosition()+1);
//                cost3B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner3bB.getSelectedItemPosition()) == 0 && spinner3aB.getSelectedItemPosition() == 0){
//                    int cost = 180;
//                    cost3B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 180 * (spinner3aB.getSelectedItemPosition()+1);
//                    cost3B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner3bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 120 * (position+1) * (float)(Integer.parseInt(pkg3B.getText().toString())/100);
                cost3B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 120 * (float)(Integer.parseInt(pkg3B.getText().toString())/100);
                cost3B.setText("Rs" + cost);
            }
        });
        atc3B = view.findViewById(R.id.atc3B);
        atc3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Strawberries";
//                pkg = spinner3aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg3B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg3B.getText().toString());
                product_quantity = Integer.parseInt(spinner3bB.getSelectedItem().toString());
                cst = cost3B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity3B.toggle();
                down3B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg3B.setText("100");
//                spinner3aB.setAdapter(adapter3aB);
                spinner3bB.setAdapter(adapter3bB);
            }
        });

        pkg4B = view.findViewById(R.id.pkg4B);
        product4B = view.findViewById(R.id.product4B);
        quantity4B = view.findViewById(R.id.quantity4B);
        down4B = view.findViewById(R.id.down4B);
        down4B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost4B = view.findViewById(R.id.cost4B);
        quantity4B.toggle();
        product4B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity4B.toggle();
                if(down4B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down4B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down4B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down4B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg4B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg4B.getText().toString()) * (spinner4bB.getSelectedItemPosition() + 1)) / 100;
                    cost4B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost4B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg4B.getText().toString()) * (spinner4bB.getSelectedItemPosition() + 1)) / 100;
                    cost4B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost4B.setText("Rs" + cost);
                }
            }
        });
//        spinner4aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 120 * (position+1) * (spinner4bB.getSelectedItemPosition()+1);
//                cost4B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner4bB.getSelectedItemPosition()) == 0 && spinner4aB.getSelectedItemPosition() == 0){
//                    int cost = 120;
//                    cost4B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 120 * (spinner4aB.getSelectedItemPosition()+1);
//                    cost4B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner4bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 160 * (position+1) * (float)(Integer.parseInt(pkg4B.getText().toString())/100);
                cost4B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 160 * (float)(Integer.parseInt(pkg4B.getText().toString())/100);
                cost4B.setText("Rs" + cost);
            }
        });
        atc4B = view.findViewById(R.id.atc4B);
        atc4B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Cherries";
//                pkg = spinner4aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg4B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg4B.getText().toString());
                product_quantity = Integer.parseInt(spinner4bB.getSelectedItem().toString());
                cst = cost4B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity4B.toggle();
                down4B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg4B.setText("100");
//                spinner4aB.setAdapter(adapter4aB);
                spinner4bB.setAdapter(adapter4bB);
            }
        });

        pkg5B = view.findViewById(R.id.pkg5B);
        product5B = view.findViewById(R.id.product5B);
        quantity5B = view.findViewById(R.id.quantity5B);
        down5B = view.findViewById(R.id.down5B);
        down5B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost5B = view.findViewById(R.id.cost5B);
        quantity5B.toggle();
        product5B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity5B.toggle();
                if(down5B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down5B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down5B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down5B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg5B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg5B.getText().toString()) * (spinner5bB.getSelectedItemPosition() + 1)) / 100;
                    cost5B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost5B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg5B.getText().toString()) * (spinner5bB.getSelectedItemPosition() + 1)) / 100;
                    cost5B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost5B.setText("Rs" + cost);
                }
            }
        });
//        spinner5aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 450 * (position+1) * (spinner5bB.getSelectedItemPosition()+1);
//                cost5B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner5bB.getSelectedItemPosition()) == 0 && spinner5aB.getSelectedItemPosition() == 0){
//                    int cost = 450;
//                    cost5B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 450 * (spinner5aB.getSelectedItemPosition()+1);
//                    cost5B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner5bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 180 * (position+1) * (float)(Integer.parseInt(pkg5B.getText().toString())/100);
                cost5B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 180 * (float)(Integer.parseInt(pkg5B.getText().toString())/100);
                cost5B.setText("Rs" + cost);
            }
        });
        atc5B = view.findViewById(R.id.atc5B);
        atc5B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Saffron: Kashmiri Mogra";
//                pkg = spinner5aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg5B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg5B.getText().toString());
                product_quantity = Integer.parseInt(spinner5bB.getSelectedItem().toString());
                cst = cost5B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity5B.toggle();
                down5B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg5B.setText("100");
//                spinner5aB.setAdapter(adapter5aB);
                spinner5bB.setAdapter(adapter5bB);
            }
        });

        pkg6B = view.findViewById(R.id.pkg6B);
        product6B = view.findViewById(R.id.product6B);
        quantity6B = view.findViewById(R.id.quantity6B);
        down6B = view.findViewById(R.id.down6B);
        down6B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost6B = view.findViewById(R.id.cost6B);
        quantity6B.toggle();
        product6B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity6B.toggle();
                if(down6B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down6B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down6B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down6B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg6B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg6B.getText().toString()) * (spinner6bB.getSelectedItemPosition() + 1)) / 100;
                    cost6B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost6B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg6B.getText().toString()) * (spinner6bB.getSelectedItemPosition() + 1)) / 100;
                    cost6B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost6B.setText("Rs" + cost);
                }
            }
        });
//        spinner6aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 400 * (position+1) * (spinner6bB.getSelectedItemPosition()+1);
//                cost6B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner6bB.getSelectedItemPosition()) == 0 && spinner6aB.getSelectedItemPosition() == 0){
//                    int cost = 400;
//                    cost6B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 400 * (spinner6aB.getSelectedItemPosition()+1);
//                    cost6B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner6bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 50 * (position+1) * (float)(Integer.parseInt(pkg6B.getText().toString())/100);
                cost6B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 50 * (float)(Integer.parseInt(pkg6B.getText().toString())/100);
                cost6B.setText("Rs" + cost);
            }
        });
        atc6B = view.findViewById(R.id.atc6B);
        atc6B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Brazil Nuts";
//                pkg = spinner6aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg6B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg6B.getText().toString());
                product_quantity = Integer.parseInt(spinner6bB.getSelectedItem().toString());
                cst = cost6B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity6B.toggle();
                down6B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg6B.setText("100");
//                spinner6aB.setAdapter(adapter6aB);
                spinner6bB.setAdapter(adapter6bB);
            }
        });

        pkg7B = view.findViewById(R.id.pkg7B);
        product7B = view.findViewById(R.id.product7B);
        quantity7B = view.findViewById(R.id.quantity7B);
        down7B = view.findViewById(R.id.down7B);
        down7B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost7B = view.findViewById(R.id.cost7B);
        quantity7B.toggle();
        product7B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity7B.toggle();
                if(down7B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down7B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down7B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down7B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg7B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg7B.getText().toString()) * (spinner7bB.getSelectedItemPosition() + 1)) / 100;
                    cost7B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost7B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg7B.getText().toString()) * (spinner7bB.getSelectedItemPosition() + 1)) / 100;
                    cost7B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost7B.setText("Rs" + cost);
                }
            }
        });
//        spinner7aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 400 * (position+1) * (spinner7bB.getSelectedItemPosition()+1);
//                cost7B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner7bB.getSelectedItemPosition()) == 0 && spinner7aB.getSelectedItemPosition() == 0){
//                    int cost = 400;
//                    cost7B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 400 * (spinner7aB.getSelectedItemPosition()+1);
//                    cost7B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner7bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 250 * (position+1) * (float)(Integer.parseInt(pkg7B.getText().toString())/100);
                cost7B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 250 * (float)(Integer.parseInt(pkg7B.getText().toString())/100);
                cost7B.setText("Rs" + cost);
            }
        });
        atc7B = view.findViewById(R.id.atc7B);
        atc7B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Macadamia";
//                pkg = spinner7aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg7B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg7B.getText().toString());
                product_quantity = Integer.parseInt(spinner7bB.getSelectedItem().toString());
                cst = cost7B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity7B.toggle();
                down7B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg7B.setText("100");
//                spinner7aB.setAdapter(adapter7aB);
                spinner7bB.setAdapter(adapter7bB);
            }
        });

        pkg8B = view.findViewById(R.id.pkg8B);
        product8B = view.findViewById(R.id.product8B);
        quantity8B = view.findViewById(R.id.quantity8B);
        down8B = view.findViewById(R.id.down8B);
        down8B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost8B = view.findViewById(R.id.cost8B);
        quantity8B.toggle();
        product8B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity8B.toggle();
                if(down8B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down8B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down8B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down8B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg8B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg8B.getText().toString()) * (spinner8bB.getSelectedItemPosition() + 1)) / 100;
                    cost8B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost8B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg8B.getText().toString()) * (spinner8bB.getSelectedItemPosition() + 1)) / 100;
                    cost8B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost8B.setText("Rs" + cost);
                }
            }
        });
//        spinner8aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 200 * (position+1) * (spinner8bB.getSelectedItemPosition()+1);
//                cost8B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner8bB.getSelectedItemPosition()) == 0 && spinner8aB.getSelectedItemPosition() == 0){
//                    int cost = 200;
//                    cost8B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 200 * (spinner8aB.getSelectedItemPosition()+1);
//                    cost8B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner8bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 250 * (position+1) * (float)(Integer.parseInt(pkg8B.getText().toString())/100);
                cost8B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 250 * (float)(Integer.parseInt(pkg8B.getText().toString())/100);
                cost8B.setText("Rs" + cost);
            }
        });
        atc8B = view.findViewById(R.id.atc8B);
        atc8B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Hazelnut";
//                pkg = spinner8aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg8B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg8B.getText().toString());
                product_quantity = Integer.parseInt(spinner8bB.getSelectedItem().toString());
                cst = cost8B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity8B.toggle();
                down8B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg8B.setText("100");
//                spinner8aB.setAdapter(adapter8aB);
                spinner8bB.setAdapter(adapter8bB);
            }
        });

        pkg9B = view.findViewById(R.id.pkg9B);
        product9B = view.findViewById(R.id.product9B);
        quantity9B = view.findViewById(R.id.quantity9B);
        down9B = view.findViewById(R.id.down9B);
        down9B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost9B = view.findViewById(R.id.cost9B);
        quantity9B.toggle();
        product9B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity9B.toggle();
                if(down9B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down9B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down9B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down9B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg9B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg9B.getText().toString()) * (spinner9bB.getSelectedItemPosition() + 1)) / 100;
                    cost9B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost9B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg9B.getText().toString()) * (spinner9bB.getSelectedItemPosition() + 1)) / 100;
                    cost9B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost9B.setText("Rs" + cost);
                }
            }
        });
//        spinner9aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 300 * (position+1) * (spinner9bB.getSelectedItemPosition()+1);
//                cost9B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner9bB.getSelectedItemPosition()) == 0 && spinner9aB.getSelectedItemPosition() == 0){
//                    int cost = 300;
//                    cost9B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 300 * (spinner9aB.getSelectedItemPosition()+1);
//                    cost9B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner9bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 120 * (position+1) * (float)(Integer.parseInt(pkg9B.getText().toString())/100);
                cost9B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 120 * (float)(Integer.parseInt(pkg9B.getText().toString())/100);
                cost9B.setText("Rs" + cost);
            }
        });
        atc9B = view.findViewById(R.id.atc9B);
        atc9B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Pecan Nuts";
//                pkg = spinner9aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg9B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg9B.getText().toString());
                product_quantity = Integer.parseInt(spinner9bB.getSelectedItem().toString());
                cst = cost9B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity9B.toggle();
                down9B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg9B.setText("100");
//                spinner9aB.setAdapter(adapter9aB);
                spinner9bB.setAdapter(adapter9bB);
            }
        });

        pkg10B = view.findViewById(R.id.pkg10B);
        product10B = view.findViewById(R.id.product10B);
        quantity10B = view.findViewById(R.id.quantity10B);
        down10B = view.findViewById(R.id.down10B);
        down10B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost10B = view.findViewById(R.id.cost10B);
        quantity10B.toggle();
        product10B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity10B.toggle();
                if(down10B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down10B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down10B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down10B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg10B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg10B.getText().toString()) * (spinner10bB.getSelectedItemPosition() + 1)) / 100;
                    cost10B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost10B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg10B.getText().toString()) * (spinner10bB.getSelectedItemPosition() + 1)) / 100;
                    cost10B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost10B.setText("Rs" + cost);
                }
            }
        });
//        spinner10aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 180 * (position+1) * (spinner10bB.getSelectedItemPosition()+1);
//                cost10B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner10bB.getSelectedItemPosition()) == 0 && spinner10aB.getSelectedItemPosition() == 0){
//                    int cost = 180;
//                    cost10B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 180 * (spinner10aB.getSelectedItemPosition()+1);
//                    cost10B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner10bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 200 * (position+1) * (float)(Integer.parseInt(pkg10B.getText().toString())/100);
                cost10B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 200 * (float)(Integer.parseInt(pkg10B.getText().toString())/100);
                cost10B.setText("Rs" + cost);
            }
        });
        atc10B = view.findViewById(R.id.atc10B);
        atc10B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Walnut Kernel";
//                pkg = spinner10aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg10B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg10B.getText().toString());
                product_quantity = Integer.parseInt(spinner10bB.getSelectedItem().toString());
                cst = cost10B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity10B.toggle();
                down10B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg10B.setText("100");
//                spinner10aB.setAdapter(adapter10aB);
                spinner10bB.setAdapter(adapter10bB);
            }
        });

        pkg11B = view.findViewById(R.id.pkg11B);
        product11B = view.findViewById(R.id.product11B);
        quantity11B = view.findViewById(R.id.quantity11B);
        down11B = view.findViewById(R.id.down11B);
        down11B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost11B = view.findViewById(R.id.cost11B);
        quantity11B.toggle();
        product11B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity11B.toggle();
                if(down11B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down11B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down11B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down11B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg11B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg11B.getText().toString()) * (spinner11bB.getSelectedItemPosition() + 1)) / 100;
                    cost11B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost11B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg11B.getText().toString()) * (spinner11bB.getSelectedItemPosition() + 1)) / 100;
                    cost11B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost11B.setText("Rs" + cost);
                }
            }
        });
//        spinner11aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 200 * (position+1) * (spinner11bB.getSelectedItemPosition()+1);
//                cost11B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner11bB.getSelectedItemPosition()) == 0 && spinner11aB.getSelectedItemPosition() == 0){
//                    int cost = 200;
//                    cost11B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 200 * (spinner11aB.getSelectedItemPosition()+1);
//                    cost11B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner11bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 160 * (position+1) * (float)(Integer.parseInt(pkg11B.getText().toString())/100);
                cost11B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 160 * (float)(Integer.parseInt(pkg11B.getText().toString())/100);
                cost11B.setText("Rs" + cost);
            }
        });
        atc11B = view.findViewById(R.id.atc11B);
        atc11B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Walnut Kernel C";
//                pkg = spinner11aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg11B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg11B.getText().toString());
                product_quantity = Integer.parseInt(spinner11bB.getSelectedItem().toString());
                cst = cost11B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity11B.toggle();
                down11B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg11B.setText("100");
//                spinner11aB.setAdapter(adapter11aB);
                spinner11bB.setAdapter(adapter11bB);
            }
        });

        pkg12B = view.findViewById(R.id.pkg12B);
        product12B = view.findViewById(R.id.product12B);
        quantity12B = view.findViewById(R.id.quantity12B);
        down12B = view.findViewById(R.id.down12B);
        down12B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost12B = view.findViewById(R.id.cost12B);
        quantity12B.toggle();
        product12B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity12B.toggle();
                if(down12B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down12B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down12B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down12B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg12B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg12B.getText().toString()) * (spinner12bB.getSelectedItemPosition() + 1)) / 100;
                    cost12B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost12B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg12B.getText().toString()) * (spinner12bB.getSelectedItemPosition() + 1)) / 100;
                    cost12B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost12B.setText("Rs" + cost);
                }
            }
        });
//        spinner12aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 100 * (position+1) * (spinner12bB.getSelectedItemPosition()+1);
//                cost12B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner12bB.getSelectedItemPosition()) == 0 && spinner12aB.getSelectedItemPosition() == 0){
//                    int cost = 100;
//                    cost12B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 100 * (spinner12aB.getSelectedItemPosition()+1);
//                    cost12B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner12bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 175 * (position+1) * (float)(Integer.parseInt(pkg12B.getText().toString())/100);
                cost12B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 175 * (float)(Integer.parseInt(pkg12B.getText().toString())/100);
                cost12B.setText("Rs" + cost);
            }
        });
        atc12B = view.findViewById(R.id.atc12B);
        atc12B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Prunes";
//                pkg = spinner12aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg12B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg12B.getText().toString());
                product_quantity = Integer.parseInt(spinner12bB.getSelectedItem().toString());
                cst = cost12B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity12B.toggle();
                down12B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg12B.setText("100");
//                spinner12aB.setAdapter(adapter12aB);
                spinner12bB.setAdapter(adapter12bB);
            }
        });

        pkg13B = view.findViewById(R.id.pkg13B);
        product13B = view.findViewById(R.id.product13B);
        quantity13B = view.findViewById(R.id.quantity13B);
        down13B = view.findViewById(R.id.down13B);
        down13B.setImageDrawable(getResources().getDrawable(R.drawable.down));
        cost13B = view.findViewById(R.id.cost13B);
        quantity13B.toggle();
        product13B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity13B.toggle();
                if(down13B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.down).getConstantState()) {
                    down13B.setImageDrawable(getResources().getDrawable(R.drawable.up));
                }
                else if(down13B.getDrawable().getConstantState() == getContext().getResources().getDrawable(R.drawable.up).getConstantState()){
                    down13B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                }
            }
        });
        pkg13B.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg13B.getText().toString()) * (spinner13bB.getSelectedItemPosition() + 1)) / 100;
                    cost13B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost13B.setText("Rs" + cost);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    float cost = (float) (120 * Integer.parseInt(pkg13B.getText().toString()) * (spinner13bB.getSelectedItemPosition() + 1)) / 100;
                    cost13B.setText("Rs" + cost);
                }
                catch(NumberFormatException nfe)
                {
                    float cost = 0;
                    cost13B.setText("Rs" + cost);
                }
            }
        });
//        spinner13aB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                int cost = 650 * (position+1) * (spinner13bB.getSelectedItemPosition()+1);
//                cost13B.setText("Rs" + cost);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                if((spinner13bB.getSelectedItemPosition()) == 0 && spinner13aB.getSelectedItemPosition() == 0){
//                    int cost = 650;
//                    cost13B.setText("Rs" + cost);
//                }
//                else{
//                    int cost = 650 * (spinner13aB.getSelectedItemPosition()+1);
//                    cost13B.setText("Rs" + cost);
//                }
//            }
//        });
        spinner13bB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                float cost = 200 * (position+1) * (float)(Integer.parseInt(pkg13B.getText().toString())/100);
                cost13B.setText("Rs" + cost);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                float cost = 200 * (float)(Integer.parseInt(pkg13B.getText().toString())/100);
                cost13B.setText("Rs" + cost);
            }
        });
        atc13B = view.findViewById(R.id.atc13B);
        atc13B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_name = "Honey Nuts";
//                pkg = spinner13aB.getSelectedItem().toString().split("gms");
                try{
                    product_package = Integer.parseInt(pkg13B.getText().toString());
                }
                catch(Exception e){
                    alertDialog = new AlertDialog.Builder(getContext()).create();
                    alertDialog.setMessage("Please enter a valid package value");
                }
//                product_package = Integer.parseInt(pkg13B.getText().toString());
                product_quantity = Integer.parseInt(spinner13bB.getSelectedItem().toString());
                cst = cost13B.getText().toString().split("Rs");
                product_cost = Float.parseFloat(cst[1]);
//                product_cost = Integer.parseInt(cst[1]);
                categories.localcart.add(new LocalCart(categories.j, R.drawable.cranberries, product_name, product_package, product_quantity, product_cost));
                categories.j++;
                Toast.makeText(categories, "Item Added", Toast.LENGTH_SHORT).show();
                quantity13B.toggle();
                down13B.setImageDrawable(getResources().getDrawable(R.drawable.down));
                pkg13B.setText("100");
//                spinner13aB.setAdapter(adapter13aB);
                spinner13bB.setAdapter(adapter13bB);
            }
        });

        return view;
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_classics, container, false);
    }

}
