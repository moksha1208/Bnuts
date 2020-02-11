package com.bnuts;

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

public class BackgroundWorker3 extends AsyncTask<String, Void, String> {
    Context context;
    BackgroundWorker3(Context ctx) {
        context = ctx;
    }

    @Override
    protected String doInBackground(String... strings) {
        String type = strings[0];
        String logs_url = "http://antispasmodic-drill.000webhostapp.com/addcustomer.php";
        if(type.equals("addcustomer")) {
            try {
                String customer_phone_no = strings[1];
                String customer_name = strings[2];
                String customer_address = strings[3];
                String customer_mail = strings[4];
                URL url = new URL(logs_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("customer_phone_no", "UTF-8") + "=" + URLEncoder.encode(customer_phone_no, "UTF-8") + "&" +
                        URLEncoder.encode("customer_name", "UTF-8") + "=" + URLEncoder.encode(customer_name, "UTF-8") + "&" +
                        URLEncoder.encode("customer_address", "UTF-8") + "=" + URLEncoder.encode(customer_address, "UTF-8") + "&" +
                        URLEncoder.encode("customer_mail", "UTF-8") + "=" + URLEncoder.encode(customer_mail, "UTF-8");
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
                return "Customer Added";
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
