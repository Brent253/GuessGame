package com.example.brent4994.guessinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import static com.example.brent4994.guessinggame.R.layout.landingactivity;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(landingactivity);

        //Reference start game button
        Button start = (Button) findViewById(R.id.startGame);

        //Set onclick listener to start button
        start.setOnClickListener(new OnClickListener() {

            //Set method action to button
            @Override
            public void onClick(View view) {

                //From current activity to destination activity(both activities must be in manifest file)
                Intent i = new Intent(getApplicationContext(), GuessingActivity.class);
                startActivity(i);
            }
        });
    }
}
