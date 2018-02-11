package com.example.android.cornhole;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.cornhole.R;

public class MainActivity extends AppCompatActivity {
    int scoreRedTeam = 0;
    int scoreBlueTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ;
    }

    public void resetButton(View view) {
        scoreRedTeam = 0;
        scoreBlueTeam = 0;
        displayForRedTeam(scoreRedTeam);
        displayForBlueTeam(scoreBlueTeam);
    }

    /**
     * This gives the display for the Red Team
     */

    public void displayForRedTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_team_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method is called when Red Team Scores 1 point
     */
    public void addOneForRed(View view) {
        scoreRedTeam = scoreRedTeam + 1;
        displayForRedTeam(scoreRedTeam);

    }

    /**
     * This method is called when Red Team Scores 3 points
     */
    public void addThreeForRed(View view) {
        scoreRedTeam = scoreRedTeam + 3;
        displayForRedTeam(scoreRedTeam);

    }

    /**
     * This method is called when Blue Team Scores 1 point to remove 1 of Reds
     */
    public void lessOneForRed(View view) {
        scoreRedTeam = scoreRedTeam - 1;
        displayForRedTeam(scoreRedTeam);

    }

    public void lessThreeForRed(View view) {
        scoreRedTeam = scoreRedTeam - 3;
        displayForRedTeam(scoreRedTeam);

    }

    /**
     * This gives the display for the Blue Team
     */

    public void displayForBlueTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when Blue Team Scores 1 point
     */
    public void addOneForBlue(View view) {
        scoreBlueTeam = scoreBlueTeam + 1;
        displayForBlueTeam(scoreBlueTeam);

    }

    /**
     * This method is called when Blue Team Scores 3 points
     */
    public void addThreeForBlue(View view) {
        scoreBlueTeam = scoreBlueTeam + 3;
        displayForBlueTeam(scoreBlueTeam);

    }

    /**
     * This method is called when Blue Team loses 1 point
     */
    public void lessOneForBlue(View view) {
        scoreBlueTeam = scoreBlueTeam - 1;
        displayForBlueTeam(scoreBlueTeam);

    }

    /**
     * This method is called when Blue Team loses 3 points
     */
    public void lessThreeForBlue(View view) {
        scoreBlueTeam = scoreBlueTeam - 3;
        displayForBlueTeam(scoreBlueTeam);

    }


}
