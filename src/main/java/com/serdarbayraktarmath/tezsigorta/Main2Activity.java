package com.serdarbayraktarmath.tezsigorta;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseObject;

import java.io.ByteArrayOutputStream;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);





    }

    public void upload(View view) throws ParseException {


        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap bitmap = BitmapFactory.decodeFile("/sdcard/Download/a.png");
        bitmap.compress(Bitmap.CompressFormat.PNG,10,byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        ParseFile parseFile = new ParseFile("a.png",bytes);
        ParseObject object = new ParseObject("images");
        object.put("image",parseFile);
        object.saveInBackground();

    }


    }

    //inputs

