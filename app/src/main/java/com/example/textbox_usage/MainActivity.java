package com.example.textbox_usage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView greeting;
    TextView greeting2;
    Button click;
    Button click2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greeting2 = (TextView)findViewById(R.id.textView);
        greeting = (TextView)findViewById(R.id.tv2);
        click = (Button)findViewById(R.id.button);
        click2=(Button)findViewById(R.id.button2);


        click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                greeting.setVisibility(View.VISIBLE);
                greeting.setText("Button1");

            }
        });
        click2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               if(greeting2.getText()=="Hello World")
                greeting2.setText("Button2");
               else
                   greeting2.setText("Hello World");

            }
        });

    }
}