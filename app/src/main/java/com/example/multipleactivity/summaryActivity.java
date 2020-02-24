package com.example.multipleactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class summaryActivity extends AppCompatActivity {
    String name, address, date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        Log.i(Data.TAG, "SummaryActivity onCreate");
        Intent intent = getIntent();
        name = intent.getStringExtra(Data.NAME_TEXT);
        address = intent.getStringExtra(Data.ADDRESS_TEXT);
        date = intent.getStringExtra(Data.DATE_TEXT);
        TextView nameText = findViewById(R.id.textView6);
        TextView addressText = findViewById(R.id.textView7);
        TextView dobText = findViewById(R.id.textView8);
        nameText.setText(name);
        addressText.setText(address);
        dobText.setText(date);
    }

    public void goToPrev(View view){
        finish();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Data.TAG, "SummaryActivity onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Data.TAG, "SummaryActivity onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Data.TAG, "SummaryActivity onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Data.TAG, "SummaryActivity onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(Data.TAG, "SummaryActivity onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(Data.TAG, "SummaryActivity onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Data.TAG, "SummaryActivity onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Data.TAG, "SummaryActivity onDestroy");
    }
}
