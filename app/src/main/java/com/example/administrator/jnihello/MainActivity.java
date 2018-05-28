package com.example.administrator.jnihello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import static com.example.administrator.jnihello.HelloJni.returnString;
import static com.example.administrator.jnihello.HelloJni.sayhello;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "JNITEST";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView1);
        String s=returnString();
        Log.d(TAG,s);
        int a=1000;
        Log.d(TAG,sayhello(a)+"");
        textView.setText(s+"\n"+sayhello(a));
    }


}
