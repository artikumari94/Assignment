package com.books.orders.commonClass;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.books.orders.internetConnectivity.CheckConnection;
import com.github.aurae.retrofit2.LoganSquareConverterFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class CommonMethods {

    private static final String TAG = "CommonMethods";
    private static AlertDialog mAlertDialog;
    public static AlarmManager alarmManager;
    public static PendingIntent pendingIntent;

    public static void internetConnectionPopUp(final Activity activity, boolean isConnected) {
        if (!isConnected) {
            showInternetConnectionDialog(activity, true);
        } else {
            showInternetConnectionDialog(activity, false);
            new CheckConnection(activity).execute(JsonConstants.INTERNET_CHECK_URL);
        }
    }

    public static void showInternetConnectionDialog(final Activity activity, final boolean isConnected) {
        // Check activity instance is available or not
        if (activity != null && !activity.isFinishing()) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    // If dialog is already displayed then cancel the dialog as below or call "mAlertDialog.dismiss()" before showing it again
                    if (isConnected) {
                        if (mAlertDialog != null && mAlertDialog.isShowing()) {
                            return;
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                        builder.setTitle("Not Connected to Internet");
                        builder.setCancelable(false);

                        builder.setMessage("Please Connect the internet and Try Again...");
                        builder.setPositiveButton("Connect", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                activity.startActivity(new Intent(WifiManager.ACTION_PICK_WIFI_NETWORK));
                            }
                        });
                        mAlertDialog = builder.create();
                        mAlertDialog.show();
                    } else {
                        if (mAlertDialog != null && mAlertDialog.isShowing()) {
                            mAlertDialog.dismiss();
                        }
                    }
                }
            });
        }
    }

    public static void poorInternetConnection(final Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    builder.setMessage("Your internet connection is slow, you may experience difficulties using this app.");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            });
        }
    }


    public static Retrofit getRetrofit(Activity context) {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(5000, TimeUnit.SECONDS)
                .readTimeout(5000, TimeUnit.SECONDS).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(JsonConstants.BASE_URL).client(client)
                .addConverterFactory(LoganSquareConverterFactory.create())
                .build();
        return retrofit;
    }


    public static String getString(Object object) {
        if (object == null) {
            return "";
        } else {
            return object.toString();
        }
    }


}
