package com.books.orders.internetConnectivity;

import android.app.Activity;
import android.os.AsyncTask;

import com.books.orders.commonClass.CommonMethods;

public class CheckConnection extends AsyncTask<String, String, String> {

    private final static int POOR_BANDWIDTH = 80; // Taken middle value of 2g [40 kbps] and 3g [128 kbps]

    private long mStartTime;

    private long mEndTime;

    private Activity mActivity;

    public CheckConnection(Activity activity) {
        this.mActivity = activity;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mStartTime = System.currentTimeMillis();
    }

    @Override
    protected String doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        mEndTime = System.currentTimeMillis();
        double timeTakenMills = Math.floor(mEndTime - mStartTime);  // time taken in milliseconds
        double timeTakenSecs = timeTakenMills / 1000;  // divide by 1000 to get time in seconds
        final int kilobytePerSec = (int) Math.round(1024 / timeTakenSecs);

        if (kilobytePerSec <= POOR_BANDWIDTH) {
            CommonMethods.poorInternetConnection(mActivity);
        }

    }

}
