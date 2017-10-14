package com.example.brent4994.guessinggame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.brent4994.guessinggame.R.layout.resultsactivity;

/**
 * Created by Brent4994 on 10/13/2017.
 */

public class ResultsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(resultsactivity);

        Intent i = getIntent();
        int result = i.getIntExtra("counter",0);
        TextView total = (TextView) findViewById(R.id.numGuesses);
        total.setText(String.valueOf(result));

        Button replay = (Button) findViewById(R.id.playAgain);

        replay.setOnClickListener(new View.OnClickListener() {

            //Set method action to button
            @Override
            public void onClick(View view) {

                //From current activity to destination activity(both activities must be in manifest file)
                Intent i = new Intent(getApplicationContext(), LandingActivity.class);
                startActivity(i);
            }
        });



    }
}
