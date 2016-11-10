package com.droiddigger.gitbranchingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void master(View view) {
        Toast.makeText(MainActivity.this, "I'mm your father Luke",Toast.LENGTH_SHORT).show();
    }

    public void branch_one(View view) {
        Toast.makeText(MainActivity.this, "I'm from branch number one", Toast.LENGTH_SHORT).show();
    }
}
