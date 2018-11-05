package com.serdarbayraktarmath.tezsigorta;

import android.app.Application;

import com.parse.Parse;

public class parse extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this )
                .applicationId("fHbiQMPrhDoDKByjmMNW0l2QFWmyYXivHR6uBbqx")
                .clientKey("arNu8bY6NcEcY31z8PPavLMVobwFc1OdeBNnVgqO")
                .server("https://parseapi.back4app/")
                .build()


        );



    }
}
