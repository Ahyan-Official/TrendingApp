package com.trendingapp.app.az;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;
import com.onesignal.OneSignal;


public class MyApplication extends Application {


    private static final String ONESIGNAL_APP_ID = "e49a99d0-e3b4-4393-9ed2-037bf6b80d0a";

    private static MyApplication mInstense;



    public MyApplication(){


        mInstense = this;

    }


    @Override
    public void onCreate() {
        super.onCreate();

        mInstense = this;

        MobileAds.initialize(this);

// Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);

//        OneSignal.startInit(this)
//                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
//                .unsubscribeWhenNotificationsAreDisabled(true)
//                .init();

    }



    public static synchronized MyApplication getmInstense(){

        return mInstense;
    }





}
