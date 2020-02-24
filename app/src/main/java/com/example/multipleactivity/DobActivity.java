package com.example.multipleactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;

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
        simpleCalendarView = (CalendarView) findViewById(R.id.calendarView); // get the reference of CalendarView
        // perform setOnDateChangeListener event on CalendarView
        simpleCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // display the selected date by using a toast
                y = year;
                m = month;
                d = dayOfMonth;
                date = d + "/" + (m+1) + "/" + y;
            }
        });
    }

    public void goToNext(View view){
        Intent intent = new Intent(this, summaryActivity.class);
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
