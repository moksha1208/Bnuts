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
import java.net.ProtocolException;
import java.net.URL;

public class BackgroundWorker4 extends AsyncTask<String, Void, String> {
    Context context;

    BackgroundWorker4(Context ctx) {
        context = ctx;
    }

    @Override
    protected String doInBackground(String... strings) {
        String type = strings[0];
        String cartout_url = "http://antispasmodic-drill.000webhostapp.com/getserialno.php";
        if (type.equals("getserialno")) {
            try {
                URL url = new URL(cartout_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                String line = bufferedReader.readLine();
                System.out.println("Buffered" + line);
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                System.out.println("OUTPUT" + line);
                return line;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ProtocolException e) {
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
