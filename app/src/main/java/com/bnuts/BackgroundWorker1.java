package com.bnuts;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundWorker1 extends AsyncTask<String, Void, String> {
    Context context;
    AlertDialog alertDialog;
    BackgroundWorker1(Context ctx) {
        context = ctx;
    }
    @Override
    protected String doInBackground(String... voids) {
        System.out.println("in bg1");
        String type = voids[0];
        String logs_url = "http://antispasmodic-drill.000webhostapp.com/logs.php";
        if(type.equals("logs")) {
            try {
                String customer_name = voids[1];
                String customer_phoneno = voids[2];
                String customer_address = voids[3];
                String customer_email = voids[4];
                String no_of_items = voids[5];
                String items = voids[6];
                String miscellaneous = voids[7];
                String total_cost = voids[8];
                String current_datetime = voids[9];
                String delivery_datetime = voids[10];
                String status = voids[11];
                URL url = new URL(logs_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("customer_name", "UTF-8") + "=" + URLEncoder.encode(customer_name, "UTF-8") + "&" +
                        URLEncoder.encode("customer_phoneno", "UTF-8") + "=" + URLEncoder.encode(customer_phoneno, "UTF-8") + "&" +
                        URLEncoder.encode("customer_address", "UTF-8") + "=" + URLEncoder.encode(customer_address, "UTF-8") + "&" +
                        URLEncoder.encode("customer_email", "UTF-8") + "=" + URLEncoder.encode(customer_email, "UTF-8") + "&" +
                        URLEncoder.encode("no_of_items", "UTF-8") + "=" + URLEncoder.encode(no_of_items, "UTF-8") + "&" +
                        URLEncoder.encode("items", "UTF-8") + "=" + URLEncoder.encode(items, "UTF-8") + "&" +
                        URLEncoder.encode("miscellaneous", "UTF-8") + "=" + URLEncoder.encode(miscellaneous, "UTF-8") + "&" +
                        URLEncoder.encode("total_cost", "UTF-8") + "=" + URLEncoder.encode(total_cost, "UTF-8") + "&" +
                        URLEncoder.encode("current_datetime", "UTF-8") + "=" + URLEncoder.encode(current_datetime, "UTF-8") + "&" +
                        URLEncoder.encode("delivery_datetime", "UTF-8") + "=" + URLEncoder.encode(delivery_datetime, "UTF-8") + "&" +
                        URLEncoder.encode("status", "UTF-8") + "=" + URLEncoder.encode(status, "UTF-8");
                System.out.println("Insert is happening");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                String result = "";
                String line = "";
                while((line = bufferedReader.readLine()) != null) {
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return "Order Placed";
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "ERROR";
    }

    @Override
    protected void onPreExecute() {
        alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("Order Status");
    }

    @Override
    protected void onPostExecute(String result) {
        alertDialog.setMessage(result);
        alertDialog.show();
        System.out.println("no im at the end");
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
