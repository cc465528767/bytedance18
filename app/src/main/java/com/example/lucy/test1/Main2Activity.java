package com.example.lucy.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
   private TextView textView;
   private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button2=(Button)findViewById(R.id.intent2);
        textView=(TextView)findViewById(R.id.text1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("噜啦啦噜啦啦噜啦噜啦雷");

            }
        });
    }
}
