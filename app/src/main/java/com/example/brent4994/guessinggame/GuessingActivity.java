package com.example.brent4994.guessinggame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random; //Import random number generator

/**
 * Created by Brent4994 on 10/12/2017.
 */

public class GuessingActivity extends AppCompatActivity {
    //Set counter outside of scope to track guesses
    int count = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guessingactivity);

        //Create a random number variable
        Random r = new Random();

        //Assign integer variable to numbers 1-20 inclusive
        final int onetotwenty = r.nextInt(21);

        // Reference to the users input guess
        final EditText guess = (EditText)findViewById(R.id.userInput);

        //Reference button to check answer
        Button check = (Button)findViewById(R.id.checkButton);



        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               int num = Integer.parseInt(guess.getText().toString());

                //Counter to track number of checked guesses

                //If the users guess is equal to the number generated
                if(num == onetotwenty)
                {
                    Toast.makeText(getApplicationContext(), "Your number " + num + " is the correct answer!! ", Toast.LENGTH_SHORT).show();
                    num = onetotwenty;
                    count++;
                    //From current activity to destination activity(both activities must be in manifest file)
                    Intent i = new Intent(getApplicationContext(), ResultsActivity.class);

                    //Put extra to intent to track counter (Variable name + value)
                    i.putExtra("counter",count);

                    startActivity(i);
                }

                else if(num < onetotwenty) //else if the users guess is less than the generated number
                {
                    Toast.makeText(getApplicationContext(), "Your number " + num + " is lower than the correct answer! ", Toast.LENGTH_SHORT).show();
                    count++;
                    Intent i = new Intent(getApplicationContext(), ResultsActivity.class);

                    //Put extra to intent to track counter (Variable name + value)
                    i.putExtra("counter",count);
                }

                else // if number is greater than generated number
                {
                    Toast.makeText(getApplicationContext(), "Your number " + num + " is greater than the correct answer! ", Toast.LENGTH_SHORT).show();
                    count++;
                    Intent i = new Intent(getApplicationContext(), ResultsActivity.class);

                    //Put extra to intent to track counter (Variable name + value)
                    i.putExtra("counter",count);
                }

            }
        });



    }
}
