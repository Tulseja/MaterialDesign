package com.wacky.lessontwo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button mActivityTwo ;
    public void startActivityTwo(View v){
        Intent res = new Intent(this,activityTwo.class) ;
        startActivity(res);
    }
    public void startFragment(View v){
        Intent res = new Intent(this,activityThree.class) ;
        startActivity(res);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mActivityTwo = (Button)findViewById(R.id.button_to_start_second) ;



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

}
