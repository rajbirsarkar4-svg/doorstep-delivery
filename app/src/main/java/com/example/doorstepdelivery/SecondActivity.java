package com.example.doorstepdelivery;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.Gravity;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(60,60,60,60);

        TextView title = new TextView(this);
        title.setText("Select Option\n");
        title.setTextSize(22);
        title.setGravity(Gravity.CENTER);

        Button btn1 = new Button(this);
        btn1.setText("1 - Area");
        btn1.setPadding(20,30,20,30);

        Button btn2 = new Button(this);
        btn2.setText("2 - Articles");
        btn2.setPadding(20,30,20,30);

        layout.addView(title);
        layout.addView(btn1);
        layout.addView(btn2);
        setContentView(layout);
    }
}
