package com.example.mad_activity_08;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mScore1;
    int counter;
    private TextView mScoreText1;

    static final String STATE_SCORE_1 = "Team 1 Score";

    protected void onSaveInstanceState(@NonNull Bundle outState) {
        // Save the scores.
        outState.putInt(STATE_SCORE_1, mScore1);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreText1 = (TextView)findViewById(R.id.score_1);

        if (savedInstanceState != null) {
            mScore1 = savedInstanceState.getInt(STATE_SCORE_1);
            //mScore2 = savedInstanceState.getInt(STATE_SCORE_2);

            // Set the score text views.
            mScoreText1.setText(String.valueOf(mScore1));
            //mScoreText2.setText(String.valueOf(mScore2));
        }
    }

    public void multiply(View view) {
        counter += 2;
        mScoreText1.setText(String.valueOf(counter));
    }
}