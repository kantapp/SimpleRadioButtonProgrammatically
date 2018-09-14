package com.kantapp.radiobutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout relativeLayout=findViewById(R.id.relativeLayout);
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup radioGroup=new RadioGroup(getApplicationContext());

                RelativeLayout.LayoutParams lp=new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);

                lp.addRule(RelativeLayout.BELOW,R.id.btn);
                radioGroup.setLayoutParams(lp);
                RadioButton radioButton1=new RadioButton(getApplicationContext());
                radioButton1.setText("India");
                radioButton1.setTextColor(Color.BLACK);
                radioGroup.addView(radioButton1);

                RadioButton radioButton2=new RadioButton(getApplicationContext());
                radioButton2.setTextColor(Color.BLACK);
                radioButton2.setText("USA");
                radioGroup.addView(radioButton2);

                RadioButton radioButton3=new RadioButton(getApplicationContext());
                radioButton3.setText("UK");
                radioButton3.setTextColor(Color.BLACK);
                radioGroup.addView(radioButton3);

                relativeLayout.addView(radioGroup);

            }
        });
    }
}
