package com.neelkanthjdabhi.blloctasks.Switch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.neelkanthjdabhi.blloctasks.R;

public class SwitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        getSupportActionBar().setTitle("Switch");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}


