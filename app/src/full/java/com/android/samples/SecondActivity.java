package com.android.samples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView welcomeView = (TextView)findViewById(R.id.welcome_view);
        welcomeView.setText(Html.fromHtml(getString(R.string.welcome_text)));
    }
}
