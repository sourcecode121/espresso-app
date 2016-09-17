package com.example.espresso2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t4 = (TextView) findViewById(R.id.test4);
        Button t4Button = (Button) findViewById(R.id.test4Button);

        t4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t4.setText("Click event");
            }
        });
    }
}
