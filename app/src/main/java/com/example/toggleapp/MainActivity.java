package com.example.toggleapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    private ImageView pic1,pic2;
    private ConstraintLayout layout;
    private ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pic1=findViewById(R.id.imageView);
        pic2=findViewById(R.id.imageView2);
        layout=findViewById(R.id.layout);
        toggleButton=findViewById(R.id.toggleButton);

        toggleButton.setOnCheckedChangeListener(this);
        layout.setBackgroundColor(Color.parseColor("#000000"));
        pic1.setVisibility(View.INVISIBLE);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(isChecked){
            layout.setBackgroundColor(Color.parseColor("#000000"));
            pic2.setVisibility(View.VISIBLE);
            pic1.setVisibility(View.INVISIBLE);
        }
        else{
            layout.setBackgroundColor(Color.parseColor("#FFFF33"));
            pic2.setVisibility(View.INVISIBLE);
            pic1.setVisibility(View.VISIBLE);
        }
    }
}
