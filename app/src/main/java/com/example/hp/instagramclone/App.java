package com.example.hp.instagramclone;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Hp on 12/11/2019.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("pvoSpA54oKu2ToltLk9qBzZCEXLkgezTL1opcDTI")
                // if defined
                .clientKey("Pw8HejbyiMesTMyVRRhOrw98pciicv9F8EFKDKTg")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
