package com.example.home.animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    RadioGroup rg;
    Button button;
    ImageView imageView;
    LinearLayout line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진보기");

        initId();

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rg.getCheckedRadioButtonId() == R.id.radioButton) {
                    imageView.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.dog);
                }
                else if(rg.getCheckedRadioButtonId() == R.id.radioButton2) {
                    imageView.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.cat);
                }
                else if(rg.getCheckedRadioButtonId() == R.id.radioButton3) {
                    imageView.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.rebit);
                }
            }
        });

    }

    private  void initId() {
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);
        rg = (RadioGroup) findViewById(R.id.rg);
        line = (LinearLayout) findViewById(R.id.line);
    }
}