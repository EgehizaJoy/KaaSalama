package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class tips_widget extends Activity {

    float x1,y1;
    float x2,y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips_widget);
    }



    public boolean onTouchEvent(MotionEvent touchevent)
    {
        switch (touchevent.getAction())
        {
// when user first touches the screen we get x and y coordinate
            case MotionEvent.ACTION_DOWN:
            {
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                break;
            }
            case MotionEvent.ACTION_UP:
            {
                x2 = touchevent.getX();
                y2 = touchevent.getY();
//if left to right sweep event on screen
                if (x1 < x2)
                {

                }
// if right to left sweep event on screen
                if (x1 > x2)
                {

                    Intent i = new Intent(tips_widget.this,psychology_widget.class);
                    startActivity(i);
                }
// if UP to Down sweep event on screen
                if (y1 < y2)
                {
//Toast.makeText(this, “UP to Down Swap Performed”, Toast.LENGTH_LONG).show();
                }
//if Down to UP sweep event on screen
                if (y1 > y2)
                {
// Toast.makeText(this, “Down to UP Swap Performed”, Toast.LENGTH_LONG).show();
                }
                break;
            }
        }
        return false;
    }

}
