package com.example.thiago.androidlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.btnAA)
    Button btnAA;

    @Click
    void btnAA() {
        AndroidAnnotationMain_.intent(this).start();
    }
    
}
