package com.ksapps.verbose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    ConnectionDetector cd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        cd = new ConnectionDetector(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cd.isConnected())
                    Toast.makeText(MainActivity.this,"No Internet connection found\nCheck it or try again",Toast.LENGTH_SHORT).show();
                else {
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }
            }
        });


    }
}
