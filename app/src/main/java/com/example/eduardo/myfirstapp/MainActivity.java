package com.example.eduardo.myfirstapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private boolean toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toggle = true;
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public void button_2_click(View view) {
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setTextSize(pickNextSize());
    }

    public void button_3_click(View view) {
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setTextColor(pickNextColor());
    }

    public void button4_click(View view) {
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setAllCaps(toggle);
        toggle = !toggle;
    }

    private int  pickNextColor() {
        Random ran = new Random();
        int num = ran.nextInt(5);
        int color = 0;
        switch (num) {
            case 0: color = Color.RED;
                break;
            case 1: color = Color.BLACK;
                break;
            case 2: color = Color.BLUE;
                break;
            case 3: color = Color.YELLOW;
                break;
            case 4: color = Color.CYAN;
                break;
            case 5: color = Color.GREEN;
                break;
        }

        return color;
    }

    private int pickNextSize () {
        Random ran = new Random();
        return ran.nextInt(50);
    }
}
