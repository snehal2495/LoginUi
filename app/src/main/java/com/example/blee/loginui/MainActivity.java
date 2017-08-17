package com.example.blee.loginui;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView reg_tv,tv;
    EditText et1,et2,et3;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reg_tv=(TextView)findViewById(R.id.Register_tv);
        tv=(TextView)findViewById(R.id.member_login_tv);
        et1=(EditText)findViewById(R.id.username_edtext);
        et2=(EditText)findViewById(R.id.passwd_edtext);
        et3=(EditText)findViewById(R.id.cnfpasswd_edtext);
        b=(Button)findViewById(R.id.register_button);





        Typeface font = Typeface.createFromAsset(getAssets(), "Roboto-Bold.ttf");
        reg_tv.setTypeface(font);
        tv.setTypeface(font);
        et1.setTypeface(font);
        et2.setTypeface(font);
        et3.setTypeface(font);
        b.setTypeface(font);
    }
}
