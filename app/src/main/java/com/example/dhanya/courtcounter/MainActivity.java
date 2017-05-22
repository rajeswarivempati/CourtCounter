package com.example.dhanya.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void displayForTeamA(int score)
    {
        TextView txt=(TextView) findViewById(R.id.score);
        txt.setText(String.valueOf(score));
    }
    public void addthreeforTeamA(View view)
    {
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void addtwoforTeamA(View view)
    {
            scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void addfreeforTeamA(View view)
    {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamB(int score)
    {
        TextView txt2=(TextView) findViewById(R.id.score2);
        txt2.setText(String.valueOf(score));
    }
    public void addthreeforTeamB(View view)
    {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void addtwoforTeamB(View view)
    {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void addfreeforTeamB(View view)
    {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view)
    {
        TextView txt2=(TextView) findViewById(R.id.score2);
        TextView txt=(TextView) findViewById(R.id.score);
        txt2.setText("0");
        txt.setText("0");
    }
}
