package com.ytl.androidintentwebnphone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWeb(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(intent);
        
    }

    public void phoneCall(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 1234567890"));
        startActivity(intent);

    }
}
