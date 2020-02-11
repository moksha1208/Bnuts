package com.bnuts;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class CustomerDetails extends AppCompatActivity {
    EditText phone_no, customer_name, email_address, pincode, town_city, flat, area, landmark;
    String phoneno;
    String name;
    String address;
    String second_address;
    String email;
    String json;
    String totalcost;
    String result;
    String excost;
//    String date, finaldate;
    int exists = 0;
    CheckBox cb;
    String checked = "0";
    LinearLayout secondaryll;
//    String msg, cart = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);
        json = getIntent().getStringExtra("localcart");
        totalcost = getIntent().getStringExtra("totalcost");
        excost = getIntent().getStringExtra("excost");
        System.out.println("misc in custdeet " + excost);
        phone_no = findViewById(R.id.phone_no);
        customer_name = findViewById(R.id.customer_name);
//        customer_address = findViewById(R.id.customer_address);
        email_address = findViewById(R.id.email_address);
        pincode = findViewById(R.id.pincode);
        town_city = findViewById(R.id.town_city);
        flat = findViewById(R.id.flat);
        area = findViewById(R.id.area);
        landmark = findViewById(R.id.landmark);
//        second_delivery_address = findViewById(R.id.second_delivery_address);
//        ll = findViewById(R.id.seconddeliveryaddress);
//        ll.setVisibility(View.INVISIBLE);
        secondaryll = findViewById(R.id.secondaryll);
        secondaryll.setVisibility(View.INVISIBLE);
        cb = findViewById(R.id.checksecondarydeliveryadress);
//        cb.setVisibility(View.INVISIBLE);
        phone_no.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(phone_no.getText().length() < 10)
                {
                    phone_no.setError("Minimum 10 character");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if(phone_no.getText().length() < 10)
                {
                    phone_no.setError("Minimum 10 characters");
                }
                if(phone_no.getText().length() == 10)
                {
                    exists = 0;
                    phoneno = phone_no.getText().toString();
                    if(phone_no.getText().length() == 11 && "0".equals(phoneno.charAt(0))) {
                        phoneno = phoneno.substring(1);
                    }
                    System.out.println("phone no" + phoneno);
                    BackgroundWorker2 backgroundWorker2 = new BackgroundWorker2(getApplicationContext());
                    backgroundWorker2.execute("checkphoneno", phoneno);
                    try {
                        result = backgroundWorker2.get();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Result" + result);
                    if (result != null) {
                        exists = 1;
                        String[] split = result.split(":");
                        customer_name.setText(split[1]);
                        customer_name.setEnabled(false);
                        String[] addsplt = split[2].split(";");
                        flat.setText(addsplt[0]);
                        flat.setEnabled(false);
                        area.setText(addsplt[1]);
                        area.setEnabled(false);
                        landmark.setText(addsplt[2]);
                        landmark.setEnabled(false);
                        town_city.setText(addsplt[3]);
                        town_city.setEnabled(false);
                        pincode.setText(addsplt[4]);
                        pincode.setEnabled(false);
//                        customer_address.setText(split[2]);
//                        customer_address.setEnabled(false);
                        email_address.setText(split[3]);
                        email_address.setEnabled(false);
                        secondaryll.setVisibility(View.VISIBLE);
//                        cb.setVisibility(View.VISIBLE);
                    }
                    else
                    {

                        customer_name.setText("");
                        customer_name.setEnabled(true);
                        flat.setText("");
                        flat.setEnabled(true);
                        area.setText("");
                        area.setEnabled(true);
                        landmark.setText("");
                        landmark.setEnabled(true);
                        town_city.setText("");
                        town_city.setEnabled(true);
                        pincode.setText("");
                        pincode.setEnabled(true);
//                        customer_address.setText("");
//                        customer_address.setEnabled(true);
                        email_address.setText("");
                        email_address.setEnabled(true);
                    }
                }
            }
        });
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    checked = "1";
                    flat.setText("");
                    area.setText("");
                    landmark.setText("");
                    town_city.setText("");
                    pincode.setText("");
//                    ll.setVisibility(View.VISIBLE);
                }
                else {
                    checked = "0";
                    String[] split = result.split(":");
                    customer_name.setText(split[1]);
                    customer_name.setEnabled(false);
                    String[] addsplt = split[2].split(";");
                    flat.setText(addsplt[0]);
                    flat.setEnabled(false);
                    area.setText(addsplt[1]);
                    area.setEnabled(false);
                    landmark.setText(addsplt[2]);
                    landmark.setEnabled(false);
                    town_city.setText(addsplt[3]);
                    town_city.setEnabled(false);
                    pincode.setText(addsplt[4]);
                    pincode.setEnabled(false);
//                    ll.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    public void proceed(View view) {
        if(phone_no.getText().toString() != null){
            if(customer_name.getText().toString() != null){
                if(flat.getText().toString() != null){
                    if(area.getText().toString() != null){
                        if(landmark.getText().toString() != null){
                            if(town_city.getText().toString() != null){
                                if(pincode.getText().toString() != null){
                                    phoneno = phone_no.getText().toString();
                                    name = customer_name.getText().toString();
                                    address = flat.getText().toString() + ";" + area.getText().toString() + ";" + landmark.getText().toString() + ";" + town_city.getText().toString() + ";" + pincode.getText().toString();
//                                  address = customer_address.getText().toString();
                                    email = email_address.getText().toString();
//                                  second_address = second_delivery_address.getText().toString();
                                    if (exists == 0) {
                                        BackgroundWorker3 backgroundWorker3 = new BackgroundWorker3(getApplicationContext());
                                        backgroundWorker3.execute("addcustomer", phoneno, name, address, email);
                                    }
                                    Intent intent = new Intent(getApplicationContext(), Bill.class);
                                    intent.putExtra("phoneno", phoneno);
                                    intent.putExtra("name", name);
                                    intent.putExtra("address", address);
                                    intent.putExtra("email", email);
                                    intent.putExtra("localcart", json);
                                    intent.putExtra("totalcost", totalcost);
                                    intent.putExtra("excost", excost);
                                    intent.putExtra("checked", checked);
                                    intent.putExtra("secondaddress", second_address);
                                    startActivity(intent);
                                }
                                else {
                                    pincode.setError("Please enter Pincode");
                                }
                            }
                            else {
                                town_city.setError("PLease enter Name of the City/Town");
                            }
                        }
                        else {
                            landmark.setError("Please enter Landmark");
                        }
                    }
                    else {
                        area.setError("Please enter Area");
                    }
                }
                else {
                    flat.setError("Please enter the details");
                }
            }
            else {
                customer_name.setError("Please enter your name");
            }
        }
        else {
            phone_no.setError("Please enter your phone number");
        }

    }
}
