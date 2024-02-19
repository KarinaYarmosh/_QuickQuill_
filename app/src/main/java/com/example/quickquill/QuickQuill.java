package com.example.quickquill;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class QuickQuill extends Application {

    private static QuickQuill instance;

    /**
     * Called when the application is starting. This is where you should initialize
     * any resources that your app will need throughout its lifecycle.
     */
    @Override
    public void onCreate() {
        super.onCreate();

        if(instance == null){
            instance = this;
        }
    }

    public static QuickQuill getInstance(){
        return instance;
    }


    /**
     * Checks whether the device has network connectivity.
     *
     * @return {@code true} if the device has network connectivity, {@code false} otherwise.
     */
    public static boolean hasNetwork(){
        return instance.isNetworkConnected();
    }


    /**
     * Checks whether the device is currently connected to a network.
     *
     * @return {@code true} if the device is connected to a network, {@code false} otherwise.
     */
    private boolean isNetworkConnected() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnected();
    }
}
