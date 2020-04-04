package com.example.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    String TAG = "TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflaters = getMenuInflater();
        inflaters.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if ( item.getItemId () == R.id.profile ){
            Log.d ( TAG , "onOptionsItemSelected: profile" );
        }
        if ( item.getItemId () == R.id.setting ){
            Log.d ( TAG , "onOptionsItemSelected: profile" );
        }
        if ( item.getItemId () == R.id.search ){
            Log.d ( TAG , "onOptionsItemSelected: profile" );
        }
        return true;
    }
}
