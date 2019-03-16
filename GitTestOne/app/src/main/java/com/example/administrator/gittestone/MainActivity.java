package com.example.administrator.gittestone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name="vvv";
    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("dd","ff");
        Toast.makeText(this,"ddd",Toast.LENGTH_SHORT).show();


    }
}
