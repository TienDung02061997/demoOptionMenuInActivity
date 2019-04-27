package com.example.optionmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControll();
    }

    private void addControll() {
        mTextView = findViewById(R.id.textMau);
    }

    //khoi tao lay out
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mauxanh:
                mTextView.setBackgroundColor(Color.BLUE);
                break;
            case R.id.mauvang:
                mTextView.setBackgroundColor(Color.YELLOW);
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
