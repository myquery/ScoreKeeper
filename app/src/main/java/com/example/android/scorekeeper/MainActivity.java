package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * declare the variable to hold scores for  team A
     */
    int teamAGoal = 0;
    int teamAFoul = 0;
    int teamACorner = 0;
    int teamAThrowIn = 0;
    int teamAPenalty = 0;

    /**
     * declare the variable to hold scores for  team A
     */
    int teamBGoal = 0;
    int teamBFoul = 0;
    int teamBCorner = 0;
    int teamBThrowIn = 0;
    int teamBPenalty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Method that add 1 Goal point to team A score
     */

    public void addGoalForTeamA(View v){
        teamAGoal += 1;
        displayTeamAGoal(teamAGoal);
    }
    /**
     * Method that add 2 points to team A Fouls
     */
    public void addFoulForTeamA(View v){
        teamAFoul += 1;
        displayTeamAFoul(teamAFoul);
    }

    /**
     * Method that add 1 point to team A Corners
     */
    public void addCornerForTeamA(View v){
        teamACorner += 1;
        displayTeamACorner(teamACorner);

    }

    /**
     * Method that add 1 point to team A Throwin
     */
    public void addThrowInForTeamA(View v){
        teamAThrowIn += 1;
        displayTeamAThrowIn(teamAThrowIn);

    }


    /**
     * Method that add 1 point to team A Penalty
     */
    public void addPenaltyForTeamA(View v){
        teamAPenalty += 1;
        displayTeamAPenalty(teamAPenalty);

    }


    /**
     * Method that add 1 Goal point to team B score
     */

    public void addGoalForTeamB(View v){
        teamBGoal += 1;
        displayTeamBGoal(teamBGoal);
    }
    /**
     * Method that add 2 points to team B Fouls
     */
    public void addFoulForTeamB(View v){
        teamBFoul += 1;
        displayTeamBFoul(teamBFoul);
    }

    /**
     * Method that add 1 point to team B Corners
     */
    public void addCornerForTeamB(View v){
        teamBCorner += 1;
        displayTeamBCorner(teamBCorner);

    }

    /**
     * Method that add 1 point to team B Throwin
     */
    public void addThrowInForTeamB(View v){
        teamBThrowIn += 1;
        displayTeamBThrowIn(teamBThrowIn);

    }


    /**
     * Method that add 1 point to team B Penalty
     */
    public void addPenaltyForTeamB(View v){
        teamBPenalty += 1;
        displayTeamBPenalty(teamBPenalty);

    }


    /**
     * Method that reset scores for both team B score
     */
    public void resetPoints(View v){
        /**
         * Reset the variable that holds Points for  team A
         */
         teamAGoal = 0;
         teamAFoul = 0;
         teamACorner = 0;
         teamAThrowIn = 0;
         teamAPenalty = 0;

        /**
         * Reset the variable that holds Points for  team B
         */
         teamBGoal = 0;
         teamBFoul = 0;
         teamBCorner = 0;
         teamBThrowIn = 0;
         teamBPenalty = 0;

        displayTeamAGoal(teamAGoal);
        displayTeamAFoul(teamAFoul);
        displayTeamACorner(teamACorner);
        displayTeamAThrowIn(teamAThrowIn);
        displayTeamAPenalty(teamAPenalty);

        displayTeamBGoal(teamBGoal);
        displayTeamBFoul(teamBFoul);
        displayTeamBCorner(teamBCorner);
        displayTeamBThrowIn(teamBThrowIn);
        displayTeamBPenalty(teamBPenalty);
    }

    /**
     * Method that displays Team A total Goal scores
     */
    private void displayTeamAGoal(int score){
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        teamAScore.setText(String.valueOf(score));
    }

    /**
     * Method that displays Team A total Fouls
     */
    private void displayTeamAFoul(int score){
        TextView teamAFoul = (TextView) findViewById(R.id.team_a_fouls);
        teamAFoul.setText(String.valueOf(score));
    }


    /**
     * Method that displays Team A total Fouls
     */
    private void displayTeamACorner(int score){
        TextView teamACorner = (TextView) findViewById(R.id.team_a_corner);
        teamACorner.setText(String.valueOf(score));
    }

    /**
     * Method that displays Team A total Fouls
     */
    private void displayTeamAThrowIn(int score){
        TextView teamAThrowIn = (TextView) findViewById(R.id.team_a_throwin);
        teamAThrowIn.setText(String.valueOf(score));
    }

    /**
     * Method that displays Team A total Fouls
     */
    private void displayTeamAPenalty(int score){
        TextView teamAPenalty = (TextView) findViewById(R.id.team_a_penalty);
        teamAPenalty.setText(String.valueOf(score));
    }


    /**
     * Method that displays Team B total Goal scores
     */
    private void displayTeamBGoal(int score){
        TextView teamBScore = (TextView) findViewById(R.id.team_b_score);
        teamBScore.setText(String.valueOf(score));
    }

    /**
     * Method that displays Team B total Fouls
     */
    private void displayTeamBFoul(int score){
        TextView teamBFoul = (TextView) findViewById(R.id.team_b_fouls);
        teamBFoul.setText(String.valueOf(score));
    }


    /**
     * Method that displays Team A total Fouls
     */
    private void displayTeamBCorner(int score){
        TextView teamBCorner = (TextView) findViewById(R.id.team_b_corner);
        teamBCorner.setText(String.valueOf(score));
    }

    /**
     * Method that displays Team A total Fouls
     */
    private void displayTeamBThrowIn(int score){
        TextView teamBThrowIn = (TextView) findViewById(R.id.team_b_throwin);
        teamBThrowIn.setText(String.valueOf(score));
    }

    /**
     * Method that displays Team A total Fouls
     */
    private void displayTeamBPenalty(int score){
        TextView teamBPenalty = (TextView) findViewById(R.id.team_b_penalty);
        teamBPenalty.setText(String.valueOf(score));
    }
}
