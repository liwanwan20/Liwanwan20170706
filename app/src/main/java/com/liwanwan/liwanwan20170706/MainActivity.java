package com.liwanwan.liwanwan20170706;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);

       //设置点击时间
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"您点击了按钮！",Toast.LENGTH_SHORT).show();
            }
        });
        //设置触摸事件
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

            if(event.getAction()==MotionEvent.ACTION_DOWN){
                Toast.makeText(MainActivity.this,"您按下了按钮！",Toast.LENGTH_SHORT).show();
            }else if(event.getAction()==MotionEvent.ACTION_UP){
                Toast.makeText(MainActivity.this,"您松开了按钮！",Toast.LENGTH_SHORT).show();
            }else{

            }
                return true;
            }
        });

    }
}
