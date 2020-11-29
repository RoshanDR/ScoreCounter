package com.example.playteam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FreeThrowTeamA(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    public void twoTeamA(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    public void threeTeamA(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }

    private void displayA(int score) {
        TextView teamA = (TextView) findViewById(R.id.scoreOfTeamA);
        teamA.setText(String.valueOf(score));
    }

    public void FreeThrowTeamB(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }


    public void twoTeamB(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    public void threeTeamB(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    private void displayB(int score) {
        TextView teamB = (TextView) findViewById(R.id.scoreOfTeamB);
        teamB.setText(String.valueOf(score));
    }

    public void Reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }
}