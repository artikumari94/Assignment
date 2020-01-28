package com.books.orders.commonClass;

import android.app.Application;
import android.content.Context;

import com.books.orders.internetConnectivity.InternetConnectivityReceiver;

import androidx.multidex.MultiDex;


public class BooksOrders extends Application {

    private static BooksOrders mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static synchronized BooksOrders getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(InternetConnectivityReceiver.ConnectivityReceiverListener listener) {
        InternetConnectivityReceiver.connectivityReceiverListener = listener;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

}
