package com.example.quickchange2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayout;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radio);
        relativeLayout=findViewById(R.id.layout);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.bluebtn:
                        relativeLayout.setBackgroundColor(Color.parseColor("#2475B0"));
                        break;
                    case R.id.greenbtn:
                        relativeLayout.setBackgroundColor(Color.parseColor("#45CE30"));
                        break;
                    case R.id.redbtn:
                        relativeLayout.setBackgroundColor(Color.parseColor("#E71C23"));
                        break;
                }
            }
        });
    }
}
