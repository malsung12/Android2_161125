package com.example.home.animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch switch1;
    RadioGroup rg;
    RadioButton radioButton, radioButton2, radioButton3;
    Button button, button2;
    ImageView imageView;
    LinearLayout line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진보기");

        initId();

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    line.setVisibility(View.VISIBLE);
                }
                else {
                    line.setVisibility(View.INVISIBLE);
                }
            }
        });


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton){
                    imageView.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.jellybean);
                }
                else if(checkedId == R.id.radioButton2) {
                    imageView.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.kitkat);
                }
                else if(checkedId == R.id.radioButton3){
                    imageView.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.loliipop);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch1.setChecked(true);
                switch1.setChecked(false);
                line.setVisibility(View.INVISIBLE);
            }
        });

    }

    private  void initId() {
        switch1 = (Switch) findViewById(R.id.switch1);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        imageView = (ImageView) findViewById(R.id.imageView);
        rg = (RadioGroup) findViewById(R.id.rg);
        line = (LinearLayout) findViewById(R.id.line);
    }
}