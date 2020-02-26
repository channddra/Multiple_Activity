package com.example.multipleactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;

public class DobActivity extends AppCompatActivity {
    String name, address, date;
    CalendarView simpleCalendarView;
    int y, m, d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dob);
        Log.i(Data.TAG, "DobActivity onCreate");
        Intent intent = getIntent();
        name = intent.getStringExtra(Data.NAME_TEXT);
        address = intent.getStringExtra(Data.ADDRESS_TEXT);
        DatePicker dp = findViewById(R.id.datePicker1);
        dp.updateDate(1990, 1, 1);
    }

    public void goToNext(View view){
        Intent intent = new Intent(this, summaryActivity.class);
        DatePicker dp = findViewById(R.id.datePicker1);

        y = dp.getYear();
        m = dp.getMonth()+1;
        d = dp.getDayOfMonth();

        if(d<10) date = "0" + d;
        else date = "" + d;

        if(m<10) date += "-0" + m + "-" + y;
        else date += "-" + m + "-" + y;

        intent.putExtra(Data.NAME_TEXT, name);
        intent.putExtra(Data.ADDRESS_TEXT, address);
        intent.putExtra(Data.DATE_TEXT, date);
        startActivity(intent);
    }

    public void goToPrev(View view){
        finish();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Data.TAG, "DobActivity onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Data.TAG, "DobActivity onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Data.TAG, "DobActivity onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Data.TAG, "DobActivity onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(Data.TAG, "DobActivity onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(Data.TAG, "DobActivity onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Data.TAG, "DobActivity onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Data.TAG, "DobActivity onDestroy");
    }
}
