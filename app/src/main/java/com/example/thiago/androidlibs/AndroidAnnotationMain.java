package com.example.thiago.androidlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_android_annotation_main)
public class AndroidAnnotationMain extends AppCompatActivity {

    @ViewById(R.id.btnAA)
    Button btnAA;

    @ViewById(R.id.btnHelp)
    Button btnHelp;

    @ViewById(R.id.lblHelloBack)
    TextView lblHelloBack;

    @ViewById(R.id.lblHelp)
    TextView lblHelp;

    @Click
    void btnAA() {
        lblHelloBack.setText("Hello btnAA");
    }

    @Click void btnHelp(){
        lblHelp.setText("https://github.com/androidannotations/androidannotations/wiki/AvailableAnnotations");
    }
}
