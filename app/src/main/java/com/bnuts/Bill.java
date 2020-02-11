package com.bnuts;

import android.Manifest;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Bill  extends AppCompatActivity {
    String phoneno, name, address, email, json, type, no_of_items, items = "", totalcost, current_datetime, delivery_datetime, status, checked, second_address;
    String date, msg, serial_no, cart, excost;
    int numberofitems = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        phoneno = getIntent().getStringExtra("phoneno");
        name = getIntent().getStringExtra("name");
        address = getIntent().getStringExtra("address");
        email = getIntent().getStringExtra("email");
        json = getIntent().getStringExtra("localcart");
        totalcost = getIntent().getStringExtra("totalcost");
        excost = getIntent().getStringExtra("excost");
        System.out.println(",isc in bill" + excost);
        type = "logs";
        checked = getIntent().getStringExtra("checked");
        second_address = getIntent().getStringExtra("secondaddress");
        if(checked.equals("1")) {
            address = second_address;
        }
        Gson gson = new Gson();
        Type collectionType = new TypeToken<List<LocalCart>>() {}.getType();
        List<LocalCart> localcart = gson.fromJson(json, collectionType);
        for (int i = 0; i<localcart.size(); i = i + 1) {
            numberofitems = numberofitems + localcart.get(i).getProduct_quantity();
        }
        no_of_items = String.valueOf(numberofitems);
        items = localcart.get(0).getProduct_name() + "(" + localcart.get(0).getProduct_package() + "gms" ;
        if(localcart.get(0).getProduct_quantity() != 1){
            items = items + " x " + localcart.get(0).getProduct_quantity() + " )";
        }
        else{
            items = items + " )";
        }
        for ( int i = 1; i<localcart.size(); i = i+ 1) {
            items = items + ",  " + localcart.get(i).getProduct_name() + "(" + localcart.get(i).getProduct_package() + "gms";
            if(localcart.get(i).getProduct_quantity() != 1){
                items = items + " x " + localcart.get(i).getProduct_quantity() + " )";
            }
            else{
                items = items + " )";
            }
        }
        DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
        current_datetime = df.format(Calendar.getInstance().getTime());
        DateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        date = sdf.toString();
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 3);
        delivery_datetime = sdf.format(c.getTime());
        status = "Not Delivered";

        BackgroundWorker1 backgroundWorker1 = new BackgroundWorker1(this);
        backgroundWorker1.execute(type, name, phoneno, address, email, no_of_items, items, excost, totalcost, current_datetime, delivery_datetime, status);
        try {
            String result = backgroundWorker1.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int p = ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.SEND_SMS);
        if(p== PackageManager.PERMISSION_DENIED){
            ActivityCompat.requestPermissions(Bill.this, new String[]{Manifest.permission.SEND_SMS}, 666);

        }

        cart = localcart.get(0).getProduct_name() + "(" +localcart.get(0).getProduct_quantity() + "gms)";
        for (int j = 1; j<localcart.size(); j = j + 1) {
            cart = cart + ", " + localcart.get(j).getProduct_name() + "(" +localcart.get(j).getProduct_package() + "gms)";
        }
        BackgroundWorker4 backgroundWorker4 = new BackgroundWorker4(this);
        backgroundWorker4.execute("getserialno");
        try {
            serial_no = backgroundWorker4.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        msg = "Order Placed: Your order No. " + serial_no + " containing " + items + " with the total amount of " + totalcost + " has been placed. It will be delivered by " + delivery_datetime + ". Further details please contact moksha1208@gmail.com";
        System.out.println("message" + msg);
        SmsManager sm = SmsManager.getDefault();
        ArrayList<String> parts =sm.divideMessage(msg);
        sm.sendMultipartTextMessage(phoneno, null, parts, null, null);

    }

    public void destroy(View view) {
        System.out.println("im being destroyed");
        doRestart(getApplicationContext());
    }

    public static void doRestart(Context c) {
        try {
            //check if the context is given
            if (c != null) {
                //fetch the packagemanager so we can get the default launch activity
                // (you can replace this intent with any other activity if you want
                PackageManager pm = c.getPackageManager();
                //check if we got the PackageManager
                if (pm != null) {
                    //create the intent with the default start activity for your application
                    Intent mStartActivity = pm.getLaunchIntentForPackage(
                            c.getPackageName()
                    );
                    if (mStartActivity != null) {
                        mStartActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        //create a pending intent so the application is restarted after System.exit(0) was called.
                        // We use an AlarmManager to call this intent in 100ms
                        int mPendingIntentId = 223344;
                        PendingIntent mPendingIntent = PendingIntent.getActivity(c, mPendingIntentId, mStartActivity, PendingIntent.FLAG_CANCEL_CURRENT);
                        AlarmManager mgr = (AlarmManager) c.getSystemService(Context.ALARM_SERVICE);
                        mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, mPendingIntent);
                        //kill the application
                        System.exit(0);
                    } else {
                        System.out.println("Was not able to restart application, mStartActivity null");
                    }
                } else {
                    System.out.println("Was not able to restart application, PM null");
                }
            } else {
                System.out.println("Was not able to restart application, Context null");
            }
        } catch (Exception ex) {
            System.out.println("Was not able to restart application");
        }
    }

}
