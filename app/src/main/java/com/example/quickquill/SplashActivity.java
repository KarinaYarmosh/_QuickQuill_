package com.example.quickquill;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {
            initApplication();
            finish();
        }, SPLASH_TIME_OUT);
    }

    private void initApplication() {
        //String applicationState = prefs.getString("applicationState", ApplicationState.LOGIN.toString());
        //Class<? extends AppCompatActivity> activityClass = getActivityClass(applicationState);
        startNewActivity(LoginActivity.class);
    }

//    private Class<? extends AppCompatActivity> getActivityClass(String applicationState) {
//        switch (ApplicationState.valueOf(applicationState)) {
//            case REGISTER:
//                return RegisterActivity.class;
//            case CONFIRM_MAIL:
//                return EmailConfirmActivity.class;
//            case GROUP_CHOOSE:
//                return GroupSelectActivity.class;
//            case MAIN_ACTIVITY:
//                return ActivityMain.class;
//            default:
//                return LoginActivity.class;
//        }
//    }

    /**
     * This method is responsible for starting a new activity.
     *
     * @param activityClass activity class
     */
    private void startNewActivity(Class<? extends AppCompatActivity> activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }

}
