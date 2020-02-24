package com.example.multipleactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Data.TAG, "MainActivity onCreate");
    }

    public void goToNext(View view){
        Intent intent = new Intent(this, AddressActivity.class);
        EditText nameText = findViewById(R.id.nameText);
        String name = nameText.getText().toString();
        intent.putExtra(Data.NAME_TEXT, name);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Data.TAG, "MainActivity onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Data.TAG, "MainActivity onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Data.TAG, "MainActivity onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Data.TAG, "MainActivity onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(Data.TAG, "MainActivity onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(Data.TAG, "MainActivity onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Data.TAG, "MainActivity onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Data.TAG, "MainActivity onDestroy");
    }
}
