package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtvMsg2 = findViewById(R.id.TvMsg2);
        txtvMsg2.setText(R.string.Msg2);

        Log.i(tag:"Lifecycle", msg: "OnCreate called...");


    }

    @Override
    protected void onStart(){
        super.onstart();

        Log.i(tag:"Lifecycle", msg: "OnStart called...");
    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.i(tag:"Lifecycle", msg: "OnResume called...");
    }

    @Override
    protected void onPause(){
        super.onPause();

        Log.i(tag:"Lifecycle", msg: "OnPause called...");
    }

    @Override
    protected void onStop(){
        super.onStop();

        Log.i(tag:"Lifecycle", msg: "OnStop called...");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Log.i(tag:"Lifecycle", msg: "OnDestroy called...");
    }
}
