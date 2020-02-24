package com.example.multipleactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity {
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Log.i(Data.TAG, "AddressActivity onCreate");
        Intent intent = getIntent();
        name = intent.getStringExtra(Data.NAME_TEXT);
    }

    public void goToNext(View view){
        Intent intent = new Intent(this, DobActivity.class);
        EditText addressText = findViewById(R.id.addressText);
        String address = addressText.getText().toString();
        intent.putExtra(Data.NAME_TEXT, name);
        intent.putExtra(Data.ADDRESS_TEXT, address);
        startActivity(intent);
    }

    public void goToPrev(View view){
        finish();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Data.TAG, "AddressActivity onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Data.TAG, "AddressActivity onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Data.TAG, "AddressActivity onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Data.TAG, "AddressActivity onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(Data.TAG, "AddressActivity onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(Data.TAG, "AddressActivity onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Data.TAG, "AddressActivity onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Data.TAG, "AddressActivity onDestroy");
    }
}
