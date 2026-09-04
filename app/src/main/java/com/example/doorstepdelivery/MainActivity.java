package com.example.doorstepdelivery;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(40,40,40,40);
        
        TextView title = new TextView(this);
        title.setText("Welcome to Doorstep Delivery");
        title.setTextSize(22);
        title.setGravity(Gravity.CENTER);
        
        TextView sub = new TextView(this);
        sub.setText("\nFast delivery at your doorstep\n");
        sub.setGravity(Gravity.CENTER);
        
        Button btn = new Button(this);
        btn.setText("Enter");
        
        layout.addView(title);
        layout.addView(sub);
        layout.addView(btn);
        setContentView(layout);
    }
          }
